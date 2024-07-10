package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightDetailsPage {

    private WebDriver driver;

    // Constructor
    public FlightDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements using @FindBy annotations

    @FindBy(xpath = "//button[@aria-label='Check-in']")
    public WebElement checkinbtn;

    @FindBy(id = "ControlGroupRetrieveBookingView_BookingRetrieveInputRTR")
    public WebElement ticknofield;

    @FindBy(id = "ControlGroupRetrieveBookingView_EticketInputEmail")
    public WebElement emailfield;

    @FindBy(id = "ControlGroupRetrieveBookingView_ButtonRetrieveBooking")
    public WebElement searchbkbtn;

    @FindBy(xpath = "//div[contains(@class, 'alert') and contains(text(), 'Unable')]")
    public WebElement alertnotify;

    @FindBy(xpath = "//button[@aria-label='Flight Status']")
    public WebElement flightstsbtn;

    @FindBy(id = "ControlGroupScheduleSearchView_AutoCompleteExtenderOriginStation")
    public WebElement originfield;

    @FindBy(id = "ControlGroupScheduleSearchView_AutoCompleteExtenderDestinationStation")
    public WebElement destinationfield;

    @FindBy(id = "ControlGroupScheduleSearchView_OriginDestinationMatrix1BookingView_TextBoxMarketDate1")
    public WebElement flightnofield;

    @FindBy(id = "ControlGroupScheduleSearchView_ButtonSubmit")
    public WebElement searchflightbtn;

    @FindBy(xpath = "//div[contains(@class, 'alert') and contains(text(), 'Sorry')]")
    public WebElement alertele;

    @FindBy(xpath = "//button[@aria-label='Manage Booking']")
    public WebElement managebkbtn;
}