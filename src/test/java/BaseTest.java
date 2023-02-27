import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup() throws InterruptedException {
        //DRY principle
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //driver.get("https://the-internet.herokuapp.com/login");
        driver.get("https://demowebshop.tricentis.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    protected WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    protected void typeIn(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    protected void clickOnElement(By locator) {
        getElement(locator).click();
    }

    protected String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    protected String getColorFromElement(By locator, String cssValue) {
        return getElement(locator).getCssValue(cssValue);
    }


}
