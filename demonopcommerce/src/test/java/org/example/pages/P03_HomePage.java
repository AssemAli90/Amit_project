package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class  P03_HomePage {



    public WebElement register_BTN()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }


    public WebElement login_BTN()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }



    public WebElement My_Account()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }


    public WebElement Currency()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }


    public WebElement searchFeild()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement SearchResult()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"]"));
    }


//    public WebElement SearchResult()
//    {
//        return Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"]"));
//    }


    public WebElement producSKUResult()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"]"));
    }


    public WebElement getSkuText()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"] span[class=\"value\"]"));
    }


    public WebElement maingategories()
    {
        return Hooks.driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }


    public List<WebElement> subcategories (int selectMainCat)
    {
        return Hooks.driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)["+selectMainCat+"]/li"));
    }


    public WebElement iphoneSlider()
    {
        return Hooks.driver.findElement(By.cssSelector(".nivoSlider > a:nth-of-type(1)"));
    }


    public WebElement glaxySlider()
    {
        return Hooks.driver.findElement(By.cssSelector(".nivoSlider > a:nth-of-type(2)"));
    }


    public WebElement facebooklink()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"]"));
    }


    public WebElement twitterlink()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"]"));
    }


    public WebElement rsslink()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"]"));
    }


    public WebElement youtubeLink()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"]"));
    }


    public WebElement wishListHtcButton()
    {
        return Hooks.driver.findElement(By.cssSelector("\"body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button"));
    }


    public WebElement successMessageBar()
    {
        return Hooks.driver.findElement(By.cssSelector("#bar-notification > div"));
    }


    public WebElement successMessageText()
    {
        return Hooks.driver.findElement(By.cssSelector("#bar-notification > div > p"));
    }


    public WebElement wishListBarButton()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }


    public WebElement qtyNumber()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }


}
