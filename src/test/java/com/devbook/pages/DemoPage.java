package com.devbook.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage extends BasePage{

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerBtn ;

    @FindBy(xpath = "//input[@id='gender-male']")
    public WebElement genderBtn;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement enterfirstname;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement enterlastname;


    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email;


    @FindBy(xpath = "//input[@id='Password']")
    public WebElement enterpassword;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    public WebElement enterconfirmpassword;

    @FindBy(xpath = "//input[@id='register-button']")
    public WebElement clickregisterbtn;

    @FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
    public WebElement verifyregistrationText;
    public void VerifyregistrationText(){
        Assert.assertTrue(verifyregistrationText.isDisplayed());
    }

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueBtn;

    @FindBy(xpath = " //input[@id='small-searchterms']")
    public WebElement searchstoreBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchBtn;


    @FindBy(xpath = "//input[@value='Add to cart']")
    public WebElement addtocartBtn;

    @FindBy(xpath = "//p[@class='content']")
    public WebElement verifyCartMessage;

    public void verifyCartMessage (){
        Assert.assertTrue(verifyCartMessage.getText().contains("The product has been added to your"));

    }

}
