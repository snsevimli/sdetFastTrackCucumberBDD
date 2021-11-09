package com.sdetFast.step_definitions;

import com.sdetFast.pages.EtsyPage;
import com.sdetFast.util.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EtsyStepDef {

    EtsyPage etsyPage=new EtsyPage();
    WebDriver driver= Driver.getDriver();


    @Given("user i on the main page")
    public void user_i_on_the_main_page() {
      driver.get("https://www.etsy.com/");
    }
    @Then("user verifies title")
    public void user_verifies_title() {
        String expected="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals("title is not matching",expected,driver.getTitle());
    }


    @When("user types wooden spoon on the search box and click submit")
    public void user_types_wooden_spoon_on_the_search_box_and_click_submit() {

        etsyPage.searchBox.sendKeys("wooden spoon", Keys.ENTER);

    }
    @Then("user verifies title as wooden spoon")
    public void user_verifies_title_as_wooden_spoon() {

        String expected="Wooden spoon | Etsy";
        Assert.assertTrue(driver.getTitle().contains(expected));

    }


}
