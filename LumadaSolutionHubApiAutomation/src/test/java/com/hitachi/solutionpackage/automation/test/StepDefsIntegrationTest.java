package com.hitachi.solutionpackage.automation.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import org.springframework.http.HttpStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsIntegrationTest extends SpringIntegrationTest {

    @When("^the client calls /baeldung$")
    public void the_client_issues_POST_hello() throws Throwable {
        executePost();
    }

    @Given("^the client calls /hello$")
    public void the_client_issues_GET_hello() throws Throwable {
        executeGet("http://localhost:8082/hello");
    }

    @When("^the client calls /version$")
    public void the_client_issues_GET_version() throws Throwable {
        executeGet("http://localhost:8082/version");
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        assertThat(latestResponse.getBody(), is(version));
    }
    
    @When("^User register solution package$")
    public void user_register_solution_package() throws Throwable {
        
    }

    @Then("^User receives status code of (\\d+)$")
    public void user_receives_status_code_of(int arg1) throws Throwable {
       
    }

    @Then("^User receives solution package \"([^\"]*)\"$")
    public void user_receives_solution_package(String arg1) throws Throwable {
       
    }

    @When("^User edit solution package \"([^\"]*)\"$")
    public void user_edit_solution_package(String arg1) throws Throwable {
        
    }

    @When("^User delete solution package \"([^\"]*)\"$")
    public void user_delete_solution_package(String arg1) throws Throwable {
        
    }

    @Then("^User verify success message \"([^\"]*)\"$")
    public void user_verify_success_message(String arg1) throws Throwable {
       
    }
}