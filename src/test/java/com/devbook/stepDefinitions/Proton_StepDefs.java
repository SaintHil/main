package com.devbook.stepDefinitions;

import com.devbook.pages.ProtonPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Proton_StepDefs {

    ProtonPage protonPage = new ProtonPage();
    String url ="https://account.proton.me/login";
    String username ="logintest2023@proton.me";
    String password ="Test12345";

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
    }
    @When("User Enters username  and password credentials")
    public void user_enters_username_and_password_credentials() {
        protonPage.userName.sendKeys(username);
        BrowserUtils.waitFor(2);
        protonPage.passWord.sendKeys(password);
        BrowserUtils.waitFor(2);
    }
    @When("User Check the SignIn radio button")
    public void user_check_the_sign_ın_radio_button() {
        protonPage.signInCheck.click();
        BrowserUtils.waitFor(2);
    }
    @When("User Click to SignIn submit button")
    public void user_click_to_sign_ın_submit_button() {
        protonPage.signInBtn.click();
        BrowserUtils.waitFor(2);
    }
    @Then("Verify this location message")
    public void verify_this_location_message() {
        BrowserUtils.waitFor(3);
        protonPage.verifyTitle();
        BrowserUtils.waitFor(2);

    }
}
