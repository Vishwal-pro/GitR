package TestNGEx;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Dataproviderclass {
  @Test(dataProvider = "dp")
  public void f(String n, String s) 
  {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dr.findElement(By.id("username")).sendKeys(n);
	  dr.findElement(By.id("password")).sendKeys(s);	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abcd", "xyyz" },
      new Object[] { "lmno", "bcmc" },
    };
  }
}