Feature: Datatable

  @Regression
  Scenario: User login with multiple credentials
    Given the following users exist:
      | username | password | email              | role    |
      | user1    | pass123  | user1@example.com  | admin   |
      | user2    | pass456  | user2@example.com  | customer|
      | user3    | pass457  | user3@example.com  | admin2  |
    When the user logs in with username "user1" and password "pass123"
    Then the login should be successful