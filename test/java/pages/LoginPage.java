package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    // WebElements using @FindBy annotations
    @FindBy(xpath = "//div[text()='Login']")
    private WebElement loginTitle;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[contains(@class, 'error-message')]")
    private WebElement errorMessage;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Getter methods for private elements
    public WebElement getLoginTitle() {
        return loginTitle;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }
}