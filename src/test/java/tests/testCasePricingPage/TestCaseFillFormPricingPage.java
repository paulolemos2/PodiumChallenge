package tests.testCasePricingPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.PricingPage;
import suport.Web;

import static org.junit.Assert.assertEquals;

public class TestCaseFillFormPricingPage {

    private WebDriver browser;

    @Before
    public void setUp() {
        browser = Web.createChrome();
        //The assertions in the title of the home page are commented out for reasons described in the README file.

        //String actualTitle = browser.getTitle();
        //assertEquals("Messaging Tools for Local Business | Customer Review Software, Webchat, Payments | Podium",actualTitle);
    }

    @Test
    public void testCaseFillTheFormPricingPage() {
        new PricingPage(browser)
                .checkPricingPage("Paulo","Lemos","Podium","paulo.lemos@gmail.com",
                        "+5561982205290");
    }

    @After
    public void tearDown () {
        //Close browser
        browser.quit();
    }
}
