import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class MainPage {
    public WebDriver driver;
    public MainPage (WebDriver driver)    {
        this.driver = driver;
    }
    // Footers
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
    @FindBy (xpath = "//a[@href='#patient-profile']")
    private WebElement smartRecordTab;
    @FindBy (xpath = "//a[text()='My Providers']")
    private WebElement myProvidersTab;
    @FindBy(css = "#secure-doc>a")
    private WebElement secureDocumentsTab;

    // secondary clickable tabs
    @FindBy (xpath = ".//*[@id='app-navbar-collapse']/ul[2]/li[2]/a")
    private WebElement myAccountDropDown;
    @FindBy (xpath = ".//*[@id='app-navbar-collapse']/ul[2]/li[2]/ul/li[5]/a")
    private List<WebElement> yourInboxButtonList;
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

    // videos
    @FindBy (xpath = ".//*[@id='welcome-tab']/div/section[1]")
    private WebElement enrollmentVideo;
    @FindBy (xpath = ".//*[@id='welcome-tab']/div/section[1]")
    private WebElement thingsToCompleteVideo;
    @FindBy (xpath = ".//*[@id='welcome-tab']/div/section[1]")
    private WebElement myJournalVideo;
    @FindBy (xpath = ".//*[@id='welcome-tab']/div/section[1]")
    private WebElement smartRecordVideo;
    @FindBy (xpath = ".//*[@id='welcome-tab']/div/section[1]")
    private WebElement secureDocumentsVideo;
    @FindBy (xpath = ".//*[@id='welcome-tab']/div/section[1]")
    private WebElement accauntSettingsVideo;

    // header labels
    @FindBy (xpath = "//span[@class='patient-name']")
    private WebElement nameLabel;
    @FindBy (xpath = "//span[text()='Phone']")
    private WebElement phoneLabel;
    @FindBy (xpath = "//span[text()='DOB']")
    private WebElement DOBlabel;
    @FindBy (xpath = "//span[text()='Primary Insurance Number']")
    private WebElement insurnaceNumLabel;
    @FindBy (xpath = "//span[text()='Provider']")
    private WebElement providerLabel;
    @FindBy (xpath = "//span[text()='Enrolling Practice']")
    private WebElement enrollingPracticeLabel;

    public boolean label1IsDisolayed () { return nameLabel.isDisplayed();}
    public boolean label2IsDisolayed () { return phoneLabel.isDisplayed();}
    public boolean label3IsDisolayed () { return DOBlabel.isDisplayed();}
    public boolean label4IsDisolayed () { return insurnaceNumLabel.isDisplayed();}
    public boolean label5IsDisolayed () { return providerLabel.isDisplayed();}
    public boolean label6IsDisolayed () { return enrollingPracticeLabel.isDisplayed();}


    public boolean video1IsDisplayed () { return enrollmentVideo.isDisplayed();}
    public boolean video2IsDisplayed () { return thingsToCompleteVideo.isDisplayed();}
    public boolean video3IsDisplayed () { return myJournalVideo.isDisplayed();}
    public boolean video4IsDisplayed () { return smartRecordVideo.isDisplayed();}
    public boolean video5IsDisplayed () { return secureDocumentsVideo.isDisplayed();}
    public boolean video6IsDisplayed () { return accauntSettingsVideo.isDisplayed();}


    public boolean yourInboxIsDisplayed ( ){ return yourInboxButtonList.size()>0;}
    public boolean welcomeTabIsDisplayed () {return welcomeTab.isDisplayed();}
    public boolean thingsToCompleteTabIsDisplayed () {return thingsToCompleteTab.isDisplayed();}
    public boolean myJournalTabIsDisplayed () {return myJournalTab.isDisplayed();}
    public boolean smartRecordTabIsDisplayed () {return smartRecordTab.isDisplayed();}
    public boolean secureDocumentsTabIsDisplayed () {return secureDocumentsTab.isDisplayed();}


    public String getLlcBottomLabel (){ return llcBottomLabel.getText();}
    public String getPrivacyPolicyBottomLabel(){ return privacyPolicyBottomLabel.getText();}
    public String getTermsConditionsLabel(){ return termsBottomLabel.getText();}



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
    public MainPage clickMyProvidertab(){
        myProvidersTab.click();
        return this;
    }
    public MainPage clickSecureDocuments(){
        secureDocumentsTab.click();
        return this;
    }

}
