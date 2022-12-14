package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiLogInPage extends BaseHaloOglasiTest {

    public HaloOglasiLogInPage() {
        PageFactory.initElements(driver, this);}


    String username;
    String email;
    String sifra;

    @FindBy(css = "a[title='Registrujte se']")
    WebElement registrujSeLink;

    @FindBy(xpath = "//input[@id='EMailOrUsername']")
    WebElement emailInputField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordInputField;

    @FindBy(css = ".btn-main")
    WebElement ulogujSeButton;


    public void registrujSeLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeLink)).click();
    }

    public void emailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }

    public void passwordInputFieldSendKeys(String sifra){
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
        passwordInputField.sendKeys(sifra);
    }

    public void ulogujSeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSeButton)).click();
    }

}
