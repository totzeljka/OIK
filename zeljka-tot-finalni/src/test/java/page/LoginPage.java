package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTest {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }



    @FindBy(id="username")
    WebElement usernameInputField;

    @FindBy(id="password")
    WebElement passwordInputField;


    @FindBy(xpath = "//i[contains(text(),'Login')]")
    WebElement loginButton;


    @FindBy(xpath = "//h2[contains(text(),'Login Page')]")
    WebElement logInTitle;

    @FindBy(css = ".subheader")
    WebElement subheaderText;


   @FindBy(id="flash")
   WebElement invalidPasswordMessage;

    public String loginTitleGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(logInTitle));
        return logInTitle.getText();
    }

    public boolean loginTitleIsDysplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(logInTitle));
        return logInTitle.isDisplayed();
    }

    public String subheaderTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(subheaderText));
        return subheaderText.getText();
    }


    public boolean subheaderTextIsDysplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(subheaderText));
        return subheaderText.isDisplayed();
    }

    public  void usernameInputFieldSendKeys(String username) {
        wdWait.until(ExpectedConditions.visibilityOf(usernameInputField)).clear();
        usernameInputField.sendKeys(username);
    }
    public  void invalidUsernameInputFieldSendKeys(String invalidUsername) {
        wdWait.until(ExpectedConditions.visibilityOf(usernameInputField)).clear();
        usernameInputField.sendKeys(invalidUsername);
    }


    public void passwordInputFieldSendKeys(String password) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
    }

    public void invalidPasswordInputFieldSendKeys(String invalidPassword) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
        passwordInputField.sendKeys(invalidPassword);
    }

    public boolean usernameInputFieldIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(usernameInputField)).clear();
       return usernameInputField.isDisplayed();
    }


    public boolean passwordInputFieldIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
        return passwordInputField.isDisplayed();

    }

    public String loginButtonGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(loginButton));
        return loginButton.getText();
    }

    public void loginButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public boolean loginButtonIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf( loginButton));
        return   loginButton.isDisplayed();
    }


    public boolean invalidCredentialMessageIsDysplayed(){
      wdWait.until(ExpectedConditions.visibilityOf(invalidPasswordMessage));
      return  invalidPasswordMessage.isDisplayed();
    }


    public String invalidCredentialMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(invalidPasswordMessage));
       return invalidPasswordMessage.getText();
    }



    public void eraseInputInUsernameField(){
        usernameInputField.sendKeys("sisarka");
        usernameInputField.clear();

    }

    public void eraseInputInPasswordField(){
        passwordInputField.sendKeys("sisarka");
        passwordInputField.clear();

    }

    public String usernameInputFieldGetText(){
      return  usernameInputField.getText();
    }


    public String paswordInputFieldGetText(){
        return  usernameInputField.getText();
    }

}


