package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PhotoDirectoryPage;

public class PhotoDirectorySteps {

    private final HomePage homePage;
    private final PhotoDirectoryPage photoDirectoryPage;

    public PhotoDirectorySteps() {
        homePage = new HomePage();
        photoDirectoryPage = new PhotoDirectoryPage();
    }

    @When("the user clicks on Community")
    public void clickOnCommunity() {
        homePage.clickOnCommunity();
    }

    @And("clicks on Photo Directory")
    public void clickOnPhotoDirectory() {
        homePage.clickOnPhotoDirectory();
    }

    @Then("the Photo Directory page should be displayed")
    public void verifyPhotoDirectoryPage() {
        homePage.verifyPhotoDirectoryPage();
    }

    @Given("the user is on the {string} page {string}")
    public void navigateToPhotoDirectory(String title, String url) {
        photoDirectoryPage.navigateToPhotoDirectory(url, title);
    }

    @When("the user searches for {string}")
    public void performSearch(String input) {
        photoDirectoryPage.performSearch(input);
    }

    @Then("the pictures related to {string} should be displayed")
    public void verifySearchRelatedPicturesDisplayed(String input) {
        photoDirectoryPage.verifyDisplayedPictures(input);
    }
}
