package MyAccountTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class ManageSubscriptionsTab {
    private WebDriver driver;
    public ManageSubscriptionsTab(Driver driver) {
    }

    //Buttons
    @FindBy(css = ".btn.btn-primary.ng-scope")
    private WebElement changePlanButton;
    @FindBy(xpath = "//subscription-card/div/div[2]/subscription-form/standard-form/form/div[6]/div/button")
    private WebElement updateCreditCardButton;
    @FindBy(xpath = "//subscription-vat/div/div[2]/standard-form/form/div[2]/div/button")
    private WebElement updateExtraBillingInfoButton;
    @FindBy(xpath = ".//*[@id='spark-settings-subscription-screen']/div/div[3]/button")
    private WebElement cancelSubscriptionButton;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/billing/invoice/in_1BjYhiDEQFXKcRmV7CRtpFx2']")
    private WebElement downloadReceiptButton;

    //Fields
    @FindBy(xpath = "//input[@name='cc_number']")
    private WebElement creditCardField;
    @FindBy(xpath = "//input[@name='ccv']")
    private WebElement ccvField;
    @FindBy(xpath = "//name[@name='expire_month']")
    private WebElement expireMonth;
    @FindBy(xpath = "//name[@name='expire_year']")
    private WebElement expireYear;
    @FindBy(xpath = "//input[@name='zip']")
    private WebElement zipcodeField;
    @FindBy(xpath = "//textarea[@name='text']")
    private WebElement extraBillingInfoField;

    //Checkbox
    @FindBy(xpath = "//input[@name='terms']")
    private WebElement checkBox;

}
