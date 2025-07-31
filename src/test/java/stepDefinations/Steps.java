package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pomPages.AdminPage;
import pomPages.DashboardPage;
import pomPages.LoginPage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class Steps extends BaseClass  {
    //WebDriver driver;
//    LoginPage loginPage;
  //  DashboardPage dashboardPage;
  //  AdminPage adminPage;
    @Given("user is on login page")
    public void user_is_on_login_page() {
       /* driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
        dashboardPage=new DashboardPage(driver);
        adminPage=new AdminPage(driver);*/


    }

    @When("user entered the userName {string} and password {string} & click on login button")
    public void user_entered_the_user_name_and_password_click_on_login_button(String userName, String password) throws InterruptedException {
        loginPage.login(userName,password);
    }

    @Then("user is on Home page.")
    @Then("user should navigates to Home Page.")
    public void user_should_navigates_to_home_page() {
        dashboardPage.getDashboardPageTitle().isDisplayed();
    }
    @Then("Close the browser.")
    public void close_the_browser() {
//driver.quit();
    }
    @When("user click on Admin.")
    public void user_click_on_admin() {
       dashboardPage.getAdminMenuBar().click();
    }



    //Data table
    @Given("the following users exist:")
    public void the_following_users_exist(DataTable dataTable) {
        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        System.out.println("---------------------------------");
        System.out.println(list.size());
System.out.println(dataTable.cell(3,3));


        for (Map<String,String> user:list){
            System.out.println(user.get("username"));
            System.out.println(user.get("password"));
            System.out.println(user.get("email"));
            System.out.println(user.get("role"));
        }
    }
    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("the login should be successful")
    public void the_login_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
    }
}
