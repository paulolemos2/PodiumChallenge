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
    public void testCaseEnterprisePageFillFormWithoutMobilePhone() {
        new EnterprisePage(browser)
                .checkEnterprisePage("Paulo","Lemos","paulo.lemos@gmail.com",
                        "2","Podium","")
                .verifyValidMsgMobilePhone("ValidMsgMobilePhone","Must be a phone number.\n" +
                        "503-555-1212");
    }

   @After
    public void tearDown () {
        //Close browser
        browser.quit();
    }

}