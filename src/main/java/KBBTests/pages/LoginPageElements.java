package KBBTests.pages;

import com.rcsa.testbase.BaseClass;
import com.rcsa.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageElements extends CommonMethods {


    @FindBy(id = "username")
    public WebElement username;


    @FindBy(id = "password")
    public WebElement password;
// kkdghkdhf



    public LoginPageElements() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}