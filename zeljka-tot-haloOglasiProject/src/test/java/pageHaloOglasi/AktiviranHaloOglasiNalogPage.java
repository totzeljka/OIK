package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AktiviranHaloOglasiNalogPage extends BaseHaloOglasiTest {

    public AktiviranHaloOglasiNalogPage() {
        PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//span[contains(text(),'Vaš nalog je uspešno aktiviran!')]")
    WebElement aktiviranHaloOglasiNalogMessageText;

    @FindBy(css = "div[class='main'] p:nth-child(1)")
    WebElement aktiviranHaloOglasiNalogMessage2Text;

    @FindBy(css = "a[href='/prijava']")
    WebElement prijavaLink;


    public String aktiviranHaloOglasiNalogMessageTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(aktiviranHaloOglasiNalogMessageText));
       return aktiviranHaloOglasiNalogMessageText.getText();
    }

    public boolean aktiviranHaloOglasiNalogMessageTextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(aktiviranHaloOglasiNalogMessageText));
        return aktiviranHaloOglasiNalogMessageText.isDisplayed();
    }

    public String aktiviranHaloOglasiNalogMessage2TextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(aktiviranHaloOglasiNalogMessage2Text));
        return aktiviranHaloOglasiNalogMessage2Text.getText();
    }

    public boolean aktiviranHaloOglasiNalogMessage2TextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(aktiviranHaloOglasiNalogMessage2Text));
        return aktiviranHaloOglasiNalogMessage2Text.isDisplayed();
    }

    public void prijavaLinkClick(){
        wdWait.until(ExpectedConditions.visibilityOf(prijavaLink)).click();
    }

}
