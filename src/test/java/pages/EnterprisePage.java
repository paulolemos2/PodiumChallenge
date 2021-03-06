package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class EnterprisePage extends BasePage {
    public EnterprisePage(WebDriver browser) {
        super(browser);
    }

    public EnterprisePage goToTheEnterprisePage() {
        browser.findElement(By.linkText("Enterprise")).click();
        String actualEnterprisePageTitle = browser.getTitle();
        assertEquals("Big Business Still Happens Locally | Podium for Enterprise",actualEnterprisePageTitle);

        return this;
    }

    public EnterprisePage fillFormRequestInformationName(String firstName, String lastName) {
        browser.findElement(By.id("FirstName")).sendKeys(firstName);
        browser.findElement(By.id("LastName")).sendKeys(lastName);

        return this;
    }

    public EnterprisePage fillFormRequestInformationEmail(String email) {
        browser.findElement(By.id("Email")).sendKeys(email);

        return this;
    }

    public EnterprisePage fillFormRequestInformationNumberOfLocations(String location) {
        browser.findElement(By.id("No_of_Locations__c")).sendKeys("2");

        return this;

    }

    public EnterprisePage fillFormRequestInformationCompany(String company) {
        browser.findElement(By.id("Company")).sendKeys(company);

        return this;
    }

    public EnterprisePage fillFormRequestInformationMobilePhone(String mobilePhone) {
        browser.findElement(By.id("MobilePhone")).sendKeys(mobilePhone);

        return this;
    }

    public EnterprisePage fillFormRequestInformationWithoutMobilePhone(String firstName, String lastName, String email,
                                                    String locations, String company, String mobilePhone) {
        fillFormRequestInformationName(firstName, lastName)
                .fillFormRequestInformationEmail(email)
                .fillFormRequestInformationNumberOfLocations(locations)
                .fillFormRequestInformationCompany(company)
                .fillFormRequestInformationMobilePhone(mobilePhone);

        return this;
    }

    public EnterprisePage clickRequestInformationButton() {
        browser.findElement(By.cssSelector("button[class='mktoButton']")).click();

        return this;
    }

    public EnterprisePage verifyValidMsgMobilePhone(String id, String errorMessage) {
        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

        String verify = browser.findElement(By.id(id)).getText();
        assertEquals(errorMessage, verify);

        return this;
    }

    public EnterprisePage checkEnterprisePage(String firstName, String lastName, String email,
                                              String locations, String company, String mobilePhone) {
        goToTheEnterprisePage()
            .fillFormRequestInformationWithoutMobilePhone(firstName,lastName,email,locations,company,mobilePhone)
                .clickRequestInformationButton();

        return this;
    }
}

