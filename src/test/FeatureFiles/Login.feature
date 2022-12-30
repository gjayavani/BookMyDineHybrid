@regression
Feature: login functionality
  Background:
    Given User on the homepage
    When User selects login tab
    Then User should be on the login window
  @smoke1
  #Happy path scenario
  Scenario: Verifying the user can login successfully with valid credentials
    When User enters username as bookmydinetest@gmail.com & password as BookTodayUser1
    And User selects signin link
    Then User should be logged in

  @smoke2
  #Unhappy path scenario
  Scenario Outline: Verifying the user cannot login successfully with invalid credentials
    When  User enters username as <username> & password as <password>
    And User selects signin link
    Then User should see the message <validation message>

    Examples:
      |     username       |     password    |         validation message    |
      |  abcd@gmail.com    | BookTodayUser1  |Either your username or password is invalid, Please try again.|
      |bookmydinetest@gmail.com|bookuser1    |Either your username or password is invalid, Please try again.|

  @smoke3
    #Unhappy path scenario
  Scenario Outline: Verifying the user cannot login successfully with invalid credentials
    When  User enters username as <username> & password as <password>
    And User selects signin link
    Then User should see the error message
    Examples:
      |     username       |   password    |
     # |                    |BookTodayUser1 |
     # |                    |               |
      |bookmydinetest@gmail.com|             |