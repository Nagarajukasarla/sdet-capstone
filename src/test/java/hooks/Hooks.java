package hooks;

import base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.initializeDriver();
        DriverManager.driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        DriverManager.driver.quit();
    }
}
