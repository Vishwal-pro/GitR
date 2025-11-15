package TestNGEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestElements {
  @Test
  public void f() 
  {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().window().maximize();
	  
	  List<WebElement> e1 = dr.findElements(By.tagName("input"));
	  System.out.println("The no of textboxes are:" +e1.size());
	  
	  for(WebElement a:e1)
	  {
		  System.out.println(a);
	  }
  }
}