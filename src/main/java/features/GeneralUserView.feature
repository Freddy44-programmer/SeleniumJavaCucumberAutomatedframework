Feature: General view

  Scenario: Validate general user is able to view products without logging in
    Given User navigates to the Online products page
    When User clicks on formal shoes drop down
    Then User should be able to view the Products

