package TestNG_project;

import org.testng.annotations.Test;

public class InvocationCount_Priority 
  {
   @Test
   public void sony()
   {
	   System.out.println("jasaswini");
   }
   @Test(priority = 1,invocationCount = 2)
   public void raja()
   {
	   System.out.println("soumya");
   }
   @Test(invocationCount = 3,priority = 2)
   public void anil()
   {
	   System.out.println("Anil kumar");
   }
   @Test(priority = 1,invocationCount = 0)      // it is skip bcz invocation cout is 0.
   public void anjli()
   {
	   System.out.println("anjali");
   }
   @Test(invocationCount = -3,priority = 2)     // it is skip bcz invocation cout is -ve .
   public void priti()
   {
	   System.out.println("priti");
   }
   
}
