import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class MyAccountTab {
    private WebDriver driver;
    public MyAccountTab (WebDriver driver) {
    }
}

public class EditContactInformationTab {
    private WebDriver driver;
    public EditContactInformationTab (Driver driver){
    }
    //Fields
    @FindBy(css = "#update-contact-phone")
    private WebElement homePhoneField;
    @FindBy(css = "#update-contact-business")
    private WebElement businessPhoneField;
    @FindBy(css = "#update-contact-email")
    private WebElement emailField;
    @FindBy(css = "#update-contact-mobile")
    private WebElement mobilePhoneField;
    @FindBy(css = "#update-contact-fax")
    private WebElement faxFieldl;
    @FindBy(css = "#update-contact-address")
    private WebElement addressField;
    @FindBy(css = "#update-contact-city")
    private WebElement cityField;
    @FindBy(css = "#update-contact-zip")
    private WebElement zipCodeField;

    //Button
    @FindBy(css = ".btn.btn-primary.pull-right")
    private WebElement saveButton;

    //Collapsing Headings
    @FindBy(xpath = ".//*[@id='headingOne']/h4/a")
    private WebElement primaryHeadingtab;
    @FindBy(xpath = ".//*[@id='headingTwo']/h4/a")
    private WebElement secondaryHeadingTab;

}

public class EditLogInInformationTab {

}

public class ManageDelegatesTab {

}

public class ManageNotifications {

}

public class ManageSubscriptions{

}

public class YourInbox {

}

