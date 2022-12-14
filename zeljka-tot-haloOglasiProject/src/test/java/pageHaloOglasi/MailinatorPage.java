package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorPage extends BaseHaloOglasiTest {

    public MailinatorPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "search")
    WebElement mailinatorInputField;


    public void mailinatorInputFieldSendKeys(String email) {
        wdWait.until(ExpectedConditions.visibilityOf(mailinatorInputField)).clear();
        mailinatorInputField.sendKeys(email);
    //    mailinatorInputField.sendKeys(Keys.ENTER);
    }
    public void mailinatorInputFieldSendKeybordKeys(Keys keyboardButton){
        wdWait.until(ExpectedConditions.visibilityOf(mailinatorInputField)).sendKeys(Keys.ENTER);
        //keyboardButton moze da bude enter ili delite ili bilo sta zelimo, u zagradi kod send keys treba da ide keybordbutton
    }
}

