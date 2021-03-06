package pages.productsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static org.junit.Assert.assertEquals;

public class TeamchatPage extends BasePage {
    public TeamchatPage(WebDriver browser) { super(browser);
    }

    public TeamchatPage goToTeamchatPage() {
        browser.findElement(By.linkText("Teamchat")).click();
        String actualTeamchatPageTitle = browser.getTitle();
        assertEquals("Podium Teamchat - Internal Communication Software for Teams",actualTeamchatPageTitle);

        return this;
    }
}
