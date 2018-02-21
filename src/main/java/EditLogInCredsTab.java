import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EditLogInCredsTab {
    WebDriver driver;
    public EditLogInCredsTab(WebDriver driver) {
        this.driver = driver;
    }
    // footers
    @FindBy (xpath = "//div[@class='container']/div[@class='row']/div[1]")
    private WebElement llcBottomLabel;
    @FindBy (xpath = "//a[@title='privacy policy']")
    private WebElement privacyPolicyBottomLabel;
    @FindBy (xpath = "//a[@title='terms and conditions']")
    private WebElement termsBottomLabel;

    //Headertabs
    @FindBy(xpath = ".//*[@id='headingOne']/h4/a")
    private WebElement changeUsernameOrEmailTab;
    @FindBy(css = "#password-expand-button")
    private WebElement changePasswordTab;

    // Fields
    @FindBy(css = "#credentials-password")
    private WebElement passwordField;
    @FindBy(css = "#credentials-user-name")
    private WebElement usernameField;
    @FindBy(css = "#credentials-email")
    private WebElement emailField;
    @FindBy(css = "#credentials-password-2")
    private WebElement currentPasswordField;
    @FindBy(css = "#credentials-password")
    private WebElement newPasswordField;
    @FindBy(css = "#credentials-password-confirmation")
    private WebElement repeatNewPasswordField;

    // Checking words on the page
    @FindBy(css = ".required-indicator")
    private WebElement requiredIndicator;
    @FindBy(xpath = "//span[@class='help-block']/strong")
    List<WebElement> theSamePassError;


    public String theSamePassTextError1 () {return theSamePassError.get(0).getText();}
    public String theSamePassTextError2 () {return theSamePassError.get(1).getText();}

    public boolean shouldBeTwoErrors ( ){
        return theSamePassError.size() == 2;
    }
    //buttons
    @FindBy(css = ".btn.btn-primary")
    private WebElement saveNewUsernameEmailPasswordButton;

    public EditLogInCredsTab typeCurrentPassword (String currentPassword){
        passwordField.sendKeys(currentPassword);
        return this;
    }
    public EditLogInCredsTab typeNewUsername(String newusername){
        usernameField.sendKeys(newusername);
        return this;
    }
    public EditLogInCredsTab typeNewEmail(String newemail){
        emailField.sendKeys(newemail);
        return this;
    }
    public EditLogInCredsTab hitSaveUsernameAndEmail(){
        saveNewUsernameEmailPasswordButton.click();
        return this;
    }
    public EditLogInCredsTab switchToChangePasswordTab(){
        changePasswordTab.click();
        return this;
    }
    public EditLogInCredsTab typeNewPassword(String newpassword){
        newPasswordField.sendKeys(newpassword);
        return this;
    }
    public EditLogInCredsTab reEnterNewPassword(String reenteredpass){
        newPasswordField.sendKeys(reenteredpass);
        return this;
    }


    public String getLlcBottomLabel2 (){ return llcBottomLabel.getText();}
    public String getPrivacyPolicyBottomLabel2(){ return privacyPolicyBottomLabel.getText();}
    public String getTermsConditionsLabel2(){ return termsBottomLabel.getText();}


}