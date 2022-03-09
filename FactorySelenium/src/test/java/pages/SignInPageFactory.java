package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPageFactory extends BasePage {

    @FindBy(xpath = "//input[@name='uid']")
    WebElement usernameText;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordText;

    public SignInPageFactory(){

        PageFactory.initElements(driver,this);

    }
    public void enterUserAndPass(String user,String pass) {
        usernameText.sendKeys(user);
        passwordText.sendKeys(pass);
    }
}
