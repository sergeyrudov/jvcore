package jvcore.jvcore.dayTwelweWBDR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class navigateTest {
    public void site_header_is_on_home_page() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "c:\\utils\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.get("http://saucelabs.com");
        WebElement header = browser.findElement(By.id("site-header"));
        browser.close();
    }
}