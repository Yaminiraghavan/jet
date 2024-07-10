package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    // WebDriver instance
    private WebDriver driver;

    // Constructor
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Elements using @FindBy annotations
    @FindBy(id = "signupbtn")
    public WebElement signupbtn;

    @FindBy(id = "titleopt")
    public WebElement titleopt;

    @FindBy(id = "firstnamefield")
    public WebElement firstnamefield;

    @FindBy(id = "lastnamefield")
    public WebElement lastnamefield;

    @FindBy(id = "countryopt")
    public WebElement countryopt;

    @FindBy(id = "dobfield")
    public WebElement dobfield;

    @FindBy(id = "dateimg")
    public WebElement dateimg;

    @FindBy(id = "phnofield")
    public WebElement phnofield;

    @FindBy(id = "emailfield")
    public WebElement emailfield;

    @FindBy(id = "passfield")
    public WebElement passfield;

    @FindBy(id = "conpassfield")
    public WebElement conpassfield;

    @FindBy(id = "termscheckbox")
    public WebElement termscheckbox;

    @FindBy(id = "submitbtn")
    public WebElement submitbtn;
}