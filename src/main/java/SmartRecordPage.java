import javafx.scene.web.WebHistory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SmartRecordPage {

    public WebDriver driver;
    public SmartRecordPage(WebDriver driver)   {

        this.driver = driver;
    }


    // Admin elements

    @FindBy(xpath = "//input[@data-text-field='ProviderName']")
    private WebElement providerNameFieldInAdmin;
    @FindBy(xpath = "//button[@class='btn btn-success btn-xs restore-provider']")
    private WebElement restoreButton;
    @FindBy (xpath = "//i[@class='fa fa-undo']")
    private List<WebElement> restoreButtons;

    public SmartRecordPage typeProviderNameAtAdmin (String providertorestore)  {
        providerNameFieldInAdmin.sendKeys(providertorestore);
        providerNameFieldInAdmin.sendKeys(Keys.ENTER);
        return this;
    }
    public SmartRecordPage clickRestoreButton () {
        restoreButton.click();
        driver.switchTo().alert().accept();
        return this;
    }
    public SmartRecordPage clickRestoreAllTheElements () {
        for (WebElement restoreButton : restoreButtons){
            restoreButton.click();
        }
        return this;
    }




     //buttons

    @FindBy (xpath = "//button[@ng-click='attachmentsCtrl.updateAttachmentName(attachment)']")
    private WebElement saveRecordNameButton;




    @FindBy(xpath = "//button[@ng-click='providersSearchCtrl.setAddProviderDetails(provider)']")
    private List<WebElement> addButtons;
    @FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
    private List<WebElement> providerPropertiesDropDown;
    @FindBy(xpath = "//button[@class='btn btn-default btn-sm']")
    private List<WebElement> viewButtonsList;
    @FindBy(xpath = "//button[@class='btn btn-info btn-sm']")
    private List<WebElement> editButtonsList;
    @FindBy(xpath = "//button[@class='btn btn-danger btn-sm']")
    private List<WebElement> deleteButtonsList;

    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[1]/a")
    private WebElement moreInfoButton1;
    @FindBy(xpath = ".//*[@id='smart-record-content']/providers-section/section/h3/div/div[1]/a")
    private WebElement moreInfoButton2;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[2]/a")
    private WebElement moreInfoButton3;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm pull-right ng-scope']")
    private WebElement providerListButton;
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm pull-right ng-scope']")
    private WebElement addProviderButton;
    @FindBy(xpath = "//button[@class='btn btn-primary pull-right ng-scope']")
    private WebElement saveProviderButton;
    @FindBy (xpath = "//button[@class='btn btn-danger btn-sm btn-block']")
    private WebElement deleteProviderButton;
    @FindBy (xpath = "//button[@class='btn btn-danger btn-sm btn-block ng-scope']")
    private WebElement confirmDeletingProvider;

    @FindBy (xpath = ".//*[@id='app-layout']/div[23]/div[7]/div/button")
    private WebElement okbuttonInTheWarning;

    @FindBy(xpath = "//button[@class='btn btn-primary ng-scope']")
    private WebElement searchButton;
    @FindBy(xpath = "//button[@class='btn btn-warning']")
    private WebElement clearButton;
    @FindBy(xpath = ".//*[@id='findYourProvider']/button")
    private WebElement addManuallyButton;
    @FindBy(xpath = "//button[@ng-click='providersAddEditCtrl.saveProvider()']")
    private WebElement saveManuallyAddedButton;
    @FindBy(xpath = ".//*[@id='smart-record-content']/div[3]/button")
    private WebElement medicareClaimsImportButton;
    @FindBy(xpath = "//button[@ng-click='providersSearchCtrl.clearResults()']")
    private WebElement backToSearchButton;


    // Year selection
    @FindBy(xpath = ".//*[@id='chart-year-select']")
    private WebElement yearDropDown;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2017']")
    private WebElement option2017;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2016']")
    private WebElement option2016;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2015']")
    private WebElement option2015;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2014']")
    private WebElement option2014;


    // texts
    @FindBy(xpath = "//p[text()='You can arrange the document to your preferences." +
            " Move sections by dragging them. Hide by closing. Use the TOC to review.']")
    private WebElement ccdDisclaimer;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[1]")
    private WebElement directMessagingString;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[2]")
    private WebElement yourClinicalRecordString;

    //texts for moreinfo buttons
    @FindBy(css = ".popover-content")
    private WebElement moreInfo1Text;
    @FindBy(css = ".popover-content")
    private WebElement moreInfo2Text;
    @FindBy(css = ".popover-content")
    private WebElement moreInfo3Text;

    //year text for Parts A/B/D date
    @FindBy (xpath = ".//*[@id='PartA']/div/h2/small")
    private WebElement partAYear;
    @FindBy(xpath = ".//*[@id='PartB']/div/h2/small")
    private WebElement partBYear;
    @FindBy(xpath = ".//*[@id='PartD']/div/h2/small")
    private WebElement partDYear;

    // fields

    @FindBy(xpath = "//input[@ng-model='providersSearchCtrl.formFields.findFirstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@ng-model='providersSearchCtrl.formFields.findOrganizationName']")
    private WebElement organizationNameField;
    @FindBy(xpath = "//input[@ng-model='providersSearchCtrl.formFields.findLastName']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@ng-model='providersSearchCtrl.formFields.findCity']")
    private WebElement cityField;
    @FindBy(xpath = "//input[@ng-model='providersSearchCtrl.formFields.findPostal']")
    private WebElement zipField;
    @FindBy(xpath = ".//*[@id='findState']")
    private WebElement stateDropDown;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='AZ']")
    private WebElement stateAZ;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='CA']")
    private WebElement stateCA;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='DC']")
    private WebElement stateDC;


    //Fields for manual adding
    @FindBy(xpath = "//select[@class='form-control ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']")
    private WebElement providerTypeDropDown;
    @FindBy(xpath = "//select[@class='form-control ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']/option[@value='2']")
    private WebElement providerTypeSpecialistOption;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.providercompany']")
    private WebElement providerCompanyField;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.providername']")
    private WebElement providerNameField;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.email']")
    private WebElement providerEmailField;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.providerphone']")
    private WebElement providerPhoneField;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.providerwebsite']")
    private WebElement providerWebsiteField;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.zipcode']")
    private WebElement providerZipCodeField;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.city']")
    private WebElement providerCityField;
    @FindBy(xpath = "//input[@ng-model='providersAddEditCtrl.currentProvider.props.provideraddress']")
    private WebElement providerAddressField;

    @FindBy(xpath = "//select[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")
    private WebElement providerStateDropDown;
    @FindBy(xpath = "//select[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']/option[@value='AZ']")
    private WebElement providerStateOption;

    @FindBy(xpath = ".//*[@id='findState']/option[@value='DC']")
    private WebElement familyMemberDropDown;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='DC']")
    private WebElement familyMemberFirstName;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='DC']")
    private WebElement familyMemberLastName;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='DC']")
    private WebElement lastAppointment;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='DC']")
    private WebElement nextAppointment;
    @FindBy(xpath = ".//*[@id='findState']/option[@value='DC']")
    private WebElement commentsField;


    @FindBy(xpath = "//input[@ng-model='attachment.newName']")
    private WebElement clinicalRecordNameField;











    //objects
    @FindBy(xpath = ".//*[@id='toast-container']/div")
    private WebElement greenContainer;
    @FindBy(xpath = ".//*[@id='app-layout']/div[23]/h2")
    private WebElement warningContainer;
    @FindBy(xpath = ".//*[@id='myccdwindow']")
    private WebElement myCCDWindow;
    @FindBy (xpath = "//div[@class='modal-content']")
    private WebElement claimsWindow;



    // .//*[@id='toast-container']/div/div  - New Provider Saved!

    // boolean methods
    public boolean greenContainerIsDisplayed () {return greenContainer.isDisplayed();}
    public boolean providersAreDisplayed () {return providerPropertiesDropDown.size()>0;}
    public boolean ccdAreDiplayed () {return viewButtonsList.size()>0;}
    public boolean providersAreNOTDisplayed () {return providerPropertiesDropDown.size()<1;}
    public boolean ccdAreNOTDiplayed () {return viewButtonsList.size()<1;}
    public boolean claimsWindowIsDisplayed () {return claimsWindow.isDisplayed();}





    public boolean myCCDWindowIsDisplayed () {return myCCDWindow.isDisplayed();}


    // text to check
    public String partAYearText (){return partAYear.getText();}
    public String partBYearText (){return partBYear.getText();}
    public String partDYearText (){return partDYear.getText();}
    public String moreInfoButton3Text () {return moreInfo3Text.getText();}
    public String moreInfoButton1Text () {return moreInfo1Text.getText();}
    public String moreInfoButton2Text () {return moreInfo2Text.getText();}
    public String greenContainerText () {return greenContainer.getText();}
    public String warningContainerText () {return warningContainer.getText();}


    //click methods



    public SmartRecordPage clickMedicareClaimsImport () {
        medicareClaimsImportButton.click();
        return this;
    }
   public SmartRecordPage clickSaveRecordname () {
        saveRecordNameButton.click();
        return this;
    }
    public SmartRecordPage clickFirstCCDViewButton () {
        viewButtonsList.get(0).click();
        return this;
    }
    public SmartRecordPage clickFirstEditButton () {
        editButtonsList.get(0).click();
        return this;
    }
    public SmartRecordPage clickFirstDeleteRecordButton () {
        deleteButtonsList.get(0).click();
        return this;
    }
    public SmartRecordPage clickSaveManuallyAdded () {
        saveManuallyAddedButton.click();
        return this;
    }
    public SmartRecordPage clickAddManuallyButton () {
        addManuallyButton.click();
        return this;
    }
        public SmartRecordPage clickConfirmDelete () {
        confirmDeletingProvider.click();
        return this;
    }
    public SmartRecordPage clickFirstProviderProperty () {
        providerPropertiesDropDown.get(0).click();
        return this;
    }
    public SmartRecordPage clickDeleteProvider () {
        deleteProviderButton.click();
        return this;
    }
    public SmartRecordPage clickStateAndChooseAZ () {
        stateDropDown.click();
        stateAZ.click();
        return this;
    }
    public SmartRecordPage clickStateAndChooseCA () {
        addProviderButton.click();
        stateCA.click();
        return this;
    }
    public SmartRecordPage clickStateAndChooseDC () {
        addProviderButton.click();
        stateDC.click();
        return this;
    }
    public SmartRecordPage clickSearch () {
        searchButton.click();
        return this;
    }
    public SmartRecordPage clickAddProvider () {
        addProviderButton.click();
        return this;
    }
    public SmartRecordPage clickProviderList () {
        providerListButton.click();
        return this;
    }

    public SmartRecordPage clickMoreInfoI (){
        moreInfoButton1.click();
        return this;
    }
    public SmartRecordPage clickMoreInfoII(){
        moreInfoButton2.click();
        return this;
    }
    public SmartRecordPage clickMoreInfoIII(){
        moreInfoButton3.click();
        return this;
    }
    public SmartRecordPage clickYearDropDown(){
        yearDropDown.click();
        return this;
    }
    public SmartRecordPage choose2015(){
        option2015.click();
        return this;
    }
    public SmartRecordPage choose2016(){
        option2016.click();
        return this;
    }
    public SmartRecordPage choose2017(){
        option2017.click();
        return this;
    }
    public SmartRecordPage clickFirstAddButton () {
        addButtons.get(0).click();
        return this;
    }
    public SmartRecordPage clickSaveProviderButton () {
        saveProviderButton.click();
        return this;
    }
    public SmartRecordPage clickAndChooseProviderType () {
        providerTypeDropDown.click();
        providerTypeSpecialistOption.click();
        return this;
    }
    public SmartRecordPage clickAndChooseProviderStateAZ () {
        providerStateDropDown.click();
        providerStateOption.click();
        return this;
    }


    // type methods
    public SmartRecordPage typeFirstName(String firstname){
        firstNameField.sendKeys(firstname);
        return this;
    }
    public SmartRecordPage typeLastName(String lastname){
        lastNameField.sendKeys(lastname);
        return this;
    }
    public SmartRecordPage typeOrganizationName(String organization){
        organizationNameField.sendKeys(organization);
        return this;
    }
    public SmartRecordPage typeCityName(String cityname){
        cityField.sendKeys(cityname);
        return this;
    }
    public SmartRecordPage typeProviderCityName(String cityname){
        providerCityField.sendKeys(cityname);
        return this;
    }
    public SmartRecordPage typeZipCode(String zipcode){
        zipField.sendKeys(zipcode);
        return this;
    }
    public SmartRecordPage typeProviderZipCode(String providerzip){
        providerZipCodeField.sendKeys(providerzip);
        return this;
    }
    public SmartRecordPage typeProviderName(String providername){
        providerNameField.sendKeys(providername);
        return this;
    }
    public SmartRecordPage typeProviderEmail(String provideremail){
        providerEmailField.sendKeys(provideremail);
        return this;
    }
    public SmartRecordPage typeProviderPhoneNum(String providerphone){
        providerPhoneField.sendKeys(providerphone);
        return this;
    }
    public SmartRecordPage typeProviderAddress (String provideraddress){
        providerAddressField.sendKeys(provideraddress);
        return this;
    }
    public SmartRecordPage typeProviderCompany(String providercompany){
        providerCompanyField.sendKeys(providercompany);
        return this;
    }
    public SmartRecordPage typeProviderWebSite(String providerwebsite){
        providerWebsiteField.sendKeys(providerwebsite);
        return this;
    }
    public SmartRecordPage typeNewClinicalRecordName(String recordname){
        clinicalRecordNameField.sendKeys(recordname);
        return this;
    }





}