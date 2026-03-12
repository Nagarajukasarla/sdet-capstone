package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.WordPressPage;

public class GetWordPressSteps {

    private final HomePage homePage;
    private final WordPressPage wordPressPage;

    public GetWordPressSteps() {
        homePage = new HomePage();
        wordPressPage = new WordPressPage();
    }

    @When("the user mouse hovers on Extend")
    public void hoverOnExtend() {
        homePage.hoverOnExtendButton();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }

    @And("clicks on Get WordPress")
    public void clickOnGetWordpress() {
        homePage.clickGetWordPress();
    }

    @Then("the Get WordPress page should be displayed")
    public void verifyGetWordPressPage() {
        wordPressPage.verifyGetWordPressPage("Get WordPress");
    }
}
