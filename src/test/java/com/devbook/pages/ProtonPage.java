package com.devbook.pages;

import com.devbook.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProtonPage extends BasePage{

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(id = "staySignedIn")
    public WebElement signInCheck;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    public void verifyTitle(){
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("account.proton.me"));
    }
}
