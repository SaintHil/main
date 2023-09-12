package com.devbook.stepDefinitions;

import com.devbook.pages.DemoPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Demowebshop_StepDefs {

    DemoPage demoPage = new DemoPage();
    String url ="https://demowebshop.tricentis.com/";


    @Given("Navigate to web page url")
    public void navigate_to_web_page_url() {
        Driver.get().get(url);
        BrowserUtils.waitFor(3);
    }
    @When("Click to register link")
    public void click_to_register_link() {
       demoPage.registerBtn.click();
    }
    @When("Enter to form user info")
    public void enter_to_form_user_info() {
       demoPage.genderBtn.click();
       demoPage.enterfirstname.sendKeys("Saint");
       demoPage.enterlastname.sendKeys("Hill");
       demoPage.email.sendKeys("sainthill1996@gmail.com");
       demoPage.enterpassword.sendKeys("123456");
       demoPage.enterconfirmpassword.sendKeys("123456");

    }
    @When("Click to register button")
    public void click_to_register_button() {
        demoPage.clickregisterbtn.click();

    }
    @Then("Verify to text message {string}")
    public void verify_to_text_message(String string) {
        Assert.assertEquals(demoPage.verifyregistrationText.getText(),"Your registration completed");

    }
    @Then("Click to continue button")
    public void click_to_continue_button() {
        demoPage.continueBtn.click();

    }
    @When("Enter the search box  {string}")
    public void enter_the_search_box(String string) {
        demoPage.searchstoreBox.sendKeys("Computing and Internet");

    }
    @When("Click to search box button")
    public void click_to_search_box_button() {
        demoPage.searchBtn.click();

    }
    @When("Add to cart product")
    public void add_to_cart_product() {
        demoPage.addtocartBtn.click();

    }
    @Then("Verify add to cart message {string}")
    public void verify_add_to_cart_message(String cartMessage) {
        Assert.assertTrue(cartMessage,demoPage.verifyCartMessage.isDisplayed());

    }
}
