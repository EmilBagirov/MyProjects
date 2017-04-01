package com.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by bagir on 05.02.2017.
 */
public class WebDriverHolder {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebDriverHolder.driver = driver;
    }
}
