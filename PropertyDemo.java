package TestNGEx;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertyDemo {
  @Test
  public void f() throws IOException, InterruptedException 
  {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  Properties p = new Properties();
	  FileReader fr = new FileReader("D:\\TestNG\\TestNG\\src\\input.properties");
	  p.load(fr);
	  dr.get(p.getProperty("url"));
	  
	  dr.findElement(By.id("username")).sendKeys("student");
	  dr.findElement(By.id("password")).sendKeys("Password123");	
	  
	  dr.findElement(By.id("submit")).click();
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//*[@id=\'loop-container\']/div/article/div[2]/div/div/div/a")).click();
	  Thread.sleep(2000);
  }
}
