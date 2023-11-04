package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LoginPage;
import org.example.pages.P03_HomePage;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class D02_Login {
    P02_LoginPage Login = new P02_LoginPage();
    P03_HomePage home = new P03_HomePage();

    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        home.login_BTN().click();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1)
    {
        Login.login_Email().sendKeys("vip@mailinator.com");
        Login.login_Password().sendKeys("Amit@2022");
    }

    @And("user press on login button")
    public void userPressOnLoginButton()
    {
        Login.CLK_Login().click();
    }


    @Then("user login to the system successfully")
    public void user_Login_To_The_System_Successfully()
    {
        SoftAssert soft = new SoftAssert();
        String CurrentUrl = Hooks.driver.getCurrentUrl();
        soft.assertEquals(CurrentUrl,"https://demo.nopcommerce.com/");
        boolean myAccountTabIsDisplayed = home.My_Account().isDisplayed();
        soft.assertTrue(myAccountTabIsDisplayed);
        soft.assertAll();
    }


    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1)
    {
        Login.login_Email().sendKeys("Vipp@mailinator.com");
        Login.login_Password().sendKeys("Amit@20222");
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem()
    {
        SoftAssert soft = new SoftAssert();
        boolean msgIsContains = Login.loginFail().getText().contains("Login was unsuccessful");
        String msgColor = Login.loginFail().getCssValue("Color");
        String msgColorHexa = Color.fromString(msgColor).asHex();
        soft.assertTrue(msgIsContains);
        soft.assertEquals(msgColorHexa,"#e4434b");
        soft.assertAll();



    }
}
