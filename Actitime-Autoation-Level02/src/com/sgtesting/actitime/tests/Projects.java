package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Projects{
	
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
	public static void createProject(WebDriver oBrowser)
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("project2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"ext-gen50\"]/td[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"ext-gen123\"]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_newCustomerNameField\"]")).sendKeys("guru2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
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
	public static void modifyProject(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();		

			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(2000);
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
	public static void deleteProject(WebDriver oBrowser)
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[5]/a")).click();
			Thread.sleep(200);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(200);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[4]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
