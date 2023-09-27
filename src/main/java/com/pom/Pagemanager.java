package com.pom;

import org.openqa.selenium.WebDriver;

public class Pagemanager {
	
public WebDriver driver;
	
	private static Loginpage log;
	private static Createaccount acc;
	
	
	
	public Pagemanager(WebDriver driver2) {
		
		this.driver=driver2;
		
		
	}
	
	public Loginpage getLog() 
	{
		if(log==null)
		{
			log= new Loginpage (driver);
		}
		return log;
	}
	
	public  Createaccount getAcc() 
	{
		if(acc==null)
		{
			acc = new Createaccount(driver);
		}
		return acc;
	}
	

}