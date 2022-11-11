package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	//Non-Parameterized constructor
	public LoginPojo() {
		PageFactory.initElements(driver, this);
		//this -- represent current class properties
	}
	
	//WebElement email = driver.findElement(By.id("email")));
	//Private WebElements 
	@CacheLookup
	@FindBy(id="email")
	private WebElement emailBox;
	
	@CacheLookup
	@FindBy(name="pass")
	private WebElement passBox;
	
	@CacheLookup
	@FindBy(id="u_0_5_ET")
	private WebElement loginBtn;
	
	@CacheLookup
	@FindBys({	//Acts like AND operator
		@FindBy(id="u_0_5_ET"),
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//button[text()='Log In']")
	})
	private WebElement loginFindBys;
	
	@CacheLookup
	@FindAll({	//Acts like OR operator
		@FindBy(id="u_0_5_ET"),
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//button[text()='Log In']")
	})
	private WebElement loginFindAll;

	//getters---to access private webelements into another class
	public WebElement getEmailBox() {
		return emailBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getLoginFindAll() {
		return loginFindAll;
	}
	
	
}
