package Naukri;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LogIn {

	static WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest()
		{
		
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.getCurrentUrl();
	}
	
	@Test(priority=1)
	public void loign()
	{
		
			
//		driver.findElement(By.linkText("Login")).click();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.getCurrentUrl();
		driver.findElement(By.cssSelector("input[id='usernameField']")).click();
		driver.findElement(By.cssSelector("input[id='usernameField']")).clear();
		driver.findElement(By.cssSelector("input[id='usernameField']")).sendKeys("rashmiranjan.mohanty14@gmail.com");
		
		driver.findElement(By.cssSelector("input[id='passwordField']")).clear();
		driver.findElement(By.cssSelector("input[id='passwordField']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[5]/div/button")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
	}
	  
	  @Test
	  public void search() 
	  {	
		  System.out.println("search");
	  }
	  
	  @Test
	  public void open_browser()
	  {
		  System.out.println("open..");
	  }
	  

	  @Test
	  public void test1()
	  {
		  System.out.println("open..test1");
	  }
  
  @BeforeClass
  public void beforeClass() 
	  
	  {
		  System.out.println("after class");
	  }
  

  @AfterClass
  public void afterClass() 
  {
	  
  }

}
