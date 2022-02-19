package kbb.steps;

import cucumber.api.java.en.Then;
import kbb.utils.CommonMethods;
import cucumber.api.java.en.When;


public class MainMenuSteps extends CommonMethods {
//    jsClick(carValuesTitle.carValues);

    @When("I hover over {string}")
    public void i_hover_over(String string) throws InterruptedException {
        actionClass(carValuesTitle.carValues);
        Thread.sleep(2000);
    }

    @When("I click {string}")
    public void i_click(String string) {

    }

    @Then("I verify {string} is displayed.")
    public void i_verify_is_displayed(String string) {

    }
    }

