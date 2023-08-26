@auto
Feature:Register User Test

Scenario:Automation Exercise Launch Browser
Given Navigate to url
Then Verify that home page is visible successfully
When Click to Signup Login button
Then Verify New User Signup! is visible
When Enter name and email address
And Click  to Signup button
Then Verify that  ENTER ACCOUNT INFORMATION is visible
When Enters Title Name Email Password Date of birth
And Select checkbox sign up for our newsletter!'
And Select checkbox  Receive special offers from our partners
And Enters First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
And Click create Account button
Then Verify that ACCOUNT CREATED! is visible

#negative test web page ---> 'http://automationexercise.com/'
#Login User with incorrect email and password
#Navigate to url
#Verify that home page is visible successfully
#Click to Signup Login button
#Verify Login to your account is visible
#Enter incorrect email address and password
#Click to login button
#Verify error Your email or password is incorrect! is visible

 @aziz
  Scenario:Login User with incorrect email and password
    Given Navigate to url
    Then Verify that home page is visible successfully
    When Click to Signup Login button
    Then Verify Login to your account is visible
    When Enter incorrect email address and password
    And Click to Login button
    Then Verify error Your email or password is incorrect! is visible

