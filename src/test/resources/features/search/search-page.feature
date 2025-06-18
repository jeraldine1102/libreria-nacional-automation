@search
Feature: books search

  Background: User make a search

  Scenario: the user performs a book search
    Given I am on the Libreria Nacional website
    When I click on search
    And type in the book
    Then I should be redirected to the results page