import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;
    CheckReadyness page;

    @BeforeClass
    public void prepare() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://xn--b1ab2a0a.xn--b1aew.xn--p1ai/services/passport/");
        }
    @AfterClass
    public void detatch() {
//        driver.close();
    }

    @Test
    public void test1() {
        page = new CheckReadyness(driver);
        page.check();
        page.fill();
        page.scrollDown();
        page.clickOnCaptcha();
    }

}

