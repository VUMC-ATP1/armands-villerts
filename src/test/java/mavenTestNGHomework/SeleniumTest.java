package mavenTestNGHomework;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeleniumTest {

    boolean headless = true;
    FirefoxDriver webDriver;
    HtmlUnitDriver headlessDriver;

    private final String satUrl1 = "https://manjaro.org/";
    private final String satUrl2 = "https://www.selenium.dev/";

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        if (headless) {
            headlessDriver = new HtmlUnitDriver(BrowserVersion.CHROME);
            headlessDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        } else {
            webDriver = new FirefoxDriver();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (headless) {
            headlessDriver.quit();
        } else {
            webDriver.close();
        }
    }

    @Test(enabled = false)
    public void firefoxBrowserTest1() {
        webDriver.get(satUrl1);
        Assert.assertEquals(webDriver.getCurrentUrl(), satUrl1);
        Assert.assertEquals(webDriver.getTitle(), "Manjaro");
    }

    @Test(enabled = false)
    public void firefoxBrowserTest2() {
        webDriver.get(satUrl2);
        Assert.assertEquals(webDriver.getCurrentUrl(), satUrl2);
        Assert.assertEquals(webDriver.getTitle(), "Selenium");
    }

    @Test(enabled = true)
    public void headlessBrowserTest2() {
        headlessDriver.get(satUrl2);
        Assert.assertEquals(headlessDriver.getCurrentUrl(), satUrl2);
        Assert.assertEquals(headlessDriver.getTitle(), "Selenium");
    }
}
