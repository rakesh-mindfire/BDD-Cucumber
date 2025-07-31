package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    WebDriver driver;

@FindBy(xpath = "//h6[text()='User Management']")
private WebElement AdminUserManagementPageTitle;

    @FindBy(xpath = "//label[text()='Username']//parent::div//following-sibling::div//child::input")
    private WebElement userNametextField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SearchButton;


    public AdminPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void searchAUser(String userName){
        userNametextField.sendKeys(userName);
        SearchButton.click();
    }
    public void verifyUserisInAdminPage(){
        AdminUserManagementPageTitle.isDisplayed();
    }

}
