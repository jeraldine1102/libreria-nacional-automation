package com.jeral.portafolio.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/")
public class LoginPage extends PageObject {
    //selectores
    @FindBy(css = "div.gray.flex.items-center.nr4")
    protected WebElementFacade btnLoginpage;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    protected WebElementFacade inputUseremail;
    @FindBy(css = "input[type='password']")
    protected WebElementFacade inputPassword;
    @FindBy(css = "button[type='submit']")
    protected WebElementFacade btnLogin;
    @FindBy(xpath = "//p[contains(text(), \"Novedades\")]")
    protected WebElementFacade txtNovedades;
    @FindBy(xpath = "//button[contains(@class, 'closeButton')]")
    WebElementFacade btnCerrarPopup;
    @FindBy(xpath = "//div[contains(text(), \"Usuario y/o contraseña equivocada\")]")
    WebElementFacade txtLoginInvalid;

    // Acciones
    public boolean isPageOpened() {
        return txtNovedades.isVisible() && getDriver().getCurrentUrl().contains("librerianacional");
    }

    public void cerrarPopupSiExiste() {
        try {
            if (btnCerrarPopup.isVisible()) {
                btnCerrarPopup.click();
            }
        } catch (Exception e) {
            // No hace nada si no aparece
        }
    }

    public void clickLoginpage() {
        btnLoginpage.waitUntilClickable().click();
    }

    public void enterUseremail(String useremail) {
        inputUseremail.waitUntilVisible().type(useremail);
    }

    public void enterPassword(String password) {
        inputPassword.waitUntilVisible().type(password);
    }

    public void clickLogin() {
        btnLogin.waitUntilClickable().click();
    }

    public void login(String useremail, String password) {
        clickLoginpage();
        enterUseremail(useremail);
        enterPassword(password);
        clickLogin();
    }

    public boolean isMessageLoginInvalidVisible() {
        return txtLoginInvalid.isVisible();
    }
}