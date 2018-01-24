import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class MyAccountTab {
    private WebDriver driver;
    public MyAccountTab(WebDriver driver) {
    }
    public class EditContactInformationTab {
        private WebDriver driver;
        public EditContactInformationTab(Driver driver) {
        }

        //Fields on the primary page
        @FindBy(css = "#update-contact-phone")
        private WebElement homePhoneField;
        @FindBy(css = "#update-contact-business")
        private WebElement businessPhoneField;
        @FindBy(css = "#update-contact-email")
        private WebElement emailField;
        @FindBy(css = "#update-contact-mobile")
        private WebElement mobilePhoneField;
        @FindBy(css = "#update-contact-fax")
        private WebElement faxFieldl;
        @FindBy(css = "#update-contact-address")
        private WebElement addressField;
        @FindBy(css = "#update-contact-address2")
        private WebElement address2Field;
        @FindBy(css = "#update-contact-city")
        private WebElement cityField;
        @FindBy(css = "#update-contact-zip")
        private WebElement zipCodeField;
        @FindBy(css = ".k-select")
        private WebElement stateDropDown;
        @FindBy(xpath = "//li[text()='Arizona']")
        private WebElement stateArizonaOption;

        //Wordings
        @FindBy(xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[1]/div/strong")
        private WebElement successWarning;

        //Button
        @FindBy(css = ".btn.btn-primary.pull-right")
        private WebElement saveButton;

        //Collapsing Headings
        @FindBy(xpath = ".//*[@id='headingOne']/h4/a")
        private WebElement primaryHeadingtab;
        @FindBy(xpath = ".//*[@id='headingTwo']/h4/a")
        private WebElement secondaryHeadingTab;

        // fields on the secondaryPage all the same as on the primary info.

        public EditContactInformationTab typeHomePhone (String number){
            homePhoneField.sendKeys(number);
            return this;
        }
        public EditContactInformationTab typeMobilePhone (String mobileNumber){
            mobilePhoneField.sendKeys(mobileNumber);
            return this;
        }
        public EditContactInformationTab typeBusinessPhone (String businessNumber){
            businessPhoneField.sendKeys(businessNumber);
            return this;
        }
        public EditContactInformationTab typeFax (String faxNumber){
            homePhoneField.sendKeys(faxNumber);
            return this;
        }
        public EditContactInformationTab typeAddress (String address1){
            addressField.sendKeys(address1);
            return this;
        }
        public EditContactInformationTab typeAddress2 (String address2){
            address2Field.sendKeys(address2);
            return this;
        }
        public EditContactInformationTab typeCity (String city){
            cityField.sendKeys(city);
            return this;
        }
        public EditContactInformationTab typeZip (String zipcode){
            zipCodeField.sendKeys(zipcode);
            return this;
        }
        public EditContactInformationTab chooseArizonaState(){
            stateDropDown.click();
            stateArizonaOption.click();
            return this;
        }

        public EditContactInformationTab filloutTheFields(String number, String mobileNumber,
                                                          String businessNumber,
                                                          String faxNumber, String address1,
                                                          String address2, String city,
                                                          String zipcode){


            this.typeHomePhone(number);
            this.typeMobilePhone(mobileNumber);
            this.typeBusinessPhone(businessNumber);
            this.typeFax(faxNumber);
            this.typeAddress(address1);
            this.typeAddress2(address2);
            this.typeCity(city);
            this.typeZip(zipcode);
            return new EditContactInformationTab(driver);
        }
        public EditContactInformationTab pressSaveButton(){
            saveButton.click();
            return this;
        }
        public EditContactInformationTab clickSecondaryAddress(){
            secondaryHeadingTab.click();
            return this;
        }

    }

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
        @FindBy(name = "current_password")
        private WebElement newPasswordField;
        @FindBy(css = "#credentials-password-confirmation")
        private WebElement repeatNewPasswordField;

        // Checking words on the page
        @FindBy(css = ".required-indicator")
        private WebElement requiredIndicator;

        //buttons
        @FindBy(css = ".btn.btn-primary")
        private WebElement saveUsernameEmailPasswordButton;

    }

    public class ManageDelegatesTab {
        private WebDriver driver;
        public ManageDelegatesTab(Driver driver) {
        }

        //Buttons
        @FindBy(xpath = "//input[@value='Add Delegate']")
        private WebElement addDelegateButton;
        @FindBy(xpath = "//button[@class='btn btn-danger']")
        private WebElement archiveDelegateButton;
        @FindBy(xpath = "//button[@class='btn btn-success']")
        private WebElement restoreDeleagateButton;

        //Fields
        @FindBy(css = "#new-delegate-email")
        private WebElement newDelegatesEmailField;

        //Checking words
        @FindBy(xpath = "//div/div[2]/h3[1]")
        private WebElement addADelegateheader;
        @FindBy(xpath = "//div/div[2]/h3[2]")
        private WebElement changeDelegateStatusHeader;
        @FindBy(css = ".col-md-4.control-label")
        private WebElement delegateEmailFieldHeader;

    }

    public class ManageNotifications {
        private WebDriver driver;
        public ManageNotifications(Driver driver) {
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

    public class ManageSubscriptions {
        private WebDriver driver;
        public ManageSubscriptions(Driver driver) {
        }

        //Buttons
        @FindBy(css = ".btn.btn-primary.ng-scope")
        private WebElement changePlanButton;
        @FindBy(xpath = "//subscription-card/div/div[2]/subscription-form/standard-form/form/div[6]/div/button")
        private WebElement updateCreditCardButton;
        @FindBy(xpath = "//subscription-vat/div/div[2]/standard-form/form/div[2]/div/button")
        private WebElement updateExtraBillingInfoButton;
        @FindBy(xpath = ".//*[@id='spark-settings-subscription-screen']/div/div[3]/button")
        private WebElement cancelSubscriptionButton;
        @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/billing/invoice/in_1BjYhiDEQFXKcRmV7CRtpFx2']")
        private WebElement downloadReceiptButton;

        //Fields
        @FindBy(xpath = "//input[@name='cc_number']")
        private WebElement creditCardField;
        @FindBy(xpath = "//input[@name='ccv']")
        private WebElement ccvField;
        @FindBy(xpath = "//name[@name='expire_month']")
        private WebElement expireMonth;
        @FindBy(xpath = "//name[@name='expire_year']")
        private WebElement expireYear;
        @FindBy(xpath = "//input[@name='zip']")
        private WebElement zipcodeField;
        @FindBy(xpath = "//textarea[@name='text']")
        private WebElement extraBillingInfoField;

        //Checkbox
        @FindBy(xpath = "//input[@name='terms']")
        private WebElement checkBox;

    }

    public class YourInbox {
        private WebDriver driver;
        public YourInbox(Driver driver) {
        }

        //Folders and Buttons
        @FindBy(xpath = "//a[@title='Compose']")
        private WebElement composeButton;
        @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox']")
        private WebElement inboxFolderButton;
        @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Drafts']")
        private WebElement draftsFolderButton;
        @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Spam']")
        private WebElement spamFolderButton;
        @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Sent']")
        private WebElement sentFolderButton;
        @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Templates']")
        private WebElement templatesFolderButton;
        @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Trash']")
        private WebElement trashFolderButton;
        @FindBy(xpath = "//input[@type='checkbox']")
        private WebElement inboxCheckboxes;
        @FindBy(xpath = "//input[@class='mail-checkbox mail-group-checkbox']")
        private WebElement ckeckAllCheckboxes;
        @FindBy(xpath = "html/body/div[1]/aside[2]/div[2]/div/div[3]/a")
        private WebElement optionsDropDown;
        @FindBy(xpath = "html/body/div[1]/aside[2]/div[2]/div/div[4]/a")
        private WebElement movetoDropDown;


        //DropDown Options
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/mark-read/Inbox']")
        private WebElement markAsReadOption;
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/delete-all/Inbox']")
        private WebElement deleteOption;
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Inbox/move']")
        private WebElement moveToInboxOption;
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Drafts/move']")
        private WebElement moveToDraftsOption;
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Spam/move']")
        private WebElement moveToSpamOption;
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Sent/move']")
        private WebElement moveToSentOption;
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Templates/move']")
        private WebElement moveToTemplatesOption;
        @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Trash/move']")
        private WebElement moveToTrashOption;

        //messages
        @FindBy(css = ".view-message.dont-show.text-nowrap")
        private WebElement messageContainer;
        @FindBy(xpath = ".//*[@id='replyboxcontent']/div/span[1]")
        private WebElement replyLink;
        @FindBy(xpath = ".//*[@id='replyboxcontent']/div/span[3]")
        private WebElement forwardLink;
        @FindBy(xpath = "//a[@class='btn btn-default reply-to']")
        private WebElement replyButton;

    }

}