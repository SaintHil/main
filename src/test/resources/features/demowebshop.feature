@shop
Feature:Demo Web Shop Test

  Scenario:Demo Web Shop Register User Test
    Given Navigate to web page url
    When Click to register link
    When Enter to form user info
    And Click to register button
    Then Verify to text message "Your registration completed"
    And Click to continue button
    When Enter the search box  "Computing and Internet"
    And Click to search box button
    And Add to cart product
    Then Verify add to cart message "The product has been added to your "