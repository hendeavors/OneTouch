
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class EditContactInfoTab {
     public WebDriver driver;
     public EditContactInfoTab(WebDriver driver)   {

         this.driver = driver;
     }

    //Fields on the primary page
    @FindBy(xpath = ".//*[@id='update-contact-phone']")
    private WebElement homePhoneField;
    @FindBy(xpath = ".//*[@id='update-contact-business']")
    private WebElement businessPhoneField;
    @FindBy(xpath = ".//*[@id='update-contact-email']")
    private WebElement emailField;
    @FindBy(xpath = ".//*[@id='update-contact-mobile']")
    private WebElement mobilePhoneField;
    @FindBy(xpath = ".//*[@id='update-contact-fax']")
    private WebElement faxField;
    @FindBy(xpath = ".//*[@id='update-contact-address']")
    private WebElement addressField;
    @FindBy(xpath = ".//*[@id='update-contact-address2']")
    private WebElement address2Field;
    @FindBy(xpath = ".//*[@id='update-contact-city']")
    private WebElement cityField;
    @FindBy(xpath = ".//*[@id='update-contact-zip']")
    private WebElement zipCodeField;
    @FindBy(css = "//input[@name='statecode_input']")
    private WebElement stateInput;

    //Fields on the secondary page

    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-phone']")
    private WebElement homePhoneFieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-business']")
    private WebElement businessPhoneFieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-email']")
    private WebElement emailFieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-mobile']")
    private WebElement mobilePhoneFieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-fax']")
    private WebElement faxFieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-address']")
    private WebElement addressFieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-address2']")
    private WebElement address2FieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-city']")
    private WebElement cityFieldSecondary;
    @FindBy(xpath = "//div[@id='collapseTwo']//input[@id='update-contact-zip']")
    private WebElement zipCodeFieldSecondary;
    @FindBy(css = "//div[@id='collapseTwo']//input[@class='k-input form-control statesdd']")
    private WebElement stateInputSecondary;


    //Wordings
    @FindBy(xpath = ".//*[@id='app-layout']/div[3]/div/div/div/div[2]/div[1]/div/strong")
    private WebElement successWarning;

    //Button
    @FindBy(css = ".btn.btn-primary.pull-right")
    private WebElement saveButtonPrimary;
    @FindBy(xpath = "//div[@id='collapseTwo']//button[@class='btn btn-primary pull-right']")
    private WebElement saveButtonSecondary;

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

    public EditContactInfoTab typeHomePhonePrimary (String number){
        homePhoneField.sendKeys(number);
        return this;
    }
    public EditContactInfoTab clearHomePhonePrimary (){
        homePhoneField.clear();
        return this;
    }
    public EditContactInfoTab typeMobilePhonePrimary (String mobilenumber){
        mobilePhoneField.sendKeys(mobilenumber);
        return this;
    }
    public EditContactInfoTab clearMobilePhonePrimary (){
        mobilePhoneField.clear();
        return this;
    }
    public EditContactInfoTab typeBusinessPhonePrimary (String businessNumber){
        businessPhoneField.sendKeys(businessNumber);
        return this;
    }
    public EditContactInfoTab clearBusinessPhonePrimary (){
        businessPhoneField.clear();
        return this;
    }
    public EditContactInfoTab typeFaxPrimary (String faxNumber){
        faxField.sendKeys(faxNumber);
        return this;
    }
    public EditContactInfoTab clearFaxPrimary (){
        faxField.clear();
        return this;
    }
    public EditContactInfoTab typeAddressPrimary (String address1){
        addressField.sendKeys(address1);
        return this;
    }
    public EditContactInfoTab clearAddressPrimary (){
        addressField.clear();
        return this;
    }
    public EditContactInfoTab typeAddress2Primary (String address2){
        address2Field.sendKeys(address2);
        return this;
    }
    public EditContactInfoTab clearAddress2Primary (){
        address2Field.clear();
        return this;
    }
    public EditContactInfoTab typeCityPrimary (String city){
        cityField.sendKeys(city);
        return this;
    }
    public EditContactInfoTab clearCityPrimary (){
        cityField.clear();
        return this;
    }
    public EditContactInfoTab typeZipPrimary (String zipcode){
        zipCodeField.sendKeys(zipcode);
        return this;
    }
    public EditContactInfoTab clearZipPrimary (){
        zipCodeField.clear();
        return this;
    }
    public EditContactInfoTab typeStatePrimary(String state){
        stateInput.clear();
        stateInput.sendKeys(state);
        return this;
    }


    public EditContactInfoTab filloutTheFieldsprimary(String number, String mobileNumber,
        String businessNumber, String faxNumber, String address1, String address2, String city,String zipcode){
        this.typeHomePhonePrimary(number);
        this.typeMobilePhonePrimary(mobileNumber);
        this.typeBusinessPhonePrimary(businessNumber);
        this.typeFaxPrimary(faxNumber);
        this.typeAddressPrimary(address1);
        this.typeAddress2Primary(address2);
        this.typeCityPrimary(city);
        this.typeZipPrimary(zipcode);
        return new EditContactInfoTab(driver);
    }
    public EditContactInfoTab pressSaveButtonPrimaryTab(){
        saveButtonPrimary.click();
        return this;
    }
    public EditContactInfoTab pressSaveButtonSecondaryTab(){
        saveButtonSecondary.click();
        return this;
    }

    public EditContactInfoTab clickSecondaryAddress(){
        secondaryHeadingTab.click();
        return this;
    }

    public EditContactInfoTab clearAllThePrimaryFields(){
        this.clearZipPrimary();
        this.clearAddressPrimary();
        this.clearAddress2Primary();
        this.clearBusinessPhonePrimary();
        this.clearCityPrimary();
        this.clearFaxPrimary();
        this.clearHomePhonePrimary();
        this.clearMobilePhonePrimary();
        return new EditContactInfoTab(driver);
    }
    public EditContactInfoTab clearAllTheSecondaryFields(){
        this.clearZipSecondary();
        this.clearAddressSecondary();
        this.clearAddress2Secondary();
        this.clearBusinessPhoneSecondary();
        this.clearCitySecondary();
        this.clearFaxSecondary();
        this.clearHomePhoneSecondary();
        this.clearMobilePhoneSecondary();;
        return new EditContactInfoTab(driver);
    }
    public EditContactInfoTab filloutTheFieldsSecondary(String number2, String mobileNumber2,
                                                      String businessNumber2, String faxNumber2, String address12, String address22, String city2,String zipcode2){
        this.typeHomePhoneSecondary(number2);
        this.typeMobilePhoneSecondary(mobileNumber2);
        this.typeBusinessPhoneSecondary(businessNumber2);
        this.typeFaxSecondary(faxNumber2);
        this.typeAddressSecondary(address12);
        this.typeAddress2Secondary(address22);
        this.typeCitySecondary(city2);
        this.typeZipSecondary(zipcode2);
        return new EditContactInfoTab(driver);
    }
    public EditContactInfoTab typeHomePhoneSecondary (String number2){
        homePhoneFieldSecondary.sendKeys(number2);
        return this;
    }
    public EditContactInfoTab clearHomePhoneSecondary (){
        homePhoneFieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeMobilePhoneSecondary (String mobilenumber2){
        mobilePhoneFieldSecondary.sendKeys(mobilenumber2);
        return this;
    }
    public EditContactInfoTab clearMobilePhoneSecondary (){
        mobilePhoneFieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeBusinessPhoneSecondary (String businessNumber2){
        businessPhoneFieldSecondary.sendKeys(businessNumber2);
        return this;
    }
    public EditContactInfoTab clearBusinessPhoneSecondary (){
        businessPhoneFieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeFaxSecondary (String faxNumber2){
        faxFieldSecondary.sendKeys(faxNumber2);
        return this;
    }
    public EditContactInfoTab clearFaxSecondary (){
        faxFieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeAddressSecondary (String address12){
        addressFieldSecondary.sendKeys(address12);
        return this;
    }
    public EditContactInfoTab clearAddressSecondary (){
        addressFieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeAddress2Secondary (String address22){
        address2FieldSecondary.sendKeys(address22);
        return this;
    }
    public EditContactInfoTab clearAddress2Secondary (){
        address2FieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeCitySecondary (String city2){
        cityFieldSecondary.sendKeys(city2);
        return this;
    }
    public EditContactInfoTab clearCitySecondary (){
        cityFieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeZipSecondary (String zipcode2){
        zipCodeFieldSecondary.sendKeys(zipcode2);
        return this;
    }
    public EditContactInfoTab clearZipSecondary (){
        zipCodeFieldSecondary.clear();
        return this;
    }
    public EditContactInfoTab typeStateSecondary(String state2){
        stateInputSecondary.clear();
        stateInputSecondary.sendKeys(state2);
        return this;
    }



}