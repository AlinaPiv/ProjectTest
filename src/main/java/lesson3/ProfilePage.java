package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPage {

    public ProfilePage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='svgicon flaticon flaticon--userhead']")
    private WebElement usericon;

    @FindBy(xpath = "//*[@class='j-journal-nav-item j-header-nav-item j-header-nav-item-userinfo']")
    private WebElement userinfo;

    public ProfilePage clickusericon() {
        usericon.click();
        return this;
    }
    public ProfilePage clickuserinfo(){
        userinfo.click();
        return this;
    }


}
