@wip5
Feature: Proton Log in User Smoke Test
Background:
  Given User is on the login page

  Scenario: Log in user Proton Mail
    #Given User is on the login page
    When User Enters "logintest2023@proton.me"  and "Test12345" credentials
    And User Check the SignIn radio button
    And User Click to SignIn submit button
    Then Verify this location message "account.proton.me"


    @wip6
  Scenario Outline: Proton Different User Type
    #Given User is on the login page
    When User Enters "<username>"  and "<password>" credentials
    And User Check the SignIn radio button
    And User Click to SignIn submit button
    Then Verify this location message "<expectedUrl>"
    Examples:
      | username                | password  | expectedUrl       |
      | logintest2023@proton.me | Test12345 | account.proton.me |
      | logintest2024@proton.me | Test12345 | account.proton.me |
      | logintest2025@proton.me | Test12345 | account.proton.me |



