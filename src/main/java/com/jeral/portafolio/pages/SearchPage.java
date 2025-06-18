package com.jeral.portafolio.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class SearchPage extends PageObject {
    @FindBy(css = "input[placeholder=\"Busca títulos, autores, categorías...\"]")
    protected WebElementFacade searchBox;

    @FindBy(css = "h1[class*='galleryTitle']")
    protected WebElementFacade tituloResultadoBusqueda;


    public void clickSearch() {
        searchBox.waitUntilClickable().click();
    }

    public void txtBook(String libro) {
        searchBox.sendKeys(libro + Keys.ENTER);
    }

    public String obtenerTituloResultado() {
        return tituloResultadoBusqueda.waitUntilVisible().getText().toLowerCase();
    }
}