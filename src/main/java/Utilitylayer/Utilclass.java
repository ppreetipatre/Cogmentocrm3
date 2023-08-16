package Utilitylayer;

import org.openqa.selenium.WebElement;

import Baselayer.Baseclass;

public class Utilclass extends Baseclass
{

	public void sendkeys(WebElement wb,String value)
	{
		wb.sendKeys(value);
		
	}
	
	public void click(WebElement wb)
	{
		wb.click();
	}
	
	
	
	
	
	
	
	
	
	
}
