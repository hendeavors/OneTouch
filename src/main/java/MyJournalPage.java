import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyJournalPage {
    private WebDriver driver;
    public MyJournalPage(WebDriver driver) {
   }
   // main elements
   @FindBy(xpath = ".//*[@id='weight']")
   private WebElement weightField;
   @FindBy(xpath = ".//*[@id='bloodPressure']")
   private WebElement bloodPressField;
   @FindBy (xpath = ".//*[@id='amBloodGlucose']")
   private WebElement glucoseField;
   @FindBy (xpath = ".//*[@id='afterBloodGlucose']")
   private WebElement amGlucoseField;
   @FindBy (xpath = ".//*[@id='height']")
   private WebElement heightDropDown;
   @FindBy (xpath = ".//*[@id='height']/option[@value='67']")
   private WebElement heightOption;
   @FindBy (xpath = ".//*[@id='saveJournal']")
   private WebElement saveButton;
   @FindBy (xpath = ".//*[@id='moreInfo']")
   private WebElement moreInfoButton;
   @FindBy (xpath = ".//*[@id='textJournal']")
   private WebElement dailyJournalField;
   @FindBy (xpath = ".//*[@id='dateSelect']")
   private WebElement dateField;
   @FindBy (xpath = ".//*[@id='updateJournal']")
   private WebElement updateButton;
   @FindBy (xpath = ".//*[@id='bmi']")
   private WebElement bmiField;


   // text elements

   //Disclaimer
    @FindBy (xpath = ".//*[@id='journalEntry']/div[2]/p")
    private WebElement disclamer;

   //BMI
    @FindBy (xpath = "//div[@class='bmiUnhealthy unhealthy']")
    private WebElement unhealthyBMIText;
    @FindBy (xpath = "//div[@class='bmiHealthy healthy']")
    private  WebElement healthyBMIText;

   //BP
    @FindBy (xpath = "//div[@class='bpHealthy healthy']")
    private WebElement healthyBloodP;
    @FindBy (xpath = "//div[@class='bpUnhealthy unhealthy']")
    private WebElement unhealthyBloodP;

   //Glocose
     @FindBy (xpath = "//div[@class='bgUnhealthy unhealthy']")
     private WebElement unhealthyGlucose;
     @FindBy (xpath = "//div[@class='bgHealthy healthy']")
     private WebElement healthyGlucose;

    //AMGlucose
    @FindBy (xpath = "//div[@class='afterbgHealthy healthy']")
    private WebElement healthyAMGlucose;
    @FindBy (xpath = "//div[@class='afterbgUnhealthy unhealthy']")
    private WebElement unhealthyAMGlucose;

    public MyJournalPage clickSave (){
        saveButton.click();
        return this;
    }
    public MyJournalPage clickUpdate (){
        updateButton.click();
        return this;
    }
    public MyJournalPage clickMoreInfo(){
        moreInfoButton.click();
        return this;
    }
    public MyJournalPage setWeight(String weight){
        weightField.clear();
        weightField.sendKeys(weight);
        return this;
    }
    public MyJournalPage setHeight (){
        heightDropDown.click();
        heightOption.click(); // height is always 5'7"
        return this;
    }
    public MyJournalPage setBloodP (String pressure){
        bloodPressField.clear();
        bloodPressField.sendKeys(pressure);
        return this;
    }
    public MyJournalPage setGlucose (String glucose){
        glucoseField.clear();
        glucoseField.sendKeys(glucose);
        return this;
    }
    public MyJournalPage setAMGlucose (String amglucose){
        amGlucoseField.clear();
        amGlucoseField.sendKeys(amglucose);
        return this;
    }
    public MyJournalPage writeANote (String note){
        dailyJournalField.clear();
        dailyJournalField.sendKeys(note);
        return this;
    }
    public MyJournalPage setTheDate (String date){
        dateField.clear();
        dateField.sendKeys(date);
        return this;
    }

    public MyJournalPage addAnEvent(String weight, String pressure, String glucose, String amglucose, String note, String date){
        this.setWeight(weight);
        this.setHeight();
        this.setBloodP(pressure);
        this.setGlucose(glucose);
        this.setAMGlucose(amglucose);
        this.writeANote(note);
        this.setTheDate(date);
        this.clickSave();
        return new MyJournalPage(driver);
    }

    public MyJournalPage modifyAnEvent (String weight, String pressure, String glucose, String amglucose, String note, String date){
        this.setWeight(weight);
        this.setHeight();
        this.setBloodP(pressure);
        this.setGlucose(glucose);
        this.setAMGlucose(amglucose);
        this.writeANote(note);
        this.setTheDate(date);
        this.clickSave();
        return new MyJournalPage(driver);
    }



    public String disclaimerText () {return disclamer.getText();}

    public String bmiMeaning () {return bmiField.getText();}
    public String bmiUnhealthyMeaning () {return unhealthyBMIText.getText();}
    public String bmiHealthyMeaning () {return healthyBloodP.getText();}

    public String bpUnhealthyMeaning () {return unhealthyBloodP.getText();}
    public String bpHealthyMeaning () {return healthyBloodP.getText();}

    public String glucUnhealthymeaning () {return unhealthyGlucose.getText();}
    public String glucHealthymeaning () {return healthyGlucose.getText();}

    public String glucAMUnhealthymeaning () {return unhealthyAMGlucose.getText();}
    public String glucAMHealthymeaning () {return healthyAMGlucose.getText();}
}
