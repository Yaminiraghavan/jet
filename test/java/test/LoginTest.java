package test;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseClass {

    @Test
    public void testLoginWithInvalidCredentials() {
        // Navigate to the login page
        driver.get("https://example.com/login");

        // Create LoginPage instance
        LoginPage loginPage = new LoginPage(driver);

        // Enter invalid email and password
        loginPage.getEmailField().sendKeys("johndoe23@gmail.com");
        loginPage.getPasswordField().sendKeys("fAS@yakk247");

        // Click on the login button
        loginPage.getLoginButton().click();

        // Verify error message is displayed
        //Assert.assertTrue(loginPage.getErrorMessage().isDisplayed(), "Error message should be displayed for invalid credentials");
    }

    @Test
    public void testForgotPasswordLink() {
        // Navigate to the login page
        driver.get("https://www.spicejet.com/");

        // Create LoginPage instance
        LoginPage loginPage = new LoginPage(driver);

        // Click on the forgot password link
        loginPage.getForgotPasswordLink().click();
    }
}
