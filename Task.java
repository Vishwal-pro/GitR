package TestNGEx;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Task 
{
  
  @Test (priority = 1)
  public void Login() 
  {
	  System.out.println("I am in login test case");
  }
  
  @Test (priority = 2)
  public void Register() 
  {
	  System.out.println("I am in register test case");
  }
  
  @Test (priority = 3)
  public void Home() 
  {
	  System.out.println("I am in home test case");
  }
  
  @Test (priority = 4)
  public void LogOut() 
  {
	  throw new SkipException("We are working on it");
  }
}