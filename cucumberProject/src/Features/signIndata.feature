#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Sign in with multiple sets of data


@data
  Scenario Outline: validating the sign in with valid credentials
    Given user is in the homepage
    When user clicks on the sign in link
    When user enters "<email>" to the signin module
    And user enters "<password>" in the signin module
    And user clicks on sign in button
    Then user should be logged in based on "<expectedResult>"
    And user should be able to close the browser

    Examples: 
      | email                 | password   | expectedResult   |
      | test@something.com    | dasfdas    | Login - My Store |
      | mike@something.com    | ddsafdas++ | Login - My Store |
      | jim@agile.com         | ddsafdfa+  | Login - My Store |
      | mike123@something.com | ddsafdas++ | My page          |
