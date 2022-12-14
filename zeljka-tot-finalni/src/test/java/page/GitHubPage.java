package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GitHubPage extends BaseTest {

    public GitHubPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "img[alt='Fork me on GitHub']")
    WebElement linkGitHub;

    public String githubTitle(){
        return    driver.getTitle();
    }




}
