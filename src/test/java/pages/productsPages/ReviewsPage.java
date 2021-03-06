package pages.productsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import static org.junit.Assert.assertEquals;

public class ReviewsPage extends BasePage {
    public ReviewsPage (WebDriver browser) { super(browser);}

    public ReviewsPage goToReviewsPage() {
        browser.findElement(By.linkText("Reviews")).click();
        //The assertions in the title of this page are commented out for reasons described in the README file.

        //String actualReviewsPageTitle = browser.getTitle();
        //assertEquals("Reviews Product Page 2021 - Podium",actualReviewsPageTitle);

        return this;
    }
}
