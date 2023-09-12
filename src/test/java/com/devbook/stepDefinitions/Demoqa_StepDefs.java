package com.devbook.stepDefinitions;

import com.devbook.pages.DemoqaPage;
import com.devbook.utilities.BrowserUtils;
import com.devbook.utilities.ConfigurationReader;
import com.devbook.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Demoqa_StepDefs {
    DemoqaPage demoqaPage = new DemoqaPage();
    String filePath = "C:\\Users\\saint\\Desktop\\TestAziz.txt";
    @Given("User is on the Demoqa upload page")
    public void user_is_on_the_demoqa_upload_page() {
       Driver.get().get("https://demoqa.com/upload-download/");
      // Driver.get().get(ConfigurationReader.get());
        BrowserUtils.waitFor(2);
    }
    @When("User click to upload button and choose file")
    public void userClickToUploadButtonAndChooseFile() {
       demoqaPage.uploadFileButton.sendKeys(ConfigurationReader.get("filePath"));
    }
    @Then("Verify that choose file path message")
    public void verifyThatChooseFilePathMessage() {
        Assert.assertEquals("C:\\fakepath\\TestAziz.txt", demoqaPage.uploadFilePath.getText());
    }
}