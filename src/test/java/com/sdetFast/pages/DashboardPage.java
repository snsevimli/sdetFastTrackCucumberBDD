package com.sdetFast.pages;

import com.sdetFast.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

public DashboardPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}


   @FindBy(linkText = "Users")
    public WebElement Users;
@FindBy(xpath = "//span[.='Books']")
    public WebElement clickOnBooks;






}
