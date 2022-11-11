package org.setpdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.ForgottenPojo;
import org.pojo.LoginPojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	LoginPojo l;
	ForgottenPojo f;
	@When("user have to click forgotten password")
	public void user_have_to_click_forgotten_password() {
	    f = new ForgottenPojo();
	    WebElement forgotpass = f.getForgotpass();
	    elementClick(forgotpass);
	}

	@When("user have to enter invalid email")
	public void user_have_to_enter_invalid_email() {
	    WebElement emailBox = f.getEmailBox();
	    passvalue(emailBox, "greens@gmail.com");
	}

	@Then("user have to click search button")
	public void user_have_to_click_search_button() {
	    WebElement searchBtn = f.getSearchBtn();
	    elementClick(searchBtn);
	}
	
	//One Dimensional Map
	@When("user have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password(DataTable  d)  {
		//access data from 1D Map
		Map<String, String> m = d.asMap(String.class, String.class);
		//get the data from particular key
		String email = m.get("username");
		l = new LoginPojo();
		WebElement emailBox = l.getEmailBox();
		passvalue(emailBox, email);
		passvalue(l.getPassBox(), m.get("password1"));
	}
	
	//Two Dimensional Map
	@When("user have to enter valid username and invalid password")
	public void user_have_to_enter_valid_username_and_invalid_password(DataTable d) {
		//Access data from 2D Map
		List<Map<String, String>> list = d.asMaps();
		//get the row--->Map
		Map<String, String> map = list.get(2);
		//get the data from Map by passing key in get(key)
		String email = map.get("username");
		//String email = li.get(1).get(2);
		l = new LoginPojo();
		WebElement emailBox = l.getEmailBox();
		passvalue(emailBox,email);
		passvalue(l.getPassBox(), list.get(1).get("pass"));
	}

	@Then("user have to reach invalid login page")
	public void user_have_to_reach_invalid_login_page() {
		String url = currentUrl();
		System.out.println(url);
		if (url.contains("privacy_mutation_token")) {
			System.out.println("user in invalid login page");
		} else {
			System.out.println("user not in invalid login page");
		}
	}

	// Scenario outline
	@When("user have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String password) {
		l = new LoginPojo();
		WebElement emailBox = l.getEmailBox();
		passvalue(emailBox, email);
		passvalue(l.getPassBox(), password);
	}

	@Then("user have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		elementClick(l.getLoginFindAll());
		Thread.sleep(2000);
	}

	

}
