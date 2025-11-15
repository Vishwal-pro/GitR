package TestNGEx;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGClass 
{
  @Test
  public void llreh() 
  {
	  System.out.println("I Am in test case");
  }
  
  @Test
  public void l() 
  {
	  System.out.println("I Am in test case");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("I Am in before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("I Am in after method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("I Am in before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("I Am in after class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("I Am in before test case");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("I Am in after test case");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("I Am in before suite case");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("I Am in after suite case");
  }
  
  @Test
  public void lh() 
  {
	  System.out.println("I Am in test case");
  }
}