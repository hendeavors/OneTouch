package MyAccountTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class YourInbox {
    private WebDriver driver;
    public YourInbox(Driver driver) {
    }

    //Folders and Buttons
    @FindBy(xpath = "//a[@title='Compose']")
    private WebElement composeButton;
    @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox']")
    private WebElement inboxFolderButton;
    @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Drafts']")
    private WebElement draftsFolderButton;
    @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Spam']")
    private WebElement spamFolderButton;
    @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Sent']")
    private WebElement sentFolderButton;
    @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Templates']")
    private WebElement templatesFolderButton;
    @FindBy(xpath = "//a[@href='https://onetouchhealth.com/mail/Inbox.Trash']")
    private WebElement trashFolderButton;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement inboxCheckboxes;
    @FindBy(xpath = "//input[@class='mail-checkbox mail-group-checkbox']")
    private WebElement ckeckAllCheckboxes;
    @FindBy(xpath = "html/body/div[1]/aside[2]/div[2]/div/div[3]/a")
    private WebElement optionsDropDown;
    @FindBy(xpath = "html/body/div[1]/aside[2]/div[2]/div/div[4]/a")
    private WebElement movetoDropDown;


    //DropDown Options
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/mark-read/Inbox']")
    private WebElement markAsReadOption;
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/delete-all/Inbox']")
    private WebElement deleteOption;
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Inbox/move']")
    private WebElement moveToInboxOption;
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Drafts/move']")
    private WebElement moveToDraftsOption;
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Spam/move']")
    private WebElement moveToSpamOption;
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Sent/move']")
    private WebElement moveToSentOption;
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Templates/move']")
    private WebElement moveToTemplatesOption;
    @FindBy(xpath = "//a[@data-href='https://onetouchhealth.com/mail/messages/Inbox/Trash/move']")
    private WebElement moveToTrashOption;

    //messages
    @FindBy(css = ".view-message.dont-show.text-nowrap")
    private WebElement messageContainer;
    @FindBy(xpath = ".//*[@id='replyboxcontent']/div/span[1]")
    private WebElement replyLink;
    @FindBy(xpath = ".//*[@id='replyboxcontent']/div/span[3]")
    private WebElement forwardLink;
    @FindBy(xpath = "//a[@class='btn btn-default reply-to']")
    private WebElement replyButton;

}

