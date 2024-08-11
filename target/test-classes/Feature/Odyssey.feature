Feature: Checking the functionality of OrangeHRM website

  Scenario: Check the create account scenario.
    Given User opens the browser
    And User open the website in the browser
    And User clicks on the CreateAccount button
    And user takes credentials from test data
    Then the application navigates to result page
  
  Scenario: Check login is successful with valid credentials.
    Given User opens the browser
    And User open the website in the browser
    When user give the data from excel
    And user hits on login button

  Scenario: Check all the elements in Homepage.
    Given User opens the browser
    And User open the website in the browser
    When User login with vaild creds.
    And User should verify all elements in homepage.

  Scenario: Check the wishlist and payment scenario
    Given User opens the browser
    And User open the website in the browser
    When User login with vaild creds.
    Given user clicks on search box
    And user click on AddToWishlist button
    And user verify mywishlist
    Then user clicks on RemoveWishList button

  Scenario: Check the cart scenario
    Given User opens the browser
    And User open the website in the browser
    When User login with vaild creds.
    Given user clicks on cart button
    And user clicks on AddToCart button
    And user clicks on ViewCart button
    And user click on IncreaseQty button
    Then user clicks on Checkout button
    Given user give all the necassary details like address etc.
    And user click on Payment button.
    And user cancel the transaction.
    Then user has been logged off.

  #Scenario: Check the payment scenario
    #Given user give all the necassary details like address etc.
    #And user click on Payment button.
    #And user cancel the transaction.
    #Then user has been logged off.
