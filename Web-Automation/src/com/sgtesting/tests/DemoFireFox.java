package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {

	
	private static 	WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		 navigate();
		 closeapplication();

	}
	
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","E:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\Drivers\\geckodriver.exe" );
		    
			oBrowser=new FirefoxDriver();
			
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:83/login.do" );
				Thread.sleep(5000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
				
				
			private static void closeapplication()
			{
				try
				{
					oBrowser.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		
}
