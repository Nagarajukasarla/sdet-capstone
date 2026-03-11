package stepdefinitions;

import base.DriverManager;
import io.cucumber.java.en.Given;

public class CommonSteps {

    @Given("the user is on the WordPress homepage {string}")
    public void navigateToWordpressHomePage(String url) {
        DriverManager.driver.get(url);
    }
}
