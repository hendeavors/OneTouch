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
    @FindBy(xpath = "//a[@href='#journal-tab']" )
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

    @FindBy (xpath = ".//*[@id='app-layout']/div[4]/div/div/div/div[1]")
    private WebElement dashBoardButtonHeading;
    @FindBy (xpath = ".//*[@id='patient-header']/div[1]/div[1]/span")
    private WebElement patientsName;
    @FindBy (xpath = ".//*[@id='patient-header']/div[2]/div[3]/span[2]")
    private WebElement practiceName;
    @FindBy (xpath = ".//*[@id='welcome-tab']/h3")
    private WebElement welcomeFrontpage;




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
    public MainPage clickMyJouranltab (){
        myJournalTab.click();
        return new MainPage(driver);
    }



    public String getPatientsName ()     {return
            patientsName.getText(); }
    public String getPracticename () {return
            practiceName.getText();}
    public String getWelcomFrontpage ()  {return
            welcomeFrontpage.getText(); }
    public String getMainPageHeading ()          {return
            dashBoardButtonHeading.getText();}

}






