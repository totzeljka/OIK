package pageHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorInboxPage extends BaseHaloOglasiTest {

    public MailinatorInboxPage() {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//td[contains(text(),'Molimo aktivirajte Vaš Halo oglasi nalog')]")
    WebElement activationMessageTextBox;

    public void activationMessageTextBoxClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(activationMessageTextBox)).click();
    }

}
