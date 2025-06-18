package com.jeral.portafolio.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.jeral.portafolio.stepdefinitions",
        tags = "@login or @search or @cart"
)
public class Runner {

}
