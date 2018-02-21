import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SecureDocumentsPage {
    private WebDriver driver;
    public SecureDocumentsPage(WebDriver driver) {
    }

    @FindBy(xpath = ".//a[@class='new-secure-document-actions']/i[1]")
    private WebElement addDocumentButton;
    @FindBy(css = "#save-new-secure-doc")
    private WebElement saveRecordButton;
    @FindBy(css = ".btn.btn-primary.getDocuments")
    private WebElement updateRecordButton;
    @FindBy(css = ".btn.btn-danger.deleteWholeDocuments")
    private WebElement deleteButton;
    @FindBy(css = "#update-secure-doc")
    private WebElement updateAllButton;
    @FindBy(css = "#deleteDocumentOnUpdatePage")
    private WebElement deleteRecordButtonOnTheUpdatePage;
    @FindBy(css = ".btn.btn-danger.deleteFromUpdateDocument.docCount")
    private WebElement deleteDocumentButtonOnTheUpdatePage;
    @FindBy(css = "#toAddDocs")
    private WebElement backToRecordsButton;

    //List of Fields
    @FindBy(xpath = ".//*[@id='finalRow']/div")
    List<WebElement> allButtons;
    @FindBy(xpath = "//input[@type='text']")
    List<WebElement> allInputFields;

    //actions
    public SecureDocumentsPage addDocument(){
        addDocumentButton.click();
         return this;
    }

    public SecureDocumentsPage saveButtonClick(){
        saveRecordButton.click();
        return this;
    }
     public SecureDocumentsPage takeScreenshot (){
         addDocumentButton.click();
         return this;
    }

}
