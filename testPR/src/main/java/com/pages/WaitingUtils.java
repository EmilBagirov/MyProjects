package com.pages;

import java.util.concurrent.TimeUnit;

import static com.pages.WebDriverHolder.*;

/**
 * Created by bagir on 05.02.2017.
 */
public class WaitingUtils {
    public static void setImplicitWait(long time, TimeUnit unit) {
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
}
