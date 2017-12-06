import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name='remember' and @type='checkbox']")
    private WebElement rememberMeCheckBox;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/forgot-username']")
    private WebElement forgotNameLink;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement logInButton;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/enroll']")
    private WebElement newAccountButton;

    public LoginPage typeUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }
    public LoginPage typePassword(String password) {
        passwordField.sendKeys(password);
        rememberMeCheckBox.click();
        return this;
    }
    public LoginPage markRememberMecheckBox() {
        rememberMeCheckBox.click();
        return this;
    }
    public LoginPage clickLoginButton() {
        logInButton.click();
        return this;
    }

    public LoginPage loggingIn(String username, String password) {
        this.typeUsername(username);
        this.typePassword(password);
        this.markRememberMecheckBox();
        this.clickLoginButton();
        return new LoginPage(driver);
    }

    public LoginPage createNewAccount (){
        newAccountButton.click();
        return new LoginPage(driver);
    }


}







