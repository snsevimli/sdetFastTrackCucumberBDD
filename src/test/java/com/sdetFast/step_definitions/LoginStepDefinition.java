package com.sdetFast.step_definitions;

import com.sdetFast.pages.LoginPage;
import com.sdetFast.pages.UsersPage;
import com.sdetFast.util.ConfigurationReader;
import com.sdetFast.util.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinition {


    LoginPage loginPage=new LoginPage();
    WebDriver driver=Driver.getDriver();
    UsersPage usersPage=new UsersPage();



    @Given("user at the login page")
    public void user_at_the_login_page() {
       String url=ConfigurationReader.get("url");
       driver.get(url);
    }
    @When("student enters username and password")
    public void student_enters_username_and_password() {
        loginPage.login("studentUsername","studentPassword");
    }
    @When("student clicks on login button")
    public void student_clicks_on_login_button() throws InterruptedException {
       loginPage.submit.click();
       Thread.sleep(3000);
    }
    @Then("student verifies username at the navigation bar")
    public void student_verifies_username_at_the_navigation_bar() throws InterruptedException {
        String actual=driver.findElement(By.xpath("//a[@id='navbarDropdown']")).getText();
        Assert.assertEquals("username is not matching","Test Student 3367",actual);
        usersPage.userText.click();
        usersPage.logOut.click();
        Thread.sleep(2000);
    }

    @When("librarian enters username and password")
    public void librarian_enters_username_and_password() throws InterruptedException {
        Thread.sleep(3000);

        loginPage.login("username","password");
    }
    @When("librarian clicks on login button")
    public void librarian_clicks_on_login_button() throws InterruptedException {
       loginPage.submit.click();
        Thread.sleep(3000);

    }
    @Then("librarian verifies username at the navigation bar")
    public void librarian_verifies_username_at_the_navigation_bar() {
        String expected="Test Librarian 1261";
        String actual=driver.findElement(By.xpath("//a[@id='navbarDropdown']")).getText();
        Assert.assertEquals("user is not matching",expected,actual);
    }




}
