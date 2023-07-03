package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class UserProfileTest {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");


        WebElement webElement11 = driver.findElement(By.xpath(".//*[@class= 'svgicon flaticon flaticon--userhead']"));
        webElement11.click();
        WebElement webElement22 = driver.findElement(By.xpath(".//*[@class= 'j-journal-nav-item j-header-nav-item j-header-nav-item-userinfo']"));
        webElement22.click();


        driver.close();
    }

}
