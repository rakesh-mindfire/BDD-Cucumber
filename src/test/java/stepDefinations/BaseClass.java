package stepDefinations;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pomPages.AdminPage;
import pomPages.DashboardPage;
import pomPages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseClass {
   public static WebDriver driver;
    public static  LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AdminPage adminPage;

    public void initializeBrowser() {
        System.out.println("🔧 Initializing browser...");
        driver = new FirefoxDriver(); // or use FirefoxDriver, EdgeDriver, etc.
        driver.manage().window().maximize();
    }
    public void closeBrowser() {
        System.out.println("🧹 Closing browser...");
        if (driver != null) {
            driver.quit();
        }
    }



}
