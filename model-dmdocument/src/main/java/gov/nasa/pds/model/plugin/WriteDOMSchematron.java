// Copyright 2019, California Institute of Technology ("Caltech").
// U.S. Government sponsorship acknowledged.
//
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
// * Redistributions of source code must retain the above copyright notice,
// this list of conditions and the following disclaimer.
// * Redistributions must reproduce the above copyright notice, this list of
// conditions and the following disclaimer in the documentation and/or other
// materials provided with the distribution.
// * Neither the name of Caltech nor its operating division, the Jet Propulsion
// Laboratory, nor the names of its contributors may be used to endorse or
// promote products derived from this software without specific prior written
// permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.

package gov.nasa.pds.model.plugin; 
import java.io.*;
import java.util.*;

class WriteDOMSchematron extends Object {	
	PrintWriter prSchematron;

	public WriteDOMSchematron () {
		return;
	}
	
//	write all Schematron files
	public void writeSchematronFile (SchemaFileDefn lSchemaFileDefn, TreeMap <String, DOMClass> lMasterDOMClassMap) throws java.io.IOException {				
		String lFileName = lSchemaFileDefn.relativeFileSpecSchematron;
		lFileName = lFileName;
		prSchematron = new PrintWriter(new OutputStreamWriter (new FileOutputStream(new File(lFileName)), "UTF-8"));		
		writeSchematronRule(lSchemaFileDefn, lMasterDOMClassMap, prSchematron);
		prSchematron.close();	
		return;
	}
		
//	write the schematron rules
	public void writeSchematronRule (SchemaFileDefn lSchemaFileDefn, TreeMap <String, DOMClass> lMasterDOMClassMap, PrintWriter prSchematron) {
		// write schematron file header
		printSchematronFileHdr (lSchemaFileDefn, prSchematron); 
		printSchematronFileCmt (prSchematron);

		// select out the rules for this namespace
		ArrayList <DOMRule> lSelectRuleArr = new ArrayList <DOMRule> ();

// 333
//		System.out.println("\ndebug --- writeSchematronRule Dump ---");
//		for (Iterator <DOMRule> i = DOMInfoModel.masterDOMRuleArr.iterator(); i.hasNext();) {
//			DOMRule lRule = (DOMRule) i.next();
//			System.out.println(" lAttr.identifier:" + lRule.identifier);
//		}	
		
		ArrayList <DOMRule> lRuleArr = new ArrayList <DOMRule> (DOMInfoModel.masterDOMRuleIdMap.values());
		for (Iterator <DOMRule> i = lRuleArr.iterator(); i.hasNext();) {
			DOMRule lRule = (DOMRule) i.next();
						
			if (lSchemaFileDefn.isMaster) {
				if (lRule.isMissionOnly) continue;
				if (! (lRule.alwaysInclude
						|| (lSchemaFileDefn.nameSpaceIdNC.compareTo(lRule.classNameSpaceNC) == 0
								&& lSchemaFileDefn.stewardArr.contains(lRule.classSteward)))) continue;
			} else if (lSchemaFileDefn.isDiscipline) {
				if (lRule.isMissionOnly) continue;
				if (! ((lSchemaFileDefn.nameSpaceIdNC.compareTo(lRule.classNameSpaceNC) == 0
								&& lSchemaFileDefn.stewardArr.contains(lRule.classSteward)))) continue;
			} else if (lSchemaFileDefn.isMission) {
				if (lRule.isMissionOnly) continue;
				if (! ((lSchemaFileDefn.nameSpaceIdNC.compareTo(lRule.classNameSpaceNC) == 0
								&& lSchemaFileDefn.stewardArr.contains(lRule.classSteward)))) continue;
			} else if (lSchemaFileDefn.isLDD) {
				// write an LDD schemtron
				if (! (lRule.isMissionOnly && DMDocument.LDDToolMissionGovernanceFlag)) continue;
				if (!((lSchemaFileDefn.nameSpaceIdNC.compareTo(lRule.classNameSpaceNC) == 0
						&& lSchemaFileDefn.stewardArr.contains(lRule.classSteward))
						|| (lRule.classTitle.compareTo(DMDocument.LDDToolSingletonClassTitle) == 0 ))) continue;
			} else {
				System.out.println(">>warning - Write Schematron - Invalid governance in SchemaFileDefn  - lSchemaFileDefn.identifier:" + lSchemaFileDefn.identifier); 			
			}
//			if (lRule.classNameSpaceNC.compareTo(lSchemaFileDefn.nameSpaceIdNC) == 0) lSelectRuleArr.add(lRule);
			lSelectRuleArr.add(lRule);
		}		
		writeSchematronRuleClasses (lSchemaFileDefn, lSelectRuleArr, prSchematron);
		
		// write schematron file footer
		printSchematronFileFtr (prSchematron); 
	}
		
//	find offending rule
	public void findOffendingRule (String lTitle, ArrayList <DOMRule> lRuleArr) {
		System.out.println("\ndebug findOffendingRule - " + lTitle);
		for (Iterator <DOMRule> i = lRuleArr.iterator(); i.hasNext();) {
			DOMRule lRule = (DOMRule) i.next();	
			if (lRule.classTitle.indexOf("Discipline_Facets") > -1 || lRule.identifier.indexOf("Discipline_Facets") > -1) {
				System.out.println("debug findOffendingRule - lRule.identifier:" + lRule.identifier);
			}
		}
		return;
	}
	
//	check if assert statement already exists
	public boolean foundAssertStmt (String lAttrId, ArrayList <DOMAssert> lAssertArr) {
		for (Iterator <DOMAssert> i = lAssertArr.iterator(); i.hasNext();) {
			DOMAssert lAssert = (DOMAssert) i.next();	
			if (lAssert.identifier.compareTo(lAttrId) == 0) {
				return true;
			}
		}
		return false;
	}
	
//	write the schematron rules
	public void writeSchematronRuleClasses (SchemaFileDefn lSchemaFileDefn, ArrayList<DOMRule> lRuleArr, PrintWriter prSchematron) {
		// write class based assertions
		
		for (Iterator <DOMRule> i = lRuleArr.iterator(); i.hasNext();) {
			DOMRule lRule = (DOMRule) i.next();	
						
			prSchematron.println("  <sch:pattern>");
			
			// write pattern level LETs
			for (Iterator <String> j = lRule.letAssignPatternArr.iterator(); j.hasNext();) {
				String lLetAssignPattern = (String) j.next();	
				prSchematron.println("    <sch:let " + lLetAssignPattern + "/>");						
			}
			
			String lRole = "";
			if (lRule.roleId.compareTo(" role=\"warning\"") == 0) lRole = " role=\"warning\"";
			prSchematron.println("    <sch:rule context=\"" + lRule.xpath + "\"" + lRole + ">");

			// write rule level LETs
			for (Iterator <String> j = lRule.letAssignArr.iterator(); j.hasNext();) {
				String lLetAssign = (String) j.next();	
				prSchematron.println("      <sch:let " + lLetAssign + "/>");						
			}
			for (Iterator <DOMAssert> j = lRule.assertArr.iterator(); j.hasNext();) {
				DOMAssert lAssert = (DOMAssert) j.next();	
				if (lAssert.assertType.compareTo("RAW") == 0) {	
					if (lAssert.assertMsg.indexOf("TBD") == 0) {
						prSchematron.println("      <sch:assert test=\"" + lAssert.assertStmt + "\"/>");						
					} else {
						prSchematron.println("      <sch:assert test=\"" + lAssert.assertStmt + "\">");
						prSchematron.println("        " + lAssert.assertMsg + "</sch:assert>");
					}
				} else if (lAssert.assertType.compareTo("EVERY") == 0) {
					String lDel = "";
					prSchematron.print("      <sch:assert test=\"" + "every $ref in (" + lRule.attrNameSpaceNC + ":" + lRule.attrTitle + ") satisfies $ref = (");
					String lTestValueString = "";
					for (Iterator<String> k = lAssert.testValArr.iterator(); k.hasNext();) {	
						lTestValueString += lDel + "'" + (String) k.next() + "'";
						lDel = ", ";
					}
					prSchematron.print(lTestValueString);
					prSchematron.println(")\">");

					// print message
					prSchematron.println("        The attribute " + lRule.attrTitle + lAssert.assertMsg + lTestValueString + ".</sch:assert>");
				} else if (lAssert.assertType.compareTo("IF") == 0) {
					String lDel = "";
					prSchematron.print("      <sch:assert test=\"" + "if (" + lRule.attrNameSpaceNC + ":" + lRule.attrTitle + ") then " + lRule.attrNameSpaceNC + ":" + lRule.attrTitle + " = (");
					String lTestValueString = "";
					for (Iterator<String> k = lAssert.testValArr.iterator(); k.hasNext();) {	
						lTestValueString += lDel + "'" + (String) k.next() + "'";
						lDel = ", ";
					}
					prSchematron.print(lTestValueString);
					prSchematron.println(") else true ()\">");

					// print message
					prSchematron.println("        The attribute " + lRule.attrTitle + lAssert.assertMsg + lTestValueString + ".</sch:assert>");					
				}
			}
			prSchematron.println("    </sch:rule>");
			prSchematron.println("  </sch:pattern>");
		} 
	}	
	
//	write the schematron file header
	public void printSchematronFileHdr (SchemaFileDefn lSchemaFileDefn, PrintWriter prSchematron) {
		prSchematron.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");					
		prSchematron.println("  <!-- " + DMDocument.masterPDSSchemaFileDefn.modelShortName + " Schematron" + " for Name Space Id:" + lSchemaFileDefn.nameSpaceIdNC + "  Version:" + lSchemaFileDefn.ont_version_id  + " - " + DMDocument.masterTodaysDate + " -->");
		prSchematron.println("  <!-- Generated from the " + DMDocument.masterPDSSchemaFileDefn.modelShortName + " Information Model Version " + DMDocument.masterPDSSchemaFileDefn.ont_version_id + " - System Build " + DMDocument.XMLSchemaLabelBuildNum + " -->");
		prSchematron.println("  <!-- *** This " + DMDocument.masterPDSSchemaFileDefn.modelShortName + " schematron file is an operational deliverable. *** -->");
		prSchematron.println("<sch:schema xmlns:sch=\"http://purl.oclc.org/dsdl/schematron\" queryBinding=\"xslt2\">");
		prSchematron.println("");		   
		prSchematron.println("  <sch:title>Schematron using XPath 2.0</sch:title>");
		prSchematron.println("");
		if (lSchemaFileDefn.nameSpaceIdNC.compareTo(DMDocument.masterNameSpaceIdNCLC) == 0) {
			// namespaces required: pds - latest version
			prSchematron.println("  <sch:ns uri=\"http://pds.nasa.gov/pds4/" + DMDocument.masterPDSSchemaFileDefn.nameSpaceIdNC + "/v" + DMDocument.masterPDSSchemaFileDefn.ns_version_id + "\" prefix=\"" + DMDocument.masterPDSSchemaFileDefn.nameSpaceIdNC + "\"/>");
		} else {
			// namespaces required: pds
			prSchematron.println("  <sch:ns uri=\"http://pds.nasa.gov/pds4/" + DMDocument.masterPDSSchemaFileDefn.nameSpaceIdNC + "/v" + DMDocument.masterPDSSchemaFileDefn.ns_version_id + "\" prefix=\"" + DMDocument.masterPDSSchemaFileDefn.nameSpaceIdNC + "\"/>");
			// namespaces required: ldd
			String governanceDirectory = "";
			if (DMDocument.LDDToolMissionGovernanceFlag) governanceDirectory = DMDocument.governanceLevel.toLowerCase() +  "/";
			prSchematron.println("  <sch:ns uri=\"http://pds.nasa.gov/pds4/" + governanceDirectory + lSchemaFileDefn.nameSpaceIdNC + "/v" + lSchemaFileDefn.ns_version_id + "\" prefix=\"" + lSchemaFileDefn.nameSpaceIdNC + "\"/>");
			// namespaces required: all other LDD discipline levels referenced; no mission level allowed
			for (Iterator<String> i = DMDocument.LDDImportNameSpaceIdNCArr.iterator(); i.hasNext();) {
				String lNameSpaceIdNC = (String) i.next();
				String lVersionNSId = (DMDocument.masterAllSchemaFileSortMap.get(lNameSpaceIdNC)).ns_version_id;
				if (lVersionNSId == null) lVersionNSId = DMDocument.masterPDSSchemaFileDefn.ns_version_id;
				prSchematron.println("  <sch:ns uri=\"http://pds.nasa.gov/pds4/" + lNameSpaceIdNC + "/v" + lVersionNSId + "\" prefix=\"" + lNameSpaceIdNC + "\"/>");
			}
		}
	}

//	write the schematron file header
	public void printSchematronFileCmt (PrintWriter prSchematron) {
		prSchematron.println("");
		prSchematron.println("		   <!-- ================================================ -->");
		prSchematron.println("		   <!-- NOTE:  There are two types of schematron rules.  -->");
		prSchematron.println("		   <!--        One type includes rules written for       -->");
		prSchematron.println("		   <!--        specific situations. The other type are   -->");
		prSchematron.println("		   <!--        generated to validate enumerated value    -->");
		prSchematron.println("		   <!--        lists. These two types of rules have been -->");
		prSchematron.println("		   <!--        merged together in the rules below.       -->");
		prSchematron.println("		   <!-- ================================================ -->");
	}
	
//		write the schematron file footer
	public void printSchematronFileFtr (PrintWriter prSchematron) {			
		prSchematron.println("</sch:schema>");
	}
}
