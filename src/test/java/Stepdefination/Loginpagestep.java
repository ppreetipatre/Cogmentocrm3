package Stepdefination;

import Baselayer.Baseclass;
import Pagelayer.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagestep extends Baseclass{
	 public static Loginpage lg;
	 
	@Given("user is on Login page")
	public void user_is_on_login_page() {
	  // Baseclass.initialization();
	   lg.initialization();
	}

	@When("user enter Loginname and password")
	public void user_enter_loginname_and_password() {
	  
	  String Uname= pr.getProperty("username");
	   String Pass= pr.getProperty("password");
	    lg = new Loginpage();
	   lg.logininfo(Uname, Pass);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	   lg.loginbutton();
	}

}
