package tests;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;


public class ClickTest {

    public static WebDriver driver;
    public static MainPage mainPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shakura_n\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver();
        //mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://uitestingplayground.com/click");
    }

    @Test
    public void clickbuttonTest() {
        mainPage.clickBt();
        Assert.assertTrue(String.valueOf(true), mainPage.getBt());
    }

    @AfterClass
    public static void tearDown() {
        driver.quit(); }
}
