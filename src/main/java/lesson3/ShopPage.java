package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends AbstractPage {

    public ShopPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Подключить пакет 'Профессиональный'")
    private WebElement propack;

    @FindBy(css = ".s-header-item-post--shop")
    private WebElement shop;

    public ShopPage clickpropack() {
        propack.click();
        return this;
    }
    public ShopPage clickshop(){
        shop.click();
        return this;
    }
}
