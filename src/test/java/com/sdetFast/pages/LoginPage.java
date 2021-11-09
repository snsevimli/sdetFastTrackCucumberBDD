package com.sdetFast.pages;

import com.sdetFast.util.ConfigurationReader;
import com.sdetFast.util.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver= Driver.getDriver();

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#inputEmail")
    public WebElement email;
    @FindBy(css = "#inputPassword")
    public WebElement password;
    @FindBy(css = ".btn.btn-lg.btn-primary.btn-block")
    public WebElement submit;

public void login(){

    email.sendKeys(ConfigurationReader.get(""));
    password.sendKeys(ConfigurationReader.get(""));
    submit.sendKeys();
}

public void login(String username, String password){

    email.sendKeys(ConfigurationReader.get(username));
    this.password.sendKeys(ConfigurationReader.get(password));
    submit.click();

}










}
