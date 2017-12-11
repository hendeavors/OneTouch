import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FullEnrollPage {
    private WebDriver driver;

    public FullEnrollPage (WebDriver driver) {

        this.driver = driver;
    }


    @FindBy(xpath = "//input[@id='insurance_number']")
    private WebElement insuranceNumberField;
    //@FindBy (xpath ="//a[@id='add-insurance-button']")
    //private WebElement addInsuranceButton;
    //@FindBy (xpath = "//input[@id='secondary_insurance_number']")
    //private WebElement secondaryInsuranceField;
    //@FindBy (xpath = "//input[@id='tertiary_insurance_number']")
    //private WebElement tertiaryInsuranceNumberField;
    @FindBy(xpath = ".//*[@id='ssn']")
    private WebElement ssnField;
    @FindBy(xpath = ".//*[@id='first_name']")
    private WebElement firstNameField;
    @FindBy(xpath = ".//*[@id='last_name']")
    private WebElement lastNameField;
    @FindBy(xpath = ".//*[@id='dob']")
    private WebElement dobField;
    @FindBy(xpath = ".//*[@id='gender']")
    private WebElement genderDropDown;
    @FindBy(xpath = "//option[@value='m']")
    private WebElement chooseMaleGender;
    @FindBy(xpath = "//option[@value='f']")
    private WebElement chooseFemaleGender;

    @FindBy(xpath = ".//*[@id='address1']")
    private WebElement addressField;
    @FindBy(xpath = ".//*[@id='address2']")
    private WebElement addressField2;
    @FindBy(xpath = ".//*[@id='city']")
    private WebElement cityField;
    @FindBy(xpath = ".//*[@id='state']")
    private WebElement stateDropDown;
    @FindBy(xpath = "//option[@value='AZ']")
    private WebElement chooseArizonaState;
    @FindBy(xpath = ".//*[@id='zip_code']")
    private WebElement zipField;

    @FindBy(xpath = ".//*[@id='nickname']")
    private WebElement nicknameField;
    @FindBy(xpath = ".//*[@id='phone']")
    private WebElement homePhoneField;
    @FindBy(xpath = ".//*[@id='cell_phone']")
    private WebElement mobilePhoneField;
    @FindBy(xpath = ".//*[@id='email']")
    private WebElement emailField;
    @FindBy (xpath = "//input[@type='checkbox']")
    private WebElement iAcceptTheTermsCheckBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement enrollButton;


    //2nd part of Enrollment Form

    @FindBy(xpath = "//input[@name='cc_number']")
    private WebElement ccNumberField;
    @FindBy(xpath = "//input[@name='ccv']")
    private WebElement ccvNumberField;
    @FindBy(xpath = "//input[@name='expire_month']")
    private WebElement expirationMonthField;
    @FindBy(xpath = "//input[@name='expire_year']")
    private WebElement expirationYearField;
    @FindBy(xpath = "//input[@id='username-input']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@id='password-input']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='password-confirmation-input']")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement completeEnrollmentButton;

    // The list of errors

    @FindBy(xpath = ".//*[@id='enroll-form']/fieldset[1]/div[1]/div[4]/div/span/strong")
    private WebElement noSSNError;
    @FindBy(xpath = ".//*[@id='enroll-form']/fieldset[3]/div[2]/div[1]/div/span/strong")
    private WebElement invalidCellPhoneNumberError;
    @FindBy(xpath = "/.//*[@id='enroll-form']/fieldset[3]/div[1]/div[2]/div/span/strong")
    private WebElement invalidPhoneNumberError;
    @FindBy(xpath = ".//*[@id='enroll-form']/fieldset[3]/div[2]/div[2]/div/span/strong")
    private WebElement emailAlreadyTakenError;
    @FindBy (xpath = "//fieldset[@class='fieldset margin-y-15']//span[@class='help-block']/strong")
    private WebElement cityRequiredError;

    // Checkwords

    @FindBy (xpath = ".//*[@id='public-layout']/header/div/div/div/div/div/div[2]/form/div/div/span")
    private WebElement checkHeading;

    //Methods for the long form


    public FullEnrollPage typeInsuranceNumber(String insurancenumber) {
        insuranceNumberField.sendKeys(insurancenumber);
        return this;
    }
    //public FullEnrollPage clickExpandInsurance () {
    //    addInsuranceButton.click();
    //    return this;
    //}
    //public FullEnrollPage typeSecondaryInsurance (String secondaryinsurance){
    //    secondaryInsuranceField.sendKeys(secondaryinsurance);
    //     return this;
    //}
    //public FullEnrollPage typeTertiaryInsurance (String tertiaryinsurance){
    //    tertiaryInsuranceNumberField.sendKeys(tertiaryinsurance);
    //    return this;
    //}

    public FullEnrollPage typeSsn(String ssn) {
        ssnField.sendKeys(ssn);
        return this;
    }
    public FullEnrollPage typeFirstName(String firstname) {
        firstNameField.sendKeys(firstname);
        return this;
    }
    public FullEnrollPage typeLastName(String lastname) {
        lastNameField.sendKeys(lastname);
        return this;
    }
    public FullEnrollPage typeDateOfBirth(String DOB) {
        dobField.sendKeys(DOB);
        return this;
    }
    public FullEnrollPage chooseFemaleGender() {
        genderDropDown.click();
        chooseFemaleGender.click();
        return this;
    }
    public FullEnrollPage chooseMaleGender() {
        genderDropDown.click();
        chooseMaleGender.click();
        return this;
    }
    public FullEnrollPage typeAddress(String address) {
        addressField.sendKeys(address);
        return this;
    }
    public FullEnrollPage typeAddress2(String address2) {
        addressField2.sendKeys(address2);
        return this;
    }
    public FullEnrollPage typeCity(String city) {
        cityField.sendKeys(city);
        return this;
    }
    public FullEnrollPage typeZip(String zip) {
        zipField.sendKeys(zip);
        return this;
    }
    public FullEnrollPage chooseState() {
        stateDropDown.click();
        chooseArizonaState.click();
        return this;
    }
    public FullEnrollPage typeNickname(String nickname) {
        nicknameField.sendKeys(nickname);
        return this;
    }
    public FullEnrollPage typeHomePhone(String homephone) {
        homePhoneField.sendKeys(homephone);
        return this;
    }
    public FullEnrollPage typeMobilePhone(String mobilephone) {
        mobilePhoneField.sendKeys(mobilephone);
        return this;
    }
    public FullEnrollPage typeEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }
    public FullEnrollPage checkIAcceptTheTerms(){
        iAcceptTheTermsCheckBox.click();
        return this;
    }
    public FullEnrollPage clickEnroll() {
        enrollButton.click();
        return this;
    }

    // 2ns page of the EnrollmentForm

    public FullEnrollPage typeCCNumber(String ccnumber) {
        ccNumberField.sendKeys(ccnumber);
        return this;
    }
    public FullEnrollPage typeCCVNumber(String ccvnumber) {
        ccvNumberField.sendKeys(ccvnumber);
        return this;
    }
    public FullEnrollPage typeExpirateMonth(String expiratemonth) {
        expirationMonthField.sendKeys(expiratemonth);
        return this;
    }
    public FullEnrollPage typeExpirateYear(String expirateyear) {
        expirationYearField.sendKeys(expirateyear);
        return this;
    }
    public FullEnrollPage typeUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }
    public FullEnrollPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
    public FullEnrollPage typePasswordConfirmation(String passwordconfirmation) {
        confirmPasswordField.sendKeys(passwordconfirmation);
        return this;
    }
    public FullEnrollPage clickCompleteEnrollmentButton() {
        completeEnrollmentButton.click();
        return this;
    }

    // Error Methods

    public String getNoSSNErrText() { return noSSNError.getText(); }
    public String getInvalidCellNumberErrText(){
        return invalidCellPhoneNumberError.getText();
    }
    public String getInvalidPhoneNumErrText(){
        return invalidPhoneNumberError.getText();
    }
    public String getEmailAlreadyTknErrText(){
        return emailAlreadyTakenError.getText();
    }
    public String getCityRequiredErr(){
        return cityRequiredError.getText();
    }
    public String getHeadingText(){
        return checkHeading.getText();
    }


    public FullEnrollPage typeIdentificationInfo (String insurancenumber, String secondaryinsurance, String tertiaryinsurance, String ssn, String firstname, String lastname, String DOB) {
        this.typeInsuranceNumber(insurancenumber);
        //this.clickExpandInsurance();
        //WebDriverWait wait = (new WebDriverWait(driver, 5));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='secondary_insurance_number']")));
        //this.typeSecondaryInsurance(secondaryinsurance);
        //this.clickExpandInsurance();
        //WebDriverWait wait2 = (new WebDriverWait(driver, 5));
        //wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tertiary_insurance_number']")));
        //this.typeTertiaryInsurance(tertiaryinsurance);
        this.typeSsn(ssn);
        this.typeFirstName(firstname);
        this.typeLastName(lastname);
        this.typeDateOfBirth(DOB);
        this.chooseFemaleGender();
        return new FullEnrollPage(driver);
    }
    public FullEnrollPage typeAddressInformation (String address, String address2, String city,String zip){
        this.typeAddress(address);
        this.typeAddress2(address2);
        this.typeCity(city);
        this.typeZip(zip);
        this.chooseState();
        return new FullEnrollPage(driver);
    }
    public FullEnrollPage enroll (String nickname, String homephone, String mobilephone, String email){
        this.typeNickname(nickname);
        this.typeHomePhone(homephone);
        this.typeMobilePhone(mobilephone);
        this.typeEmail(email);
        this.checkIAcceptTheTerms();
        this.clickEnroll();
        return new FullEnrollPage(driver);
    }
    public FullEnrollPage finishEnrolling (String ccnumber, String ccvnumber, String expiratemonth, String expirateyear, String username, String password, String passwordconfirmation){
        this.typeCCNumber(ccnumber);
        this.typeCCVNumber(ccvnumber);
        this.typeExpirateMonth(expiratemonth);
        this.typeExpirateYear(expirateyear);
        this.typeUsername(username);
        this.typePassword(password);
        WebDriverWait wait3 = (new WebDriverWait(driver, 5));
        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password-confirmation-input']")));
        this.typePasswordConfirmation(passwordconfirmation);
        this.clickCompleteEnrollmentButton();
        return new FullEnrollPage(driver);
    }

}



