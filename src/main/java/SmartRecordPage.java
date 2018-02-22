import javafx.scene.web.WebHistory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SmartRecordPage {

    public WebDriver driver;
    public SmartRecordPage(WebDriver driver)   {
        this.driver = driver;
    }

     //elements
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[1]/a")
    private WebElement moreInfoButton1;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[2]/a")
    private WebElement moreInfoButton2;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[3]/a")
    private WebElement moreInfoButton3;
    @FindBy(xpath = ".//*[@id='smart-record-content']/div[1]/div/button")
    private WebElement refreshButton;
    @FindBy(xpath = ".//*[@id='chart-year-select']")
    private WebElement yearDropDown;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2017']")
    private WebElement option2017;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2016']")
    private WebElement option2016;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2015']")
    private WebElement option2015;
    @FindBy(xpath = ".//*[@id='chart-year-select']/option[@value='2014']")
    private WebElement option2014;
    @FindAll(@FindBy(xpath = "//div[@class='panel-heading ng-binding collapsed']"))
    private List<WebElement> allYouHaveCCDsTabElements;
    @FindBy(xpath = ".//*[@id='smart-record-content']/div[1]/div/div[2]/div[1]")
    private WebElement secondTab;
    @FindBy(xpath = ".//*[@id='1']/div[7]/div/a")
    private WebElement secondTabXML;
    @FindBy(xpath = ".//*[@id='collapseall']/span")
    private WebElement collapseButton;
    @FindBy(xpath = "html/body/div[1]/div/table/tbody/tr[3]/td/span")
    private WebElement patientDetailButton;
    @FindBy(xpath = ".//*[@id='tochead']")
    private WebElement tableOfContentstab;
    @FindBy(xpath = "//p[text()='You can arrange the document to your preferences." +
            " Move sections by dragging them. Hide by closing. Use the TOC to review.']")
    private WebElement ccdDisclaimer;


    //Checkboxes in the table of Contents
    @FindBy(xpath = ".//*[@id='toc']/li[1]/span[1]/i")
    private WebElement section1;
    @FindBy(xpath = ".//*[@id='toc']/li[2]/span[1]/i")
    private WebElement section2;
    @FindBy(xpath = ".//*[@id='toc']/li[3]/span[1]/i")
    private WebElement section3;
    @FindBy(xpath = ".//*[@id='toc']/li[4]/span[1]/i")
    private WebElement section4;
    @FindBy(xpath = ".//*[@id='toc']/li[5]/span[1]/i")
    private WebElement section5;
    @FindBy(xpath = ".//*[@id='toc']/li[6]/span[1]/i")
    private WebElement section6;
    @FindBy(xpath = ".//*[@id='toc']/li[7]/span[1]/i")
    private WebElement section7;
    @FindBy(xpath = ".//*[@id='toc']/li[8]/span[1]/i")
    private WebElement section8;
    @FindBy(xpath = ".//*[@id='toc']/li[9]/span[1]/i")
    private WebElement section9;
    @FindBy(xpath = ".//*[@id='toc']/li[10]/span[1]/i")
    private WebElement section10;
    @FindBy(xpath = ".//*[@id='toc']/li[11]/span[1]/i")
    private WebElement section11;
    @FindBy(xpath = ".//*[@id='toc']/li[12]/span[1]/i")
    private WebElement section12;
    @FindBy(xpath = ".//*[@id='toc']/li[13]/span[1]/i")
    private WebElement section13;


    // texts
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[1]")
    private WebElement directMessagingString;
    @FindBy(xpath = ".//*[@id='smart-record-content']/h3[2]")
    private WebElement yourClinicalRecordString;

    //texts for more info buttons
    @FindBy(css = ".popover-content")
    private WebElement moreInfo1Text;
    @FindBy(css = ".popover-content")
    private WebElement moreInfo2Text;
    @FindBy(css = ".popover-content")
    private WebElement moreInfo3Text;

    //year text for Parts A/B/D date
    @FindBy (xpath = ".//*[@id='PartA']/div/h2/small")
    private WebElement partAYear;
    @FindBy(xpath = ".//*[@id='PartB']/div/h2/small")
    private WebElement partBYear;
    @FindBy(xpath = ".//*[@id='PartD']/div/h2/small")
    private WebElement partDYear;



    public SmartRecordPage clickMoreInfoI (){
        moreInfoButton1.click();
        return this;
    }
    public String moreInfoButton1Text () {return moreInfo1Text.getText();}

    public SmartRecordPage clickMoreInfoII(){
        moreInfoButton2.click();
        return this;
    }
    public String moreInfoButton2Text () {return moreInfo2Text.getText();}

    public SmartRecordPage clickMoreInfoIII(){
        moreInfoButton3.click();
        return this;
    }
    public String moreInfoButton3Text () {return moreInfo3Text.getText();}

    public String partAYearText (){return partAYear.getText();}
    public String partBYearText (){return partBYear.getText();}
    public String partDYearText (){return partDYear.getText();}

    public SmartRecordPage choose2014(){
        yearDropDown.click();
        option2014.click();
        return this;
    }
    public SmartRecordPage choose2015(){
        yearDropDown.click();
        option2015.click();
        return this;
    }
    public SmartRecordPage choose2016(){
        yearDropDown.click();
        option2016.click();
        return this;
    }
    public SmartRecordPage choose2017(){
        yearDropDown.click();
        option2017.click();
        return this;
    }
    public boolean refreshButtonIsDisplayed(){
        refreshButton.isDisplayed();
        return true;
    }
    public List<WebElement> getTabs (){
        return allYouHaveCCDsTabElements;
    }
    public String getTabsByNumber (int number) {
        return getTabs().get(number - 1).getText();
    }


}