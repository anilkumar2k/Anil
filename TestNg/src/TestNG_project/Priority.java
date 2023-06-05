package TestNG_project;

import org.testng.annotations.Test;

public class Priority
{
	@Test(priority = 3)
	public void ipsita()
	{
		System.out.println("ipsita");
	}
	@Test(priority = 1)
	public void soumya ()
	{
      System.out.println("soumya ranjan");
	}
	@Test(priority = 2)
	public void harapriya ()
	{
		System.out.println("Harapriya");
	}
	@Test
	public void anil()
	{
		System.out.println("anil");
		
	}
	@Test()
	public void anjali()
	{
		System.out.println("anjali");
	}
	
}
