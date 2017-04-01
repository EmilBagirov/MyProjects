package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.pages.UiUtils.$;
import static com.pages.UiUtils.goTo;
import static com.pages.WaitingUtils.*;
import static org.openqa.selenium.By.cssSelector;

public class Page {
    public static final String LOGIN_INPUT = ".login>input";
    public static final String PASS_INPUT=".password>input";
    public static final String SUBMIT_BUTTON=".submit>button";
    public static final String ERROR_TEXT=".error-text";


    public void open() {
        setImplicitWait(5, TimeUnit.SECONDS);
        goTo("https://ukr.net/");
    }



    public void login (String name, String pass) {
        $(cssSelector(LOGIN_INPUT)).sendKeys(name);
        $(cssSelector(PASS_INPUT)).sendKeys(pass);
        $(cssSelector(SUBMIT_BUTTON)).click();
    }

    public String getErrorMsg() {
        return $(cssSelector(ERROR_TEXT)).getText();
    }
}
