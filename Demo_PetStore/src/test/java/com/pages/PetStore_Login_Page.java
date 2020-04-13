package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PetStore_Login_Page {
	
	WebDriver driver;
	
	By signin=By.xpath("/html/body/div[1]/div[2]/div/a[2]");
	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("/html/body/div[1]/div[2]/div/a[2]");
	
	//constructor Method
	public PetStore_Login_Page(WebDriver driver) 
	{
		this.driver=driver;
	}
	 // url for launch the chrome
	public void url(String browser) {
		try 
		{
		 if (browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
			//To launch Firefox Browser
		 else if (browser.equalsIgnoreCase("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//To launch Chrome Browser
			
		} 
		catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
		
		
	}
	//using webdriver get visting the testing website
	public void LoginPage() 
	{
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		System.out.println(driver.getTitle());
		//to maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	//to login the petstore website 
	public void Logindetails1(String un, String pw) throws InterruptedException
	{
		driver.findElement(signin).click();
	    Thread.sleep(2000);
		driver.findElement(username).sendKeys(un); 
		// passing the vaild mail
		Thread.sleep(2000);
		driver.findElement(password).sendKeys(pw);
		// passing the vaild password
		Thread.sleep(2000);
		driver.findElement(login).click();
	}
	
	 //To take Screenshot of the company view sheet
	public void screenshot(String path) throws IOException, InterruptedException
		{
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src,new File(path));		
		}

	public void closeBrowser() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.close(); 
		// close the current tab
	}

}
		


