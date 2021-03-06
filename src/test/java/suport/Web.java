package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome() {
        //**define below the path of the local directory of chromedriver as explained in the README file.**
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Paulo Lemos\\Documents\\Drivers\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.manage().window().maximize();

        //Access the site
        browser.get("https://www.podium.com");

        return browser;
    }
}
