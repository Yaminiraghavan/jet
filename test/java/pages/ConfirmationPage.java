package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
    public WebDriver driver;

    @FindBy(xpath = "//h2[contains(text(), 'Booking Confirmation')]")
    private WebElement confirmationMessage;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isBookingConfirmed() {
        return confirmationMessage.isDisplayed();
    }
}
