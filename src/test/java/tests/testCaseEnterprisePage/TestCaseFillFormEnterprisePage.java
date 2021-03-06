package tests.testCaseEnterprisePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.EnterprisePage;
import suport.Web;

import static org.junit.Assert.assertEquals;

public class TestCaseFillFormEnterprisePage {

    private WebDriver browser;

    @Before
    public void setUp() {
        browser = Web.createChrome();
        //The assertions in the title of the home page are commented out for reasons described in the README file.

        //String actualTitle = browser.getTitle();
        //assertEquals("Messaging Tools for Local Business | Customer Review Software, Webchat, Payments | Podium",actualTitle);
    }


    @Test
    public void testCaseEnterprisePageFillFormWithoutName() {
        new EnterprisePage(browser)
                .checkEnterprisePage("","Lemos","paulo.lemos@gmail.com",
                        "2","Podium","+5561982205290")
                .verifyErrorMessageName("ValidMsgFirstName","This field is required.");
    }

    @Test
    public void testCaseEnterprisePageFillFormWithoutEmail() {
        new EnterprisePage(browser)
                .checkEnterprisePage("Paulo","Lemos","",
                        "2","Podium","+5561982205290")
                .verifyErrorMessageEmail("ValidMsgEmail","Must be valid email.\n" +
                        "example@yourdomain.com");
    }

    @Test
    public void testCaseEnterprisePageFillFormWithoutCompany() {
        new EnterprisePage(browser)
                .checkEnterprisePage("Paulo","Lemos","paulo.lemos@gmail.com",
                        "2","","+5561982205290")
                .verifyErrorMessageCompany("ValidMsgCompany","This field is required.");
    }

    @Test
    public void testCaseEnterprisePageFillFormWithoutMobilePhone() {
        new EnterprisePage(browser)
                .checkEnterprisePage("Paulo","Lemos","paulo.lemos@gmail.com",
                        "2","Podium","")
                .verifyErrorMessageMobilePhone("ValidMsgMobilePhone","Must be a phone number.\n" +
                        "503-555-1212");
    }

   @After
    public void tearDown () {
        //Close browser
        browser.quit();
    }

}
