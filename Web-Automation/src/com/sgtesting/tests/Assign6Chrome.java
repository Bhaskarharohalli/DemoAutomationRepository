package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6Chrome {

	private static WebDriver wb=null;

	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimizeflyoverwindow();
		createcustomer();
		createproject();
		moifiyproject();
		//deleteproject();
		//deletecustomer();
		//logout();
		//close();

	}
	private static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\Drivers\\chromedriver.exe");

		wb=new ChromeDriver();

	}

	private static void navigate()
	{
		try
		{
			wb.get("http://localhost:83/login.do");
			Thread.sleep(3000);
			wb.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeflyoverwindow()
	{
		wb.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	}

	private static void login()
	{
		try
		{
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void createcustomer()
	{
		try
		{
			wb.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("guru1");
			Thread.sleep(3000);
			wb.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createproject()
	{
		try
		{

			wb.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(5000);
			wb.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("project2");
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id=\"ext-gen50\"]/td[2]")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id=\"ext-gen123\"]")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id=\"projectPopup_newCustomerNameField\"]")).sendKeys("guru2");
			Thread.sleep(3000);
			wb.findElement(By.xpath("//span[text()='Create Project']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void moifiyproject()
	{
		try
		{
			wb.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();		

			wb.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void deleteproject()
	{
		try
		{

			wb.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[5]/a")).click();
			Thread.sleep(2500);
			wb.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2500);
			wb.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[4]/div[3]")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//div[text()='Delete']")).click();
			wb.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}

	private static void deletecustomer()
	{
		try
		{
			wb.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			wb.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2500);
			wb.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2500);
			wb.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2500);
			wb.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			wb.findElement(By.partialLinkText("Logout'")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{

			e.printStackTrace();
		}
	}

	private static void close()
	{
		wb.close();
	}


}
