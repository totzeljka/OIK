package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecureAreaPage extends BaseTest {



    public SecureAreaPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//h4[@class='subheader']" )
    WebElement successfulLoginMessage;


    public boolean successfulLoginMessageIsDysplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(successfulLoginMessage));
        return successfulLoginMessage.isDisplayed();
    }

    public String successfulLoginMessageGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(successfulLoginMessage)).getText();
    }
}
