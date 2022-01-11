package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1ForChrome {

	private static  WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		deleteuser();
		logout();
		closeApplication();

	}
	private static void launchbrowser()
	{


		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\Drivers\\chromedriver.exe");

			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()

	{
		try
		{
			oBrowser.navigate().to("http://localhost:83/login.do ");
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		

	private static void minimizeFlyOutWindow()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("// div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("bhaskar");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("h n");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']" )).sendKeys("bhaskar@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\'] ")).sendKeys("sampledemo");
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='h n,bhaskar']")).click();
		   Thread.sleep(3000);
		oBrowser.findElements(By.id("userDataLightBox_deleteBtn"));
		Thread.sleep(2000);
		
		Alert oAlert=oBrowser.switchTo().alert();
		//String strContent=oAlert.getText();
		//System.out.println(strContent);
		oAlert.accept();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		
		
}
