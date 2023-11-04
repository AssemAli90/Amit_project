package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_LoginPage {

    public WebElement login_Email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement login_Password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement CLK_Login()
    {
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public WebElement loginFail()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }




}
