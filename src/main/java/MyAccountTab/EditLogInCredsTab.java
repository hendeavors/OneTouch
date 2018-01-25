package MyAccountTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class EditLogInCredsTab {
    private WebDriver driver;
    public EditLogInCredsTab(Driver driver) {
    }

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



}