package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D04_SearchStepDef {

    P03_HomePage home = new P03_HomePage();

    @When("user search with valid product name {string}")
    public void userSearchWithValidProductName(String arg0)
    {
        home.searchFeild().sendKeys(arg0);
        home.searchFeild().sendKeys(Keys.ENTER);
    }

    @Then("verify user find relative results {string}")
    public void verifyUserFindRelativeResults(String productName)
    {
//       SoftAssert soft = new SoftAssert();
//       String Url = Hooks.driver.getCurrentUrl();
//       soft.assertTrue(Url.contains("https://demo.nopcommerce.com/search?q="));
//       int count = home.SearchResult().getSize();
//       for (int i = 0; i < count; i++)
//        {
//            String searchResaultText = home.SearchResult().getText().toLowerCase();
//            soft.assertTrue(searchResaultText.contains(productName.toLowerCase()));
//        }


    }


    @When("user search with valid {string}")
    public void userSearchWithValid(String arg0)
    {
        home.searchFeild().sendKeys(arg0);
        home.searchFeild().sendKeys(Keys.ENTER);
    }


    @And("click on the product from search reslt")
    public void clickOnTheProductFromSearchReslt()
    {
        home.producSKUResult().click();
    }

    @Then("verify user find the exact serial {string}")
    public void verifyUserFindTheExactSerial(String serialNumber)
    {
        String SKU = home.getSkuText().getText();
        Assert.assertEquals(SKU,serialNumber);
    }




}
