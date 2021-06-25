package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MainPage {

    public WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@class, 'btn btn-primary')]")
    private WebElement clickButton;

    @FindBy(xpath = "//*[contains(@class, 'btn btn-success')]")
    private WebElement successButton;

    public void clickBt() {
        clickButton.click(); }

    public boolean getBt() {
       boolean res = successButton.isDisplayed();
       return res;
    }
}
