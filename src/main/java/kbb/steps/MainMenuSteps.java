package kbb.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import kbb.utils.CommonMethods;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class MainMenuSteps extends CommonMethods {
//    jsClick(carValuesTitle.carValues);

    @When("I hover over {string}")
    public void i_hover_over(String string) throws InterruptedException {
        actionClass(carValuesTitle.carValues);
        Thread.sleep(2000);


    }
    @And("I click {string}")
    public void i_click(String string) throws InterruptedException {
        click(carValuesTitle.newOrUsedPrice);
        Thread.sleep(2000);
    }


    /*@Given("I click myKBB")
    public void i_click_myKBB() throws InterruptedException {
        click(carValuesTitle.myKBB);
        Thread.sleep(2000);

    }

    @Then("I click create account")
    public void i_click_create_account() throws InterruptedException {
        click(carValuesTitle.createAccount);
        Thread.sleep(2000);
    }
*/

    @Then("I verify {string} is displayed.")
    public void i_verify_is_displayed(String string) {

    }
    }
