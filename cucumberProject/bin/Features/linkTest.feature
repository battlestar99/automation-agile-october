#Author: anik@agile1tech.com
Feature: Links in the footer of the homepage

  Scenario: validating the link navigation
    
    
    Given user is in the homepage
    When user clicks on the specials
    Then user should navigate to the special page
    When user clicks on the new products
    Then user should navigate to the new products page
    And user should be able to close the browser
		