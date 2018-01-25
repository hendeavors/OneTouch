package MyAccountTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class ManageDelegatesTab {
    private WebDriver driver;
    public ManageDelegatesTab(Driver driver) {
    }

    //Buttons
    @FindBy(xpath = "//input[@value='Add Delegate']")
    private WebElement addDelegateButton;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    private WebElement archiveDelegateButton;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement restoreDeleagateButton;

    //Fields
    @FindBy(css = "#new-delegate-email")
    private WebElement newDelegatesEmailField;

    //Checking words
    @FindBy(xpath = "//div/div[2]/h3[1]")
    private WebElement addADelegateheader;
    @FindBy(xpath = "//div/div[2]/h3[2]")
    private WebElement changeDelegateStatusHeader;
    @FindBy(css = ".col-md-4.control-label")
    private WebElement delegateEmailFieldHeader;

}