import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){

    }
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy (xpath = "//input[@type='checkbox']")
    private WebElement checkbox;
    @FindBy (xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy (xpath = "//a[text()='Forgot Your Username?']")
    private WebElement forgotUsername;
    @FindBy (xpath = "//a[text()='Forgot Your Password?']")
    private WebElement forgotPassword;
    @FindBy (xpath = "//div[@class='container']/div[@class='row']/div[1]")
    private WebElement llcBottomLabel;
    @FindBy (xpath = "//a[@title='privacy policy']")
    private WebElement privacyPolicyBottomLabel;
    @FindBy (xpath = "//a[@title='terms and conditions']")
    private WebElement termsBottomLabel;
    @FindBy (xpath = "//a[text()='Create a new account']")
    private WebElement createNewAccButton;
    @FindBy (xpath = ".//*[@id='public-layout']/header/nav/div/a/img")
    private WebElement headerPicture;
    @FindBy (xpath = "//section[@class='enrollment-type-details']/h2")
    private WebElement fullEnrollHeading;
    @FindBy (xpath = "//div[2]/section/h2")
    private WebElement shortEnrollHeading;
    @FindBy (xpath = ".//*[@id='public-layout']/div[3]/h2")
    private WebElement authFailure;
    @FindBy (xpath = "//button[@class='confirm']")
    private WebElement failureOkButton;
    @FindBy (xpath = "//span[@class='help-block']/strong")
    private WebElement invalidCredError;




   public LoginPage typeUsername (String username){
       usernameField.sendKeys(username);
       return this;
   }
    public LoginPage typePassword (String password){
        passwordField.sendKeys(password);
        return this;
    }
    public LoginPage clickCheckbox (){
        checkbox.click();
        return this;
    }
    public LoginPage clickLoginButton (){
        loginButton.click();
        return this;
    }
    public LoginPage clickCreateNewAcc (){
       createNewAccButton.click();
       return this;
    }
    public LoginPage clickFailureOK(){
       failureOkButton.click();
       return this;
    }


    public LoginPage logInToTheAccount (String username, String password){
       this.typeUsername(username);
       this.typePassword(password);
       this.clickCheckbox();
       this.clickLoginButton();
       return new LoginPage(driver);
    }

    public String getShortHeadingText () {return shortEnrollHeading.getText();}
    public String getFullHeadingText () {return fullEnrollHeading.getText();}
    public String getLlcBottomLabel (){ return llcBottomLabel.getText();}
    public String getPrivacyPolicyBottomLabel(){ return privacyPolicyBottomLabel.getText();}
    public String getTermsConditionsLabel(){ return termsBottomLabel.getText();}
    public String getFailureText () {return authFailure.getText();}
    public String getInvalidCredsError () {return invalidCredError.getText();}

}


