package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public Properties p;
	
	
	public Configuration_Reader() throws Exception
	{
		File f= new File("C:\\Users\\home\\eclipse-workspace\\Facebook\\src\\test\\java\\com\\helper\\Facebook.propertyfile");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);	
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;
		
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
	}
	

}
