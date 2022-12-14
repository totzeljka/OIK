package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiPage extends BaseHaloOglasiTest {

    public HaloOglasiPage() {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//a[normalize-space()='Uloguj se']")
    WebElement ulogujSeButton;


    public void ulogujSeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSeButton)).click();
    }


}
