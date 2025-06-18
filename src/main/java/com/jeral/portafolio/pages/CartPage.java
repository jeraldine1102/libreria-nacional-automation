package com.jeral.portafolio.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.Random;

public class CartPage extends PageObject {

    @FindBy(css = "article.vtex-product-summary-2-x-element")
    private List<WebElementFacade> listaLibros;

    @FindBy(xpath = "(//button[.//span[text()='Agregar al carrito']])[1]")
    protected WebElementFacade btnAgregarCarrito;

    @FindBy(xpath = "//div[text()='Ítem agregado al carrito']")
    protected WebElementFacade txtLibroAgregado;

    public void seleccionarLibroAleatorio() {
        if (listaLibros.isEmpty()) {
            throw new RuntimeException("No hay libros disponibles.");
        }

        int index = new Random().nextInt(listaLibros.size());
        WebElementFacade libro = listaLibros.get(index);

        // Scroll
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", libro);
        libro.waitUntilClickable().click();
    }

    public void agregarAlCarrito() {
        btnAgregarCarrito.waitUntilClickable().click();
    }

    public void txtVerificacionLibro() {
        assert txtLibroAgregado.waitUntilVisible().isDisplayed();
    }


}
