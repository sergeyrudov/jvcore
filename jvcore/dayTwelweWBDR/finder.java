package jvcore.jvcore.dayTwelweWBDR;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class finder {
    @BeforeClass
        public static void main(String[] args)throws Exception {
            System.setProperty("webdriver.gecko.driver", "C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            execute(driver);
        }
        static void execute(WebDriver driver)throws Exception{
        String adv_url = "http://..";
        String prod_url = "https://..";
        String username = "..";
        String password = "..";
        //navigate and sign in as superadmin on production environment control panel
        driver.get(prod_url);
        WebElement LoginField = driver.findElement(By.cssSelector("#username"));
        LoginField.sendKeys(username);
        WebElement PasswField = driver.findElement(By.cssSelector("#password"));
        PasswField.sendKeys(password);
        WebElement SubmitBtn = driver.findElement(By.cssSelector("#_submit"));
        SubmitBtn.click();
        //navigate to tizer company->advertising
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[2]/ul[2]/li[2]/a/span")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("4293");
        driver.findElement(By.xpath("//a[@class='filter_link'][contains(text(),'tizer_autotest')]")).click();
        driver.findElement(By.xpath("//a[@class='filter_link'][contains(text(),'tizer_autotest_group')]")).click();
        //get value of click count before click and sign out
        Thread.sleep(5000);
        WebElement v = driver.findElement(By.cssSelector("#dataAjaxTable > tbody > tr > td:nth-child(9)"));
        String a = String.valueOf(v);
            System.out.println(a);
 /*             System.out.println(findValueBeforeClick);
         value_before_click = int(find_value_before_click)+1;
        driver.get(prod_url + '/logout');
        //open page with tizer dvertising and click on it
        driver.get(adv_url);
        driver.find_element_by_xpath("/html/body/div[1]/div[1]/div/div/a/div/div[2]/div[3]").click();
        //wait for 500 seconds
        Thread.sleep(50000);
        //open control panel and proceed to tizer advertising
        driver.get(prod_url);
        driver.find_element_by_css_selector(('#username')).send_keys(username);
        driver.find_element_by_css_selector(('#password')).send_keys(password);
        driver.find_element_by_css_selector(('#_submit')).click();
        driver.find_element_by_xpath("/html/body/div/div[1]/div/div/div[2]/ul[2]/li[2]/a/span").click();
        driver.find_element_by_xpath("//input[@type='search']").send_keys('4293');
        //get value of click after click on advertising
        Thread.sleep(300);
        driver.find_element_by_xpath("//a[@class='filter_link'][contains(text(),'tizer_autotest')]").click();
        Thread.sleep(300);
        driver.find_element_by_xpath("//a[@class='filter_link'][contains(text(),'tizer_autotest_group')]").click();
        Thread.sleep(300);
        find_value_after_click = self.driver.find_element_by_xpath(("/html/body/div[1]/div[3]/div[2]/div/div[5]/div[2]/div/table/tbody/tr/td[9]")).text.encode('utf-8')
        value_after_click = int(find_value_after_click);
        //check that value before click+1 == value after click
        assertEqual(value_after_click, value_before_click);*/
    }
}