package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2ForChrome {
	
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		
		launch();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyuser();
		deleteUser();
		logout();
		closeApplication();
		
		

	}
	
	private static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		
		oBrowser=new ChromeDriver();
		
	}
	
	private static void navigate()
	{
		try
		{
		oBrowser.get("http://localhost:83/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
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
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("bhaskar");
			oBrowser.findElement(By.name("lastName")).sendKeys("h n");
			oBrowser.findElement(By.name("email")).sendKeys("hnbhaskar11@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String strContent=oAlert.getText();
			System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void  modifyuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			//oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			
		oBrowser.findElement(By.xpath("//span[text()='h n, bhaskar']")).click();
		oBrowser.findElement(By.xpath("userDataLightBox_firstNameField")).clear();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Boss");
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(3000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}


