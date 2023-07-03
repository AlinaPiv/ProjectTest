package lesson5Test;

import io.qameta.allure.Description;
import lesson3.DraftPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DeleteDraftTest extends AbstractTest{

    @Test
    @DisplayName("Удаление черновика записи")
    @Description("Удаление черновика записи ")
    void delDraftTest(){
        DraftPage draftMenu = new DraftPage(getWebDriver());
        draftMenu
                .clickuserIcon()
                        .clickmanagePostList()
                                .clickdeleteBtn()
                                        .clickokBtn();

        Assertions.assertEquals("https://www.livejournal.com/post/list",getWebDriver().getCurrentUrl());
    }




  /* @Test
    void myActiontest() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com"));
        Assertions.assertTrue(getDriver().getTitle().contains("черновики"));

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.cssSelector(".s-header-item--user")))
                .pause(1000l).sendKeys(getDriver()
                        .findElement(By.cssSelector(".s-header-sub-list-item__link--postlist")))
                .pause(1000l)
                .click(getDriver().findElement(By.cssSelector(".action-0-2-150:nth-child(1)")))
                .pause(1000l)
                .click(getDriver().findElement(By.cssSelector(".backgroundBlue-0-2-124")))
                .build()
                .perform();

        Thread.sleep(1000);
    }*/

}
