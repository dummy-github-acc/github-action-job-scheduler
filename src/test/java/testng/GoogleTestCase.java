package testng;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleTestCase {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleHomePageTestCase() {
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}