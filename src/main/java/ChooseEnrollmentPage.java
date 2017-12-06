import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseEnrollmentPage {
    private WebDriver driver;

    public ChooseEnrollmentPage(WebDriver driver) {this.driver = driver;}

    @FindBy (xpath = "//section[@class='enrollment-type-details']/h2")
    private WebElement fullEnrollmentHeader;
    @FindBy (xpath = "//div[2]/div/div[2]/section/h2")
    private WebElement quickEnrollmentHeader;
    @FindBy (xpath = "//a[@title='Quick enrollment']")
    private WebElement quickEnrollButton;
    @FindBy (xpath = "//a[@title='Full enrollment']")
    private WebElement fullEnrollButton;
    @FindBy (xpath = "//a[@title='Login']")
    private WebElement alreadyHaveAnAccountButton;

    // clicking the buttons
    public ChooseEnrollmentPage chooseFullEnroll(){
        fullEnrollButton.click();
        return new ChooseEnrollmentPage(driver);
    }
    public ChooseEnrollmentPage chooseQuickEnroll(){
        quickEnrollButton.click();
        return new ChooseEnrollmentPage(driver);
    }
    public ChooseEnrollmentPage chooseAlreadyHaveAnAccount(){
        alreadyHaveAnAccountButton.click();
        return new ChooseEnrollmentPage(driver);
    }
    // getting header texts
    public String getFullHeaderText() { return fullEnrollmentHeader.getText(); }
    public String getQuickHeaderText() { return quickEnrollmentHeader.getText(); }

}
