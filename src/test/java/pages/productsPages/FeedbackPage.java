package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static org.junit.Assert.assertEquals;

public class FeedbackPage extends BasePage {
    public FeedbackPage(WebDriver browser) { super(browser); }

    public FeedbackPage goToFeedbackPage() {
        browser.findElement(By.linkText("Feedback")).click();
        String actualFeedbackPageTitle = browser.getTitle();
        assertEquals("Podium Feedback - Customer Feedback Software & Feedback Tool",actualFeedbackPageTitle);

        return this;
    }
}
