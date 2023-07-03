package lesson5Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lesson3.MainMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractTest {

    @Test
    @DisplayName("Отображение названия")
    @Description("Тест ничего не делает, просто пример")
    @Severity(SeverityLevel.MINOR)
    void testTrue(){
        Assertions.assertTrue(true);
    }

    @Test
    void mainMenuNavigateTest(){
        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu
                .clickusericon();
        Assertions.assertEquals("https://alinapvr.livejournal.com/",getWebDriver().getCurrentUrl());
    }




}
