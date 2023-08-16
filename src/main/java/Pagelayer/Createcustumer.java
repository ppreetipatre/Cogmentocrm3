package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilclass;

public class Createcustumer extends Baseclass
{
	public static 	Utilclass ut;
	
	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contact;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	private WebElement create;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	public Createcustumer()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void custinfo(String Fname, String Lname)
	{
		 ut = new Utilclass();
		ut.click(contact);
		ut.click(create);
		ut.sendkeys(fname, Fname);
		ut.sendkeys(lname, Lname);
	}
	public void save() {
		ut.click(save);
	}
	
}
