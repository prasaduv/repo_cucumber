Feature: 

  Scenario Outline: 
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user navigated to the homepage

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |