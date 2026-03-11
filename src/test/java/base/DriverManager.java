package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void initializeDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public static void initializeDriver(Duration duration) {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, duration);
    }
}
