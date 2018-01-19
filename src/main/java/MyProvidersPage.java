import com.sun.xml.internal.bind.v2.WellKnownNamespace;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MyProvidersPage {
    private WebDriver driver;
    public MyProvidersPage (WebDriver driver) {
    }
    //Buttons
    @FindBy(xpath = ".//*[@id='providerSearch']")
    private WebElement searchButton;
    @FindBy(xpath = ".//*[@id='clearFindProvider']")
    private WebElement clearButton;
    @FindBy(xpath = ".//*[@id='manualAdd']")
    private WebElement addManuallyButton;
    @FindBy(css = ".btn.btn-primary.selectProvider")
    private WebElement addProviderButton;
    @FindBy(css = ".btn.btn-primary.getProvider")
    private WebElement updateProviderButton;
    @FindBy(css = ".btn.btn-danger.removeProvider")
    private WebElement deleteProviderButton;
    @FindBy(css = ".btn.btn-primary.pull-right.backToProviderBtn")
    private WebElement backToProvidersButton;
    @FindBy(css = "#updateProviderBtn")
    private WebElement updateProviderButtonInTheChart;
    @FindBy(css = "#removeFullProvider")
    private WebElement deleteProviderButtonInThe

    //Fields
    @FindBy (xpath = "//input[@name='findLastName']")
    private WebElement lastNameField;
    @FindBy (xpath = "//input[@name='findFirstName']")
    private WebElement firstNameField;
    @FindBy (xpath = "//input[@name='findOrganizationName']")
    private WebElement OrganizationNameField;
    @FindBy (xpath = "//input[@name='findCity']")
    private WebElement cityField;
    @FindBy (xpath = "//input[@name='findPostal']")
    private WebElement postalCodeField;
//_________________________________________________________________________

    @FindBy(xpath = "#pType")
    private WebElement providerTypeDropDown;
    @FindBy(xpath = ".//*[@id='pType']/option[@value='3']")
    private WebElement providerTypeOption;
    @FindBy(xpath = "//span[@aria-controls='lastApp_dateview']")
    private WebElement calendarLastAppointmentSelect;
    @FindBy(xpath = "//span[@aria-controls='nextApp_dateview']")
    private WebElement calendarNextAppointmentSelect;
    @FindBy(css = "#fax")
    private WebElement faxField;










    //Dropdown
    @FindBy(xpath = "//select[@name='findState']")
    private WebElement stateDropDown;
    @FindBy(xpath = "//select[@name='findState']/option[@value='AZ']")
    private WebElement stateOption;
    @FindBy(xpath = "//select[@name='findCountry']")
    private WebElement countryDropDown;
    @FindBy(xpath = "//select[@name='findCountry']/option[@value='US']")
    private WebElement contryOption;

    //Columns
    @FindBy(css = ".npiNumber")
    private WebElement npiNumberColumn;
    @FindBy(css = ".providerFirstName")
    private WebElement firstnameColumn;
    @FindBy(css = ".providerLastName")
    private WebElement lastNameColumn;
    @FindBy(css = ".providerCity")
    private WebElement cityColumn;
    @FindBy(css = ".providerOrganization")
    private WebElement getOrganizationNameColumn;
    @FindBy(css = ".k-icon.k-i-close")
    private WebElement closeResultsWindow;

    //Elements
    @FindBy(css = ".form-group.text-center>label")
    private WebElement providerNamelabel;




}
