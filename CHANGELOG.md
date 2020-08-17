# Change Log

## [11.4.0-SNAPSHOT](https://github.com/NASA-PDS/pds4-information-model/tree/11.4.0-SNAPSHOT) (2020-05-22)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v11.3.0...11.4.0-SNAPSHOT)

## [v11.3.0](https://github.com/NASA-PDS/pds4-information-model/tree/v11.3.0) (2020-05-22)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/11.3.0-SNAPSHOT...v11.3.0)

**Implemented enhancements:**

- LDDTool: Add PDS Namespace Registry information to Help output [\#172](https://github.com/NASA-PDS/pds4-information-model/issues/172)
- LDDTool: Setup and configure CI/CD and Nightly Builds [\#158](https://github.com/NASA-PDS/pds4-information-model/issues/158)

**Fixed bugs:**

- LDDTool does not handle "unbounded" maximum cardinality in Choice blocks correctly [\#180](https://github.com/NASA-PDS/pds4-information-model/issues/180)

**Closed issues:**

- CCB-268 how to test this [\#143](https://github.com/NASA-PDS/pds4-information-model/issues/143)

**Merged pull requests:**

- Bugfix - Cleanup LDDTool change to backout multiple Versions - 2 [\#185](https://github.com/NASA-PDS/pds4-information-model/pull/185) ([jshughes](https://github.com/jshughes))
- Update one  CCB-204 related message that LDDTool writes to output log [\#184](https://github.com/NASA-PDS/pds4-information-model/pull/184) ([jshughes](https://github.com/jshughes))
- Reclassify CCB-204 messages that LDDTool writes to the output log. [\#183](https://github.com/NASA-PDS/pds4-information-model/pull/183) ([jshughes](https://github.com/jshughes))
- Backout LDDTool change that allows multiple IM Versions [\#182](https://github.com/NASA-PDS/pds4-information-model/pull/182) ([jshughes](https://github.com/jshughes))
- LDDTool does not handle "unbounded" maximum cardinality correctly [\#181](https://github.com/NASA-PDS/pds4-information-model/pull/181) ([jshughes](https://github.com/jshughes))
- Configure LDDTool to allow multiple Information Model Versions [\#179](https://github.com/NASA-PDS/pds4-information-model/pull/179) ([jshughes](https://github.com/jshughes))
- Add LDDTool command line ption for printing configured namespaces and… [\#174](https://github.com/NASA-PDS/pds4-information-model/pull/174) ([jshughes](https://github.com/jshughes))

## [11.3.0-SNAPSHOT](https://github.com/NASA-PDS/pds4-information-model/tree/11.3.0-SNAPSHOT) (2020-04-18)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v11.2.2...11.3.0-SNAPSHOT)

**Closed issues:**

- CCB-256: Need method for providing permissible value definitions for external namespaces in Ingest\_LDD [\#130](https://github.com/NASA-PDS/pds4-information-model/issues/130)

**Merged pull requests:**

- LDDTool writing wrong type of Rule to validate attribute permissible … [\#171](https://github.com/NASA-PDS/pds4-information-model/pull/171) ([jshughes](https://github.com/jshughes))

## [v11.2.2](https://github.com/NASA-PDS/pds4-information-model/tree/v11.2.2) (2020-04-06)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v11.2.1...v11.2.2)

**Fixed bugs:**

- LDDTool: Version info bug introduced since v11.2.0 [\#168](https://github.com/NASA-PDS/pds4-information-model/issues/168)

**Merged pull requests:**

- Backed out change for command line option to allow choice of Data dir… [\#169](https://github.com/NASA-PDS/pds4-information-model/pull/169) ([jshughes](https://github.com/jshughes))

## [v11.2.1](https://github.com/NASA-PDS/pds4-information-model/tree/v11.2.1) (2020-03-24)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v11.2.0...v11.2.1)

**Merged pull requests:**

- Bugfix - The new permissible values are not being written to the Sche… [\#157](https://github.com/NASA-PDS/pds4-information-model/pull/157) ([jshughes](https://github.com/jshughes))

## [v11.2.0](https://github.com/NASA-PDS/pds4-information-model/tree/v11.2.0) (2020-03-13)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v11.1.0...v11.2.0)

**Fixed bugs:**

- Bugfix - Add code to fail gracefully for deprecated -M argument [\#154](https://github.com/NASA-PDS/pds4-information-model/issues/154)
- Bugfix - Change the error message reported for "nillable" attribute error. [\#146](https://github.com/NASA-PDS/pds4-information-model/issues/146)
- LDDtool: exposed class has a component class with a component exposed class [\#142](https://github.com/NASA-PDS/pds4-information-model/issues/142)

**Closed issues:**

- CCB-279: Mis-Matched \<axes\> and Axis\_Array Specifications  [\#152](https://github.com/NASA-PDS/pds4-information-model/issues/152)
- CCB-272: Reinstate Array\_1D in the Information Model [\#148](https://github.com/NASA-PDS/pds4-information-model/issues/148)
- LDDtool: unescaped & in output .xml [\#141](https://github.com/NASA-PDS/pds4-information-model/issues/141)

**Merged pull requests:**

- Add code to fail gracefully for deprecated -M argument [\#156](https://github.com/NASA-PDS/pds4-information-model/pull/156) ([jshughes](https://github.com/jshughes))
- Add code to fail gracefully for deprecated -M argument [\#155](https://github.com/NASA-PDS/pds4-information-model/pull/155) ([jshughes](https://github.com/jshughes))
- Mis-Matched \<axes\> and Axis\_Array Specifications [\#153](https://github.com/NASA-PDS/pds4-information-model/pull/153) ([jshughes](https://github.com/jshughes))
- BugFix - Add \<DD\_Associate\_External\_Class\> to \<DD\_Class\> definition [\#151](https://github.com/NASA-PDS/pds4-information-model/pull/151) ([jshughes](https://github.com/jshughes))
- Bugfix - Ampersand not escaped in LDDTool generated XML Schema file \(… [\#150](https://github.com/NASA-PDS/pds4-information-model/pull/150) ([jshughes](https://github.com/jshughes))
- Reinstate Array\_1D in the Information Model [\#149](https://github.com/NASA-PDS/pds4-information-model/pull/149) ([jshughes](https://github.com/jshughes))
- Change the error message reported for "nillable" attribute error. [\#147](https://github.com/NASA-PDS/pds4-information-model/pull/147) ([jshughes](https://github.com/jshughes))

## [v11.1.0](https://github.com/NASA-PDS/pds4-information-model/tree/v11.1.0) (2020-03-11)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v11.0.0...v11.1.0)

**Closed issues:**

- CCB-274 - Add attribute dictionary\_type to Ingest\_LDD - Update [\#144](https://github.com/NASA-PDS/pds4-information-model/issues/144)

**Merged pull requests:**

- Add attribute dictionary\_type to Ingest\_LDD - Remove -M Option [\#145](https://github.com/NASA-PDS/pds4-information-model/pull/145) ([jshughes](https://github.com/jshughes))

## [v11.0.0](https://github.com/NASA-PDS/pds4-information-model/tree/v11.0.0) (2020-02-29)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v10.1.2...v11.0.0)

**Closed issues:**

- CCB-278: Fix errors in logical\_identifier, ASCII\_LID, ASCIIVID and ASCII\_LIDVID\_LID [\#139](https://github.com/NASA-PDS/pds4-information-model/issues/139)
- CCB-274 - Add attribute dictionary\_type to Ingest\_LDD [\#137](https://github.com/NASA-PDS/pds4-information-model/issues/137)
- CCB-220: Add ability to specify many source products via table. [\#135](https://github.com/NASA-PDS/pds4-information-model/issues/135)
- CCB-271: Add reference\_types for Product\_Ancillary [\#133](https://github.com/NASA-PDS/pds4-information-model/issues/133)
- Improve versioning documentation to include IM version information [\#132](https://github.com/NASA-PDS/pds4-information-model/issues/132)

**Merged pull requests:**

- Fix errors in logical\_identifier, ASCII\_LID, ASCIIVID and ASCII\_LIDVI… [\#140](https://github.com/NASA-PDS/pds4-information-model/pull/140) ([jshughes](https://github.com/jshughes))
- Add attribute dictionary\_type to Ingest\_LDD [\#138](https://github.com/NASA-PDS/pds4-information-model/pull/138) ([jshughes](https://github.com/jshughes))
- CCB-220 Add ability to specify many source products via table. [\#136](https://github.com/NASA-PDS/pds4-information-model/pull/136) ([jshughes](https://github.com/jshughes))
- Add reference\_types for Product\_Ancillary [\#134](https://github.com/NASA-PDS/pds4-information-model/pull/134) ([jordanpadams](https://github.com/jordanpadams))
- Method for providing permissible value definitions for external names… [\#131](https://github.com/NASA-PDS/pds4-information-model/pull/131) ([jshughes](https://github.com/jshughes))

## [v10.1.2](https://github.com/NASA-PDS/pds4-information-model/tree/v10.1.2) (2020-01-24)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v10.1.1...v10.1.2)

**Implemented enhancements:**

- Update LDDTool to write the PDS4 Data Dictionary \(DocBook\) for multiple LDDs [\#93](https://github.com/NASA-PDS/pds4-information-model/issues/93)

**Fixed bugs:**

- LDDTool: Fix invalid examples or link to valid versions online [\#105](https://github.com/NASA-PDS/pds4-information-model/issues/105)
- Improve error handling for LDDTool processing of CTLI IngestLDD file [\#91](https://github.com/NASA-PDS/pds4-information-model/issues/91)

**Closed issues:**

- Sync up LDDTool version with Maven build version [\#127](https://github.com/NASA-PDS/pds4-information-model/issues/127)
- Nillable attributes are not declared nillable in class definitions.   [\#125](https://github.com/NASA-PDS/pds4-information-model/issues/125)
- Sync LDDTool version with Maven version [\#124](https://github.com/NASA-PDS/pds4-information-model/issues/124)
- CCB-204: Define and enforce best practices for discipline and project dictionaries. Part-4 [\#122](https://github.com/NASA-PDS/pds4-information-model/issues/122)
- CCB-204: Define and enforce best practices for discipline and project dictionaries. Part-3 [\#113](https://github.com/NASA-PDS/pds4-information-model/issues/113)
- LDDTool aborts on short filename [\#111](https://github.com/NASA-PDS/pds4-information-model/issues/111)
- Clean up IMTool/LDDTool UML/XMI file writer for MagicDraw UML Class Diagrams [\#109](https://github.com/NASA-PDS/pds4-information-model/issues/109)
- CCB-138 Fix mismatch between context object types and values of \<type\> in \<Observing\_System\_Component\> class [\#103](https://github.com/NASA-PDS/pds4-information-model/issues/103)
- CCB-204: Validate that no attribute is named "unit" - Part 2 [\#101](https://github.com/NASA-PDS/pds4-information-model/issues/101)
- CCB-268 Add optional attribute to class Terminological\_Entry [\#99](https://github.com/NASA-PDS/pds4-information-model/issues/99)
- CCB-204: Define and enforce best practices for discipline and project dictionaries. - Part 1 [\#97](https://github.com/NASA-PDS/pds4-information-model/issues/97)
- Multi LDD DataDictionary Cleanup [\#95](https://github.com/NASA-PDS/pds4-information-model/issues/95)
- Stage PDS4 Information Model V1E00 Build\_10b [\#89](https://github.com/NASA-PDS/pds4-information-model/issues/89)

**Merged pull requests:**

- Update tool versioning to move to config file [\#129](https://github.com/NASA-PDS/pds4-information-model/pull/129) ([jordanpadams](https://github.com/jordanpadams))
- Sync up LDDTool version with Maven build version [\#128](https://github.com/NASA-PDS/pds4-information-model/pull/128) ([jshughes](https://github.com/jshughes))
- Nillable attributes are not declared nillable in class definitions. [\#126](https://github.com/NASA-PDS/pds4-information-model/pull/126) ([jshughes](https://github.com/jshughes))
- Nillable attribute must be a required attribute of one class [\#123](https://github.com/NASA-PDS/pds4-information-model/pull/123) ([jshughes](https://github.com/jshughes))
- Validate that there are no nested Exposed classes [\#114](https://github.com/NASA-PDS/pds4-information-model/pull/114) ([jshughes](https://github.com/jshughes))
- LDDTool aborts on short filename [\#112](https://github.com/NASA-PDS/pds4-information-model/pull/112) ([jshughes](https://github.com/jshughes))
- Clean up IMTool/LDDTool UML/XMI file writer for MagicDraw UML Class D… [\#110](https://github.com/NASA-PDS/pds4-information-model/pull/110) ([jshughes](https://github.com/jshughes))
- Remove LDDTool Test Cases From Examples Directory [\#108](https://github.com/NASA-PDS/pds4-information-model/pull/108) ([jshughes](https://github.com/jshughes))
- CCB-138 Fix mismatch between object types in \<Observing\_System\_Component\> class [\#106](https://github.com/NASA-PDS/pds4-information-model/pull/106) ([jshughes](https://github.com/jshughes))
- Issue \#101 CCB-204: Validate that no attribute is named "unit" - Part 2 [\#102](https://github.com/NASA-PDS/pds4-information-model/pull/102) ([jshughes](https://github.com/jshughes))
- Issue \#99 Add the optional attribute skos\_relation\_name [\#100](https://github.com/NASA-PDS/pds4-information-model/pull/100) ([jshughes](https://github.com/jshughes))
- Issue \#97 CCB-204 Validate that LDD attributes named "type" or with n… [\#98](https://github.com/NASA-PDS/pds4-information-model/pull/98) ([jshughes](https://github.com/jshughes))
- Issue 95 Multi LDD DataDictionary Cleanup [\#96](https://github.com/NASA-PDS/pds4-information-model/pull/96) ([jshughes](https://github.com/jshughes))
- \#93 Multi\_LDD\_DataDictionary [\#94](https://github.com/NASA-PDS/pds4-information-model/pull/94) ([jshughes](https://github.com/jshughes))
- Issue \#91 Fix LDDTOOL CTLI IngestLDD Abort [\#92](https://github.com/NASA-PDS/pds4-information-model/pull/92) ([jshughes](https://github.com/jshughes))
- Issue \#89 Stage PDS4 Information Model V1E00 Build 10b [\#90](https://github.com/NASA-PDS/pds4-information-model/pull/90) ([jshughes](https://github.com/jshughes))

## [v10.1.1](https://github.com/NASA-PDS/pds4-information-model/tree/v10.1.1) (2019-10-19)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v10.1.0...v10.1.1)

**Implemented enhancements:**

- LDDTool: Update version flag \(-v\) to show IM version as well as software version [\#74](https://github.com/NASA-PDS/pds4-information-model/issues/74)

**Closed issues:**

- IMTool: LDDTool Config Properties Update [\#83](https://github.com/NASA-PDS/pds4-information-model/issues/83)
- LDDTool: IngestLDD 'Report' rules do not make it to Schematron [\#1](https://github.com/NASA-PDS/pds4-information-model/issues/1)

## [v10.1.0](https://github.com/NASA-PDS/pds4-information-model/tree/v10.1.0) (2019-10-11)
[Full Changelog](https://github.com/NASA-PDS/pds4-information-model/compare/v10.0.0...v10.1.0)

**Fixed bugs:**

- LDDTool: XMLSchema Fix Null In Import Cleanup [\#81](https://github.com/NASA-PDS/pds4-information-model/issues/81)
- LDDTool: XMLSchema Fix Nul In Import File Name [\#79](https://github.com/NASA-PDS/pds4-information-model/issues/79)
- LDDTool: Fixed the calculation of class extensions and restrictions [\#77](https://github.com/NASA-PDS/pds4-information-model/issues/77)
-  CCB-252 Make\_Science\_Facets\_wavelength\_range\_nillable\_BugFix [\#64](https://github.com/NASA-PDS/pds4-information-model/issues/64)

**Closed issues:**

- Revert CCB-256 Permissible value definitions Ingest LDD [\#75](https://github.com/NASA-PDS/pds4-information-model/issues/75)
- CCB-256 Permissible\_value\_definitions\_Ingest\_LDD\_Update\_Data [\#72](https://github.com/NASA-PDS/pds4-information-model/issues/72)
- CCB-256 Permissible\_value\_definitions\_Ingest\_LDD\_Update [\#70](https://github.com/NASA-PDS/pds4-information-model/issues/70)
- DOMConv\_Depcreation\_FinalCleanup\_Deprecate\_InfoModel\_and\_Associated\_Classes [\#68](https://github.com/NASA-PDS/pds4-information-model/issues/68)
- DOMConv\_Deprecation\_FinalCleanup\_Continued [\#66](https://github.com/NASA-PDS/pds4-information-model/issues/66)

**Merged pull requests:**

- Issue \#83 IMTool\_LDDTool\_Config\_Properties\_Update [\#84](https://github.com/NASA-PDS/pds4-information-model/pull/84) ([jshughes416](https://github.com/jshughes416))
- Issue \#81 LDDTool\_XMLSchema\_Fix\_Null\_In\_Import\_Cleanup [\#82](https://github.com/NASA-PDS/pds4-information-model/pull/82) ([jshughes416](https://github.com/jshughes416))
- Issue \#79 LDDTool\_XMLSchema\_Fix\_Null\_In\_Import [\#80](https://github.com/NASA-PDS/pds4-information-model/pull/80) ([jshughes416](https://github.com/jshughes416))
- \#77 LDDTool\_IMG\_LDD\_Brightness\_Correction\_Cristina [\#78](https://github.com/NASA-PDS/pds4-information-model/pull/78) ([jshughes416](https://github.com/jshughes416))
- \#75 CCB-256 Permissible\_value\_definitions\_Ingest\_LDD\_Removal [\#76](https://github.com/NASA-PDS/pds4-information-model/pull/76) ([jshughes416](https://github.com/jshughes416))
- \#72 CCB-256 Permissible\_value\_definitions\_Ingest\_LDD\_Update\_Data [\#73](https://github.com/NASA-PDS/pds4-information-model/pull/73) ([jshughes416](https://github.com/jshughes416))
- Issue \#70 CCB-256 Permissible\_value\_definitions\_Ingest\_LDD\_Update [\#71](https://github.com/NASA-PDS/pds4-information-model/pull/71) ([jshughes416](https://github.com/jshughes416))
- Issue \#68 dom conv depcreation final cleanup deprecate info model and associated classes [\#69](https://github.com/NASA-PDS/pds4-information-model/pull/69) ([jshughes416](https://github.com/jshughes416))
- Issue \#66 DOMConv\_Deprecation\_FinalCleanup\_Continued [\#67](https://github.com/NASA-PDS/pds4-information-model/pull/67) ([jshughes416](https://github.com/jshughes416))
- Issue \#64 CCB-252 Make\_Science\_Facets\_wavelength\_range\_nillable\_BugFix [\#65](https://github.com/NASA-PDS/pds4-information-model/pull/65) ([jshughes416](https://github.com/jshughes416))

## [v10.0.0](https://github.com/NASA-PDS/pds4-information-model/tree/v10.0.0) (2019-09-12)
**Closed issues:**

- DOMConv Deprecation\_FinalCleanup - Fix Errors Found in Build 10a [\#62](https://github.com/NASA-PDS/pds4-information-model/issues/62)
- 190908b\_DOMConv\_Depcreation\_FinalCleanup\_Remove\_DOM\_From\_Filename - Part 1 [\#60](https://github.com/NASA-PDS/pds4-information-model/issues/60)
- 190908\_PDS4\_Information\_Model\_V1D00\_Database\_Update - Part 3 [\#58](https://github.com/NASA-PDS/pds4-information-model/issues/58)
- 190908\_PDS4\_Information\_Model\_V1D00\_Database\_Update - Part 2 [\#56](https://github.com/NASA-PDS/pds4-information-model/issues/56)
- 190908\_PDS4\_Information\_Model\_V1D00\_Database\_Update - Part 1 [\#54](https://github.com/NASA-PDS/pds4-information-model/issues/54)
- DOMConv Deprecation\_FinalCleanup - Deprecate Deprecate InfoModel [\#52](https://github.com/NASA-PDS/pds4-information-model/issues/52)
- DOMConv Deprecation\_FinalCleanup - Deprecate MasterInfoModel [\#50](https://github.com/NASA-PDS/pds4-information-model/issues/50)
- DOMConv Deprecation\_FinalCleanup - Deprecate LDDParser [\#48](https://github.com/NASA-PDS/pds4-information-model/issues/48)
- DOMConv Deprecation\_FinalCleanup - Deprecate GetModels [\#46](https://github.com/NASA-PDS/pds4-information-model/issues/46)
- DOMConv Deprecation\_FinalCleanup - Deprecate MOF Writers [\#44](https://github.com/NASA-PDS/pds4-information-model/issues/44)
- DOMConv Deprecation\_FinalCleanup - ExportModels [\#42](https://github.com/NASA-PDS/pds4-information-model/issues/42)
- CCB-256	Permissible\_value\_definitions\_Ingest\_LDD [\#40](https://github.com/NASA-PDS/pds4-information-model/issues/40)
- DOMConv Deprecation\_FinalCleanup - DeprecatedDefn [\#38](https://github.com/NASA-PDS/pds4-information-model/issues/38)
- DOMConv Deprecation\_FinalCleanup - DOMProtAttr [\#36](https://github.com/NASA-PDS/pds4-information-model/issues/36)
- DOMConv Deprecation\_FinalCleanup - DOMAttr [\#34](https://github.com/NASA-PDS/pds4-information-model/issues/34)
- DOMConv Deprecation\_FinalCleanup WriteDOMSpecification [\#32](https://github.com/NASA-PDS/pds4-information-model/issues/32)
- CCB-249	Schematron Rule Elements - Assert and Report [\#29](https://github.com/NASA-PDS/pds4-information-model/issues/29)
- CCB258 Software\_Updates [\#27](https://github.com/NASA-PDS/pds4-information-model/issues/27)
- CCB-253-Add\_Units\_of\_Force\_as\_a\_unit\_of\_measure [\#25](https://github.com/NASA-PDS/pds4-information-model/issues/25)
- CCB-251 - Add Units of Gmass as a unit of measure [\#23](https://github.com/NASA-PDS/pds4-information-model/issues/23)
- CCB-266-Change\_Data\_Type\_of\_External\_Reference\_reference\_text [\#21](https://github.com/NASA-PDS/pds4-information-model/issues/21)
- CCB-262-Add\_Supporting\_Observationan\_To\_Primary\_Result\_Summary\_purpose [\#19](https://github.com/NASA-PDS/pds4-information-model/issues/19)
- CCB-252\_Make\_Science\_Facets\_wavelength\_range\_nillable [\#17](https://github.com/NASA-PDS/pds4-information-model/issues/17)
- CCB\_250\_Add\_MD5\_To\_Checksum\_Type\_Deprecate\_MD5Deep [\#16](https://github.com/NASA-PDS/pds4-information-model/issues/16)
- CCB\_244\_Deprecate\_Earth-based\_from\_Instrument\_Host\_type [\#14](https://github.com/NASA-PDS/pds4-information-model/issues/14)
- CCB\_254\_Add\_Astrophysical\_To\_Targetype [\#12](https://github.com/NASA-PDS/pds4-information-model/issues/12)
- DOMConv - Install new dd11179.pins file [\#10](https://github.com/NASA-PDS/pds4-information-model/issues/10)
- CCB-237 - Change Attribute doi to Data Type ASCII\_DOI [\#9](https://github.com/NASA-PDS/pds4-information-model/issues/9)
- DOMConv\_UnitTesting\_PINS\_Test\_classOrder [\#7](https://github.com/NASA-PDS/pds4-information-model/issues/7)
- Update Maven docs to refer to Github release assets [\#6](https://github.com/NASA-PDS/pds4-information-model/issues/6)
- DOM Conversion [\#4](https://github.com/NASA-PDS/pds4-information-model/issues/4)

**Merged pull requests:**

- Issue \#62 DOMConv Deprecation\_FinalCleanup - Fix Errors Found in Buil… [\#63](https://github.com/NASA-PDS/pds4-information-model/pull/63) ([jshughes416](https://github.com/jshughes416))
- Issue \#60 190908b\_DOMConv\_Depcreation\_FinalCleanup\_Remove\_DOM\_From\_Fi… [\#61](https://github.com/NASA-PDS/pds4-information-model/pull/61) ([jshughes416](https://github.com/jshughes416))
- Issue \#58 190908\_PDS4\_Information\_Model\_V1D00\_Database\_Update - Part 3 [\#59](https://github.com/NASA-PDS/pds4-information-model/pull/59) ([jshughes416](https://github.com/jshughes416))
- Issue \#56 190908\_PDS4\_Information\_Model\_V1D00\_Database\_Update - Part 2 [\#57](https://github.com/NASA-PDS/pds4-information-model/pull/57) ([jshughes416](https://github.com/jshughes416))
- Issue \#54 190908\_PDS4\_Information\_Model\_V1D00\_Database\_Update - Part 1 [\#55](https://github.com/NASA-PDS/pds4-information-model/pull/55) ([jshughes416](https://github.com/jshughes416))
- Issue \#52 DOMConv Deprecation\_FinalCleanup - Deprecate InfoModel - Pa… [\#53](https://github.com/NASA-PDS/pds4-information-model/pull/53) ([jshughes416](https://github.com/jshughes416))
- Issue \#50 DOMConv Deprecation\_FinalCleanup - Deprecate MasterInfoModel [\#51](https://github.com/NASA-PDS/pds4-information-model/pull/51) ([jshughes416](https://github.com/jshughes416))
- Issue \#48 DOMConv Deprecation\_FinalCleanup - Deprecate LDDParser [\#49](https://github.com/NASA-PDS/pds4-information-model/pull/49) ([jshughes416](https://github.com/jshughes416))
- Issue \#46 DOMConv Deprecation\_FinalCleanup - Deprecate GetModels [\#47](https://github.com/NASA-PDS/pds4-information-model/pull/47) ([jshughes416](https://github.com/jshughes416))
- Issue \#44 DOMConv Deprecation\_FinalCleanup - Deprecate MOF Writers [\#45](https://github.com/NASA-PDS/pds4-information-model/pull/45) ([jshughes416](https://github.com/jshughes416))
- Issue \#42 DOMConv Deprecation\_FinalCleanup - ExportModels [\#43](https://github.com/NASA-PDS/pds4-information-model/pull/43) ([jshughes416](https://github.com/jshughes416))
- Issue \#40 CCB-256	Permissible\_value\_definitions\_Ingest\_LDD [\#41](https://github.com/NASA-PDS/pds4-information-model/pull/41) ([jshughes416](https://github.com/jshughes416))
- Issue \#36 DOMConv Deprecation\_FinalCleanup - DeprecatedDefn [\#39](https://github.com/NASA-PDS/pds4-information-model/pull/39) ([jshughes416](https://github.com/jshughes416))
- Issue \#36 DOMConv Deprecation\_FinalCleanup - DOMProtAttr [\#37](https://github.com/NASA-PDS/pds4-information-model/pull/37) ([jshughes416](https://github.com/jshughes416))
- Issue \#34 DOMConv Deprecation\_FinalCleanup DOMAttr [\#35](https://github.com/NASA-PDS/pds4-information-model/pull/35) ([jshughes416](https://github.com/jshughes416))
- Issue \#32 DOMConv Deprecation\_FinalCleanup WriteDOMSpecification [\#33](https://github.com/NASA-PDS/pds4-information-model/pull/33) ([jshughes416](https://github.com/jshughes416))
- New MDPTNConfigClassDisp.xml [\#31](https://github.com/NASA-PDS/pds4-information-model/pull/31) ([jshughes416](https://github.com/jshughes416))
- Issue \#29 CCB-249 Schematron\_Rule\_Elements\_Assert\_and\_Report [\#30](https://github.com/NASA-PDS/pds4-information-model/pull/30) ([jshughes416](https://github.com/jshughes416))
- CCB258 Software\_Updates [\#28](https://github.com/NASA-PDS/pds4-information-model/pull/28) ([jshughes416](https://github.com/jshughes416))
- Issue \#25 CCB-253-Add\_Units\_of\_Force\_as\_a\_unit\_of\_measure [\#26](https://github.com/NASA-PDS/pds4-information-model/pull/26) ([jshughes416](https://github.com/jshughes416))
- Issue \#21 CCB-266-Change\_Data\_Type\_of\_External\_Reference\_reference\_text [\#22](https://github.com/NASA-PDS/pds4-information-model/pull/22) ([jshughes416](https://github.com/jshughes416))
- Issue \#19 CCB-262-Add\_Supporting\_Observationan\_To\_Primary\_Result\_Summ… [\#20](https://github.com/NASA-PDS/pds4-information-model/pull/20) ([jshughes416](https://github.com/jshughes416))
- Issue \#17 CCB-252\_Make\_Science\_Facets\_wavelength\_range\_nillable [\#18](https://github.com/NASA-PDS/pds4-information-model/pull/18) ([jshughes416](https://github.com/jshughes416))
- Issue \#14 CCB\_244\_Deprecate\_Earth-based\_from\_Instrument\_Host\_type [\#15](https://github.com/NASA-PDS/pds4-information-model/pull/15) ([jshughes416](https://github.com/jshughes416))
- Issue \#12 CCB\_254\_Add\_Astrophysical\_To\_Targetype [\#13](https://github.com/NASA-PDS/pds4-information-model/pull/13) ([jshughes416](https://github.com/jshughes416))
- Issue-\#9 CCB-237 - Change Attribute doi to Data Type ASCII\_DOI [\#11](https://github.com/NASA-PDS/pds4-information-model/pull/11) ([jshughes416](https://github.com/jshughes416))
- Issue-\#7--DOMConv\_UnitTesting\_PINS\_Test\_classOrder [\#8](https://github.com/NASA-PDS/pds4-information-model/pull/8) ([jshughes416](https://github.com/jshughes416))
- DOMConv\_UnitTesting\_LDDDOMParser\_Cart\_Geom\_abort [\#5](https://github.com/NASA-PDS/pds4-information-model/pull/5) ([jshughes416](https://github.com/jshughes416))



\* *This Change Log was automatically generated by [github_changelog_generator](https://github.com/skywinder/Github-Changelog-Generator)*