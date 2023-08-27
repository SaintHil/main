@wip
Feature: Proton Log in User Smoke Test
  Scenario: Log in user Proton Mail
    Given User is on the login page
    When User Enters username  and password credentials
    And User Check the SignIn radio button
    And User Click to SignIn submit button
    Then Verify this location message
