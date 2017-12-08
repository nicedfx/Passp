import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckReadyness {
    @FindBy(xpath = "/html/body[@class=' f-desktop f-enableph']/div[@id='page']/div[@id='wrapper']/section[@class='b-container g-wrapper']/div[@class='m_il']/div[@class='b-navigation m_b2']/span[@class='b-navigation-group']/a[@id='nav_old']")
    WebElement passportStarogo;
    @FindBy(xpath = "//div[@class = \"select-input\"]")
    WebElement region;
    @FindBy(xpath = "//div[@class='select-search-holder']/input[@class='select-search']")
    WebElement regionText;
    @FindBy(xpath = "/html/body[@class=' f-desktop f-enableph']/div[@id='page']/div[@id='wrapper']/section[@class='b-container g-wrapper']/div[@class='m_il']/div[@id='form_old']/div[@class='c-form t-1']/form[@class='e-formsubmit']/div[@class='cf-holder t-1']/div[@class='cf-item t-1 '][1]/div[@class='cf-item-input t-a']/div[@class='placeholder']/input[@class='input e-errortip f-placeholder']")
    WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id=\"form_old\"]/div[2]/form/div[2]/div[2]/div[1]/div[1]/div")
    WebElement documentNumber;
    @FindBy(xpath = "//*[@id=\"form_old\"]/div[2]/form/div[2]/div[2]/div[1]/div[1]/input")
    WebElement getDocumentNumberNumbers;
    @FindBy(xpath = "//*/span[text() = \"Санкт-Петербург и Ленинградская область\"]")
    WebElement saintP;
    @FindBy(xpath = "//*/input[@class =\"input t-ico_right e-errortip f-placeholder\" and @name =\"captcha\"]")
    WebElement cont;

    WebDriver driver;

    public boolean check() {
        System.out.println(passportStarogo.isDisplayed());
        passportStarogo.click();
        System.out.println(region.isDisplayed());
        return passportStarogo.isDisplayed();

    }

    public void fill() {
        passportStarogo.click();
        region.click();
        regionText.sendKeys("санкт");
        saintP.click();
        dateOfBirth.sendKeys("20091986");
        documentNumber.click();
        getDocumentNumberNumbers.sendKeys("866592");

    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void clickOnCaptcha() {
        cont.click();
    }


    public CheckReadyness(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

