package com.sdetFast.pages;

import com.sdetFast.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="Add Book" )
    public WebElement addBook;
    @FindBy(name = "name")
    public WebElement bookName;
    @FindBy(name = "isbn")
    public WebElement isbn;
    @FindBy(name = "year")
    public WebElement year;
    @FindBy(xpath = "//input[@name='author']")
    public WebElement author;
    @FindBy(name = "book_category_id")
    public WebElement bookCategory;
    @FindBy(id = "description")
    public WebElement description;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChanges;











}
