import com.sun.org.apache.bcel.internal.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eugenes\\IdeaProjects\\testselenium\\Drivers\\chromedriver.exe");
        //System.setProperty("Phantomjs.binary.path", "C:\\Users\\eugenes\\IdeaProjects\\testselenium\\Drivers\\phantomjs.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://staging.onetouchhealth.com/");

        driver.findElement(By.xpath("//a[@href='https://staging.onetouchhealth.com/enroll']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


}
