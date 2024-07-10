package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;


public class BaseClass {

    public static WebDriver driver;
    public Actions actions;
    public SignUpPage signUpPage;
    public LoginPage loginPage;
    public SearchFlightPage searchFlightPage;
    public BookingPage bookingPage;
    public FlightDetailsPage flightDetailsPage;

    @BeforeSuite
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions = new Actions(driver);
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        searchFlightPage = new SearchFlightPage(driver);
        bookingPage = new BookingPage(driver);
        flightDetailsPage = new FlightDetailsPage(driver);
    }

    @BeforeTest
    public void launchBrowser() {
        driver.get("https://www.spicejet.com/");
    }


    public static String takeScreenshot(String testCaseName){
            TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

            File destinationFile = new File("Screenshot/"+testCaseName+ ".png");
            try {
                FileUtils.copyFile(srcFile,destinationFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String path = "<img src = " + destinationFile.getAbsolutePath() + "width = 200px height = 200px/>";
            Reporter.log(path);
            return destinationFile.getAbsolutePath();
        }
    @AfterTest
    public String tearDown(){
        driver.quit();
        return "";
    }
}



