package MyAccountTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class EditContactInfoTab {

    private WebDriver driver;
    public EditContactInfoTab(Driver driver) {
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

    public EditContactInfoTab typeHomePhone (String number){
        homePhoneField.sendKeys(number);
        return this;
    }
    public EditContactInfoTab typeMobilePhone (String mobileNumber){
        mobilePhoneField.sendKeys(mobileNumber);
        return this;
    }
    public EditContactInfoTab typeBusinessPhone (String businessNumber){
        businessPhoneField.sendKeys(businessNumber);
        return this;
    }
    public EditContactInfoTab typeFax (String faxNumber){
        homePhoneField.sendKeys(faxNumber);
        return this;
    }
    public EditContactInfoTab typeAddress (String address1){
        addressField.sendKeys(address1);
        return this;
    }
    public EditContactInfoTab typeAddress2 (String address2){
        address2Field.sendKeys(address2);
        return this;
    }
    public EditContactInfoTab typeCity (String city){
        cityField.sendKeys(city);
        return this;
    }
    public EditContactInfoTab typeZip (String zipcode){
        zipCodeField.sendKeys(zipcode);
        return this;
    }
    public EditContactInfoTab chooseArizonaState(){
        stateDropDown.click();
        stateArizonaOption.click();
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
        return this;
    }
    public EditContactInfoTab pressSaveButton(){
        saveButton.click();
        return this;
    }
    public EditContactInfoTab clickSecondaryAddress(){
        secondaryHeadingTab.click();
        return this;
    }

}