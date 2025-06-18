@login
Feature: Login functionality

  Background: User is on the login page
    Given I am on the Libreria Nacional website
    When I click the login button

  Scenario: Successful login
    And I enter a valid email and password
    Then I should be redirected to my account page

  Scenario: Unsuccessful login
    And I enter an invalid email or password
    Then I should see an error message
