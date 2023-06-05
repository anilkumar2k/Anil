package TestNG_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependesOnMethod
 {
   @Test
   public void login ()
   {
	 Assert.fail();                 // fail() use for fail the method.
	 System.out.println("login");
   }
   @Test(dependsOnMethods = "login")
   public void creatework()
   {
	   System.out.println("work created");
   }
   @Test(dependsOnMethods = "creatework")
   public void deleteWork()
   {
	   System.out.println("work deleted");
   }
 
  
 }

