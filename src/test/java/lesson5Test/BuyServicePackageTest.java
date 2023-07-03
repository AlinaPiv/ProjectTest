package lesson5Test;

import io.qameta.allure.Description;
import lesson3.ShopPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuyServicePackageTest extends AbstractTest {


    @Test
    @DisplayName("Покупка пакета Профессиональный")
    @Description("Покупка  и подключение пакета Профессиональный")
    void shopProPackageTest(){
        ShopPage shopMenu = new ShopPage(getWebDriver());
        shopMenu
                .clickshop()
                .clickpropack();

        Assertions.assertEquals("https://www.livejournal.com/shop/profaccount.bml",getWebDriver().getCurrentUrl());
    }

}
