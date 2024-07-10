package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

    private WebDriver driver;

    // Constructor
    public BookingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements using @FindBy annotations

    @FindBy(id = "ControlGroupBookingView_PassengerInputContactName_FirstName")
    public WebElement firstnamefield;

    @FindBy(id = "ControlGroupBookingView_PassengerInputContactName_LastName")
    public WebElement lastnamefield;

    @FindBy(id = "ControlGroupBookingView_PassengerInputContact_Phone")
    public WebElement phnofield;

    @FindBy(id = "ControlGroupBookingView_PassengerInput_Email")
    public WebElement emailfield;

    @FindBy(id = "ControlGroupBookingView_PassengerInputContactName_FirstName")
    public WebElement passfirstnamefield;

    @FindBy(id = "ControlGroupBookingView_PassengerInputContactName_LastName")
    public WebElement passlastnamefield;

    @FindBy(xpath = "//button[@id='ControlGroupBookingView_AvailabilityInputSearchView_ButtonSubmit']")
    public WebElement continuebtn1;

    @FindBy(xpath = "//button[@id='ControlGroupBookingView_ButtonSubmit']")
    public WebElement continuebtn2;

    // Additional elements (adjust these based on the actual page structure)
    @FindBy(xpath = "//button[@id='notification-close']")
    public WebElement notifyXbtn;

    @FindBy(id = "ControlGroupBookingView_paymentDetails_creditCard")
    public WebElement cardnofield;

    @FindBy(id = "ControlGroupBookingView_paymentDetails_nameOnCard")
    public WebElement cardnamefield;

    @FindBy(id = "ControlGroupBookingView_paymentDetails_expiryMonth")
    public WebElement expmonfield;

    @FindBy(id = "ControlGroupBookingView_paymentDetails_expiryYear")
    public WebElement expyrfield;

    @FindBy(id = "ControlGroupBookingView_paymentDetails_securityCode")
    public WebElement cvvfield;

    @FindBy(xpath = "//button[@id='ControlGroupBookingView_ButtonSubmit']")
    public WebElement continuebtn3;
}
