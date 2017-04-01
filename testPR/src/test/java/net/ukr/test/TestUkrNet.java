package net.ukr.test;
import com.pages.WebDriverHolder;
import com.pages.oldschool.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.applet.Main;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestUkrNet {

    WebDriver driver;
    MainPage mainPage;
    com.pages.oldschool.MainPage mp;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        WebDriverHolder.setDriver(driver);
        mainPage=new MainPage();
        mp = new com.pages.oldschool.MainPage(driver);

    }

    @Test
    public void testOldSchoolPage () {
        mp.goTo("jkj");
        mp.fillUserName("Hello");
    }

    /*@Test
    public void shouldBeErrorMsg() {
        page.open();
        page.login("dkjkdjk", "dddddd");
        String err = page.getErrorMsg();
        assertThat (err, equalTo("khjhjh"))
    }*/

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
