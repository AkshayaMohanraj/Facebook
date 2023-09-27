package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	public static WebDriver driver;


	public static WebDriver Browserlaunch(String drivername)
	{
		if(drivername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\Facebook\\Drive\\chromedriver.exe");
			 driver=new ChromeDriver();
			}
		else if(drivername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\home\\eclipse-workspace\\Adactin\\Drive\\geckodriver.exe");
			 driver=new ChromeDriver();
		}
		return driver;
	}
	public static void close()
	{
		driver.close();
	}
	public void quit()
	{
		driver.quit();
	}
	public void navigateto(String url)
	{
		driver.navigate().to(url);
	}
	public void navigateback()
	{
		driver.navigate().back();
	}
	public void navigateforward()
	{
		driver.navigate().forward();
	}
	public void navigaterefresh()
	{
		driver.navigate().refresh();
	}
	public void geturl(String url)
	{
		driver.get(url);
	}
	public void gettext(WebElement element)
	{
		element.getText();
	}
	public void getattribute(WebElement element,String value)
	{
		element.getAttribute(value);
	}
	public void getcurrenturl()
	{
		driver.getCurrentUrl();
	}
	public void gettitle()
	{
		driver.getTitle();
	}
	public void isenabled(WebElement element)
	{
		element.isEnabled();
	}
	public void isdisplayed(WebElement element)
	{
		element.isDisplayed();
	}
	public void isselected(WebElement element)
	{
		element.isSelected();
	}
	public void ismultiple(WebElement element)
	{
		Select s=new Select(element);
		s.isMultiple();
	}
	public void getoptions(WebElement element)
	{
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			options.get(i).getText();
		}
	}
	public void getallselectedopions(WebElement element)
	{
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(int i=0;i<allSelectedOptions.size();i++)
		{
			allSelectedOptions.get(i).getText();
		}
	}
	public void getfirstselected(WebElement element)
	{
		Select s=new Select(element);
		s.getFirstSelectedOption();
	}
	public void click()
	{
		Actions ac=new Actions(driver);
		ac.click().build().perform();
	}
	public void sendkeys(WebElement element,String value)
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(element, value).build().perform();
	}
	public void robot(WebElement element) throws AWTException
	{
		Actions ac=new Actions(driver);
		ac.click(element).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void alert()
	{
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public void iframes(WebElement element)
	{
		driver.switchTo().frame(element);
		driver.switchTo().defaultContent();
	}
	public void windowhandles(WebElement element)
	{
		String windowHandle = driver.getWindowHandle();
		element.click();
		String s=null;
		Set<String> windowHandles = driver.getWindowHandles();
		for (String a : windowHandles) 
		{
			if(a.equals(s))
			{
				element.click();
			}
			else if(a.equals(windowHandle))
			{
				s=a;
			}
		}
	}
	public void checkbox(WebElement element)
	{
		element.click();
	}
	public void implicitwait(int a, TimeUnit value)
	{
		driver.manage().timeouts().implicitlyWait(a, value);
	}
	public void explicitwait(WebElement Element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	public void Fluentwait()
	{
		Wait Wait =new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(20, TimeUnit.SECONDS).ignoring(Exception.class);
	}
	public void takescreenshot() throws IOException
	{
		TakesScreenshot take=(TakesScreenshot) driver;
		File screen = take.getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileUtils.copyDirectory(screen, destination);
	}
	public void Actions(WebElement Element)
	{
		Actions ac=new Actions(driver);
		ac.click().build().perform();
		ac.click(Element).build().perform();
		ac.doubleClick(Element).build().perform();
		ac.contextClick(Element).build().perform();
		ac.moveToElement(Element).build().perform();
		ac.clickAndHold(Element).build().perform();
		ac.dragAndDrop(Element, Element).build().perform();
		}
	public void scrollupanddown(WebElement Element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("Window.ScrollBy(0,-2000);", " ");
		js.executeScript("Window.ScrollBy(0, 1500);", " ");
		js.executeScript("arguments[0].click();", Element);
		js.executeScript("arguments[0].ScrollIntoView;", Element);
	}
	public void dropdown(WebElement Element,String Value)
	{
		Select s=new Select(Element);
		List<WebElement> options = s.getOptions();
		for (WebElement text : options) 
		{
			if(text.equals(Value))
			{
				s.selectByValue(Value);
			}
			else if(text.equals(Value))
			{
				s.selectByVisibleText(Value);
			}
		}
	}
	public void selectbyindex(WebElement Element,int a)
	{
		Select s=new Select(Element);
		s.selectByIndex(a);	
	}}
