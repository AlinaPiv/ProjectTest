package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AutorizationTest {

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


        WebElement loginBtn = driver.findElement(By.cssSelector(".s-header-item__link--login"));
        loginBtn.click();
        WebElement userNameArea = driver.findElement(By.xpath(".//input[@name='user']"));
        userNameArea.click();
        userNameArea.sendKeys("AlinaPvr");
        WebElement passwordArea = driver.findElement(By.xpath(".//input[@name='lj_loginwidget_password']"));
        passwordArea.click();
        passwordArea.sendKeys("45RWt_%SDx");
        WebElement loginButton = driver.findElement(By.name("action:login"));
        loginButton.click();

         driver.close();
    }
}


