package com.sgtesting.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign10ForChrome {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		loginadmin();
		createusers1();
		logoutadmin();
		loginUser1();
		createusers2();
		logoutUser1();
		loginUser2();
		createusers3();
		logoutUser2();
		loginUser3();
		logoutUser3();
		loginUser2_1();
		modifyUser3();
		logoutUser2();
		loginUserUpdated3();
		logoutUser3();
		loginUser1_1();
		modifyUser2();
		logoutUser1();
		loginUserUpdated2();
		logoutUser2();
		loginadmin();
		modifyUser1();
		logoutadmin();
		loginUserUpdated1();
		logoutUser1();
		loginUserUpdated2();
	}

	private static void LaunchBrowser() {
		try {
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(5000);
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate() {
		try {
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginadmin() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createusers1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Demo");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).sendKeys("abs@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abs");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logoutadmin() {
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
	}
	private static void loginUser1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createusers2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Demo");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).sendKeys("abs@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logoutUser1() {
		try {
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUser2() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createusers3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Demo");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("User3");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).sendKeys("abs@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("User3");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logoutUser2() {
		try {
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginUser3() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logoutUser3() {
		try {
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUser2_1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//span[text()='User3, Demo']")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUserUpdated3() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	private static void loginUser1_1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("abs");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyUser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//span[text()='User2, Demo']")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginUserUpdated2() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//span[text()='User1, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abc");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUserUpdated1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void DeleteUser3()
	{
		try {

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

