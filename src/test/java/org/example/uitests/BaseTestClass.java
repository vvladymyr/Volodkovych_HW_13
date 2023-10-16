package org.example.uitests;

import org.example.uitests.driver.WebDriverFactory;
import org.example.uitests.driver.WebDriverFactory2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTestClass {
    protected WebDriver driver;

    @BeforeClass
    public void beforeClass() {
//        driver = WebDriverFactory.getDriver("chrome");
//        driver = WebDriverFactory.getDriver();
//        System.setProperty("browser", "chrome");
//        driver = WebDriverFactory2.getDriver();

//        driver = WebDriverFactory.getDriver(Browser.CHROME);



//        System.setProperty("browser", "firefox");
        driver = WebDriverFactory2.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

//    public static void main(String[] args) {
//        System.getProperties().forEach((k, v) -> System.out.println(k + "   " + v));
//    }

}
