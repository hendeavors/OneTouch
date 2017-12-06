import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(xpath = ".//*[@id='app-navbar-collapse']/ul[2]/li[2]/a")
    private WebElement myAccountButton;
    @FindBy(xpath = "//a[@href='#welcome-tab']" )
    private WebElement welcomeTab;
    @FindBy(xpath = ".//*[@id='journalTab']/a" )
    private WebElement myJournalTab;
    @FindBy(xpath = "//a[@href='#allProviders']" )
    private WebElement myProvidersTab;
    @FindBy(xpath = "//a[@href='#secure-doc-tab']" )
    private WebElement secureDocumentsTab;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/edit-contact-information']" )
    private WebElement editContactinfoButton;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/edit-delegates']" )
    private WebElement manageDelegatesButton;
    @FindBy(xpath = "//a[@href='https://staging.onetouchhealth.com/logout']" )
    private WebElement logOutButton;
    @FindBy(xpath = "//a[@href='/home#todo-tab']" )
    private WebElement toCompleteButton;
    @FindBy (xpath = "//a[@href='https://staging.onetouchhealth.com/edit-credentials']")
    private WebElement editLoginCredsButton;
    @FindBy (xpath = "//a[@href='https://staging.onetouchhealth.com/manage-notifications']")
    private WebElement manageNotificationsButton;

    //heading for checking the page

    @FindBy (xpath = "//div[2]/strong")
    private WebElement editCredsHeading;
    @FindBy (xpath = ".//*[@id='headingOne']/h4/a")
    private WebElement changeUsernameTabHeading;
    @FindBy (xpath = ".//*[@id='sms-expand-button']")
    private WebElement changeTextSmsTabHeading;
    @FindBy (xpath = ".//*[@id=\'password-expand-button\']")
    private WebElement changePasswordTabHeading;
    @FindBy (xpath = "//a[href='https://staging.onetouchhealth.com/home']")
    private WebElement dashBoardButtonHeading;


    public MainPage clikcEditContactInfo(){
        myAccountButton.click();
        editContactinfoButton.click();
        return new MainPage(driver);
    }
    public MainPage clickEditLoginCreds(){
        myAccountButton.click();
        editLoginCredsButton.click();
        return new MainPage(driver);
    }
    public MainPage clickManageDelegates(){
        myAccountButton.click();
        manageDelegatesButton.click();
        return new MainPage(driver);
    }
    public MainPage clickManageNotifications(){
        myAccountButton.click();
        editContactinfoButton.click();
        return new MainPage(driver);
    }
    public MainPage clickToCompleteButton(){
        toCompleteButton.click();
        return new MainPage(driver);
    }



    public String getEditCredsHeadingText ()     {return editCredsHeading.getText(); }
    public String getChangeUsernameTabHeading () {return changeUsernameTabHeading.getText();}
    public String getChangeTextSmsTabheading ()  {return changeTextSmsTabHeading.getText(); }
    public String getChangePasswordTabHeading () {return changePasswordTabHeading.getText();}
    public String getMainPageHeading ()          {return dashBoardButtonHeading.getText();}


}






