package test;

import base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import pages.*;

public class BaseTest extends BaseClass {
    public static WebDriver driver;
    public SignUpPage signUpPage;
    public LoginPage loginPage;
    public SearchFlightPage searchFlightPage;
    public BookingPage bookingPage;
    public ConfirmationPage confirmationPage;

    public static WebDriver launchBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions op = new ChromeOptions();
            // op.addArguments("--headless=new");
            op.addArguments("--disable-notifications");
            op.addArguments("start-maximized");
            driver = new ChromeDriver(op);
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions op = new EdgeOptions();
            // op.addArguments("--headless");
            op.addArguments("--disable-notifications");
            op.addArguments("start-maximized");
            driver = new EdgeDriver(op);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions op = new FirefoxOptions();
            // op.addArguments("--headless");
            op.addArguments("--disable-notifications");
            op.addArguments("start-maximized");
            driver = new FirefoxDriver(op);
        }
        return driver;
    }

    @BeforeMethod
    public void setUp(String browser) {
        driver = launchBrowser(browser);
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        searchFlightPage = new SearchFlightPage(driver);
        bookingPage = new BookingPage(driver);
        confirmationPage = new ConfirmationPage(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        driver.quit();
        }

    }



