package tests.testCaseCreateAFreeAccountPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CreateAccountPage;
import suport.Web;

import static org.junit.Assert.assertEquals;

public class TestCaseFillFormCreateAFreeAccount {
    private WebDriver browser;

    @Before
    public void setUp() {
        browser = Web.createChrome();
        //The assertions in the title of the home page are commented out for reasons described in the README file.
        //String actualTitle = browser.getTitle();
        //assertEquals("Messaging Tools for Local Business | Customer Review Software, Webchat, Payments | Podium",actualTitle);
    }

    @Test
    public void testCaseFillTheFormCreateAFreeAccountWithoutName() {
        new CreateAccountPage(browser)
                .fillTheFormCreateAFreeAccount("","Lemos","+5561982205290",
                        "Software Quality Assurance Tester","paulo.lemos@gmail.com",
                        "podium123@")
                .verifyErrorMessageName("error-message-firstName","First name is required.");
    }

    @Test
    public void testCaseFillTheFormCreateAFreeAccountWithoutMobilePhone() {
        new CreateAccountPage(browser)
                .fillTheFormCreateAFreeAccount("Paulo","Lemos","",
                        "Software Quality Assurance Tester","paulo.lemos@gmail.com",
                        "podium123@")
                .verifyErrorMessageMobilePhone("error-message-phone","Phone is required.");
    }

    @Test
    public void testCaseFillTheFormCreateAFreeAccountWithoutBusinessName() {
        new CreateAccountPage(browser)
                .fillTheFormCreateAFreeAccount("Paulo","Lemos","+5561982205290",
                        "","paulo.lemos@gmail.com",
                        "podium123@")
                .verifyErrorMessageBusinessName("error-message-businessName","Business name is required.");
    }

    @Test
    public void testCaseFillTheFormCreateAFreeAccountWithoutEmail() {
        new CreateAccountPage(browser)
                .fillTheFormCreateAFreeAccount("Paulo","Lemos","+5561982205290",
                        "Software Quality Assurance Tester","",
                        "podium123@")
                .verifyErrorMessageEmail("error-message-email","Email is required.");
    }

    @Test
    public void testCaseFillTheFormCreateAFreeAccountWithoutPassword() {
        new CreateAccountPage(browser)
                .fillTheFormCreateAFreeAccount("Paulo","Lemos","+5561982205290",
                        "Software Quality Assurance Tester","paulo.lemos@gmail.com","")
                .verifyErrorMessagePassword("error-message-password","Password is required.");
    }

    @After
    public void tearDown () {
        //Close browser
        browser.quit();
    }
}
