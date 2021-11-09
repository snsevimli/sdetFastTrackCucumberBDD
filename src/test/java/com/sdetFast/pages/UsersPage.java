package com.sdetFast.pages;

import com.sdetFast.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Add User")
    public WebElement addUser;
    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(id = "user_group_id")
    public WebElement userGroup;

    @FindBy(id = "status")
    public WebElement status;
    @FindBy(name = "start_date")
    public WebElement startDate;
    @FindBy(name = "end_date")
    public WebElement endDate;

    @FindBy(id = "address")
    public WebElement adress;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChanges;

    @FindBy(xpath = "//tbody//tr[1]//td[1]/a")
    public WebElement editUser;

    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public WebElement userText;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOut;











}
