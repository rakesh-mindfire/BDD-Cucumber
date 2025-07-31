package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

@FindBy(xpath = "//h6[text()='Dashboard']")
private WebElement DashboardPageTitle;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement AdminMenuBar;

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public WebElement getDashboardPageTitle() {
        return DashboardPageTitle;
    }

    public WebElement getAdminMenuBar() {
        return AdminMenuBar;
    }
}
