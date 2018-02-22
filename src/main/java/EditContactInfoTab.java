
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.String.format;

public class EditContactInfoTab {
     public WebDriver driver;
     public EditContactInfoTab(WebDriver driver)   {
         this.driver = driver;
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
    private WebElement faxField;
    @FindBy(css = "#update-contact-address")
    private WebElement addressField;
    @FindBy(css = "#update-contact-address2")
    private WebElement address2Field;
    @FindBy(css = "#update-contact-city")
    private WebElement cityField;
    @FindBy(css = "#update-contact-zip")
    private WebElement zipCodeField;
    @FindBy(css = ".k-input.form-control.statesdd")
    private WebElement stateInput;


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


    // Header
    @FindBy (xpath = "//div[@class='container']/div[@class='row']/div[1]")
    private WebElement llcBottomLabel;
    @FindBy (xpath = "//a[@title='privacy policy']")
    private WebElement privacyPolicyBottomLabel;
    @FindBy (xpath = "//a[@title='terms and conditions']")
    private WebElement termsBottomLabel;
    @FindBy (xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[1]/div")
    private WebElement successLabel;
    @FindBy (xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[1]/div")
    private WebElement faxError;
    @FindBy (xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[1]/div")
    private WebElement phoneError;
    @FindBy (xpath = "//div[@role='alert']//*[text()[contains(.,'Cell Phone Errors:')]]")
    private WebElement cellPhoneError;
    @FindBy (xpath = "//div[@role='alert']//*[text()[contains(.,'Business Phone Errors:')]]")
    private WebElement businessPhoneError;
    @FindBy (xpath = "//div[@role='alert']//*[text()[contains(.,'Address1 Errors:')]]")
    private WebElement address1Error;
    @FindBy (xpath = "//div[@role='alert']//*[text()[contains(.,'Address2 Errors:')]]")
    private WebElement address2Error;
    @FindBy (xpath = "//div[@role='alert']//*[text()[contains(.,'Postal Errors:')]]")
    private WebElement zipcodeError;


    //List of Fields
    @FindBy(xpath = "//div[@role='alert']")
    List<WebElement> getErrors;

    public String getLlcBottomLabel2 (){ return llcBottomLabel.getText();}
    public String getPrivacyPolicyBottomLabel2(){ return privacyPolicyBottomLabel.getText();}
    public String getTermsConditionsLabel2(){ return termsBottomLabel.getText();}
    public String successHeader (){ return successLabel.getText();}
    public String homePhoneText () {return homePhoneField.getText();}
    public String businessPhoneText () {return businessPhoneField.getText();}
    public String faxText (){return faxField.getText();}
    public String mobilePhoneText () {return mobilePhoneField.getText();}

    public String faxErrorTextFromTheList () {return getErrors.get(1).getText();}
    public String faxErrorText () {return faxError.getText();}
    public String phoneErrorText () {return phoneError.getText();}
    public String cellPhoneErrorText () {return cellPhoneError.getText();}
    public String businessPhoneErrorText () {return businessPhoneError.getText();}
    public String address1ErrorText () {return address1Error.getText();}
    public String address2ErrorText () {return address2Error.getText();}
    public String zipErrorText () {return zipcodeError.getText();}

    // errors actions
    public String getErrorByNumber (int number){
        return getErrors.get(number -1).getText();
    }

    public boolean shouldBeFiveErrors ( ){
        return getErrors.size() == 5;
    }

    public EditContactInfoTab typeHomePhone (String number){
        homePhoneField.sendKeys(number);
        return this;
    }
    public EditContactInfoTab clearHomePhone (){
        homePhoneField.clear();
        return this;
    }
    public EditContactInfoTab typeMobilePhone (String mobilenumber){
        mobilePhoneField.sendKeys(mobilenumber);
        return this;
    }
    public EditContactInfoTab clearMobilePhone (){
        mobilePhoneField.clear();
        return this;
    }
    public EditContactInfoTab typeBusinessPhone (String businessNumber){
        businessPhoneField.sendKeys(businessNumber);
        return this;
    }
    public EditContactInfoTab clearBusinessPhone (){
        businessPhoneField.clear();
        return this;
    }
    public EditContactInfoTab typeFax (String faxNumber){
        faxField.sendKeys(faxNumber);
        return this;
    }
    public EditContactInfoTab clearFax (){
        faxField.clear();
        return this;
    }
    public EditContactInfoTab typeAddress (String address1){
        addressField.sendKeys(address1);
        return this;
    }
    public EditContactInfoTab clearAddress (){
        addressField.clear();
        return this;
    }
    public EditContactInfoTab typeAddress2 (String address2){
        address2Field.sendKeys(address2);
        return this;
    }
    public EditContactInfoTab clearAddress2 (){
        address2Field.clear();
        return this;
    }
    public EditContactInfoTab typeCity (String city){
        cityField.sendKeys(city);
        return this;
    }
    public EditContactInfoTab clearCity (){
        cityField.clear();
        return this;
    }
    public EditContactInfoTab typeZip (String zipcode){
        zipCodeField.sendKeys(zipcode);
        return this;
    }
    public EditContactInfoTab clearZip (){
        zipCodeField.clear();
        return this;
    }
    public EditContactInfoTab typeState(String state){
        stateInput.clear();
        stateInput.sendKeys(state);
        return this;
    }


    public EditContactInfoTab filloutTheFields(String number, String mobileNumber,
        String businessNumber, String faxNumber, String address1, String address2, String city,String zipcode){
        this.typeHomePhone(number);
        this.typeMobilePhone(mobileNumber);
        this.typeBusinessPhone(businessNumber);
        this.typeFax(faxNumber);
        this.typeAddress(address1);
        this.typeAddress2(address2);
        this.typeCity(city);
        this.typeZip(zipcode);
        return new EditContactInfoTab(driver);
    }
    public EditContactInfoTab pressSaveButton(){
        saveButton.click();
        return this;
    }
    public EditContactInfoTab clickSecondaryAddress(){
        secondaryHeadingTab.click();
        new WebDriverWait(driver,5);
        return this;
    }

    public EditContactInfoTab clearAllTheFields(){
        this.clearZip();
        this.clearAddress();
        this.clearAddress2();
        this.clearBusinessPhone();
        this.clearCity();
        this.clearFax();
        this.clearHomePhone();
        this.clearMobilePhone();
        return new EditContactInfoTab(driver);
    }




}