import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureDocumentsPage {
    private WebDriver driver;

    public SecureDocumentsPage(WebDriver driver) {
        this.driver = driver;
    }
     private By recordField = By.xpath("//input[@name='title']");
     private By descriptionField = By.xpath(".//*[@id='newDescription']");
     private By documentNameField = By.xpath("//input[@class='documentName form-control']");
     private By documentName2 = By.xpath("//input[@class='docName form-control documentName']");
     private By uploadFileButton = By.xpath("//input[@name='fileToUpoad']");
     private By addOneMoreDocumentButton = By.xpath("//input[@class='pagefile form-control-file addfile']");
     private By saveButton = By.xpath(".//*[@id='save-new-secure-doc']");
     private By addDocumentButton = By.xpath("//a[@class='addDocument']/i[@class='fa fa-plus-circle']");
     private By countryDropDown = By.xpath("//select[@class='form-control' and @name='findCountry']");
     private By countryOption = By.xpath("//select[@class='form-control' and @name='findState']//option[@value='US']");
     private By postalcodeField = By.xpath("//input[@name='findPostal']");
     private By clearButton = By.xpath(".//*[@id='clearFindProvider']");
     private By searchButton = By.xpath(".//*[@id='providerSearch']");
     private By addmanuallyButton = By.xpath(".//*[@id='manualAdd']");

     // typing the record name for the document
     public SecureDocumentsPage typeRecordName(String recordname) {
        driver.findElement(recordField).sendKeys(recordname);
        return this;
    }
    // typing the description for the document
    public SecureDocumentsPage typeDescription (String description) {
        driver.findElement(descriptionField).sendKeys(description);
        return this;
    }
    // typing the name for the document
    public SecureDocumentsPage typeDocumentName(String documentname1){
        driver.findElement(documentNameField).sendKeys(documentname1);
        return this;
    }
    // attempt to upload the file
    public SecureDocumentsPage uploadDocument(){
        driver.findElement(uploadFileButton).sendKeys("C:\\Users\\eugenes\\Downloads\\desktop.jpg");
        return this;
    }
    // attempt to save the record
    public SecureDocumentsPage clickSaveRecordButton() {
        driver.findElement(saveButton).click();
        return this;
    }
//  attempt to add one more document
//  public SecureDocumentsPage addOneMoreDocument() {
//      driver.findElement(addDocumentButton).click();
//        driver.findElement(documentName2).sendKeys();
//        return this;

    //add the first document
    public SecureDocumentsPage addingADocument (String recordname, String description, String documentname1){
        this.typeRecordName(recordname);
        this.typeDescription(description);
        this.typeDocumentName(documentname1);
        this.uploadDocument();
        this.clickSaveRecordButton();
        return new SecureDocumentsPage(driver);
    }
/*    public SecureDocumentsPage addingOneMoreDocument (String recordname, String description, String documentname1){
        this.typeRecordName(recordname);
        this.typeDescription(description);
        this.typeDocumentName(documentname1);
        this.uploadDocument();
        this.clickSaveRecordButton();
        return new SecureDocumentsPage(driver);
*/


}






