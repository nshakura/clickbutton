package tests;

import com.codeborne.selenide.Condition;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Configuration;
import org.junit.Before;



public class ClickTest {

    @BeforeClass
    public static void setUp() {
        closeWebDriver();
        Configuration.baseUrl = "http://uitestingplayground.com";
    }

    @Before
    public void login() {
        open("/");
    }

    @Test
    public void dynamicIdTest() {
        open("/dynamicid");
        sleep(2000);
        $(By.xpath("//*[@class='btn btn-primary']")).click();
    }

    @Test
    public void claccAttributeTest() {
        open("/classattr");
        sleep(2000);
        $(By.xpath("//button[contains(@class,'btn-primary')]")).click();
        sleep(2000);
        switchTo().alert().accept();
        sleep(3000);
        }

    @Test
    public void hiddenLayersTest() {
        open("/hiddenlayers");
        sleep(2000);
        $(By.xpath("//button[@id='greenButton']")).click();
        sleep(2000);
        $(By.xpath("//button[@id='blueButton']")).isEnabled();
        sleep(3000);
    }

    @Test
    public void ajaxDataTest() throws InterruptedException {
        open("/ajax");
        $(By.xpath("//button[@id='ajaxButton']")).click();
        sleep(15000);
        $(By.xpath("//p[contains(text(), 'Data loaded with AJAX get request.')]")).shouldBe(Condition.visible);

    }

    @Test
    public void clickTest() {
        open("/click");
        $(By.xpath("//button[@class='btn btn-primary']")).click();
        sleep(2000);
        $(By.xpath("//button[@class='btn btn-success']")).shouldBe(Condition.visible);
        sleep(2000);

    }



    }


