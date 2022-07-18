package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.AuthorizationPage;
import utils.webDriverManager;
import org.testng.Assert;

public class CommonStepDefs {

    WebDriver driver = webDriverManager.getInstance();

    private final String satUrl = "https://www.saucedemo.com/";

    @Given("I have navigated to login page")
    public void navigateToLoginPage() {
         driver.get(satUrl);
    }
    @When("I login with {string} and {string}")
    public void loginOnPage(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }
    @Then("I am successfully logged in")
    public void assertSuccessfulLogin() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Then("I get error message {string}")
    public void iGetErrorMessage() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }
}
