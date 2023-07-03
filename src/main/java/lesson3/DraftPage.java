package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DraftPage extends AbstractPage {

    @FindBy(css = ".s-header-item--user")
    private WebElement userIcon;

    @FindBy(css = ".s-header-sub-list-item__link--postlist")
    private WebElement managePostList;

    @FindBy(css = ".action-0-2-150:nth-child(1)")
    private WebElement deleteBtn;

    @FindBy(css = ".backgroundBlue-0-2-124")
    private WebElement okBtn;



    @FindBy(linkText = "Поделиться черновиком")
    private WebElement shareDraft;

    @FindBy(linkText = "Черновики")
    private WebElement drafts;

    @FindBy(xpath = "//div[@id='editorWrapper']/div/div/div")
    private WebElement text;

    @FindBy(css = ".s-header-item-post--long")
    private WebElement napisatvblog;

    @FindBy(css = ".text-0-2-124")
    private WebElement titleTxt;

    public DraftPage(WebDriver driver) {
        super(driver);
    }

    public DraftPage clickbuttnblog() {
        napisatvblog.click();
        return this;
    }

    public DraftPage clicktitleTxt(){
        titleTxt.click();
        return this;
    }

    public DraftPage clicktext(){
        text.click();
        return this;
    }

    public DraftPage clickshareDraft(){
        shareDraft.click();
        return this;
    }

    public DraftPage clicknapisatvblog(){
        napisatvblog.click();
        return this;
    }

    public DraftPage clickuserIcon(){
        userIcon.click();
        return this;
    }

    public DraftPage clickmanagePostList(){
        managePostList.click();
        return this;
    }

    public DraftPage clickdeleteBtn(){
        deleteBtn.click();
        return this;
    }

    public DraftPage clickokBtn(){
        okBtn.click();
        return this;
    }

    public DraftPage clickdrafts(){
        drafts.click();
        return this;
    }

    public DraftPage setTitleTxt(String titleTxt){
        this.titleTxt.click();
        this.titleTxt.sendKeys(titleTxt);
        return this;
    }
    public DraftPage setText(String text){
        this.text.click();
        this.text.sendKeys(text);
        return this;
    }

}
