package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class HaloOglasiSuccessfulRegistrationPage  extends BaseHaloOglasiTest {

    public HaloOglasiSuccessfulRegistrationPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "div[class='regsitration-success']")
    WebElement successfulRegistrationMessage;

    @FindBy(css = ".row.registration-step1")
    WebElement successfulRegistrationMessage2;


    public boolean successfulRegistrationMessageIsDysplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.isDisplayed();
    }

    public String successfulRegistrationMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.getText();

        //moze i zajedno return wdWait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage)).getText()
    }


    public void switchtonewtab(){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> numberOfTabs=new ArrayList<>(driver.getWindowHandles());
        //indeks taba pocinje od nule
        driver.switchTo().window(numberOfTabs.get(1));
    }

}
