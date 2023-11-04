package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_RegisterPage {

    public WebElement register_BTN()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement Selectgender() {
        WebElement gender = Hooks.driver.findElement(By.id("gender-male"));
        return gender;
    }

    public WebElement Firstname()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement LasName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement dayList()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement monthList()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement yearList()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement Email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement Password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement password2()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement clk_register()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement RegisterSuccessfully() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }


}
