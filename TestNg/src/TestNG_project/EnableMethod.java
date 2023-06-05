package TestNG_project;

import org.testng.annotations.Test;

public class EnableMethod 
{
	@Test
	public void anil()
	{
		System.out.println("Anil");
	}
	@Test(enabled = false)
	public void soumya()
	{
		System.out.println("soumya");
	}
}
