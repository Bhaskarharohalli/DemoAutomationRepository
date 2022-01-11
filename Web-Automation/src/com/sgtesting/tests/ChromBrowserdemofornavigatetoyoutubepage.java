package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromBrowserdemofornavigatetoyoutubepage {
	
	private static WebDriver b=null;
	

	public static void main(String[] args) {
		
		//configuring the system properties of chrome driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		
		//initializing the chrome browser
		
		b=new ChromeDriver();
		
		//navigate through a perticular website
		try
		{
			
		
		b.get("https://www.youtube.com/watch?v=3XpRKrowbkg");
	
		Thread.sleep(5000);
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		// close the chrome browser
		
		b.close();
		
	
		

	}

}
