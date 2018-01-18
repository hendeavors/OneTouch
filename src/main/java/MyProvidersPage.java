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







}
