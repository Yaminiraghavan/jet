package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPage {
    private WebDriver driver;

    // Constructor
    public SearchFlightPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements using @FindBy annotations

    @FindBy(xpath = "//label[@for='ctl00_mainContent_rbtnl_Trip_0']")
    public WebElement onewaybtn;

    @FindBy(xpath = "//label[@for='ctl00_mainContent_rbtnl_Trip_1']")
    public WebElement roundwaybtn;

    @FindBy(id = "ctl00_mainContent_ddl_originStation1_CTXT")
    public WebElement fromfield;

    @FindBy(id = "ctl00_mainContent_ddl_destinationStation1_CTXT")
    public WebElement tofield;

    @FindBy(xpath = "//input[@id='ctl00_mainContent_view_date1']")
    public WebElement deperaturedate;

    @FindBy(xpath = "//input[@id='ctl00_mainContent_view_date2']")
    public WebElement returndate;

    @FindBy(xpath = "//input[@id='ctl00_mainContent_btn_FindFlights']")
    public WebElement searchbtn;

    @FindBy(xpath = "//span[contains(text(),'Flight Details')]")
    public WebElement verifyele;

    public void wait(String delhi, String mumbai, String s) {
    }
}
