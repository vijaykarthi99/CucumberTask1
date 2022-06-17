Feature: validate a FB page

  Scenario: to validate for Login model
    Given user is on fb page
    When user enter valid usename and password
    And user click Login button
    Then user shoud be in a error page
