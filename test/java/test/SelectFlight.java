package test;

import base.BaseClass;
import org.testng.annotations.Test;

public class SelectFlight extends BaseClass {

    @Test
    public void selectFlight(){

        searchFlightPage.onewaybtn.click();

        searchFlightPage.fromfield.sendKeys("Chennai");

        searchFlightPage.tofield.clear();

        searchFlightPage.tofield.sendKeys("Delhi");

        searchFlightPage.deperaturedate.click();

        actions.click(searchFlightPage.searchbtn).perform();

        actions.click(searchFlightPage.onewaybtn).perform();

        // Assert.assertEquals(driver.getCurrentUrl(), "https://www.spicejet.com/booking");
    }
}