package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GitHubPage;
import page.LoginPage;
import page.SecureAreaPage;
import page.SharedPage;

public class FinalniTest extends BaseTest {


    LoginPage loginPage;
    SecureAreaPage secureAreaPage;
    SharedPage sharedPage;
    GitHubPage gitHubPage;

    @Before
    public void setUpTest(){

        loginPage=new LoginPage();

        secureAreaPage= new SecureAreaPage();

        sharedPage=new SharedPage();

        gitHubPage=new GitHubPage();
    }

    String username="tomsmith";
    String password="SuperSecretPassword!";
    String invalidUsername="zeljka";
    String invalidPassword="krastavcici";


    @Test
    public void pageTextIsDysplayedTest(){
        Assert.assertTrue(loginPage.loginTitleIsDysplayed());
        Assert.assertTrue(loginPage.subheaderTextIsDysplayed());
        Assert.assertEquals("Login Page", loginPage.loginTitleGetText());
        Assert.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.",
                loginPage.subheaderTextGetText());
    }


    @Test
    public void  successfulLogInWithValidCredentialsTest(){

        loginPage.usernameInputFieldSendKeys(username);
        loginPage.passwordInputFieldSendKeys(password);
        loginPage.loginButtonClick();
        Assert.assertTrue(secureAreaPage.successfulLoginMessageIsDysplayed());
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.", secureAreaPage.successfulLoginMessageGetText());
    }


    @Test
    public void unsucessfulloginWithValidUsernameInvalidPasswordTest(){

        loginPage.usernameInputFieldSendKeys(username);
        loginPage.invalidPasswordInputFieldSendKeys(invalidPassword);
        loginPage.loginButtonClick();

       Assert.assertTrue(loginPage.invalidCredentialMessageIsDysplayed());
       Assert.assertEquals("Your password is invalid!\n" + "×",loginPage.invalidCredentialMessageGetText());
    }


    @Test
    public void  unsucessfulLoginWithInvalidUsernameValidPasswordTest(){
        loginPage.invalidUsernameInputFieldSendKeys(invalidUsername);
        loginPage.passwordInputFieldSendKeys(password);
        loginPage.loginButtonClick();
        Assert.assertTrue(loginPage.invalidCredentialMessageIsDysplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×", loginPage.invalidCredentialMessageGetText());
    }

    @Test
    public void  unsucessfulloginBlankUsernameAndPasswordFieldTest(){
        loginPage.loginButtonClick();
        Assert.assertTrue(loginPage.invalidCredentialMessageIsDysplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×", loginPage.invalidCredentialMessageGetText());
    }
    @Test
    public void unsucessfulLoginInvalidUsernameInvalidPasswprdTest(){
        loginPage.invalidUsernameInputFieldSendKeys(invalidUsername);
        loginPage.passwordInputFieldSendKeys(invalidPassword);
        loginPage.loginButtonClick();
        Assert.assertTrue(loginPage.invalidCredentialMessageIsDysplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×", loginPage.invalidCredentialMessageGetText());
    }


    @Test
    public void  unsucessfulLoginBlancPasswordFieldTest(){
        loginPage.usernameInputFieldSendKeys(username);
        loginPage.loginButtonClick();
        Assert.assertTrue(loginPage.invalidCredentialMessageIsDysplayed());
        Assert.assertEquals("Your password is invalid!\n" + "×",loginPage.invalidCredentialMessageGetText());
    }

    @Test
    public void  unsucessfulLoginBlancUsernameFieldTest(){
        loginPage.passwordInputFieldSendKeys(password);
        loginPage.loginButtonClick();
        Assert.assertTrue(loginPage.invalidCredentialMessageIsDysplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×", loginPage.invalidCredentialMessageGetText());
    }


    @Test
    public void allFunctionalElementsAreDysplayedAsPerBRDTest(){
      Assert.assertTrue( loginPage.usernameInputFieldIsDisplayed());
      Assert.assertTrue( loginPage.passwordInputFieldIsDisplayed());
      Assert.assertTrue( loginPage.loginButtonIsDisplayed());
    }


    @Test
    public void buttonLoginTextTest(){
       Assert.assertEquals("Login", loginPage.loginButtonGetText());
    }



    @Test
    public void inputInInputFieldsCanBeErasedTest(){
        loginPage.eraseInputInUsernameField();
        loginPage.eraseInputInPasswordField();
        Assert.assertEquals("",loginPage.usernameInputFieldGetText());
        Assert.assertEquals("", loginPage.paswordInputFieldGetText());
    }



    @Test
    public void pageTitleTest(){
      Assert.assertEquals( "The Internet", driver.getTitle());
    }


    @Test
    public void clickinOnLinkOpensNewTabTitleGiiHubTest() {

    sharedPage.linkGitHubClick();
    Assert.assertEquals("GitHub - saucelabs/the-internet: An example application that captures prominent and ugly functionality found on the web. Perfect for writing automated acceptance tests against.",
                    gitHubPage.githubTitle());
    }


    @Test
    public void endToEndTest(){


    }


}
