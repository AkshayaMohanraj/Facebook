package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver driver;

	public Loginpage(WebDriver driver2) {
		
	this.driver=driver2;
		
	PageFactory.initElements(driver, this);
	}

	public WebElement getEmailorphone() {
		return Emailorphone;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public  WebElement getCreateacc() {
		return createacc;
	}
	@FindBy(name = "email")
	private WebElement Emailorphone;
	

	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createacc;

}