package lesson5Test;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class ScrollTest extends AbstractTest {

    @Test
    @DisplayName("Скролл страницы")
    @Description("Скролл страницы профиля")
    void jsTest() throws InterruptedException {

        getWebDriver().findElement(By.cssSelector(".flaticon--userhead > use")).click();
        Assertions.assertTrue(getWebDriver().getTitle().contains("Профиль"));
       JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
        jsExecutor.executeScript("window.scrollBy(0,209)");

        Thread.sleep(1000);
      //  getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

    }

}
