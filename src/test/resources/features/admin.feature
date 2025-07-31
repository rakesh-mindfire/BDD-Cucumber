@Web
Feature: Admin
@Smoke
  Scenario: Search a user by userName
    Given user is on login page
    When user entered the userName "Admin" and password "admin123" & click on login button
    Then user is on Home page.
    When user click on Admin.
    Then user should be navigates to Admin/user management page.
    When user entered a username "Admin" & click on search.
    Then list of user should display with Same userName.
    And Close the browser.