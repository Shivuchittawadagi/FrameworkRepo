package Listeners;



import javax.xml.transform.Result;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Ilistenerclass.class})
public class Listenerscript
{
	@Test
	public void test1()
	{
		System.out.println("login" );
	}
	@Test
	public void test2()
	{
		System.out.println("logout");
		Assert.fail();
	}
}
