package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPojo extends BaseClass {
	//Non-parameterized constructor
	public ForgottenPojo() {
		PageFactory.initElements(driver, this);
	}
	
	//private webelement
	@FindBy(xpath="//a[text()='Forgotten password']")
	private WebElement forgotpass;
	
	@FindBy(id="identify_email")
	private WebElement emailBox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchBtn;

	//getters--->access private webelement into another class
	
	public WebElement getForgotpass() {
		return forgotpass;
	}

	public WebElement getEmailBox() {
		return emailBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
