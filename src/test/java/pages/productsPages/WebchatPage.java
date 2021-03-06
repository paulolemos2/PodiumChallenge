package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import static org.junit.Assert.assertEquals;

public class WebchatPage extends BasePage {
    public WebchatPage(WebDriver browser) { super(browser); }

    public WebchatPage goToWebchatPage() {
        browser.findElement(By.linkText("Webchat")).click();
        //The assertions in the title of this page are commented out for reasons described in the README file.

        //String actualWebchatPageTitle = browser.getTitle();
        //assertEquals("Webchat Product Page 2021 - Podium",actualWebchatPageTitle);

        return this;
    }
}
