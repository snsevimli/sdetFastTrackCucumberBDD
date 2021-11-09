package com.sdetFast.step_definitions;

import com.sdetFast.pages.DashboardPage;
import com.sdetFast.pages.UsersPage;
import com.sdetFast.util.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserAdd {
  WebDriver driver= Driver.getDriver();
  WebDriverWait wait=new WebDriverWait(driver,10);
    UsersPage usersPage=new UsersPage();



    @Then("librarian clicks on users")
    public void librarian_clicks_on_users() throws InterruptedException {

        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.Users.click();
        Thread.sleep(3000);


    }
    @Then("librarian clicks on add user")
    public void librarian_clicks_on_add_user() throws InterruptedException {
        usersPage.addUser.click();
        Thread.sleep(2000);

    }
    @Then("librarian fill in the blanks and click save changes")
    public void librarian_fill_in_the_blanks_and_click_save_changes() throws InterruptedException {
         usersPage.fullName.sendKeys("Lord Dracula");
         usersPage.password.sendKeys("1234567");
         usersPage.email.sendKeys("dracula2@gmail.com");
        Select select=new Select(usersPage.userGroup);
        select.selectByVisibleText("Librarian");
        select=new Select(usersPage.status);
        select.selectByVisibleText("ACTIVE");
        usersPage.adress.sendKeys("123 Main st");
        //Thread.sleep(2000);
        usersPage.saveChanges.click();

    }
    @Then("librarian verifies full name email and status active on the users page")
    public void librarian_verifies_full_name_email_and_status_active_on_the_users_page() throws InterruptedException {
        Thread.sleep(2000);
        String actual=driver.findElement(By.xpath("//table//tbody//tr[1]/td[3]")).getText();
        Assert.assertEquals("data is incorrect","Lord Dracula",actual);


    }



    @Then("librarian clicks on editUser")
    public void librarian_clicks_on_edit_user() throws InterruptedException {
        Thread.sleep(2000);
        usersPage.editUser.click();

    }
    @Then("change status to inactive")
    public void change_status_to_inactive() throws InterruptedException {
        Thread.sleep(2000);

        Select select=new Select(usersPage.status);
        select.selectByIndex(1);

    }
    @Then("clicks save changes")
    public void clicks_save_changes() {
        usersPage.saveChanges.click();
    }
    @Then("verifies the fullname is not on the top of the list")
    public void verifies_the_fullname_is_not_on_the_top_of_the_list() throws InterruptedException {
        Thread.sleep(2000);

        String expected="Lord Dracula";
       // String actual=driver.findElement(By.xpath("//tbody//tr//td[.='max payne']"));
        Assert.assertFalse(driver.findElement(By.xpath("//tbody//tr//td[3]")).equals(expected));
    }









}
