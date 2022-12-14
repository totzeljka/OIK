package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiProfilPage extends BaseHaloOglasiTest {


    public HaloOglasiProfilPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = ".header-label")
    WebElement mojProfilHeaderLink;

    @FindBy(css = ".header-category-link.logged-in-wrapper")
    WebElement korisnickoIme;

    @FindBy(xpath = "div[class='header-category-link logged-in-wrapper opened'] p[class='user-email']")
    WebElement email;


    public void mojProfilHeaderLinkHover() {
        wdWait.until(ExpectedConditions.visibilityOf(mojProfilHeaderLink));
        actions.moveToElement(mojProfilHeaderLink).perform();
    }

    public boolean korisnickoImeIsDysplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoIme));
        return korisnickoIme.isDisplayed();
    }

    public String korisnickoImeGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(korisnickoIme));
        return korisnickoIme.getText();
    }

    public boolean emailIsDysplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(email));
        return email.isDisplayed();
    }

    public String emailGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(email));
        return email.getText();
    }


}






