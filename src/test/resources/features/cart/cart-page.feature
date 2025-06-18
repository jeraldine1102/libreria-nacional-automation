@cart
Feature: books to cart

  Background: : user adds book to cart

  Scenario: the user adds book to cart
    Given I am on the Libreria Nacional website
    When I click on the book
    And I click on the button Agregar al carrito
    Then I should see verification text Ítem agregado al carrito