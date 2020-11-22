#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Sign in

  Scenario: validating the sign in with valid credentials
   
   Given user is in the homepage
    When user clicks on the sign in link
    When user enters user name
    And user enters password
    And user clicks on sign in button
    Then user should be logged in
    And user should be able to close the browser

  Scenario: validating the sign in with invalid credentials
    Given user is in the homepage
    When user clicks on the sign in link
    When user enters invalid user name
    And user enters invlid password
    And user clicks on sign in button
    Then user should see a message of invalid credentials
    And user should not be able to login
    And user should be able to close the browser
