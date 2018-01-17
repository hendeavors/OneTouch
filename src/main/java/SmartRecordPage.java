import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartRecordPage {

    private WebDriver driver;
    public SmartRecordPage(WebDriver driver) {
    }
     //elements
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[1]/a")
    private WebElement moreInfo1;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[2]/a")
    private WebElement moreInfo2;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[3]/a")
    private WebElement moreInfo3;
    @FindBy(xpath = ".//*[@id='smart-record-content']/div[1]/div/button")
    private WebElement refreshButton;
    @FindBy(xpath = ".//*[@id='chart-year-select']")
    private WebElement yearDropDown;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2017']")
    private WebElement option2017;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2016']")
    private WebElement option2016;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2015']")
    private WebElement option2015;
    @FindBy(xpath = ".//*[@id='smart-record-content']/table/tbody/tr/td[1]")
    private WebElement directAddressLabel;

    //texts
    @FindBy(xpath = ".//*[@id='popover975693']/div[2]")
    private WebElement moreInfo1Text;
    @FindBy(xpath = ".//*[@id='popover474350']/div[2]")
    private WebElement moreInfo2Text;
    @FindBy(xpath = ".//*[@id='popover383925']/div[2]")
    private WebElement moreInfo3Text;



}