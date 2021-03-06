package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class PricingPage extends BasePage{
    public PricingPage(WebDriver browser) { super(browser); }

    public PricingPage goToPricingPage() {
        browser.findElement(By.linkText("Pricing")).click();
        String actualPricingPageTitle = browser.getTitle();
        assertEquals("Podium Plans & Pricing | Messaging Tools to for Local Business",actualPricingPageTitle);

        return this;
    }

    public PricingPage fillTheFormRequestAQuoteName(String firstName, String lastName) {
        browser.findElement(By.id("FirstName")).sendKeys(firstName);
        browser.findElement(By.id("LastName")).sendKeys(lastName);

        return this;
    }

    public PricingPage fillTheFormRequestAQuoteCompany(String company) {
        browser.findElement(By.id("Company")).sendKeys(company);

        return this;
    }

    public PricingPage fillTheFormRequestAQuoteEmail(String email) {
        browser.findElement(By.id("Email")).sendKeys(email);

        return this;
    }

    public PricingPage fillTheFormRequestAQuoteMobilePhone(String mobilePhone) {
        browser.findElement(By.id("MobilePhone")).sendKeys(mobilePhone);

        return this;
    }

    public PricingPage fillTheFormRequestAQuote(String firstName, String lastName, String company,
                                                String email, String mobilePhone) {
        fillTheFormRequestAQuoteName(firstName, lastName)
                .fillTheFormRequestAQuoteCompany(company)
                .fillTheFormRequestAQuoteEmail(email)
                .fillTheFormRequestAQuoteMobilePhone(mobilePhone);

        return this;
    }

    public PricingPage checkPricingPage(String firstName, String lastName, String company,
                                        String email, String mobilePhone) {
        goToPricingPage()
                .fillTheFormRequestAQuote(firstName,lastName,company,email,mobilePhone);

        return this;
    }
}
