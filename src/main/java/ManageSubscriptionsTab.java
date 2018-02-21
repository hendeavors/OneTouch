
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.cert.X509Certificate;
import java.sql.Driver;
import java.util.List;

public class ManageSubscriptionsTab {
    private WebDriver driver;
    public ManageSubscriptionsTab(WebDriver driver) {
    }

    //Buttons
    @FindBy(xpath = "//subscription-card/div/div[2]/subscription-form/standard-form/form/div[6]/div/button")
    private WebElement updatePlanButton;
    @FindBy(xpath = "//subscription-card/div/div[2]/subscription-form/standard-form/form/div[6]/div/button")
    private WebElement updateCreditCardButton;
    @FindBy(xpath = "//subscription-vat/div/div[2]/standard-form/form/div[2]/div/button")
    private WebElement updateExtraBillingInfoButton;
    @FindBy(xpath = "//button[@class='btn btn-danger btn-xs pull-right']")
    private WebElement cancelSubscriptionButton;
    @FindBy(xpath = "//div[3]/div/div[2]/standard-form/form/div/div/button")
    private WebElement submitCancellationButton;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/billing/invoice/in_1BjYhiDEQFXKcRmV7CRtpFx2']")
    private WebElement downloadReceiptButton;
    @FindBy(xpath = "//resume-subscription/div/div[2]/standard-form/form/div/div/button")
    private WebElement resumeSubscriptionButton;
    @FindBy(xpath = "//resume-subscription/div/div[2]/standard-form/form/div/div/button")
    List<WebElement> resumeButton;
    @FindBy(xpath = "//button[@class='btn btn-danger btn-xs pull-right']")
    List<WebElement> cancelButton;
    @FindBy(xpath = ".//*[@id='spark-settings-subscription-screen']/div/div[1]/div[1]")
    List<WebElement> subscribePanel;
    @FindBy (xpath = "//div[@class='panel-heading' and text()='Current Subscription']")
    private WebElement subscriptionPanelHeader;
    @FindBy (xpath = "//div[@class='panel-heading' and text()='Subscribe']")
    private WebElement subscribeHeader;

    //Fields
    @FindBy(xpath = "//input[@name='cc_number']")
    private WebElement creditCardField;
    @FindBy(xpath = "//input[@name='ccv']")
    private WebElement ccvField;
    @FindBy(name = "expire_month")
    private WebElement expireMonth;
    @FindBy(name = "expire_year")
    private WebElement expireYear;
    @FindBy(name = "zip")
    private WebElement zipcodeField;
    @FindBy(xpath = "//textarea[@name='text']")
    private WebElement extraBillingInfoField;

    //Checkbox
    @FindBy(xpath = "//input[@name='terms']")
    private WebElement checkBox;


    //Checking Containers
    @FindBy(xpath = "//div[@class='alert alert-success ng-scope']")
    private WebElement successContainer;
    @FindBy(xpath = "//subscription-card/div/div[1]/div[2]/span")
    private WebElement ccNumberContainer;
    @FindBy(css = ".alert.alert-success.ng-scope")
    private WebElement successContainerVAT;

    //Errors

    @FindBy(xpath = "//strong[text()='The card number is not a valid credit card number.']")
    private WebElement invalidCardError1;
    @FindBy(xpath = "//strong[text()='The credit card entered is invalid or cannot be used.']")
    private WebElement invalidCardError2;
    @FindBy(xpath = "//div[2]/div/div/span/strong")
    private WebElement invalidCVVError;
    @FindBy(xpath = "//div[3]/div/div/div/div[1]/div/span/strong")
    private WebElement invalidExpMonthError;
    @FindBy(xpath = "//div[3]/div/div/div/div[2]/div/span/strong")
    private WebElement invalidExpYearError;
    @FindBy (xpath = ".//*[@id='spark-settings-subscription-screen']/div/resume-subscription/div/div[2]/div")
    private WebElement yellowContainer;

    public String text1 () {return subscribeHeader.getText();}
    public String text () {return subscriptionPanelHeader.getText();}
    public String whenTheSubscriptionIsCanceledText () { return yellowContainer.getText();}
    public String cardCannotBeUsedErrorText () {return invalidCardError2.getText();}
    public String invalidCCNumErrorText () {return invalidCardError1.getText();}

    public String invalidCVVErrorText () {return invalidCVVError.getText(); }
    public String invalidExpMonthErrorText () {return invalidExpMonthError.getText();}
    public String invalidExpYearErrorText () {return invalidExpYearError.getText();}



    public String ccnumberMeaning () {return ccNumberContainer.getText();}
    public String successText () {return successContainer.getText();}
    public String successText2 () {return successContainerVAT.getText();}


    public ManageSubscriptionsTab typeCardNumber (String cardnumber){
        creditCardField.clear();
        creditCardField.sendKeys(cardnumber);
        return this;
    }
    public ManageSubscriptionsTab typeSecurityCode (String securitycode){
        ccvField.clear();
        ccvField.sendKeys(securitycode);
        return this;
    }
    public ManageSubscriptionsTab typeExpMonth (String expirationmonth){
        expireMonth.clear();
        expireMonth.sendKeys(expirationmonth);
        return this;
    }
    public ManageSubscriptionsTab typeExpYear (String expirationyear){
        expireYear.clear();
        expireYear.sendKeys(expirationyear);
        return this;
    }
    public ManageSubscriptionsTab typeZipCode (String zip){
        zipcodeField.clear();
        zipcodeField.sendKeys(zip);
        return this;
    }
    public ManageSubscriptionsTab setCheckbox (boolean  value) {
        if (!checkBox.isSelected() == value){
            checkBox.click();
        }
        return this;
    }


    public ManageSubscriptionsTab setCardValues (String cardnumber,String securitycode,
                                                 String expirationmonth, String expirationyear, String zip){
        this.typeCardNumber(cardnumber);
        this.typeSecurityCode(securitycode);
        this.typeExpMonth(expirationmonth);
        this.typeExpYear(expirationyear);
        this.typeZipCode(zip);
        return new ManageSubscriptionsTab(driver);
    }
    public ManageSubscriptionsTab clickUpdateCard(){
        updatePlanButton.click();
        return this;
    }

    public ManageSubscriptionsTab typeExtraBillingInfo (String info){
        extraBillingInfoField.clear();
        extraBillingInfoField.sendKeys(info);
        updateExtraBillingInfoButton.click();
        return this;
    }

    public ManageSubscriptionsTab clickCancel (){
        cancelSubscriptionButton.click();
        return this;
    }
     public ManageSubscriptionsTab clickSubmitCancellation(){
       submitCancellationButton.click();
       return this;
     }

    public ManageSubscriptionsTab clickDownLoad (){
        downloadReceiptButton.click();
        return this;
    }

    public boolean yellowContainerIsDisplayed(){ return yellowContainer.isDisplayed() == true;    }
    public boolean resumeButtonIsDisplayed(){return resumeButton.size()>0 == true;    }
    public boolean cancelSubscriptionIsDisplayed(){ return cancelButton.size()>0 == true;    }
    public boolean subscribePanelisDisplayed(){ return  subscribePanel.size()>0 == true;    }


    public ManageSubscriptionsTab hitResumeButtonifDisplayed (  ) {
        if (resumeButtonIsDisplayed()== true)
        {
            resumeSubscriptionButton.click();
        }
        else {
            cancelSubscriptionButton.click();
        }
        return this;
    }

    public ManageSubscriptionsTab hitCancelButtonifDisplayed (  ) {
        if (cancelSubscriptionIsDisplayed()== true)
              {
            cancelSubscriptionButton.click();
              }
        else {
            resumeSubscriptionButton.click();
            }
        return this;
    }


     public ManageSubscriptionsTab clickResumeButton (){
        resumeSubscriptionButton.click();
        return this;
     }




}
