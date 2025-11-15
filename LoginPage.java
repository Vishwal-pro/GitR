package TestNGEx;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginPage 
{
	WebDriver dr = new ChromeDriver();
	
  @Test
  public void f() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  WebElement we = dr.findElement(By.xpath("//input[@name='username']"));
	  we.sendKeys("Admin");
	  Thread.sleep(2000);
	  
	  WebElement we1 = dr.findElement(By.xpath("//input[@name='password']"));
	  we1.sendKeys("admin123");		
	  Thread.sleep(2000);
	  
	  WebElement we0 = dr.findElement(By.xpath("//button[@type='submit']"));
	  we0.click();	
  }
  @BeforeTest
  public void beforeTest() 
  {
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  dr.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  dr.close();
  }
}