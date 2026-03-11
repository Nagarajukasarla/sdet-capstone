package pages;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.logging.Logger;


public class PhotoDirectoryPage {

    private final Logger logger = Logger.getLogger(PhotoDirectoryPage.class.getName());

    private final By searchField = By.xpath("//input[@placeholder='Search photos']");
    private final By itemsList = By.xpath("//ul[contains(@class,'wp-block-post-template')]");
    private final By searchResultText = By.xpath("//main//h1");

    public void navigateToPhotoDirectory(String url, String expectedTitle) {
        DriverManager.driver.get(url);

        String title = DriverManager.driver.getTitle();
        Assert.assertNotNull(title);

        if (title.contains(expectedTitle)) {
            logger.info("Successfully Navigated to Photo Directory");
        }
    }

    public void performSearch(String input) {
        DriverManager.wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchField)
        );

        WebElement searchInputField = DriverManager.driver.findElement(searchField);
        searchInputField.sendKeys(input);
        searchInputField.submit();
    }

    public void verifyDisplayedPictures(String input) {
        WebElement searchItems = DriverManager.wait.until(
                ExpectedConditions.visibilityOfElementLocated(itemsList)
        );

        Assert.assertNotNull(searchItems, "Search Items Not Found");

        List<WebElement> items = searchItems.findElements(By.tagName("li"));
        logger.info(items.size() + " Items Found");

        WebElement resultText = DriverManager.wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchResultText)
        );
        Assert.assertNotNull(resultText, "Search Results not found!");

        if (resultText.getText().contains(input)) {
            logger.info("Pictures Loaded Successfully");
        }
    }
}
