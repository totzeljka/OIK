package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistrationPage extends BaseHaloOglasiTest {

    public HaloOglasiRegistrationPage() {
        PageFactory.initElements(driver, this);}


    @FindBy(css = "input[value='person']")
    WebElement fizickoLiceRadioButton;

    @FindBy(xpath = "//input[@id='UserName']")
    WebElement korisnickoImeInputField;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailInputField;

    @FindBy(id ="Password")
    WebElement lozinkaInputField;

    @FindBy(css = "#ConfirmPassword")
    WebElement ponoviLozinkuInputField;

    @FindBy(id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement saglasnostCheckBox;

    @FindBy(css = ".buttons-wrapper") //css = ".buttons-wrapper>button:firstchild" ako zelim da iz te klase odabere prvi cajld moze i last ili n-ti cajjld
    WebElement registrujMeButton;


    public void fizickoLiceRadioButtonIsClicked(){
        wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLiceRadioButton));
        if (!fizickoLiceRadioButton.isSelected())
                fizickoLiceRadioButton.click();
        //moze i zajedno    if( !wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLiceRadioButton)).isSelected());
        //                fizickoLiceRadioButton.click();)
    }

       public void korisnickoImeInputFieldSendKeys(String username){
           wdWait.until(ExpectedConditions.visibilityOf(korisnickoImeInputField)).clear();
           korisnickoImeInputField.sendKeys(username);
       }

    public void emailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }

    public void lozinkaInputFieldSendKeys(String sifra){
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaInputField)).clear();
        lozinkaInputField.sendKeys(sifra);
    }

    public void ponoviLozinkuInputFieldSendKeys(String sifra){
        wdWait.until(ExpectedConditions.visibilityOf(ponoviLozinkuInputField)).clear();
        ponoviLozinkuInputField.sendKeys(sifra);
    }

    public void saglasnostCheckBoxClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(saglasnostCheckBox));
        saglasnostCheckBox.click();
    }

    public void  registrujMeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujMeButton)).click();
    }

}


