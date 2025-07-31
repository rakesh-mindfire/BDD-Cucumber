@Web
Feature: Login Functionality

  @Smoke
  Scenario: Successful login with valid credentials
    Given user is on login page
    When user entered the userName "Admin" and password "admin123" & click on login button
    Then user should navigates to Home Page.
    And Close the browser.


    @Regression
  Scenario Outline: : Verify the login with valid & invalid credntials
    Given user is on login page
    When user entered the userName "<email>" and password "<password>" & click on login button
    Then user should navigates to Home Page.
    And Close the browser.
    Examples:
      | email | password |
      | Admin | admin123 |
      | Admin1 | admin1234 |