package tests.testCaseProductsPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.productsPages.*;
import suport.Web;

import static org.junit.Assert.assertEquals;

public class TestCaseCheckPages {

    private WebDriver browser;

    @Before
    public void setUp() {
        browser = Web.createChrome();
        //The assertions in the title of the home page are commented out for reasons described in the README file.

        //String actualTitle = browser.getTitle();
        //assertEquals("Messaging Tools for Local Business | Customer Review Software, Webchat, Payments | Podium",actualTitle);
    }

    @Test
    public void testCaseCheckReviewsPage() {
        new ReviewsPage(browser)
                .goToReviewsPage();
    }

    @Test
    public void testCaseCheckTeamchatPage() {
        new TeamchatPage(browser)
                .goToTeamchatPage();
    }

    @Test
    public void testCaseCheckWebchatPage() {
        new WebchatPage(browser)
                .goToWebchatPage();
    }

    @Test
    public void testCaseCheckFeedbackPage() {
        new FeedbackPage(browser)
                .goToFeedbackPage();
    }

    @After
    public void tearDown () {
        //Close browser
        browser.quit();
    }
}
