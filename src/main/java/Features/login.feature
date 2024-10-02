Feature: Login Action

  Scenario: Successful login with valid Credentials
    Given User is on landing Page
    When User Navigate to login Page
    And User enters username and password
    Then Message displayed login successfully