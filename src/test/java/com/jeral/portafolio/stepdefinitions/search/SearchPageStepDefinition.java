package com.jeral.portafolio.stepdefinitions.search;

import com.jeral.portafolio.pages.SearchPage;
import com.jeral.portafolio.steps.LoginStep;
import com.jeral.portafolio.utils.EnvReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchPageStepDefinition {
    @Steps
    private LoginStep loginStep;

    @Steps
    private SearchPage searchPage;

    public SearchPageStepDefinition() {
        // Constructor vacío requerido
    }

    @When("I click on search")
    public void iClickOnSearch() {
        loginStep.closePopup();
        searchPage.clickSearch();
    }

    @And("type in the book")
    public void typeInTheBook() {
        String libro = EnvReader.getLibroAleatorio();
        searchPage.txtBook(libro);
    }

    @Then("I should be redirected to the results page")
    public void iShouldBeRedirectedToTheResultsPage() {
        searchPage.obtenerTituloResultado();

    }

}
