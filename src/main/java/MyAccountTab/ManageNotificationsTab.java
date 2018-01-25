package MyAccountTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class ManageNotificationsTab {
    private WebDriver driver;
    public ManageNotificationsTab(Driver driver) {
    }

    //Buttons
    @FindBy(css = "#opt-out-button")
    private WebElement receiveNotificationsOnButton;
    @FindBy(xpath = "//div[2]/div[2]/div[1]/button[1]")
    private WebElement changeSMSNumber;
    @FindBy(xpath = "//div[2]/div[2]/div[1]/button[2]")
    private WebElement changeNotificationEmail;
    @FindBy(xpath = ".//*[@id='remove-emails-button']")
    private WebElement removeEmailNotificationButton;
    @FindBy(xpath = ".//*[@id='remove-sms-notifications-button']")
    private WebElement removeSMSNotificationButton;
    @FindBy(xpath = ".//*[@id='opt-out-button']")
    private WebElement removeAllNotificationsButton;
    @FindBy(xpath = ".//*[@id='sms-help-button']")
    private WebElement notificationStatusButton;
    @FindBy(xpath = ".//*[@id='sms-help-modal']/div/div/div[3]/button")
    private WebElement closeButtonForStatusWindow;
    @FindBy(xpath = ".//*[@id='enter-email-form']/div[3]/div/button")
    private WebElement saveButtonChangeEmailWindow;

    //Error messages
    @FindBy(xpath = ".//*[@id='email-entry-errors']/div")
    private WebElement errorMessage;

    //Fields
    @FindBy(css = ".modal-title")
    private WebElement changeChangeEmailWindowHeader;
    @FindBy(xpath = ".//*[@id='credentials-password']")
    private WebElement currentPasswordFieldChangeEmailWindow;
    @FindBy(xpath = ".//*[@id='credentials-email']")
    private WebElement emailChangeEmailWindow;

}
