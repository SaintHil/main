package com.devbook.pages;


import com.devbook.utilities.Driver;
import com.devbook.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(css = "#rcc-confirm-button")
    public WebElement understandBtn;

    @FindBy(className = "nav__menu-item")
    public List<WebElement> menuList;
    @FindBy(xpath = "//a[text()='Developers']")
    public WebElement developers;
    @FindBy(xpath = "//a[text()='All Posts']")
    public WebElement allPosts;

    public void navigateToMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }

    public void navigateToSubMenu(String subMenu){
        Driver.get().findElement(By.xpath("//span[text()='"+subMenu+"']")).click();
    }

    public String getTextHeader(String headerText){
        return Driver.get().findElement(By.xpath("//*[text()='"+headerText+"']")).getText();
    }
    public List<Map<String, String>> getDataList(String sheetName){
        ExcelUtil excelUtil=new ExcelUtil("src/test/resources/Batch2DevBook.xlsx",sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();
        return dataList;
    }
}
