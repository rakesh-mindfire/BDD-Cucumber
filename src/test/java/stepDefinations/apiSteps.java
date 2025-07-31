package stepDefinations;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasKey;


//import static io.restassured.RestAssured.*;

public class apiSteps {
    Response response;
    RequestSpecification requestSpecification;
   // String requestBody;

    // static RestAssured restAssured;
    @Given("the API base URL is {string}")
    public void the_api_base_url_is(String URI) {

        requestSpecification = given().baseUri(URI).header("x-api-key","reqres-free-v1");
    }
    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String pathParam) {
        response = requestSpecification.when().get(pathParam);
    }
    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer StatusCode) {
        response.then().log().all().assertThat().statusCode(StatusCode);

    }
    @Then("the response should contain {string} with value {string}")
    public void the_response_should_contain_with_value(String Key, String value) {
 response.then().body(Key, equalTo(Integer.parseInt(value)));


    }
    @Given("the request body is:")
    public void the_request_body_is(String body) {
        //requestBody=body;
        requestSpecification=requestSpecification.given().body(body).contentType(ContentType.JSON).log().all();
    }
    @When("I send a POST request to {string}")
    public void i_send_a_post_request_to(String PathParam) {
        response = requestSpecification.when().post(PathParam);
    }
    @Then("the response should contain {string}")
    public void the_response_should_contain(String key) {
        response.then().body("$", hasKey(key));

    }

}
