import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.cssSelector(".fa");
    By actualTextAndColorElement = By.id("flash");


//    @BeforeMethod
//    public void localSetup(){
//        System.out.println("Pre svake metode");
//    }

    @Test
    public void loginTestByText() {
        driver.get("https://the-internet.herokuapp.com/login");
        typeIn(usernameField, "tomsmith");
        typeIn(passwordField, "SuperSecretPassword!");
        clickOnElement(loginButton);

        String actualText = getTextFromElement(actualTextAndColorElement);
        System.out.println(actualText);

        int indexDrugi = actualText.length() - 2;

        String actualTextSubString = actualText.substring(0, indexDrugi);

        String actualTextSplit[] = actualText.split("(?<=!)");

        String expectedText = "You logged into a secure area!";

        Assert.assertEquals(actualTextSplit[0], expectedText, "Expected text is not equal to actual text!!!");

    }

    @Test
    public void loginTestByColor(){
        driver.get("https://the-internet.herokuapp.com/login");
        typeIn(usernameField, "tomsmith");
        typeIn(passwordField, "SuperSecretPassword!");
        clickOnElement(loginButton);

        String actualColor = getColorFromElement(actualTextAndColorElement, "background-color");
        System.out.println(actualColor);

        String expectedColor = "rgba(93, 164, 35, 1)";

        Assert.assertTrue(actualColor.equals(expectedColor), "Expected color is not equal to: " + actualColor);

    }



}
