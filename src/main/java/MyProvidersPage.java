import com.sun.xml.internal.bind.v2.WellKnownNamespace;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import sun.swing.plaf.synth.DefaultSynthStyle;

public class MyProvidersPage {
    private WebDriver driver;
    public MyProvidersPage (WebDriver driver) {
    }
    //Buttons in the main search window
    @FindBy(xpath = ".//*[@id='providerSearch']")
    private WebElement searchButton;
    @FindBy(xpath = ".//*[@id='clearFindProvider']")
    private WebElement clearButton;
    @FindBy(css = "#manualAdd")
    private WebElement addManuallyButton;
    @FindBy(css = ".btn.btn-primary.getProvider")
    private WebElement updateProviderButton;
    @FindBy(css = ".btn.btn-danger.removeProvider")
    private WebElement deleteProviderButton;
    @FindBy(css = ".btn.btn-primary.pull-right.backToProviderBtn")
    private WebElement backToProvidersButton;
    @FindBy(css = "#updateProviderBtn")
    private WebElement updateProviderButtonInTheChart;
    @FindBy(css = "#removeFullProvider")
    private WebElement deleteProviderButtonInTheChart;
    @FindBy(css = ".confirm")
    private WebElement okButtonForError;

    //Fields in the main search window
    @FindBy (xpath = "//input[@name='findLastName']")
    private WebElement lastNameField;
    @FindBy (xpath = "//input[@name='findFirstName']")
    private WebElement firstNameField;
    @FindBy (xpath = "//input[@name='findOrganizationName']")
    private WebElement organizationNameField;
    @FindBy (xpath = "//input[@name='findCity']")
    private WebElement cityField;
    @FindBy (xpath = "//input[@name='findPostal']")
    private WebElement postalCodeField;

    //Dropdowns in the Main search window
    @FindBy(xpath = "//select[@name='findState']")
    private WebElement stateDropDown;
    @FindBy(xpath = "//select[@name='findState']/option[@value='AZ']")
    private WebElement stateOption;
    @FindBy(xpath = "//select[@name='findCountry']")
    private WebElement countryDropDown;
    @FindBy(xpath = "//select[@name='findCountry']/option[@value='US']")
    private WebElement conutryOption;

    //Columns in the results table
    @FindBy(css = ".npiNumber")
    private WebElement npiNumberColumn;
    @FindBy(css = ".providerFirstName")
    private WebElement firstnameColumn;
    @FindBy(css = ".providerLastName")
    private WebElement lastNameColumn;
    @FindBy(css = ".providerCity")
    private WebElement cityColumn;
    @FindBy(css = ".providerOrganization")
    private WebElement organizationNameColumn;
    @FindBy(css = ".k-icon.k-i-close")
    private WebElement closeResultsWindow;
    @FindBy(css = ".btn.btn-primary.selectProvider")
    private WebElement addProviderButton;

    //Fields in the providers chart
    @FindBy(css = "#pType")
    private WebElement providerTypeDropDown;
    @FindBy(xpath = ".//*[@id='pType']/option[@value='2']")
    private WebElement providerTypeOption;
    @FindBy(xpath = "//span[@aria-controls='lastApp_dateview']")
    private WebElement calendarLastAppointmentSelect;
    @FindBy(xpath = "//a[@title='Monday, January 01, 2018']")
    private WebElement calendarLastAppointSet;
    @FindBy(xpath = "//span[@aria-controls='nextApp_dateview']")
    private WebElement calendarNextAppointmentSelect;
    @FindBy(xpath = "//a[@title='Wednesday, February 28, 2018']")
    private WebElement calendarNextAppointSet;
    @FindBy(css = "#addfax")
    private WebElement faxField;
    @FindBy(css = "#addpName")
    private WebElement providerNameField;
    @FindBy(css = "#addpCompany")
    private WebElement providerCompanyField;
    @FindBy(css = "#addpEmail")
    private WebElement providerEmailField;
    @FindBy(css = "#addpPhone")
    private WebElement providerPhoneField;
    @FindBy(css = "#addcommentBox")
    private WebElement addCommentBox;
    @FindBy(css = "#save-submit-btn")
    private WebElement saveManuallyAddedProvider;

    // Error texts
    @FindBy(css = ".sweet-alert.showSweetAlert.visible>h2")
    private WebElement searchError;

    //Provider text
    @FindBy(xpath = "//div[@class='form-group text-center']/label")
    private WebElement providerNameLabel;
    @FindBy(xpath = "//label[.=\"Test Provider\"]")
    private WebElement providerNameLabel2;



    public MyProvidersPage typeFirstName(String firstname){
        firstNameField.sendKeys(firstname);
        return this;
    }
    public MyProvidersPage typeLastName(String lastname){
        lastNameField.sendKeys(lastname);
        return this;
    }
    public MyProvidersPage typeOrganization (String organization){
        organizationNameField.sendKeys(organization);
        return this;
    }
    public MyProvidersPage typeCity (String cityname){
        cityField.sendKeys(cityname);
        return this;
    }
    public MyProvidersPage typeZip (String zip){
        postalCodeField.sendKeys(zip);
        return this;
    }
    public MyProvidersPage chooseState(){
        stateDropDown.click();
        stateOption.click();
        return this;
    }
    public MyProvidersPage chooseCountry(){
        countryDropDown.click();
        conutryOption.click();
        return this;
    }
    public MyProvidersPage hitSearchButton(){
        searchButton.click();
        return this;
    }

    public MyProvidersPage hitAddProviderManually(){
        addManuallyButton.click();
        return this;
    }
    public MyProvidersPage hitAddProvider(){
        addProviderButton.click();
        return this;
    }
    public MyProvidersPage hitOkError() {
        okButtonForError.click();
        return this;
    }
    public MyProvidersPage setLastDate(){
        calendarLastAppointmentSelect.click();
        calendarLastAppointSet.click();
        return this;
    }
    public MyProvidersPage setNextDate() {
        calendarNextAppointmentSelect.click();
        calendarNextAppointSet.click();
        return this;
    }
    public MyProvidersPage hitSaveManuallyAddedProvider(){
        saveManuallyAddedProvider.click();
        return this;
    }
    public MyProvidersPage providerDropDown(){
        providerTypeDropDown.click();
        return this;
    }
    public MyProvidersPage providerDropDownOption(){
        providerTypeOption.click();
        return this;
    }
    public MyProvidersPage typeProviderName (String providername){
        providerNameField.sendKeys( providername);
        return this;
    }
    public MyProvidersPage typeProviderCompany (String companyname){
        providerCompanyField.sendKeys( companyname);
        return this;
    }
    public MyProvidersPage typeProviderEmail (String provideremail){
        providerEmailField.sendKeys( provideremail);
        return this;
    }
    public MyProvidersPage typeProviderPhone (String providerPhone){
        providerPhoneField.sendKeys( providerPhone);
        return this;
    }
    public MyProvidersPage typeFax (String fax){
        faxField.sendKeys( fax);
        return this;
    }
    public MyProvidersPage typeComment (String notes){
        addCommentBox.sendKeys( notes);
        return this;
    }
    public MyProvidersPage clickSaveManually ( ){
        saveManuallyAddedProvider.click();
        return this;
    }

    public MyProvidersPage addProviderManually(String providername, String companyname, String provideremail,
                                               String providerphone, String fax, String notes){
        this.typeProviderName(providername);
        this.typeProviderCompany(companyname);
        this.typeProviderEmail(provideremail);
        this.typeProviderPhone(providerphone);
        this.typeFax(fax);
        this.typeComment(notes);
        //this.providerDropDown();
        //this.providerDropDownOption();
        this.clickSaveManually();
        return new MyProvidersPage(driver);
    }

    public MyProvidersPage fillInProviderSearch(String firstname,String lastname,String organization,String cityname,String zip ){
        this.typeFirstName(firstname);
        this.typeLastName(lastname);
        this.typeOrganization(organization);
        this.typeCity(cityname);
        this.typeZip(zip);
        this.chooseCountry();
        this.chooseState();
        this.hitSearchButton();
        return new MyProvidersPage(driver);
    }

    public String searchErrorText () {return searchError.getText();}
    public String npiNumberColumnText () {return npiNumberColumn.getText();}
    public String firstnameColumnText (){return firstnameColumn.getText();}
    public String lastnameColumnText () {return lastNameColumn.getText();}
    public String cityColumnText (){return cityColumn.getText();}
    public String organizationColumnText () {return organizationNameColumn.getText();}
    public String providerNameText (){return providerNameLabel.getText();}
    public String provider2Text () {return providerNameLabel2.getText();}


}
