package org.step;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	@Given("open the browser launch the url")
	public void open_the_browser_launch_the_url() {
		
		
	}

	@When("Enter Valid User Email and invalid password")
	public void enter_Valid_User_Email_and_invalid_password() {
	    
	}
	
	@When("Enter Invalid User Email and invalid password")
	public void enter_Invalid_User_Email_and_invalid_password(DataTable d) {
		
		
	Map<String, String> asMap = d.asMap(String.class, String.class);
	
	String email = asMap.get("userName");
	String pass = asMap.get("Password");
		
		  
	}

	@When("User click the Login button")
	public void user_click_the_Login_button() {
	   
	}

	@When("User get webpage title")
	public void user_get_webpage_title() {
	    
	}

	@When("User get current Url")
	public void user_get_current_Url() {
	   
	}

	@Then("User is an Invalid credential page")
	public void user_is_an_Invalid_credential_page() {
	    
	}


}
