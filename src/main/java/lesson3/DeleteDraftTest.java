package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DeleteDraftTest {

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


        WebElement webElement11 = driver.findElement(By.cssSelector(".s-header-item--user"));

        webElement11.click();
        WebElement webElement22 = driver.findElement(By.cssSelector(".s-header-sub-list-item__link--postlist"));
        webElement22.click();
        WebElement webElement33 = driver.findElement(By.cssSelector(".action-0-2-150:nth-child(1)"));
        webElement33.click();
        WebElement webElement44 = driver.findElement(By.cssSelector(".backgroundBlue-0-2-124"));
        webElement44.click();


        try {
            driver.findElement(By.cssSelector(".s-header-item--user"));
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getSupportUrl());
        }

        driver.close();
    }
}
