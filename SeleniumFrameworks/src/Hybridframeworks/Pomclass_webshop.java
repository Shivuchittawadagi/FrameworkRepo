package Hybridframeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass_webshop 
{
	@FindBy(linkText = "Log in")
	private WebElement link_text;
	
	@FindBy(id = "Email")
	private WebElement mail_textfield;
	
	@FindBy(id = "Password")
	private WebElement pass_textfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[1]/a")
	private WebElement books;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[6]/a")
	private WebElement jewelry;
	
	public Pomclass_webshop(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement login_link()
	{
		return link_text;
	}
	public WebElement email()
	{
		return mail_textfield;
	}
	public WebElement password()
	{
		return pass_textfield;
	}
	public WebElement login_button()
	{
		return login_btn;
	}
	public WebElement Books() 
	{
		return books;
	}
	public WebElement jewel()
	{
		return jewelry;
	}
}
