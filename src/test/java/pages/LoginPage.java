package pages;

import org.jfree.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver browser) { super(browser); }

    public LoginPage goToLoginPage() {
        browser.findElement(By.linkText("Login")).click();
        String actualLoginPageTitle = browser.getTitle();
        assertEquals("Login | Podium - Messaging Tools for Local Business",actualLoginPageTitle);

        return this;
    }

    public LoginPage fillFormLoginEmail(String email) {
        browser.findElement(By.id("emailOrPhoneInput")).sendKeys(email);

        return this;
    }

    public LoginPage fillFormLoginPassword(String password) {
        browser.findElement(By.id("passwordInput")).sendKeys(password);

        return this;
    }

    public LoginPage clickButtonSignIn() {
        browser.findElement(By.id("signInButton")).click();

        return this;
    }

    public LoginPage verifyErrorMessage() {
        if(browser.getPageSource().contains("Incorrect email or password. Please try again.")) {
            System.out.println("Incorrect email or password. Please try again.\nTest passed.");
        }
        else {
            System.out.println("Test failed.");
        }

        return this;
    }

    public LoginPage incorrectLogin(String email, String password) {
        goToLoginPage()
                .fillFormLoginEmail(email)
                .clickButtonSignIn()
                .fillFormLoginPassword(password)
                .clickButtonSignIn()
                .verifyErrorMessage();

        return this;
    }
}
