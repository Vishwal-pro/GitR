package TestNGEx;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBar {
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practice.expandtesting.com/login");
	  dr.manage().window().maximize();
	  JavascriptExecutor js = (JavascriptExecutor)dr;
	  js.executeScript("window.scrollBy(0,700)");	//scroll down
	  Thread.sleep(2000);
	  
	  WebElement we = dr.findElement(By.xpath("//a[@class='my-link']"));
	  js.executeScript("arguments[0].scrollIntoView(true)",we);
	  we.click();
	  //js.executeScript("window.scrollBy(700,-400)");	//scroll up
  }
}