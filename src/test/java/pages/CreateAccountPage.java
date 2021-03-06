package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class CreateAccountPage extends BasePage{
    public CreateAccountPage (WebDriver browser) { super(browser);}

    public CreateAccountPage goToCreateAccountPage() {
        browser.findElement(By.linkText("Get Started")).click();
        String actualGetStartedPageTitle = browser.getTitle();
        assertEquals("Get Started | Podium - Messaging Tools for Local Business",actualGetStartedPageTitle);

        return this;
    }

    public CreateAccountPage fillTheFormCreateAFreeAccountName(String firstName, String lastName) {

        browser.findElement(By.id("input-signup-firstName")).sendKeys(firstName);
        browser.findElement(By.id("input-signup-lastName")).sendKeys(lastName);

        return this;
    }

    public CreateAccountPage fillTheFormCreateAFreeAccountMobilePhone(String mobilePhone) {
        browser.findElement(By.id("input-signup-phone")).sendKeys(mobilePhone);

        return this;
    }

    public CreateAccountPage fillTheFormCreateAFreeAccountBusinessName(String businessName) {
        browser.findElement(By.id("input-signup-businessName")).sendKeys(businessName);

        return this;
    }

    public CreateAccountPage fillTheFormCreateAFreeAccountEmail(String email) {
        browser.findElement(By.id("input-signup-email")).sendKeys(email);

        return this;
    }

    public CreateAccountPage fillTheFormCreateAFreeAccountPassword(String password) {
        browser.findElement(By.id("input-signup-password")).sendKeys(password);

        return this;
    }

    public CreateAccountPage clickCreateAccountButton() {
        browser.findElement(By.id("create-account-next-btn")).click();

        return this;
    }

    public CreateAccountPage verifyErrorMessage(String id, String errorMessage) {
        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

        String verify = browser.findElement(By.id(id)).getText();
        assertEquals(errorMessage, verify);

        return this;
    }

    public CreateAccountPage verifyErrorMessageName(String id, String errorMessage) {
        verifyErrorMessage(id,errorMessage);

        return this;
    }

    public CreateAccountPage verifyErrorMessageMobilePhone(String id, String errorMessage) {
        verifyErrorMessage(id,errorMessage);

        return this;
    }

    public CreateAccountPage verifyErrorMessageBusinessName(String id, String errorMessage) {
        verifyErrorMessage(id,errorMessage);

        return this;
    }

    public CreateAccountPage verifyErrorMessageEmail(String id, String errorMessage) {
        verifyErrorMessage(id,errorMessage);

        return this;
    }

    public CreateAccountPage verifyErrorMessagePassword(String id, String errorMessage) {
        verifyErrorMessage(id,errorMessage);

        return this;
    }

    public CreateAccountPage fillTheFormCreateAFreeAccount(String firstName, String lastName, String mobilePhone,
                                                           String businessName, String email, String password) {
          goToCreateAccountPage()
                .fillTheFormCreateAFreeAccountName(firstName,lastName)
                .fillTheFormCreateAFreeAccountMobilePhone(mobilePhone)
                .fillTheFormCreateAFreeAccountBusinessName(businessName)
                .fillTheFormCreateAFreeAccountEmail(email)
                .fillTheFormCreateAFreeAccountPassword(password)
                  .clickCreateAccountButton();

        return this;
    }
}
