import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
    private WebDriver driver;

    private LoginPage loginPage;
    private FullEnrollPage fullEnrollPage;
    private QuickEnrollPage quickEnrollPage;
    private ChooseEnrollmentPage chooseEnrollmentPage;
    private MyJournalPage myJournalPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eugenes\\IdeaProjects\\WebDrivers\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://staging.onetouchhealth.com/");
        loginPage = new LoginPage(driver);
        fullEnrollPage = new FullEnrollPage(driver);
        quickEnrollPage = new QuickEnrollPage(driver);
        chooseEnrollmentPage = new ChooseEnrollmentPage(driver);
        myJournalPage = new MyJournalPage(driver);
        mainPage = new MainPage(driver);

    }

    @Test
    public void checkAuthorizatiobAbility() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
        loginPage.loggingIn("bryanp123","HEPass$3456");
        String headingText = mainPage.getMainPageHeading();
        Assert.assertEquals("dashboard",headingText);

        //NewAccountPage newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
        //newAccountPage.typeIdentificationInfo("", "", "", "", "");
        //String heading = newAccountPage.getHeadingText();
        //Assert.assertEquals("indicates required field", heading);
    }


    @Test
    public void goThroughQuickEnroll() {
        //активировали PageFactory
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ChooseEnrollmentPage chooseEnrollmentPage = PageFactory.initElements(driver,ChooseEnrollmentPage.class);
        QuickEnrollPage quickEnrollPage = PageFactory.initElements(driver,QuickEnrollPage.class);
        MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
        //Прогнали процедуры
        loginPage.createNewAccount();
        chooseEnrollmentPage.chooseQuickEnroll();
        quickEnrollPage.completeQuickEnrollAndSubmit(
                "Nate",
                "Diaz",
                "14/11/1988",
                "11111111111111111111",
                "4808650777",
                "UFC200",
                "Ultimate22##",
                "Ultimate22##");
        String headingText = mainPage.getMainPageHeading();
        Assert.assertEquals("dashboard",headingText);
    }

    @Test
    public void gothroughFullEnroll() {
        //активировали PageFactory
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ChooseEnrollmentPage chooseEnrollmentPage = PageFactory.initElements(driver,ChooseEnrollmentPage.class);
        FullEnrollPage fullEnrollPage = PageFactory.initElements(driver,FullEnrollPage.class);
        MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
        //Прогнали процедуры
        //WebDriverWait wait = (new WebDriverWait(driver, 2));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Quick enrollment']")));
        loginPage.createNewAccount();
        chooseEnrollmentPage.chooseFullEnroll();
        fullEnrollPage.typeInsuranceNum("11111111111111111111");
        fullEnrollPage.typeSecondInsurance("2222222222222222");
        fullEnrollPage.typeTeriaryInsuranceAndAlltheRest("33333333333333","99999999","Conor","McGregor","11/02/1989");
        fullEnrollPage.typeAddressInformation("12345","1234","Dublin","90210");
        fullEnrollPage.enroll("Theking","4808658888","4801111111","mcgregor@conor.com");
        fullEnrollPage.finishEnrolling("4111111111111111", "234","02","2022","Theking","Unbeaten22##","Unbeaten22##");
        String noSSn = fullEnrollPage.getNoSSNErrText();
        String cityIsRequired = fullEnrollPage.getCityRequiredErr();
        String phoneNumErr = fullEnrollPage.getInvalidPhoneNumErrText();
        String cellNumErr = fullEnrollPage.getInvalidCellNumberErrText();
        String emailErr = fullEnrollPage.getEmailAlreadyTknErrText();
        Assert.assertEquals("The ssn field is required.", noSSn);
        Assert.assertEquals("The city field is required.", cityIsRequired);
        Assert.assertEquals("The phone must be a valid phone number.", phoneNumErr);
        Assert.assertEquals("The cell phone must be a valid phone number.", cellNumErr);
        Assert.assertEquals("The email has already been taken.", emailErr);

        //если все ввели верно то вот эти проверки
        // String headingText = mainPage.getMainPageHeading();
        // Assert.assertEquals("dashboard",headingText);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}