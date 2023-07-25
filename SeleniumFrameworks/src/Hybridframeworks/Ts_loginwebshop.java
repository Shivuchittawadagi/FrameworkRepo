package Hybridframeworks;

import java.io.IOException;

import org.testng.annotations.Test;

public class Ts_loginwebshop extends Base_class
{
	@Test
	public void testscript() throws InterruptedException, IOException
	{
		Pomclass_webshop pmc=new Pomclass_webshop(driver);
		pmc.login_link().click();
		Thread.sleep(2000);
		pmc.email().sendKeys(ReadDatafromproperty.getdatafromproperty("UN"));
		Thread.sleep(2000);
		pmc.password().sendKeys(ReadDatafromproperty.getdatafromproperty("PWD"));
		Thread.sleep(2000);
		pmc.login_button().click();
		Thread.sleep(1500);
		pmc.Books().click();
		Thread.sleep(1500);
		pmc.jewel().click();
				
	}
}
