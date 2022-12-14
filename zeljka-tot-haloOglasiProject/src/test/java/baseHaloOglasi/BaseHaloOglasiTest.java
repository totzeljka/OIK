package baseHaloOglasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseHaloOglasiTest {


    public static WebDriver driver;

    public static WebDriverWait wdWait;

    public static Actions actions;


    @Before
    public void setUpHaloOglasi(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        wdWait= new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.halooglasi.com/");
        driver.manage().window().maximize();
        actions = new Actions(driver);

    }


    @After
    public  void tearDown(){
        //kako ne bi zaboravili nesto da odradimo intelij ima komandu to do. intelij ce mi prikazati sve nerazresene to do-ove ima ga i dole  u baru dole
        //TODO odkomentarisati kada svi testovi budu gotovi
        //  driver.quit();
    }

}
