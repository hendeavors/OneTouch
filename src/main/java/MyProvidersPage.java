import com.sun.xml.internal.bind.v2.WellKnownNamespace;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MyProvidersPage {
    private WebDriver driver;
    public MyProvidersPage (WebDriver driver) {
    }
    //Buttons in the main search window
    @FindBy(xpath = ".//*[@id='providerSearch']")
    private WebElement searchButton;
    @FindBy(xpath = ".//*[@id='clearFindProvider']")
    private WebElement clearButton;
    @FindBy(xpath = ".//*[@id='manualAdd']")
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
    private WebElement getAddProviderButton;

    //Fields in the providers chart
    @FindBy(css = "#pType")
    private WebElement providerTypeDropDown;
    @FindBy(xpath = ".//*[@id='pType']/option[@value='2']")
    private WebElement providerTypeOption;
    @FindBy(xpath = "//span[@aria-controls='lastApp_dateview']")
    private WebElement calendarLastAppointmentSelect;
    @FindBy(xpath = "//span[@aria-controls='nextApp_dateview']")
    private WebElement calendarNextAppointmentSelect;
    @FindBy(css = "#fax")
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

    public MyProvidersPage hitAddProvider(){
        addManuallyButton.click();
        return this;
    }
    public MyProvidersPage addProviderManually(String providername, String companyname, String provideremail){
        providerTypeDropDown.click();
        providerTypeOption.click();
        providerNameField.sendKeys(providername);
        providerCompanyField.sendKeys(companyname);
        providerEmailField.sendKeys(provideremail);
        return this;
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






}
