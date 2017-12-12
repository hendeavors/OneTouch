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
    @FindBy (xpath = ".//*[@id='dateSelect']")
    private WebElement dateRange;
    @FindBy (xpath = ".//*[@id='weight']")
    private WebElement weightField;
    @FindBy (xpath = ".//*[@id='height']")
    private WebElement heightDropDown;
    @FindBy (xpath = "//select[@id='height']/option[@value='72']")
    private WebElement heightOption;
    @FindBy (xpath = ".//*[@id='bloodPressure']")
    private WebElement bloodPressureField;
    @FindBy (xpath = ".//*[@id='amBloodGlucose']")
    private WebElement BloodGlucoseField;
    @FindBy (xpath = ".//*[@id='afterBloodGlucose']")
    private WebElement afterMealBloodGlucoseField;
    @FindBy (xpath = ".//*[@id='textJournal']")
    private WebElement commentsField;
    @FindBy (xpath = ".//*[@id='saveJournal']")
    private WebElement updateButton;
    @FindBy (xpath = "//div[@id='moreInfo']")
    private WebElement moreInfoButton;

    // Checking the notes for the fields

    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[3]/div[1]")
    private WebElement healthiBmiRange;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[3]/div[2]")
    private WebElement unhealthyBmiRange;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[4]/div[1]")
    private WebElement healthyBloodPressureRange;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[4]/div[2]")
    private WebElement unhealthyBloodPressureRange;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[5]/div[1]")
    private WebElement healthyBloodGlucose;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[5]/div[2]")
    private WebElement unhealthyBloodGlucose;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[6]/div[1]")
    private WebElement healthyMealBloodGlucose;
    @FindBy (xpath = ".//*[@id='journalEntry']/div[4]/div/div/div[6]/div[2]")
    private WebElement unhealthyMealBloodGlucose;
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

    public String getHealthyBMI () { return healthiBmiRange.getText(); }
    public String getUnhealthyBMI (){ return unhealthyBmiRange.getText();}
    public String getHealthyBloodPressure () {return healthyBloodPressureRange.getText();}
    public String getUnhealthyBloodPressure  (){return  unhealthyBloodPressureRange.getText();}
    public String getHealthyBloodGlucose () {return healthyBloodGlucose.getText();}
    public String getUnhealthyBloodGlucose (){return unhealthyBloodGlucose.getText();}
    public String getDailyJournalHeading () { return dailyJournalHeading.getText();}
    public String getMoreInfoheading () {return moreInfoHeading.getText();}
    public String getDisclaimer () {return disclaimer.getText();}
    public String getNoteFromTheDiary () {return commentsField.getText();}

    // checking labels
    public String getWeightLabel (){return weightLabel.getText();}
    public String getHeightLabel (){return heightLabel.getText();}
    public String getBMILabel (){return bmiLabel.getText();}
    public String getBloodPressureLabel (){return bloodPressureLabel.getText();}
    public String getBloodGlucoseLabel (){return bloodGlucoseLabel.getText();}
    public String getAMBloodGlucoseLabel () {return amBloodGlucoseLabel.getText();}

    // checking attribute

    public String getBMIDot (){
        return bmiGraphicsDot.getAttribute("cx");
        //return bmiGraphicsDot.getAttribute("cy");
    }




    public MyJournalPage typeDate (String journalDate){
        dateRange.sendKeys(journalDate);
        return this;
    }
    public MyJournalPage typeWeight(String weight) {
        weightField.sendKeys(weight);
        return this;
    }
    public MyJournalPage selectHeight() {
        heightDropDown.click();
        heightOption.click();
        return this;
    }
    public MyJournalPage typeBloodPressure(String bloodpressure) {
        bloodPressureField.sendKeys(bloodpressure);
        return this;
    }
    public MyJournalPage typeBloodGlucose(String bloodglucose) {
        BloodGlucoseField.sendKeys(bloodglucose);
        return this;
    }
    public MyJournalPage typeAMBloodGlucose(String amglucose) {
        afterMealBloodGlucoseField.sendKeys(amglucose);
        return this;
    }
    public MyJournalPage typeNoteToTheJournal(String note) {
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
    public MyJournalPage addANoteToMyJournal (String journalDate, String weight, String bloodpressure, String bloodglucose, String amglucose, String note) {
        this.typeDate(journalDate);
        this.typeWeight(weight);
        this.selectHeight();
        this.typeBloodPressure(bloodpressure);
        this.typeBloodGlucose(bloodglucose);
        this.typeAMBloodGlucose(amglucose);
        this.typeNoteToTheJournal(note);
        return new MyJournalPage(driver);
    }













}

