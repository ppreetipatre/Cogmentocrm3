package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilclass;

public class Loginpage extends Baseclass
{
	public  Utilclass ut;
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginbtn;
	
	
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void logininfo(String Uname, String Pass)
	{
		 ut =new Utilclass();
		ut.sendkeys(username, Uname);
		ut.sendkeys(password, Pass);
		
	}
	
	public void loginbutton()
	{
		ut.click(loginbtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
