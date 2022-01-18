package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoproject {
	public static WebDriver oBrowser=null;
	
      
   public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		
		
		
		
	}
	
		public static void launchBrowser()
		{
			String path=null;
			try
			{
				path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				System.out.println(path);
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		
		public static void navigate()
		{
			try
			{
				oBrowser.navigate().to("http://localhost:83/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		
		public static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		public static void login()
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
		
		/**
		 * Created By:
		 * Created Date:
		 * Test case ID:
		 * Reviewed By:
		 * Reviewed Date:
		 * Parameters:
		 * Return Value:
		 * Purpose:
		 * Description:
		 */
		public static void logout()
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
		public static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		public static void createCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
				oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_nameField\"]")).sendKeys("anil");
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
				
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		

		/**
		 * Created By:
		 * Created Date:
		 * Test case ID:
		 * Reviewed By:
		 * Reviewed Date:
		 * Parameters:
		 * Return Value:
		 * Purpose:
		 * Description:
		 */
		public static void modifyCustomer()
		{
			try
	   	 {
	   	  
	   	  oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
	   	  Thread.sleep(5000);
	   	 oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click();
	   	 Thread.sleep(3000);
	   	  oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
	   
	   	  Thread.sleep(400);
	   	  
	   	 }catch(Exception e)
	   	 {
	   		 e.printStackTrace();
	   	 }
	   	 
		}

		/**
		 * Created By:
		 * Created Date:
		 * Test case ID:
		 * Reviewed By:
		 * Reviewed Date:
		 * Parameters:
		 * Return Value:
		 * Purpose:
		 * Description:
		 */
		public static void deleteCustomer()
		{

			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
				}
		
		
		public static void createProject()
		{
			try
			{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectNameField\"]")).click();
			oBrowser.findElement(By.xpath("projectPopup_projectNameField")).sendKeys("project1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]")).click();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		public static void modifyProject() {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[26]/div[2]/div")).click();
			
			
			
			
		}
		public static void deleteProject()
		
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
			
		}

	}

