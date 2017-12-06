import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProviderPage {
    private WebDriver driver;

    public MyProviderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameField = By.xpath("//div[@class='col-md-6']/input[@name='findFirstName']");
    private By lastnameField = By.xpath("//div[@class='col-md-6']/input[@name='findLastName']");
    private By organizationNameField = By.xpath("//div[@class='col-md-6']/input[@name='findOrganizationName']");
    private By cityNameField = By.xpath("//div[@class='col-md-6']/input[@name='findCity']");
    private By stateDropDown = By.xpath("//select[@class='form-control' and @name='findState']");
    private By stateOption = By.xpath("//select[@class='form-control' and @name='findState']/option[@value='AZ']");
    private By countryDropDown = By.xpath("//select[@class='form-control' and @name='findCountry']");
    private By countryOption = By.xpath("//select[@class='form-control' and @name='findState']//option[@value='US']");
    private By postalcodeField = By.xpath("//input[@name='findPostal']");
    private By clearButton = By.xpath(".//*[@id='clearFindProvider']");
    private By searchButton = By.xpath(".//*[@id='providerSearch']");
    private By addmanuallyButton = By.xpath(".//*[@id='manualAdd']");


    public MyProviderPage typeFirstName(String firstname) {
        driver.findElement(firstNameField).sendKeys(firstname);
        return this;
    }

    public MyProviderPage typeLastName(String lastname) {
        driver.findElement(lastnameField).sendKeys(lastname);
        return this;
    }

    public MyProviderPage typeOrganizationName(String orgname) {
        driver.findElement(organizationNameField).sendKeys(orgname);
        return this;
    }

    public MyProviderPage typeCity(String cityname) {
        driver.findElement(cityNameField).sendKeys(cityname);
        return this;
    }

    public MyProviderPage typePostalCode(String postalcode) {
        driver.findElement(postalcodeField).sendKeys(postalcode);
        return this;
    }

    public MyProviderPage selectState() {
        driver.findElement(stateDropDown).click();
        driver.findElement(stateOption).click();
        return this;
    }

    public MyProviderPage selectCountry() {
        driver.findElement(countryDropDown).click();
        driver.findElement(countryOption).click();
        return this;
    }

    public MyProviderPage clickSearchButton() {
        driver.findElement(searchButton).click();
        return this;
    }

    public MyProviderPage searchingByFirstAndLastName (String firstname, String lastname) {
        this.typeFirstName(firstname);
        this.typeLastName(lastname);
        this.clickSearchButton();
        return new MyProviderPage(driver);
    }
}