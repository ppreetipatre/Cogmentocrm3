package Baselayer;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.time.Duration;
//import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass

{
	public static Properties pr;
	public static WebDriver driver;

	public Baseclass() 
	{
	
	 pr = new Properties();
	String path= System.getProperty("user.dir")+"\\src\\main\\java\\Configlayer\\config.properties";
	
	
	try {
		FileInputStream fis = new FileInputStream(path);
		System.out.println("file");
		
			pr.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static  void initialization()
	{
		 driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.get(pr.getProperty("url"));
		
	}
	
	
	}

