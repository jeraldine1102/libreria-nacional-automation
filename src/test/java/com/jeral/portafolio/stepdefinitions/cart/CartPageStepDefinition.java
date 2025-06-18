package com.jeral.portafolio.stepdefinitions.cart;

import com.jeral.portafolio.steps.CartStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CartPageStepDefinition {

    @Steps
    private CartStep cartStep;

    @When("I click on the book")
    public void iClickOnTheBook() {
        cartStep.seleccionarLibro();
    }

    @And("I click on the button Agregar al carrito")
    public void iClickOnTheButtonAgregarAlCarrito() {
        cartStep.agregarAlCarritoDesdeDetalle();
    }

    @Then("I should see verification text Ítem agregado al carrito")
    public void iShouldSeeVerificationTextItemAgregadoAlCarrito() {
        cartStep.verificarLibro();

    }
}
