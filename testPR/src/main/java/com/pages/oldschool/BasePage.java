package com.pages.oldschool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo (String url) {
        driver.get(url);
    }

    protected WebElement find (By by) {
        return driver.findElement(by);
    }
}
