package lesson5Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lesson3.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class AuthorizationTest extends AbstractTest {


    @Test
    @DisplayName("Отображение названия")
    @Description("Пример")
    @Severity(SeverityLevel.NORMAL)
    void testTrue(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Авторизация пользователя")
    @Description("Авторизация пользователя на сайте")
    void loginIn(){
       // MainMenu mainMenu = new MainMenu(getWebDriver());

        new LoginPage(getWebDriver())
                .setLogin("AlinaPvr")
                .setPassword("45RWt_%SDx")
                .loginIn();
        Assertions.assertTrue (getWebDriver().findElement(By.cssSelector(".s-header-item--user")).getText().equals("alinapvr"));


    }

}
