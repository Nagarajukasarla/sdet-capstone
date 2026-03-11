package pages;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class WordPressPage {

    private final By wordPressTextTag = By.tagName("h1");

    public void verifyGetWordPressPage(String expected) {
        DriverManager.wait.until(
                ExpectedConditions.visibilityOfElementLocated(wordPressTextTag)
        );
        String content = DriverManager.driver.findElement(wordPressTextTag).getText();
        Assert.assertEquals(content, expected);
    }
}
