package test;

import base.BaseClass;
import org.testng.annotations.Test;

public class FlightDetailstest extends BaseClass {

    @Test
    public void testFlightStatusCheck() {
        // Navigate to the SpiceJet flight details page
        driver.get("https://www.spicejet.com/");

        // Enter origin, destination, and flight number
        flightDetailsPage.originfield.sendKeys("DEL");
        flightDetailsPage.destinationfield.sendKeys("BOM");
        flightDetailsPage.flightnofield.sendKeys("SG123");

        // Click on search flight button
        flightDetailsPage.searchflightbtn.click();

        // Verify flight status or other details
        // Assert.assertTrue(flightDetailsPage.alertele.isDisplayed(), "Flight not found");

    }
}
