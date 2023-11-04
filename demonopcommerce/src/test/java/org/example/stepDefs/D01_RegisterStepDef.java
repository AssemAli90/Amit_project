package org.example.stepDefs;

import com.sun.org.apache.bcel.internal.generic.NEW;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_RegisterPage;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {
    P01_RegisterPage register = new P01_RegisterPage();
    P03_HomePage home = new P03_HomePage();


    @Given("user go to register page")
    public void userGoToResgisterPage ()
    {
        home.register_BTN().click();
    }

    @When("user select gender type")
    public void userSelectGenderType()
    {
        register.Selectgender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1)
    {
        register.Firstname().sendKeys("Assem");
        register.LasName().sendKeys("Ali");
    }

    @And("user enter date of birth {string} {string} {string}")
    public void userEnterDateOfBirth(String arg0, String arg1, String arg2)
    {
        Select select = new Select(register.dayList());
        select.selectByValue("12");

        select = new Select(register.monthList());
        select.selectByVisibleText("May");

        select = new Select(register.yearList());
        select.selectByVisibleText("1990");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0)
    {
        register.Email().sendKeys("vip@mailinator.com");
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1)
    {
        register.Password().sendKeys("Amit@2022");
        register.password2().sendKeys("Amit@2022");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {
        register.clk_register().click();
    }

    @Then("verify success message is displayed")
    public void verifySuccessMessageIsDisplayed()
    {
        SoftAssert soft = new SoftAssert();
        String msgColor = register.RegisterSuccessfully().getCssValue("color");
        soft.assertEquals(msgColor,"rgba(76, 177, 124, 1)");
        String registerationMsg = register.RegisterSuccessfully().getText();
        soft.assertTrue(registerationMsg.contains("Your registration completed"));
        soft.assertAll();
    }


}
