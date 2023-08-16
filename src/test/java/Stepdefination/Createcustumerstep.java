package Stepdefination;

import Pagelayer.Createcustumer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createcustumerstep {
	public static Createcustumer cr;
	@When("User enter personal information")
	public void user_enter_personal_information() {
		 cr = new Createcustumer();
		cr.custinfo("aa", "bb");
	}

	@Then("click on save button")
	public void click_on_save_button() {
	    cr.save();
	}
}
