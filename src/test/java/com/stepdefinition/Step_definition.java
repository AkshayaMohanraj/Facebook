package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.helper.File_Reader_Manager;
import com.pom.Pagemanager;
import com.testrunner.Facebook_Testrunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition extends Baseclass {
	
	public static WebDriver driver=Facebook_Testrunner.driver;
	  
	public static Pagemanager page=new Pagemanager(driver);
	
	
	
	@Given("^User is on Facebook Application$")
	public void user_is_on_Facebook_Application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url); 
	}

	@When("^User Enterr the UserName in \"([^\"]*)\" Field$")
	public void user_Enterr_the_UserName_in_Field(String username) throws Throwable {
	   
		sendkeys(page.getLog().getEmailorphone(), username);
	}

	@Then("^User Enter Password in \"([^\"]*)\" Field$")
	public void user_Enter_Password_in_Field(String password) throws Throwable {
	   
		sendkeys(page.getLog().getPassword(), password);
	}

	@When("^User Enter Create Account Button to Create New Account$")
	public void user_Enter_Create_Account_Button_to_Create_New_Account() throws Throwable {
	    
	    Actions(page.getLog().getCreateacc());
	}

	@When("^User select First Name in firstname Field$")
	public void user_select_First_Name_in_firstname_Field() throws Throwable {
	    
	    sendkeys(page.getAcc().getFirstname(), "vihana");
	}

	@When("^User Enter Last Name in lastname Field$")
	public void user_Enter_Last_Name_in_lastname_Field() throws Throwable {
	    
	    sendkeys(page.getAcc().getSurname(), "jithu");
	}

	@When("^User Enter new mobile No/mail Id in respective Field$")
	public void user_Enter_new_mobile_No_mail_Id_in_respective_Field() throws Throwable {
	    
	    sendkeys(page.getAcc().getMobileno(), "vihanajithu@gmail.com");
	}

	@When("^User Gentrated New Password in newpassword Field$")
	public void user_Gentrated_New_Password_in_newpassword_Field() throws Throwable {
	    
	    sendkeys(page.getAcc().getNewpassword(), "vihana@2022");
	}

	@When("^User Select Birth Date in day Field$")
	public void user_Select_Birth_Date_in_day_Field() throws Throwable {
	    
	    dropdown(page.getAcc().getDay(), "06");
	}

	@When("^User Enter Birth Month in month Field$")
	public void user_Enter_Birth_Month_in_month_Field() throws Throwable {
	    
	    dropdown(page.getAcc().getMonth(), "04");
	}

	@When("^User Choose Birth Year in year Field$")
	public void user_Choose_Birth_Year_in_year_Field() throws Throwable {
	    
	    dropdown(page.getAcc().getYear(), "2022");
	}


	@Then("^User Choose Gender Options in Respective Field$")
	public void user_Choose_Gender_Options_in_Respective_Field() throws Throwable {
	    
	   Actions(page.getAcc().getFemale());
	}

}