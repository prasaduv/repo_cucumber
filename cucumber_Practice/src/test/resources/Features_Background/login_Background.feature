Feature: Check homepage functionality

  Background: user is logged in
    Given user is on login page
    When user enter username and password
    Then user navigated to homepage

  Scenario: checking the personal details page
    When user clicks on my info link
    Then navigated to personal details

  Scenario: checking the user details page
    When user clicks on Admin link
    Then navigated to user details
