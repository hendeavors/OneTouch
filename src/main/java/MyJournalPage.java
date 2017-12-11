import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.windows.WEmbeddedFrame;

import javax.swing.border.EmptyBorder;

public class MyJournalPage {
    private WebDriver driver;

    public MyJournalPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (xpath = ".//*[@id='weight']")
    private WebElement weightField;
    @FindBy (xpath = "//label[@class='journalLabels']/following-sibling::select[@id='height']")
    private WebElement heightDropDown;
    @FindBy (xpath = "//option[@value='67']/parent::select[@id='height']")
    private WebElement heightOption;
    @FindBy (xpath = ".//*[@id='bloodPressure']")
    private WebElement bloodPressureField;
    @FindBy (xpath = ".//*[@id='amBloodGlucose']")
    private WebElement aMBloodGlucoseField;
    @FindBy (xpath = ".//*[@id='afterBloodGlucose']")
    private WebElement afterMealBloodGlucoseField;
    @FindBy (xpath = ".//*[@id='textJournal']")
    private WebElement commentsField;
    @FindBy (xpath = ".//*[@id='saveJournal']")
    private WebElement updateButton;


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
        aMBloodGlucoseField.sendKeys(bloodglucose);
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
    public MyJournalPage clickUpdateButton() {
        updateButton.click();
        return this;
    }
    public MyJournalPage andANoteToMyJournal (String weight, String bloodpressure, String bloodglucose, String amglucose, String note) {
        this.typeWeight(weight);
        this.selectHeight();
        this.typeBloodPressure(bloodpressure);
        this.typeBloodGlucose(bloodglucose);
        this.typeAMBloodGlucose(amglucose);
        this.typeNoteToTheJournal(note);
        this.clickUpdateButton();
        return new MyJournalPage(driver);
    }

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
    private WebElement dailyJournalHeading

    public String getHealthyBMI () { return healthiBmiRange.getText(); }
    public String getUnhealthyBMI (){ return unhealthyBmiRange.getText();}
    public String getHealthyBloodPressure () {return healthyBloodPressureRange.getText();}
    public String getUnhealthyBloodPressure  (){return  unhealthyBloodPressureRange.getText();}
    public String getHealthyBloodGlucose () {return healthyBloodGlucose.getText();}
    public String getUnhealthyBloodGlucose (){return unhealthyBloodGlucose.getText();}
    public String getDailyJournalHeading () { return }












}

