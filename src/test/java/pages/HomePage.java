package pages;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class HomePage {

    private final By headerNavList = By.xpath("//ul[@aria-label='Main']");

    private final By extendButtonItem = By.xpath("./li[4]");
    private final By wordPressButton = By.linkText("Get WordPress");
    private final By communityButton = By.xpath(".//button[contains(@aria-label, 'Community')]");

    // Testing context dependent search using xpath
    private final By photoDirectoryLink = By.xpath(".//a[contains(@href, 'photos')]");


    private static final Logger logger = Logger.getLogger(HomePage.class.getName());

    public void hoverOnExtendButton() {
        try {
            WebElement element = DriverManager.driver.findElement(headerNavList);

            WebElement extendButton = element.findElement(extendButtonItem);

            Actions actions = new Actions(DriverManager.driver);
            actions.moveToElement(extendButton).perform();

        } catch (Exception e) {
            logger.info("Element not found: " + e.getMessage());
        }
    }

    public void clickGetWordPress() {
        DriverManager.wait.until(
                ExpectedConditions.visibilityOfElementLocated(wordPressButton)
        );
        DriverManager.driver.findElement(wordPressButton).click();
    }

    public void clickOnCommunity() {
        DriverManager.wait.until(
                ExpectedConditions.visibilityOfElementLocated(communityButton)
        );
        WebElement element = DriverManager.driver.findElement(headerNavList);

        element.findElement(communityButton).click();
    }

    public void clickOnPhotoDirectory() {
        DriverManager.wait.until(
                ExpectedConditions.visibilityOfElementLocated(headerNavList)
        );

        WebElement header = DriverManager.driver.findElement(headerNavList);
        header.findElement(photoDirectoryLink).click();
    }

    public void verifyPhotoDirectoryPage() {
        String title = DriverManager.driver.getTitle();

        if (title != null) {
            if (title.contains("Photo Directory")) {
                logger.info("Successfully Navigated to Photo Directory Page");
                return;
            }
            logger.info("Navigation to Photo Directory page is failed. Title=" + title);
            return;
        }
        logger.info("Title is null. Expected: " + "Photo Directory");
    }
}
