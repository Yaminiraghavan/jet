package test;

import base.BaseClass;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SignUpPageTest extends BaseClass {

    @Test
    public void testSignUp() {
        // Click on Sign Up button to open registration form
        signUpPage.signupbtn.click();

        // Switch to the new window (assuming sign up opens in a new window/tab)
        Set<String> windows = driver.getWindowHandles();
        List<String> windowHandles = new ArrayList<>(windows);
        driver.switchTo().window(windowHandles.get(1));

        // Fill out the registration form
        Select titleDropdown = new Select(signUpPage.titleopt);
        titleDropdown.selectByValue("MR");

        signUpPage.firstnamefield.sendKeys("John");
        signUpPage.lastnamefield.sendKeys("Doe");

        Select countryDropdown = new Select(signUpPage.countryopt);
        countryDropdown.selectByVisibleText("Japan");

        signUpPage.dobfield.sendKeys("24/10/1998");
        signUpPage.dateimg.click();

        signUpPage.phnofield.sendKeys("3428769026");
        signUpPage.emailfield.sendKeys("johndoe23@gmail.com");
        signUpPage.passfield.sendKeys("fAS@yakk247");
        signUpPage.conpassfield.sendKeys("fAS@yakk247");

        actions.click(signUpPage.termscheckbox).perform();

        signUpPage.submitbtn.click();

        // Assert.assertTrue(condition, "Assertion message");
        // Assert.assertEquals(actualValue, expectedValue, "Assertion message");
    }


}