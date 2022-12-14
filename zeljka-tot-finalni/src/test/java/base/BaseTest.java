package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;


    @Before
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        wdWait= new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        actions = new Actions(driver);
        driver.get("https://the-internet.herokuapp.com/login");

    }


    @After
    public void tearDown(){
        //TODO nakon zavrsetka testa odkomentarisi
        //driver.quit();
    }

}
