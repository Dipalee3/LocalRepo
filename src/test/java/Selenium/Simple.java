package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	System.setProperty("webdriver.chrome.driver","C:\\Github\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //upcasting
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	
	driver.quit();

}
}
	



