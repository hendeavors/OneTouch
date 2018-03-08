

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.Random;

public class ManageNotificationsTab {
     public WebDriver driver;
     public ManageNotificationsTab(WebDriver driver) {
        this.driver = driver;
    }

    //Green buttons
    @FindBy(xpath = "//button[@id='opt-out-button' and @class='btn btn-success']")
    private WebElement bigGreenButton;
    @FindBy(xpath = "//button[@id='opt-out-button' and @class='btn btn-success']")
    List<WebElement> bigGreenButtonList;
    @FindBy(xpath = ".//*[@id='enable-email-notifications-link']")
    private List<WebElement> subscribeBackToEmailNotificationsList;
    @FindBy(xpath = "//a[@class='btn btn-success']")
    private List<WebElement> subscribeBackToSMSNotificationsList;
    @FindBy (xpath = ".//*[@id='enable-email-notifications-link']")
    private WebElement subscribeEmailBackButton;
    @FindBy(xpath = "//a[@class='btn btn-success']")
    private WebElement subscribeSMSBackButton;



    @FindBy (xpath = "//button[@class='cancel']")
    private WebElement cancelButtonInPopUp;
    @FindBy (xpath = "//button[@class='confirm']")
    private WebElement yesContinueButtonInPopUp;

    //Blue buttons
    @FindBy(xpath = "//div[2]/div[2]/div[1]/button[2]")
    private WebElement changeNotificationEmailButton;
    @FindBy(xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[2]/div[1]/button[1]")
    private WebElement changeSMSNotiNumButton;
    @FindBy(xpath = ".//*[@id='enter-email-form']/div[3]/div/button")
    private WebElement changeEmailSaveButton;
    @FindBy(xpath = "//button[@id='send-verify-button']")
    private WebElement sendVerificationCodeButton;
    @FindBy(xpath = ".//*[@id='enter-email-modal']/div/div/div[3]/button")
    private WebElement closeButtonForEmailNotificationWidnow;
    @FindBy(xpath = ".//*[@id='send-confirmation-button']")
    private WebElement checkVerificationCodeButton;


    //Red buttons
    @FindBy(xpath = ".//*[@id='remove-emails-button']")
    private WebElement removeEmailNotificationButton;
    @FindBy(xpath = ".//*[@id='remove-sms-notifications-button']")
    private WebElement removeSMSNotificationButton;
    @FindBy(xpath = "//button[@id='opt-out-button' and @class='btn btn-danger btn-xs opt-out-button']")
    private WebElement removeAllNotificationsButton;

    // link in the front for the status
    @FindBy(xpath = ".//*[@id='sms-help-button']")
    private WebElement notificationStatusLink;
    @FindBy(xpath = ".//*[@id='sms-help-modal']/div/div/div[3]/button")
    private WebElement closeStatusWindowButton;

    //Error/Success messages
    @FindBy(xpath = ".//*[@id='email-entry-errors']/div")
    private WebElement emailErrorMessage;
    @FindBy(xpath = "//div[@class='alert alert-dismissible alert-danger']")
    private WebElement smsNumError;
    @FindBy(xpath = ".//*[@id='email-entry-errors']/div")
    private WebElement emailError;
    @FindBy(xpath = ".//*[@id='sms-verification-errors']/div")
    private List<WebElement> smsNumErrorList;
    @FindBy(xpath = ".//*[@id='email-entry-errors']/div")
    private List<WebElement> emailEntryErrorsList;
    @FindBy(xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[1]/div")
    private WebElement successContainer;
    @FindBy(xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[1]/div")
    private List<WebElement> successContainerList;
    @FindBy(xpath = ".//*[@id='sms-confirmation-errors']/div")
    private List<WebElement> verificationCodeSentGreenContainerList;
    @FindBy (xpath = "//div[@class='alert alert-dismissible alert-danger' and @role='alert']")
    private List<WebElement> wrongCodeRedContinerList;
    @FindBy (xpath = "//div[@class='alert alert-dismissible alert-danger' and @role='alert']")
    private WebElement wrongCodeRedContiner;

    @FindBy(xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[2]/p")
    private WebElement notificationsDisabledContianer;



    //Fields
    @FindBy(css = ".modal-title")
    private WebElement changeEmailWindowHeader;
    @FindBy(xpath = ".//*[@id='credentials-password']")
    private WebElement currentPasswordField;
    @FindBy(xpath = ".//*[@id='credentials-email']")
    private WebElement emailField;
    @FindBy(xpath = ".//*[@id='enter-verification-number']")
    private WebElement numberForSmsField;
    @FindBy(xpath = ".//*[@id='send-confirmation-form']/div[1]/input")
    private WebElement currentPassForVerificationCodeField;
    @FindBy(xpath = ".//*[@id='enter-verification-code']")
    private WebElement verificationCodeField;

    // text elements
    @FindBy (xpath = ".//*[@id='sms-status-modal-status-ok']/span")
    private WebElement statusBarText;





    //Checking strings
    public String smsNumUseErrorText (){ return smsNumError.getText();}
    public String emailEntryErrorText () { return emailError.getText();}
    public String emailChangeSuccessText () { return successContainer.getText();}
    public String wrongCodeFailureText () {return wrongCodeRedContiner.getText();}
    public String notificationsDisabledText () {return notificationsDisabledContianer.getText();}
    public String statusBarText () { return statusBarText.getText();}


     // boolean methods
    public boolean bigGreenButtonIsDisplayed () { return
        bigGreenButtonList.size()>0 == true;
    }
    public boolean numberUsedErrorIsVisible ( ){
        return smsNumErrorList.size()>0 == true;
    }
    public boolean emailChangingErros ( ){
        return emailEntryErrorsList.size()>0 == true;
    }
    public boolean emailChangingSuccess ( ){
        return successContainerList.size()>0 == true;
    }
    public boolean codeSentMessageContainer () {return verificationCodeSentGreenContainerList.size()>0 == true;}
    public boolean wrongCodeMessageContainer () {return wrongCodeRedContinerList.size()>0 == true;}
    public boolean subscribeEmailButtonIsDisplayed () {return subscribeBackToEmailNotificationsList.size()>0 == true;}
    public boolean subscribeSMSButtonIsDisplayed () {return subscribeBackToSMSNotificationsList.size()>0 == true;}


    //clicking the buttons methods
    public ManageNotificationsTab clickBigGreenButton (){
        bigGreenButton.click();
        return this;
    }
    public ManageNotificationsTab clickChangeSMSNumber (){
        changeSMSNotiNumButton.click();
        return this;
    }
    public ManageNotificationsTab clickSendVerifyCode (){
        sendVerificationCodeButton.click();
        return this;
    }
    public ManageNotificationsTab clickChangeEmailButton(){
        changeNotificationEmailButton.click();
        return this;
    }
    public ManageNotificationsTab clickSave(){
        changeEmailSaveButton.click();
        return this;
    }
    public ManageNotificationsTab clickCheckCodeButton () {
        checkVerificationCodeButton.click();
        return this;
    }
    public ManageNotificationsTab clickOptOutOfAllNotifications (){
        removeAllNotificationsButton.click();
        return this;
    }
    public ManageNotificationsTab clickOptOutOfEmailNotifications (){
        removeEmailNotificationButton.click();
        return this;
    }
    public ManageNotificationsTab clickOptOutOfSMSNotifications (){
        removeSMSNotificationButton.click();
        return this;
    }
    public ManageNotificationsTab clickYesContinue () {
        yesContinueButtonInPopUp.click();
        return this;
    }
    public ManageNotificationsTab clickCancel () {
        cancelButtonInPopUp.click();
        return this;
    }
    public ManageNotificationsTab clickSubscribeEmail (){
        subscribeEmailBackButton.click();
        return this;
    }
    public ManageNotificationsTab clickSubscribeSMS (){
        subscribeSMSBackButton.click();
        return this;
    }
    public ManageNotificationsTab clickStatusLink () {
        notificationStatusLink.click();
        return this;
    }












    //typing the meanings
    public ManageNotificationsTab typeSMSNumber (String smsnumber) {
        numberForSmsField.sendKeys(smsnumber);
        return this;
    }
    public ManageNotificationsTab typeCurrentPassword (String password) {
        currentPasswordField.clear();
        currentPasswordField.sendKeys(password);
        return this;
    }
    public ManageNotificationsTab typeNewEmail (String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }
    public ManageNotificationsTab typeRandomPhoneNumber (String number){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        numberForSmsField.sendKeys(number + randomInt);
        return this;
    }
    public ManageNotificationsTab typeCurrentPassForVerification (String verificpass) {
        currentPassForVerificationCodeField.sendKeys(verificpass);
        return this;
    }
    public ManageNotificationsTab typeRandomVerificationCode (String verificarioncode) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        currentPassForVerificationCodeField.sendKeys(verificarioncode + randomInt);
        return this;
    }







}
