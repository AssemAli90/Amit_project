package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_HomePage home = new P03_HomePage();


    @When("user opens facebook link")
    public void user_opens_facebook_link()
    {
        home.facebooklink().click();
    }


    @When("user opens twitter link")
    public void userOpensTwitterLink()
    {
        home.twitterlink().click();
    }


    @When("user opens rss link")
    public void userOpensRssLink()
    {
        home.rsslink().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink()
    {
        home.youtubeLink().click();
    }
    @Then("Verify {string} is opened in new tab")
    public void verifyIsOpenedInNewTab(String newSitelink)
    {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Assert.assertEquals(tabs.size(),2,"The second tab didn't open");
        Hooks.driver.switchTo().window(tabs.get(1));
        String currentUrl = Hooks.driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(currentUrl,newSitelink);
        soft.assertAll();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }



}
