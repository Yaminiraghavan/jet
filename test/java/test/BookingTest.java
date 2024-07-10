package test;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.BookingPage;
import static base.BaseClass.driver;

public class BookingTest extends BaseClass {

    @Test
    public void testBookingProcess() {
        // Navigate to the SpiceJet booking page
        driver.get("https://www.spicejet.com/");

        // Create BookingPage instance
        BookingPage bookingPage = new BookingPage(driver);

        // Enter passenger details
        bookingPage.firstnamefield.sendKeys("John");
        bookingPage.lastnamefield.sendKeys("Doe");
        bookingPage.phnofield.sendKeys("1234567890");
        bookingPage.emailfield.sendKeys("john.doe@gmail.com");

        // Proceed with booking
        bookingPage.continuebtn1.click();

        // Enter payment details
        bookingPage.cardnofield.sendKeys("1234567890123456");
        bookingPage.cardnamefield.sendKeys("John Doe");
        bookingPage.expmonfield.sendKeys("12");
        bookingPage.expyrfield.sendKeys("2025");
        bookingPage.cvvfield.sendKeys("123");

        // Proceed to confirm booking
        bookingPage.continuebtn3.click();

        // Assert.assertTrue(driver.getCurrentUrl().contains("confirmation"), "Booking not confirmed");
    }
}
