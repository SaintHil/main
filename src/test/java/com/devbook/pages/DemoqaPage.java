package com.devbook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoqaPage extends BasePage {

    @FindBy(id="uploadFile")
    public WebElement uploadFileButton;

    @FindBy(id="uploadedFilePath")
    public WebElement uploadFilePath;



}
