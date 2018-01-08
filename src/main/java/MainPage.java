import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver driver;
    public MainPage (WebDriver driver) {
    }
    //text labels to check
    @FindBy (xpath = ".//*[@id='patient-header']/div[2]/div[1]/span[1]")
    private WebElement hicnoLabel;
    @FindBy (xpath = ".//*[@id='patient-header']/div[2]/div[2]/span[1]")
    private WebElement providerLabel;
    @FindBy (xpath = ".//*[@id='patient-header']/div[2]/div[3]/span[1]")
    private WebElement practiceLabel;
    @FindBy (xpath = "//div[@class='container']/div[@class='row']/div[1]")
    private WebElement llcBottomLabel;
    @FindBy (xpath = "//a[@title='privacy policy']")
    private WebElement privacyPolicyBottomLabel;
    @FindBy (xpath = "//a[@title='terms and conditions']")
    private WebElement termsBottomLabel;

    // Clickable tabs
    @FindBy (xpath = "//a[text()='Welcome!']")
    private WebElement welcomeTab;
    @FindBy (xpath = "//a[text()='Things to Complete']")
    private WebElement thingsToCompleteTab;
    @FindBy (xpath = "//a[text()='My Journal']")
    private WebElement myJournalTab;
    @FindBy (xpath = "//a[text()='Smart Record']")
    private WebElement smartRecordTab;
    @FindBy (xpath = "//a[text()='My Providers']")
    private WebElement myProvidersTab;

    // secondary clickable tabs
    @FindBy (xpath = "//a[@class='dropdown-toggle']")
    private WebElement myAccountDropDown;
    @FindBy (xpath = "//*[text()[contains(.,'Edit Contact Information')]]")
    private WebElement editContactInformationTab;
    @FindBy (xpath = "//*[text()[contains(.,'Edit Log In Credentials')]]")
    private WebElement editLoginCredsTab;
    @FindBy (xpath = "//*[text()[contains(.,'Manage Delegates')]]")
    private WebElement manageNotificationsTab;
    @FindBy (xpath = "//*[text()[contains(.,'Logout')]]")
    private WebElement logOutTab;
    @FindBy (xpath = "//div[@class='todo-nav-item']/a[@href='/home#todo-tab']")
    private WebElement toCompleteButton;


    public String getProviderText () {return providerLabel.getText();}
    public String getPracticeText () {return practiceLabel.getText();}
    public String getTheHICNOText () {return hicnoLabel.getText();}


    public MainPage clickWelcomeTab(){
        welcomeTab.click();
        return this;
    }
    public MainPage clickThingsToComplete(){
        thingsToCompleteTab.click();
        return this;
    }
    public MainPage clickMyJournalTab(){
        myJournalTab.click();
        return this;
    }
    public MainPage clickSmartRecordTab(){
        smartRecordTab.click();
        return this;
    }
    public MainPage clickMyProviderstab(){
        myProvidersTab.click();
        return this;
    }


    // My Account tabs clicking

    public MainPage goToEditContactInformation(){
        myAccountDropDown.click();
        editContactInformationTab.click();
        return this;
    }
    public MainPage goToEditLoginInformation(){
        myAccountDropDown.click();
        editLoginCredsTab.click();
        return this;
    }
    public MainPage goToManageNotificationsTab(){
        myAccountDropDown.click();
        manageNotificationsTab.click();
        return this;
    }
    public MainPage goToLogOutTab(){
        myAccountDropDown.click();
        logOutTab.click();
        return this;
    }



}
