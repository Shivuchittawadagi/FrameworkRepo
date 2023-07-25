package Hybridframeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Frameworkconstants
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1500);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
