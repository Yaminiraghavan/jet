package test;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.SearchFlightPage;

public class ConfirmationTest extends BaseClass {
   public SearchFlightPage searchFlightPage;
   public ConfirmationPage confirmationPage;

    @Test
    public void testBookingConfirmation() {
        searchFlightPage.wait("Delhi", "Mumbai", "25-02-2023");
        Assert.assertTrue(confirmationPage.isBookingConfirmed());
    }


}