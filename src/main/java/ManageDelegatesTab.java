

import org.omg.PortableInterceptor.ServerRequestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

import java.sql.Driver;

public class ManageDelegatesTab {
     WebDriver driver;
    public ManageDelegatesTab(WebDriver driver) {
    }

    //Buttons
    @FindBy(xpath = "//input[@value='Add Delegate']")
    private WebElement addDelegateButton;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    private WebElement archiveDelegateButton;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement restoreDeleagateButton;

    //Fields
    @FindBy(xpath = "//input[@id='new-delegate-email']")
    private WebElement newDelegatesEmailField;

    //Checking words
    @FindBy(xpath = "//div/div[2]/h3[1]")
    private WebElement addADelegateheader;
    @FindBy(xpath = "//div/div[2]/h3[2]")
    private WebElement changeDelegateStatusHeader;
    @FindBy(css = ".col-md-4.control-label")
    private WebElement delegateEmailFieldHeader;
    //bottom cords
    @FindBy (xpath = "//div[@class='container']/div[@class='row']/div[1]")
    private WebElement llcBottomLabel;
    @FindBy (xpath = "//a[@title='privacy policy']")
    private WebElement privacyPolicyBottomLabel;
    @FindBy (xpath = "//a[@title='terms and conditions']")
    private WebElement termsBottomLabel;
    // error words
    @FindBy(css = ".help-block>strong")
    private WebElement invalidEmailError;
    @FindBy(xpath = "//div[text()[contains(.,'Delagate already exists!')]]")
    private WebElement existingDelegateError;
    @FindBy (xpath = "//div[text()[contains(.,'Delegate Restored!')]]")
    private WebElement successRestoringMessage;
    @FindBy (xpath = "//div[text()[contains(.,'Delegate Archived!')]]")
    private WebElement successArchivingMessage;


    //list of buttons
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    List<WebElement> archiveButtons;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    List<WebElement> restoreButtons;


    public String getLlcBottomLabel (){ return llcBottomLabel.getText();}
    public String getPrivacyPolicyBottomLabel(){ return privacyPolicyBottomLabel.getText();}
    public String getTermsConditionsLabel(){ return termsBottomLabel.getText();}

    public String getInvalidEmailErrorText () { return invalidEmailError.getText();}
    public String delegateExistErrorText () {return existingDelegateError.getText();}
    public String successRestoringText () {return successRestoringMessage.getText();}
    public String successArchivingText () {return successArchivingMessage.getText();}


    public ManageDelegatesTab typeRandomDelegatesName (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        newDelegatesEmailField.sendKeys("testEmail"+ randomInt+"@gmail.com");
        return this;
    }
    public ManageDelegatesTab typeDelegateEmail(String email) {
        newDelegatesEmailField.sendKeys(email);
        return this;
    }


    public ManageDelegatesTab clickAddDelegate (){
        addDelegateButton.click();
        return this;
    }
    public ManageDelegatesTab clickArchiveAll (){
        for (WebElement archivebutton : archiveButtons){
            archivebutton.click();
        }
        return this;
    }
    public ManageDelegatesTab clickRestoreAll () {
        for (WebElement restorebutton : restoreButtons) {
            restorebutton.click();
        }
        return this;
    }
    public ManageDelegatesTab archiveFirstDelegate (){
        if (archiveButtons.size()>0) archiveButtons.get(0).click();
        else restoreButtons.get(0).click();
        return this;
    }
    public ManageDelegatesTab restoreFirstDelegate (){
        if (restoreButtons.size()>0) restoreButtons.get(0).click();
        else archiveButtons.get(0).click();
        return this;
    }

}