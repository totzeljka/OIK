package testHaloOglasi;

import baseHaloOglasi.BaseHaloOglasiTest;
import pageHaloOglasi.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class SuccessfulRegistrationHaloOglasiTest extends BaseHaloOglasiTest {



    HaloOglasiPage haloOglasiPage;
    HaloOglasiRegistrationPage haloOglasiRegistrationPage;
    HaloOglasiLogInPage haloOglasiLogInPage;
    MailinatorPage mailinatorPage;
    MailinatorInboxPage mailinatorInboxPage;
    HaloOglasiMailMessagePage haloOglasiMailMessagePage;
    AktiviranHaloOglasiNalogPage aktiviranHaloOglasiNalogPage;
    HaloOglasiSuccessfulRegistrationPage haloOglasiSuccessfulRegistrationPage;
    HaloOglasiProfilPage haloOglasiProfilPage;

    @Before
    public void setUpHaloOglasiTest(){

         haloOglasiPage= new HaloOglasiPage();
         haloOglasiRegistrationPage= new HaloOglasiRegistrationPage();
         haloOglasiLogInPage= new HaloOglasiLogInPage();
         mailinatorPage= new MailinatorPage();
         mailinatorInboxPage=new MailinatorInboxPage();
         haloOglasiMailMessagePage=new HaloOglasiMailMessagePage();
         aktiviranHaloOglasiNalogPage=new AktiviranHaloOglasiNalogPage();
         haloOglasiSuccessfulRegistrationPage=new HaloOglasiSuccessfulRegistrationPage();
         haloOglasiProfilPage=new HaloOglasiProfilPage();
    }

Random random = new Random();
    String username="111123bubamara"+random.nextInt(999999);
    String email=username+"@mailinator.com";
    String sifra="111123bubamara";



    @Test
    public void  successfulRegistrationHaloOglasiTest(){
        haloOglasiPage.ulogujSeButtonClick();
        haloOglasiLogInPage.registrujSeLinkClick();
        haloOglasiRegistrationPage.fizickoLiceRadioButtonIsClicked();
        haloOglasiRegistrationPage.korisnickoImeInputFieldSendKeys(username);
        haloOglasiRegistrationPage.emailInputFieldSendKeys(email);
        haloOglasiRegistrationPage.lozinkaInputFieldSendKeys(sifra);
        haloOglasiRegistrationPage.ponoviLozinkuInputFieldSendKeys(sifra);
        haloOglasiRegistrationPage.saglasnostCheckBoxClick();
        haloOglasiRegistrationPage.registrujMeButtonClick();
        assertTrue(haloOglasiSuccessfulRegistrationPage.successfulRegistrationMessageIsDysplayed());
        assertEquals("Registracija je uspela!\n" +
                        "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : "+email+" !",
                haloOglasiSuccessfulRegistrationPage.successfulRegistrationMessageGetText());

        driver.get("https://www.mailinator.com/");
        mailinatorPage.mailinatorInputFieldSendKeys(email);
        mailinatorInboxPage.activationMessageTextBoxClick();

        //haloOglasiMailMessagePage.aktivirajNalogButtonMoveTo();
        haloOglasiMailMessagePage.aktivirajNalogButtonClick();
        assertTrue(aktiviranHaloOglasiNalogPage.aktiviranHaloOglasiNalogMessageTextIsDisplayed());
        assertTrue(aktiviranHaloOglasiNalogPage.aktiviranHaloOglasiNalogMessage2TextIsDisplayed());
        assertEquals("Vaš nalog je uspešno aktiviran!",
                aktiviranHaloOglasiNalogPage.aktiviranHaloOglasiNalogMessageTextGetText());
        assertEquals("Produžite na stranicu za logovanje kako biste pristupili našem portalu. ",
                aktiviranHaloOglasiNalogPage.aktiviranHaloOglasiNalogMessage2TextGetText());

        aktiviranHaloOglasiNalogPage.prijavaLinkClick();
        haloOglasiLogInPage.emailInputFieldSendKeys(email);
        haloOglasiLogInPage.passwordInputFieldSendKeys(sifra);
        haloOglasiLogInPage.ulogujSeButtonClick();
        haloOglasiProfilPage.mojProfilHeaderLinkHover();
        assertTrue(haloOglasiProfilPage.korisnickoImeIsDysplayed());
        assertEquals(username, haloOglasiProfilPage.korisnickoImeGetText());

        assertTrue(haloOglasiProfilPage.emailIsDysplayed());
        assertEquals("email:"+email, haloOglasiProfilPage.emailGetText());
    }
}
