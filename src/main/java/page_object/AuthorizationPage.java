package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.webDriverManager;

public class AuthorizationPage {

    WebDriver driver = webDriverManager.getInstance();
    private By userNameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//h3[@'data-test=\"error\"']");

    public void authorizeUser(String username, String password){
        driver.findElement(userNameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void verifyErrorMessage (String errorMsg) {
        driver.findElement(errorMessage);
        Assert.assertEquals(errorMessage, errorMsg);
    }
}
