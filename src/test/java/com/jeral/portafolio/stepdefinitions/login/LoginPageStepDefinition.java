package com.jeral.portafolio.stepdefinitions.login;

import com.jeral.portafolio.steps.LoginStep;
import com.jeral.portafolio.utils.EnvReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginPageStepDefinition {
    @Steps
    private LoginStep loginStep; // <- DEJÁ que Serenity lo inyecte

    public LoginPageStepDefinition() {
        // Constructor vacío requerido por Cucumber + Serenity
    }

    @Given("I am on the Libreria Nacional website")
    public void iAmOnTheLibreriaNacionalWebsite() {
        loginStep.openSite();
        loginStep.closePopup();
        Assert.assertTrue(loginStep.getLoginPage().isPageOpened());
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        loginStep.btnLoginpage();
    }

    @And("I enter a valid email and password")
    public void iEnterAValidEmailAndPassword() {
        String email = EnvReader.getUseremail();
        String password = EnvReader.getPassword();

        loginStep.txtUseremail(email);
        loginStep.txtPassword(password);
        loginStep.btnlogin();

    }

    @Then("I should be redirected to my account page")
    public void iShouldBeRedirectedToMyAccountPage() {
        loginStep.openSite();
        Assert.assertTrue(loginStep.getLoginPage().isPageOpened());
    }

    @And("I enter an invalid email or password")
    public void iEnterAnInvalidEmailOrPassword() {
        String emailInvalid = EnvReader.getEmailInvalid();
        String passwordInvalid = EnvReader.getPasswordInvalid();

        loginStep.txtUseremail(emailInvalid);
        loginStep.txtPassword(passwordInvalid);
        loginStep.btnlogin();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        loginStep.txtInvalid();
    }

}
