package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.pages.WebDriverHolder.*;

public class UiUtils {

    public static WebElement $(By by) {
        return getDriver().findElement(by);
    }
    public static void goTo (String url) {
        getDriver().get(url);
    }
}
