import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.windows.WEmbeddedFrame;

import javax.management.monitor.StringMonitor;
import javax.swing.border.EmptyBorder;

public class MyJournalPage {
    private WebDriver driver;

    public MyJournalPage(WebDriver driver) {

        this.driver = driver;
    }

    // Main fields and buttons
    @FindBy (xpath = ".//*[@id='dateSelectDiv']/span/span/span")
    private WebElement dateRangeDropDown;
    @FindBy (xpath = "//a[@title='Monday, December 04, 2017']")
    private WebElement chooseMondayThe4th;
    @FindBy (xpath = "//input[@id='weight']")
    private WebElement weightField;
    @FindBy (xpath = ".//*[@id='height']")
    private WebElement heightDropDown;
    @FindBy (xpath = "//select[@id='height']/option[@value='72']")
    private WebElement heightOption;
    @FindBy (xpath = ".//*[@id='bloodPressure']")
    private WebElement bloodPressureField;
    @FindBy (xpath = ".//*[@id='amBloodGlucose']")
    private WebElement bloodGlucoseField;
    @FindBy (xpath = ".//*[@id='afterBloodGlucose']")
    private WebElement afterMealBloodGlucoseField;
    @FindBy (xpath = ".//*[@id='textJournal']")
    private WebElement commentsField;
    @FindBy (xpath = ".//*[@id='updateJournal']")
    private WebElement updateButton;
    @FindBy (xpath = "//div[@id='moreInfo']")
    private WebElement moreInfoButton;

    // Checking the notes for the fields

    @FindBy (xpath = ".//*[@id='journalEntry']/div[1]/div[2]/div[2]/div/label")
    private WebElement dailyJournalHeading;
    @FindBy (xpath = ".//*[@id='moreInfoDialogBox_wnd_title']")
    private WebElement moreInfoHeading;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[2]/p")
    private WebElement disclaimer;

    //checking Labels

    @FindBy (xpath = ".//*[@id='journalEntry']/div[3]/div/div/div[1]/label")
    private WebElement weightLabel;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[3]/div/div/div[2]/label")
    private WebElement heightLabel;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[3]/div/div/div[3]/label")
    private WebElement bmiLabel;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[3]/div/div/div[4]/label")
    private WebElement bloodPressureLabel;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[3]/div/div/div[5]/label")
    private WebElement bloodGlucoseLabel;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[3]/div/div/div[6]/label")
    private WebElement amBloodGlucoseLabel;


    //Graphics dots for testing (350lb,48BMI,140/90,80 and 100 Blood Glucose)
    @FindBy (xpath = ".//*[@id=\'displayWeightandBMI\']/svg/g/g[1]/g[4]/g/circle[13]")
    private WebElement weightGraphicsDot;
    @FindBy (xpath = ".//*[@id=\'displayWeightandBMI\']/svg/g/g[1]/g[4]/g/circle[11]")
    private WebElement bmiGraphicsDot;
    @FindBy (xpath = ".//*[@id='displayBPandBG']/svg/g/g[1]/g[4]/g/circle[18]")
    private WebElement systolicBloodPressure;
    @FindBy (xpath = ".//*[@id='displayBPandBG']/svg/g/g[1]/g[4]/g/circle[26]")
    private WebElement diastolicBloodPressure;
    @FindBy (xpath = ".//*[@id='displayBPandBG']/svg/g/g[1]/g[4]/g/circle[30]")
    private WebElement bloodGlucose;
    @FindBy (xpath = ".//*[@id='displayBPandBG']/svg/g/g[1]/g[4]/g/circle[22]")
    private WebElement amBloodGlucose;

     //checking words
    public String getDailyJournalHeading () { return dailyJournalHeading.getText();}
    public String getMoreInfoheading () {return moreInfoHeading.getText();}
    public String getDisclaimer () {return disclaimer.getText();}
    public String getNoteFromTheDiary () {return commentsField.getText();}
    public String getWeightLabel (){return weightLabel.getText();}
    public String getHeightLabel (){return heightLabel.getText();}
    public String getBMILabel (){return bmiLabel.getText();}
    public String getBloodPressureLabel (){return bloodPressureLabel.getText();}
    public String getBloodGlucoseLabel (){return bloodGlucoseLabel.getText();}
    public String getAMBloodGlucoseLabel () {return amBloodGlucoseLabel.getText();}

    // checking attribute

    public MyJournalPage typeThe4thOfDecember (){
        dateRangeDropDown.click();
        chooseMondayThe4th.click();
        return this;
    }
    public MyJournalPage typeWeight(String weight) {
        weightField.clear();
        weightField.sendKeys(weight);
        return this;
    }
    public MyJournalPage selectHeight() {
        heightDropDown.click();
        heightOption.click();
        return this;
    }
    public MyJournalPage typeBloodPressure(String bloodpressure) {
        bloodPressureField.clear();
        bloodPressureField.sendKeys(bloodpressure);
        return this;
    }
    public MyJournalPage typeBloodGlucose(String bloodglucose) {
        bloodGlucoseField.clear();
        bloodGlucoseField.sendKeys(bloodglucose);
        return this;
    }
    public MyJournalPage typeAMBloodGlucose(String amglucose) {
        afterMealBloodGlucoseField.clear();
        afterMealBloodGlucoseField.sendKeys(amglucose);
        return this;
    }
    public MyJournalPage typeNoteToTheJournal(String note) {
        commentsField.clear();
        commentsField.sendKeys(note);
        return this;
    }
    public MyJournalPage clickSaveButton() {
        updateButton.click();
        return this;
    }
    public MyJournalPage clickMoreInfoButton (){
        moreInfoButton.click();
        return this;
    }
    public MyJournalPage addDateToTheJouranl(){
        this.typeThe4thOfDecember();
        return new MyJournalPage(driver);
    }
    public MyJournalPage addANoteToMyJournal (String weight, String bloodpressure, String bloodglucose, String amglucose, String note) {
        this.typeWeight(weight);
        this.selectHeight();
        this.typeBloodPressure(bloodpressure);
        this.typeBloodGlucose(bloodglucose);
        this.typeAMBloodGlucose(amglucose);
        this.typeNoteToTheJournal(note);
        this.clickSaveButton();
        return new MyJournalPage(driver);
    }













}

