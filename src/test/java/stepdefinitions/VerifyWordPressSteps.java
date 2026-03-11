package stepdefinitions;

import base.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyWordPressSteps {

    @Given("the user launches the browser")
    public void launchBrowser() {}

    @When("the user navigates to {string}")
    public void navigateToSite(String url) {
        DriverManager.driver.get(url);
    }

    @Then("the page title should be {string}")
    public void verifyTitle(String expectedTitle) {
        String actualTitle = DriverManager.driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
