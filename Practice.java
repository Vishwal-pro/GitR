package TestNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice {
  @Test
  
  @Parameters({"username","password"})
  
  public void f(String username,String password) throws InterruptedException 
  {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practice.expandtesting.com/login");
	  dr.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  WebElement we = dr.findElement(By.id("username"));
	  we.sendKeys(username);
	  Thread.sleep(2000);
	  
	  WebElement we1 = dr.findElement(By.id("password"));
	  we1.sendKeys(password);
	  Thread.sleep(2000);	  	
	  
	  WebElement we2 = dr.findElement(By.id("submit-login"));
	  we2.click();
	  Thread.sleep(2000);
  }
}