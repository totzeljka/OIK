package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SharedPage extends BaseTest {

    public SharedPage(){
        PageFactory.initElements(driver, this);
    }



    @FindBy(css = "img[alt='Fork me on GitHub']")
    WebElement linkGitHub;


    public void linkGitHubClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(linkGitHub)).click();
    }









}
