package stepDefinations;

import io.cucumber.java.en.*;
public class AdminSteps extends BaseClass{


    ///Admin Step
    @Then("user should be navigates to Admin\\/user management page.")
    public void user_should_be_navigates_to_admin_user_management_page() {
        adminPage.verifyUserisInAdminPage();
    }
    @When("user entered a username {string} & click on search.")
    public void user_entered_a_username_click_on_search(String userName) {
        adminPage.searchAUser(userName);
    }
    @Then("list of user should display with Same userName.")
    public void list_of_user_should_display_with_same_user_name() {

    }

}
