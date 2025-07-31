package stepDefinations;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pomPages.AdminPage;
import pomPages.DashboardPage;
import pomPages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseClass{
    @Before(order = 1)
    public void beforeScenario(Scenario scenario) {
        System.out.println("Starting scenario: " + scenario.getName());

    }
    @Before(value ="@Web",order = 2)
    public void setUp() {
        initializeBrowser();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage=new LoginPage(driver);
        dashboardPage=new DashboardPage(driver);
        adminPage=new AdminPage(driver);
    }
    @After(value ="@Web",order = 1)
    public void tearDown() {
        closeBrowser();
    }

    @After(order = 2)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("❌ Scenario failed: " + scenario.getName());
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failure Screenshot");
            // Take screenshot or log extra info
        } else {
            System.out.println("✅ Scenario passed: " + scenario.getName());
        }
    }
}
