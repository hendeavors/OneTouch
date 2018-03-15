
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyJournalPage {
    public WebDriver driver;
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
   @FindBy (xpath = ".//*[@id='height']/option[@value='67']")
   private WebElement heightOption;

   // buttons
   @FindBy (xpath = ".//*[@id='saveJournal']")
   private WebElement saveButton;
    @FindBy (xpath = ".//*[@id='updateJournal']")
    private WebElement updateButton;


   @FindBy (xpath = ".//*[@id='moreInfo']")
   private WebElement moreInfoButton;

   @FindBy (xpath = ".//*[@id='textJournal']")
   private WebElement dailyJournalField;

   @FindBy (xpath = ".//*[@id='dateSelectDiv']/span/span/span")
   private WebElement chooseDateButton;

   @FindBy (xpath = "//a[@data-value='2018/2/15']")
   private WebElement setTheDate;

   @FindBy (xpath = ".//*[@id='bmi']")
   private WebElement bmiField;


   // text elements

    //More info button
    @FindBy (xpath = ".//*[@id='moreInfoDialogBox']")
    private WebElement moreInfoContainer;
    @FindBy (xpath = ".//*[@id='moreInfoDialogBox_wnd_title']")
    private WebElement moreInfoHeading;

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

    // MessageContainers
    @FindBy (xpath = ".//*[@id='main-app-panel-container']/div/div[2]/div[1]/div")
    private WebElement successContainer;
    @FindBy (xpath = ".//*[@id='journalErrors']/ul/li")
    private List<WebElement> listOfFormatErrors;
    @FindBy (xpath = ".//*[@id='journalErrors']")
    private WebElement alertContainer;


    //methods
   public String disclaimerText () {return disclamer.getText();}
   public boolean disclaimerIsVisible () {return disclamer.isDisplayed();}

   public MyJournalPage typeBloodPressure (String pressure) {
       bloodPressField.clear();
       bloodPressField.sendKeys(pressure);
       return this;
   }
   public MyJournalPage clearBloodPressure() {
       bloodPressField.clear();
       return this;
   }

   public MyJournalPage typeWeight (String weight) {
       weightField.clear();
       weightField.sendKeys(weight);
       return this;
   }
    public MyJournalPage clearWeight() {
        weightField.clear();
        return this;
   }

   public MyJournalPage typeGlucose (String glucose) {
       glucoseField.clear();
       glucoseField.sendKeys(glucose);
       return this;
   }
    public MyJournalPage clearGlucose() {
        glucoseField.clear();
        return this;
   }

   public MyJournalPage typeAMGlucose (String amglucose) {
       amGlucoseField.clear();
       amGlucoseField.sendKeys(amglucose);
       return this;
   }
    public MyJournalPage clearAMGlucose() {
        amGlucoseField.clear();
        return this;
   }


   public MyJournalPage choose57Height () {
      heightOption.click();
      return this;
   }
   public MyJournalPage hitSubmit () {
      if (updateButton.isDisplayed()){
          updateButton.click();
      }
      else {saveButton.click();}
      return this;
   }

    public boolean alertContainerIsVisible () {return alertContainer.isDisplayed();}
    public boolean alertMessagesAreFive () {return listOfFormatErrors.size()==5;}

    public boolean successContainerIsVisible () {return successContainer.isDisplayed();}
    public String successContainerText () {return successContainer.getText();}


    public String weightFormatErrorText () {return listOfFormatErrors.get(0).getText();}
    public String glucoseFormatErrorText () {return listOfFormatErrors.get(1).getText();}
    public String amGlucoseFormatErrorText () {return listOfFormatErrors.get(2).getText();}
    public String bloodPressureFormatErrorText () {return listOfFormatErrors.get(3).getText();}
    public String bloodPressureFormatErrorText2 () {return listOfFormatErrors.get(4).getText();}


    public boolean redBMIIsVisible () {return unhealthyBMIText.isDisplayed();}
    public boolean greenBMIIsVisible () {return healthyBMIText.isDisplayed();}

    public boolean redBloodPressureIsVisible () {return unhealthyBloodP.isDisplayed();}
    public boolean greenBloodPressureIsVisible () {return healthyBloodP.isDisplayed();}

    public boolean redGlucoseVisible () {return unhealthyGlucose.isDisplayed();}
    public boolean greenGlucoseVisible () {return healthyGlucose.isDisplayed();}

    public boolean redAMGlucoseIsVisible () {return unhealthyAMGlucose.isDisplayed();}
    public boolean greenAMGlucoseVisible () {return healthyAMGlucose.isDisplayed();}

    public MyJournalPage clickMoreInfoButton () {
       moreInfoButton.click();
       return this;
    }

    public boolean moreInfoContainerIsVisible () {return moreInfoContainer.isDisplayed();}

    @FindBy(xpath = ".//*[@id='moreInfoDialogBox']/ul/li")
    private List<WebElement> healthyResultsBullets;

    public boolean sixLinesOfGuide () {return healthyResultsBullets.size()== 6;}

    public MyJournalPage typeNoteInMyJournal (String message) {
        dailyJournalField.clear();
        dailyJournalField.sendKeys(message);
        return this;
    }
    public MyJournalPage clearMyJournalNote () {
        dailyJournalField.clear();

        return this;
    }

    public MyJournalPage clickCalendar () {
        chooseDateButton.click();
        return this;
    }
    public MyJournalPage setTheDate () {
        setTheDate.click();
        return this;
    }

    //public boolean checkTheValues () {return weightField.getAttribute("value" = "200");}

    public MyJournalPage clearAllTheFields (){
        this.clearWeight();
        this.clearBloodPressure();
        this.clearGlucose();
        this.clearAMGlucose();
        this.clearMyJournalNote();
        return new MyJournalPage(driver);
    }

}
