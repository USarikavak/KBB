package kbb.pages;

import kbb.testbase.BaseClass;
import kbb.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenuTitlesPage extends CommonMethods {


    @FindBy(xpath= "//*[@id=\"app\"]/header/div/nav/div[2]/a")
    public WebElement carValues;



    @FindBy(id = "password")
    public WebElement password;
// kkdghkdhf



    public MenuTitlesPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}