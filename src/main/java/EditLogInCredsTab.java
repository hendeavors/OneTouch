import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EditLogInCredsTab {
    public WebDriver driver;

    public EditLogInCredsTab(WebDriver driver) {
        this.driver = driver;
    }

    // footers
    @FindBy(xpath = "//div[@class='container']/div[@class='row']/div[1]")
    private WebElement llcBottomLabel;
    @FindBy(xpath = "//a[@title='privacy policy']")
    private WebElement privacyPolicyBottomLabel;
    @FindBy(xpath = "//a[@title='terms and conditions']")
    private WebElement termsBottomLabel;

    //tabs
    @FindBy(xpath = "//div[@id='collapseOne']//a[@role='button']")
    private WebElement tabOne;
    @FindBy(xpath = "//div[@id='headingTwo']//a[@id='sms-expand-button']")
    private WebElement tabTwo;
    @FindBy(xpath = "//div[@id='headingThree']//a[@id='password-expand-button']")
    private WebElement tabThree;


    // Fields Tab1
    @FindBy(xpath = "//div[@id='collapseOne']//input[@name='current_password']")
    private WebElement currentPasswordTab1;
    @FindBy(xpath = "//div[@id='collapseOne']//input[@name='username']")
    private WebElement usernameTab1;
    @FindBy(xpath = "//div[@id='collapseOne']//input[@name='email']")
    private WebElement emailTab1;
    @FindBy(xpath = ".//*[@id='send-verify-button']")
    private WebElement saveButtonTab1;

    // Fields Tab2
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@name='current_password']")
    private WebElement currentPasswordTab2;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='smsverifiedphone']")
    private WebElement smsNumTab2;
    @FindBy(xpath = "//button[@id='send-verify-button']")
    private WebElement sendVerificationButton;


    // Fields Tab3
    @FindBy(xpath = "//div[@id='collapseThree']//input[@id='credentials-password-2']")
    private WebElement currentPasswordTab3;
    @FindBy(xpath = "//div[@id='collapseThree']//input[@id='credentials-password']")
    private WebElement newPasswordTab3;
    @FindBy(xpath = "//div[@id='collapseThree']//input[@id='credentials-password-confirmation']")
    private WebElement confirmPasswordTab3;
    @FindBy(xpath = "//div[@id='collapseThree']/div/form/div[4]/div/button")
    private WebElement saveButtonTab3;


    // Checking words on the page
    @FindBy(xpath = "//span[@class='help-block']/strong")
    private WebElement errorText;

    public String errorText() {
        return errorText.getText();
    }

    public boolean errorIsVisible() {
        return errorText.isDisplayed();
    }

    @FindBy(xpath = ".//*[@id='main-app-panel-container']/div/div[2]/div[1]/div")
    private WebElement messageContainer;

    public String containerText() {
        return messageContainer.getText();
    }

    public boolean containerIsVisible() {
        return messageContainer.isDisplayed();
    }


    //buttons
    @FindBy(css = ".btn.btn-primary")
    private WebElement saveNewUsernameEmailPasswordButton;

    public EditLogInCredsTab clickSendVerification() {
        sendVerificationButton.click();
        return this;
    }

    public EditLogInCredsTab typeCurrentPasswordTab1(String currentPassword1) {
        currentPasswordTab1.clear();
        currentPasswordTab1.sendKeys(currentPassword1);
        return this;
    }

    public EditLogInCredsTab typeCurrentPasswordTab2(String currentPassword2) {
        currentPasswordTab2.clear();
        currentPasswordTab2.sendKeys(currentPassword2);
        return this;
    }

    public EditLogInCredsTab typeCurrentPasswordTab3(String currentPassword3) {
        currentPasswordTab3.clear();
        currentPasswordTab3.sendKeys(currentPassword3);
        return this;
    }

    public EditLogInCredsTab typeNewUsernameTab1(String newusername) {
        usernameTab1.clear();
        usernameTab1.sendKeys(newusername);
        return this;
    }

    public EditLogInCredsTab typeNewEmailTab1(String newemail) {
        emailTab1.clear();
        emailTab1.sendKeys(newemail);
        return this;
    }

    public EditLogInCredsTab hitSaveonTab1() {
        saveButtonTab1.click();
        return this;
    }

    public EditLogInCredsTab hitSaveonTab3() {
        saveButtonTab3.click();
        return this;
    }

    public EditLogInCredsTab click3rdTab() {
        tabThree.click();
        return this;
    }

    public EditLogInCredsTab click1stTab() {
        tabOne.click();
        return this;
    }

    public EditLogInCredsTab click2ndTab() {
        tabTwo.click();
        return this;
    }

    public EditLogInCredsTab typeNewPassword(String newpassword) {
        newPasswordTab3.sendKeys(newpassword);
        return this;
    }

    public EditLogInCredsTab confirmNewPassword(String reenteredpass) {
        confirmPasswordTab3.sendKeys(reenteredpass);
        return this;
    }

    public EditLogInCredsTab typeSmsNumTab2(String sms) {
        smsNumTab2.sendKeys(sms);
        smsNumTab2.sendKeys(Keys.ENTER);
        return this;
    }

    public EditLogInCredsTab clearNumTab2() {
        smsNumTab2.clear();
        return this;
    }

    public String getLlcBottomLabel2 (){ return llcBottomLabel.getText();}
    public String getPrivacyPolicyBottomLabel2(){ return privacyPolicyBottomLabel.getText();}
    public String getTermsConditionsLabel2(){ return termsBottomLabel.getText();}


}