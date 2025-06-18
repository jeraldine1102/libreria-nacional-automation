package com.jeral.portafolio.steps;

import com.jeral.portafolio.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
    private LoginPage loginPage = new LoginPage();

    @Step("Open web site")
    public void openSite() {
        loginPage.open();
    }

    // ❓ Si realmente necesitas acceder a loginPage desde otro lado:
    public LoginPage getLoginPage() {
        return loginPage;
    }

    @Step("Closed Popup")
    public void closePopup() {
        loginPage.cerrarPopupSiExiste();
    }

    @Step("Click in the button login page")
    public void btnLoginpage() {
        loginPage.clickLoginpage();
    }

    @Step("Enter email")
    public void txtUseremail(String email) {
        loginPage.enterUseremail(email);
    }

    @Step("Enter password")
    public void txtPassword(String password) {
        loginPage.enterPassword(password);
    }

    @Step("Click in the button login")
    public void btnlogin() {
        loginPage.clickLogin();
    }

    @Step("Login with email and password")
    public void login(String useremail, String password) {
        loginPage.login(useremail, password);
    }

    @Step("Invalid login text")
    public void txtInvalid() {
        loginPage.isMessageLoginInvalidVisible();
    }
}
