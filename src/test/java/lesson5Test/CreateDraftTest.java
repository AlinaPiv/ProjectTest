package lesson5Test;

import io.qameta.allure.Description;
import lesson3.DraftPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CreateDraftTest extends AbstractTest{

    @Test
    @DisplayName("Создание черновика записи")
    @Description("Создание черновика записи с главной страницы")
    void createDraftTest(){
        DraftPage draftMenu = new DraftPage(getWebDriver());
        draftMenu
                .clickbuttnblog()
                        .setTitleTxt("test")
                                .setText("test")
                                        .clickshareDraft()
                                                .clickdrafts();

        Assertions.assertEquals("https://www.livejournal.com/post/list",getWebDriver().getCurrentUrl());
    }


  /*  @Test
    void myActiontest() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com"));


        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.cssSelector(".s-header-item-post--long")))
                .pause(1000l).sendKeys(getDriver()
                        .findElement(By.cssSelector(".text-0-2-124")),"test")
                .pause(1000l).sendKeys(getDriver()
                        .findElement(By.xpath("//div[@id='editorWrapper']/div/div/div")),"test")
                .pause(1000l)

                .click(getDriver().findElement(By.linkText("Поделиться черновиком")))
                .click(getDriver().findElement(By.linkText("Черновики")))
                .build()
                .perform();

        Thread.sleep(1000);
        Assertions.assertTrue(getDriver().getTitle().contains("Черновики"));
    }*/

}
