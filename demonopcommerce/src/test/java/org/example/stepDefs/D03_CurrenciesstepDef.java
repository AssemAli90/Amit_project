package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class D03_CurrenciesstepDef {

    P03_HomePage home = new P03_HomePage();



    @When("user select euro currency")
    public void user_select_euro_currency()
    {
        Select select = new Select(home.Currency());
        select.selectByVisibleText("Euro");
    }

    @Then("euro symbol is displayed successfully on all four products")
    public void euroSymbolIsDisplayedSuccessfullyOnAllFourProducts()
    {

    }





 }
