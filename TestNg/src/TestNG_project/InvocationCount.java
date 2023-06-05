package TestNG_project;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount = 2)
	public void sipra()
	{
		System.out.println("sipra mishra");
	}
	@Test(invocationCount = 3)
	public void raja()
	{
		System.out.println("raja");
	}
	@Test(invocationCount = 4)
	public void anil()
	{
		System.out.println("anil");
		
	}
	@Test(invocationCount = 0)            //skip the method bcz here invocation count is 0 . 
	public void sony() 
	{
		System.out.println("jasaswini");
	}
}
