@API
Feature: API

  Background:
    Given the API base URL is "https://reqres.in/"

  Scenario: Get List User
    When I send a GET request to "/api/users?page=2"
    Then the response status code should be 200
    And the response should contain "page" with value "2"


  Scenario: Successfully create a user

    And the request body is:
      """
      {
      "name": "morpheus",
      "job": "leader"
      }
      """
    When I send a POST request to "/api/users"
    Then the response status code should be 201
    And the response should contain "id"