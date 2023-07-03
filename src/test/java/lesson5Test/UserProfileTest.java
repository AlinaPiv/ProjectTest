package lesson5Test;

import io.qameta.allure.Description;
import lesson3.ProfilePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class UserProfileTest extends AbstractTest{

    @Test
    @DisplayName("Переход на страницу профиля")
    @Description("Переход на страницу профиля с главной страницы")
    void gotoProfileTest(){
        ProfilePage profileMenu = new ProfilePage(getWebDriver());
        profileMenu
                .clickusericon()
                        .clickuserinfo();

        Assertions.assertEquals("https://alinapvr.livejournal.com/profile",getWebDriver().getCurrentUrl());
    }


  /*  @Test
    void myActiontest() throws InterruptedException {
        new WebDriverWait(getWebDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com"));
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.xpath("//*[@class='svgicon flaticon flaticon--userhead']")))
                .pause(1000l)
                .click(getDriver().findElement(By.xpath("//*[@class='j-journal-nav-item j-header-nav-item j-header-nav-item-userinfo']")))
                .build()
                .perform();

        Thread.sleep(1000);
    } */

}
