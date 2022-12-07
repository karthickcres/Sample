package StepD;

import Base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sdefenation extends Baseclass   {
	
	@Given("To lunch the browser")
	public void to_lunch_the_browser() {
	  lunchbrowser();
	  lunchurl("https://www.facebook.com");
	  maxwindowmain();
	}

	@Then("to given the user id and password")
	public void to_given_the_user_id_and_password() {
		//driver.WebElements()
	   
	}

	@Then("press the login button")
	public void press_the_login_button() {
	    
	}

}
