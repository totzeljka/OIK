package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiMailMessagePage extends BaseHaloOglasiTest {

    public HaloOglasiMailMessagePage() {
        PageFactory.initElements(driver, this);}


    @FindBy(linkText = "Aktiviraj nalog") //iframe!
    WebElement aktivirajNalogButton;

    //xpath = "//strong[contains(text(),'Aktiviraj nalog')]"

    @FindBy(id="html_msg_body")
    WebElement iframeBody;

    public void aktivirajNalogButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(aktivirajNalogButton)).click();
    }

//    public void aktivirajNalogButtonMoveTo(){
//        actions.scrollToElement(aktivirajNalogButton).perform();
//    }
    //prvi nacin
    public void IframeBodySwitch(){
        wdWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeBody));
    }
    //drugi nacin driverom prebacujam obavezno mora metoda i da se vrati
            public void IframeBodySwitchWithDriver(){
                wdWait.until(ExpectedConditions.visibilityOf(iframeBody));
                driver.switchTo().frame(iframeBody);
            }
            public void switchtodefoltcontent(){
                driver.switchTo().defaultContent();
            }

}
