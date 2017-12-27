import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyProviderPage {
    private WebDriver driver;
    public MyProviderPage(WebDriver driver, WebDriver firstNameField, WebDriver lastNameField) {
        this.driver = driver;
        }

    @FindBy(xpath = "//input[@name='findFirstName']")
    private WebDriver firstNameField;
    @FindBy(xpath = "//input[@name='findLastName']")
    private WebDriver lastNameField;
    @FindBy(xpath = "//input[@name='findOrganizationName']")
    private WebDriver organizationNameField;
    @FindBy(xpath = "//input[@name='findCity']")
    private WebDriver cityNameField;
    @FindBy(xpath = "//select[@name='findState']")
    private WebDriver stataDropDown;
    @FindBy(xpath = "//select[@name='findState']/option[@value='AZ']")
    private WebDriver stateOptionAZ;
    @FindBy(xpath = "//select[@name='findCountry']")
    private WebDriver findCountryDropDown;
    @FindBy(xpath = "//select[@name='findCountry']/option[@value='US']")
    private WebDriver countryOptionUS;
    @FindBy(xpath = "//input[@name='findPostal']")
    private WebDriver postalCodeField;
    @FindBy(xpath = ".//*[@id='providerSearch']")
    private WebDriver searchButton;
    @FindBy(xpath = ".//*[@id='clearFindProvider']")
    private WebDriver clearButton;
    @FindBy(xpath = ".//*[@id='manualAdd']")
    private WebDriver addManuallyButton;
    @FindBy (xpath = "//a[@class='btn btn-primary selectProvider']")
    private WebDriver addButton;

}