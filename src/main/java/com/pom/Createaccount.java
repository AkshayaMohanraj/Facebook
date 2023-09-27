package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccount {
	
	public WebDriver driver;
	
	public Createaccount(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSurname() {
		return Surname;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getCreateacc() {
		return createacc;
	}
	
	@FindBy(name  = "firstname")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement Surname;
	
	@FindBy(name =  "reg_email__")
	private WebElement mobileno;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newpassword;
	
	@FindBy(name = "birthday_day")
	private WebElement day;
	
	@FindBy(name = "birthday_month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(name = "login")
	private WebElement female;
	
	@FindBy(xpath = "// input[@type='radio'][1]")
	private WebElement createacc;
	

}