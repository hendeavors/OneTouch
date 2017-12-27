import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
    public LoginPage page;

    //Primary Elements on the page
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "///div[2]/form/div[3]/div/div/label/input")
    private WebElement rememberMeCheckBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/forgot-username']")
    private WebElement forgotUsername;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/password/reset']")
    private WebElement forgotPassword;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/enroll']")
    private WebElement createNewAccount;

    //Error Elements on the page
    @FindBy(xpath = ".//*[@id='public-layout']/div[3]/h2")
    private WebElement loginError;
    @FindBy(xpath = ".//*[@id='public-layout']/div[3]/div[7]/div/button")
    private WebElement skipLoginError;
    @FindBy(xpath = "//span[@class='help-block']/strong")
    private WebElement invalidCreds;

    //Secondary Elements on the page
    @FindBy(xpath = "//a[@title='privacy policy']")
    private WebElement privacyPolicy;
    @FindBy(xpath = "//a[@title='terms and conditions']")
    private WebElement termsAndConditions;


    public LoginPage typeUsername (String username){
        usernameField.sendKeys(username);
        return this;
    }
    public LoginPage typePassword (String password){
        passwordField.sendKeys(password);
        return this;
    }
    public LoginPage clickCheckBox (boolean value) {
        if (!rememberMeCheckBox.isSelected()== value){
            rememberMeCheckBox.click();
        }
        return this;
    }
    public LoginPage clickLogin(){
        loginButton.click();
        return this;
    }
    public void logginIn () {
        loginButton.click();
    }
    public String getErrorText () { return loginError.getText();}
    public String getInvalidCredsError () {return invalidCreds.getText();}
    public String privacyPolicyHeader () {return privacyPolicy.getText();}
    public String termsAndConditionsHeader () {return termsAndConditions.getText();}

}







