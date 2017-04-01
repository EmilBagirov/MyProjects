package com.pages.oldschool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends BasePage {

    @FindBy(how = How.CSS, using = ".login>input")
    WebElement loginName;


    public static final By LINK1 = By.cssSelector("hjjkkhjkh");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void fillUserName(String name) {
        loginName.sendKeys(name);
    }

}
