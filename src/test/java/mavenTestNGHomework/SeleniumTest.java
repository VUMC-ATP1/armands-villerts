package mavenTestNGHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
    FirefoxDriver webDriver;

    private final String satUrl1 = "https://manjaro.org/";
    private final String satUrl2 = "https://www.selenium.dev/";

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        webDriver = new FirefoxDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        webDriver.close();
    }

    @Test
    public void firefoxBrowserTest1() {
        webDriver.get(satUrl1);
        Assert.assertEquals(webDriver.getCurrentUrl(), satUrl1);
        Assert.assertEquals(webDriver.getTitle(), "Manjaro");
    }

    @Test
    public void firefoxBrowserTest2() {
        webDriver.get(satUrl2);
        Assert.assertEquals(webDriver.getCurrentUrl(), satUrl2);
        Assert.assertEquals(webDriver.getTitle(), "Selenium");
    }
}
