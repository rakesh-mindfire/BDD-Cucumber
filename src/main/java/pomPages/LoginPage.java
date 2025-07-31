package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //WebDriver driver;
    @FindBy(name="username")
    private WebElement userNameTextfield;
    @FindBy(name="password")
    private WebElement passWordTextfield;
    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void login(String userName,String password) throws InterruptedException {
        userNameTextfield.sendKeys(userName);
        passWordTextfield.sendKeys(password);
        loginButton.click();
        Thread.sleep(3000);

    }
}
