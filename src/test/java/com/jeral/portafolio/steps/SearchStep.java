package com.jeral.portafolio.steps;

import com.jeral.portafolio.pages.SearchPage;
import com.jeral.portafolio.utils.EnvReader;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchStep {
    EnvReader rnd;
    private SearchPage searchPage = new SearchPage();
    private String libroBuscado;

    @Step("Click in the search")
    public void lblSearch() {
        searchPage.clickSearch();
    }

    public SearchPage getSearchPage() {
        return searchPage;
    }

    @Step("Search book")
    public void buscarLibroAleatorio() {
        libroBuscado = EnvReader.getLibroAleatorio(); // guardas el libro aleatorio en una variable de clase
        searchPage.txtBook(libroBuscado);         // haces la búsqueda con ese valor
    }

    @Step("Validar que el título coincide con la búsqueda")
    public void validarResultadoBusqueda() {
        String titulo = searchPage.obtenerTituloResultado(); // obtienes el título que aparece en la página
        Assert.assertTrue("El título no coincide con el libro buscado. Esperado: " + libroBuscado + ", Encontrado: " + titulo,
                titulo.toLowerCase().contains(libroBuscado.toLowerCase())); // comparas ambos
    }

}

