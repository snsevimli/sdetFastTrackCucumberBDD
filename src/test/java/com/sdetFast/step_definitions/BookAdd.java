package com.sdetFast.step_definitions;

import com.sdetFast.pages.BooksPage;
import com.sdetFast.pages.DashboardPage;
import com.sdetFast.util.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAdd {


    WebDriver driver= Driver.getDriver();

    @When("librarian clicks on Books")
    public void librarian_clicks_on_books() throws InterruptedException {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.clickOnBooks.click();
        Thread.sleep(3000);
    }
    @Then("librarian fills in the blanks and click save changes")
    public void librarian_fills_in_the_blanks_and_click_save_changes() throws InterruptedException {

        BooksPage booksPage=new BooksPage();
        booksPage.addBook.click();
        Thread.sleep(2000);
        booksPage.bookName.sendKeys("Selenium");
        booksPage.isbn.sendKeys("123456789");
        booksPage.year.sendKeys("2004");
        booksPage.author.sendKeys("max payne");
        Select select=new Select(booksPage.bookCategory);
        select.selectByVisibleText("Fantasy");
        booksPage.description.sendKeys("unknown");
        booksPage.saveChanges.click();
        Thread.sleep(4000);



    }
    @Then("verifies book name on the top of the list")
    public void verifies_book_name_on_the_top_of_the_list() {
        String actual=driver.findElement(By.xpath("//table//tbody/tr[1]/td[3]")).getText();
        String expected="Selenium";
        Assert.assertEquals("books name not matching",expected,actual);
    }




}
