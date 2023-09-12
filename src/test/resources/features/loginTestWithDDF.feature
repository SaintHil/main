Feature: Data Driven Testing in Cucumber
  @DDF
  Scenario Outline: DDF Login Test
    Given The user is on the login page
    When The user enters "<sheetName>" and row number <rowNumber>
    Then The welcome message contains in excel "<sheetName>" <rowNumberForName>
    And The user verify that company name is <rowNumberForCompany> in the "<sheetName>"
    Examples:
      | sheetName | rowNumber | rowNumberForName |rowNumberForCompany|
      | Test Data | 0         | 0                |0                  |
      | Test Data | 1         | 1                |1                  |
