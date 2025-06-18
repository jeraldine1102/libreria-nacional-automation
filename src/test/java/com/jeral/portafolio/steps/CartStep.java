package com.jeral.portafolio.steps;

import com.jeral.portafolio.pages.CartPage;
import net.thucydides.core.annotations.Step;

public class CartStep {
    private CartPage cartPage = new CartPage();

    @Step("Seleccionar un libro aleatorio")
    public void seleccionarLibro() {
        cartPage.seleccionarLibroAleatorio();
    }

    @Step("Agregar al carrito desde detalle")
    public void agregarAlCarritoDesdeDetalle() {
        cartPage.agregarAlCarrito();
    }

    @Step("Validar texto de libro agregado al carrito")
    public void verificarLibro() {
        cartPage.txtVerificacionLibro();
    }
}
