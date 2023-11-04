package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {

    P03_HomePage home = new P03_HomePage();
    Random random = new Random();

    int SelectedMainCat = random.nextInt(7);

    List<WebElement> mainCategories = (List<WebElement>) home.maingategories();


    String maincatTitle;

    String subTitle;

    boolean isSub;



    @When("select one of the seven main categories to hover randomly")
    public void select_one_of_the_seven_main_categories_to_hover_randomly()
    {
       Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(mainCategories.get(SelectedMainCat)).perform();
       maincatTitle = mainCategories.get(SelectedMainCat).getText().toLowerCase().trim();
    }


    @And("select one of the three subcategories to hover randomly if it have")
    public void selectOneOfTheThreeSubcategoriesToHoverRandomlyIfItHave()
    {
        List<WebElement> subcat = home.subcategories((SelectedMainCat + 1));
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        if (!subcat.isEmpty())
        {
            isSub = true;
            Random random1 = new Random();
            int selectedSubCat = random1.nextInt(3);
            subTitle = subcat.get(selectedSubCat).getText().toLowerCase().trim();
            subcat.get(selectedSubCat).click();
        }
        else
        {
            isSub = false;
            mainCategories.get(SelectedMainCat).click();
        }
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Then("the page title should be the same as the selected one")
    public void thePageTitleShouldBeTheSameAsTheSelectedOne()
    {
        String pageTitle = Hooks.driver.getTitle().toLowerCase().trim();

        if (isSub)
        {
            System.out.println("this sub category of : " + maincatTitle);
            System.out.println("page Title:" + pageTitle);
            System.out.println("sub category name : " +subTitle);
            Assert.assertTrue(pageTitle.contains(subTitle));
        }
        else
        {
            System.out.println("this main category");
            System.out.println("category name : " + maincatTitle) ;
            System.out.println("page title : " + pageTitle);
            Assert.assertTrue(pageTitle.contains(maincatTitle));
        }



    }






}
