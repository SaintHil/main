package com.devbook.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoPage extends BasePage{

    @FindBy(xpath ="//img[@alt='Website for automation practice']")
    public WebElement homePageLogo;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signUpLoginBtn;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement signUPText;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userName;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailName;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpBtn;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement enterAccountText;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInbox;

    @FindBy(id = "days")
    public WebElement dayIn;

    @FindBy(id = "months")
    public WebElement monthIn;

    @FindBy(id = "years")
    public WebElement yearIn;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheck;

    @FindBy(xpath = "//*[@id='form']/div/div/div/div/form/div[7]/label")
    public WebElement partnersCheck;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement companyName;

    @FindBy(id = "address1")
    public WebElement address1Name;

    @FindBy(id = "address2")
    public WebElement address2Name;

    @FindBy(id = "country")
    public WebElement countryName;

    @FindBy(id = "state")
    public WebElement stateName;

    @FindBy(id = "city")
    public WebElement cityName;

    @FindBy(id = "zipcode")
    public WebElement zipCode;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccountBtn;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath="//h2[.='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailInbox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPasswordInbox;

    @FindBy(xpath = "//*[@data-qa='login-button']")
    public WebElement loginAccountBtn;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement invalidText;



    public void verifyHomePageLogo(){
        Assert.assertTrue(homePageLogo.isDisplayed());
    }

    public void verifyNewUserText(){
        Assert.assertTrue(signUPText.getText().contains("New User Signup!"));
    }

    public void verifyEnterAccountText(){
        Assert.assertTrue(enterAccountText.getText().contains("ENTER ACCOUNT INFORMATION"));
    }

    public void verifyAccountCreated(){
        Assert.assertTrue(accountCreatedText.getText().contains("ACCOUNT CREATED!"));

    }
}
