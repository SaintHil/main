package com.devbook.stepDefinitions;

import com.devbook.pages.AutoPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class AutoExercize_StepDefs {

    AutoPage autopage = new AutoPage();
    Faker faker = new Faker();
    String url = "https://automationexercise.com/";


    @Given("Navigate to url")
    public void navigate_to_url() {
        Driver.get().get(url);
        BrowserUtils.waitFor(3);
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        autopage.verifyHomePageLogo();
        BrowserUtils.waitFor(3);
    }

    @When("Click to Signup Login button")
    public void click_to_signup_login_button() {
        autopage.signUpLoginBtn.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        BrowserUtils.waitFor(2);
        autopage.verifyNewUserText();
    }

    @When("Enter name and email address")
    public void enter_name_and_email_address() {
        BrowserUtils.waitFor(2);
        autopage.userName.sendKeys(faker.name().firstName());
        BrowserUtils.waitFor(3);
        autopage.emailName.sendKeys(faker.internet().emailAddress());
        BrowserUtils.waitFor(3);
    }

    @When("Click  to Signup button")
    public void click_to_signup_button() {
        autopage.signUpBtn.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Verify that  ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_ınformatıon_is_visible() {
        autopage.verifyEnterAccountText();
        BrowserUtils.waitFor(2);

    }

    @Then("Enters Title Name Email Password Date of birth")
    public void enters_title_name_email_password_date_of_birth() {
        autopage.passwordInbox.sendKeys(faker.internet().password());
        BrowserUtils.waitFor(2);
        autopage.dayIn.sendKeys("10", Keys.ENTER);
        autopage.monthIn.sendKeys("June", Keys.ENTER);
        autopage.yearIn.sendKeys("1997", Keys.ENTER);
    }

    @Then("Select checkbox sign up for our newsletter!'")
    public void select_checkbox_sign_up_for_our_newsletter() {
        BrowserUtils.waitFor(2);
        autopage.newsletterCheck.click();
    }

    @Then("Select checkbox  Receive special offers from our partners")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        autopage.partnersCheck.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Enters First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void enters_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        autopage.firstName.sendKeys(faker.name().firstName());
        BrowserUtils.waitFor(1);
        autopage.lastName.sendKeys(faker.name().lastName());
        BrowserUtils.waitFor(1);
        autopage.companyName.sendKeys(faker.company().name());
        BrowserUtils.waitFor(1);
        autopage.address1Name.sendKeys(faker.address().streetAddress());
        BrowserUtils.waitFor(1);
        autopage.address2Name.sendKeys(faker.address().fullAddress());
        BrowserUtils.waitFor(1);
        autopage.countryName.sendKeys(faker.address().country());
        BrowserUtils.waitFor(1);
        autopage.stateName.sendKeys(faker.address().state());
        BrowserUtils.waitFor(1);
        autopage.cityName.sendKeys(faker.address().cityName());
        BrowserUtils.waitFor(1);
        autopage.zipCode.sendKeys(faker.address().zipCode());
        BrowserUtils.waitFor(1);
        autopage.mobileNumber.sendKeys(faker.phoneNumber().cellPhone());
    }

    @Then("Click create Account button")
    public void click_create_account_button() {
        autopage.createAccountBtn.click();
        BrowserUtils.waitFor(2);

    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        autopage.verifyAccountCreated();
        BrowserUtils.waitFor(2);
    }

}