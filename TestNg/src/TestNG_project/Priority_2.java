package TestNG_project;

import org.testng.annotations.Test;

public class Priority_2 
{
     @Test(priority = -9)
     public void ipsita ()
     {
    	 System.out.println("ipsita");
     }
     @Test(priority = -32)
     public void harapriya()
     {
    	 System.out.println("harapriya");
     }
     @Test(priority = 0)
     public void anil()
     {
    	 System.out.println("anil");
     }
     @Test(priority = 3)
     public void soumya()
     {
    	 System.out.println("raja");
     }
}
