package com.devbook.stepDefinitions;

import com.devbook.pages.ProtonPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProtonWithParameters_StepDefs {
    ProtonPage protonPage = new ProtonPage();
    String actualUrl= Driver.get().getCurrentUrl();
    @When("User Enters {string}  and {string} credentials")
    public void user_enters_and_credentials(String username, String password) {
        protonPage.userName.sendKeys(username);
        BrowserUtils.waitFor(2);
        protonPage.passWord.sendKeys(password);

    }
    @Then("Verify this location message {string}")
    public void verify_this_location_message(String expectedUrl) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        BrowserUtils.waitFor(2);


    }
}