package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainMenu extends AbstractPage {

    @FindBy(css = ".s-header-item__link--login")
    private WebElement login;

     @FindBy(css = ".s-header-item--user")
    private WebElement userpic;

    @FindBy(css = ".s-header-sub-list-item__link--postlist")
    private WebElement postlist;

    @FindBy(xpath = "//*[@class='svgicon flaticon flaticon--userhead']")
    private WebElement usericon;

    @FindBy(css = ".s-header-item-post--long")
    private WebElement napisatvblog;

    @FindBy(css = ".s-header-item-post--shop")
    private WebElement shop;

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public MainMenu clicklogin(){
        login.click();
        return this;
    }

    public MainMenu clickuserpic(){
        userpic.click();
        return this;
    }

    public MainMenu clickpostlist(){
        postlist.click();
        return this;
    }

    public MainMenu clickusericon(){
        usericon.click();
        return this;
    }

    public MainMenu clicknapisatvblog(){
        napisatvblog.click();
        return this;
    }

    public MainMenu clickshop(){
        shop.click();
        return this;
    }

}
