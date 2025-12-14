package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver; 
	 public void initializebrowser()// declaring interface  it globally// // webdriver--> interface chrome driver --> classpublic void initializebrowser()
{
	driver= new ChromeDriver(); // Used for launch Chrome//
	driver.get("https://selenium.qabible.in/"); // Used for launching the URL//
	driver.manage().window().maximize();
}
public void closebrowser()
{
	//driver.close(); // used to close current tab //
	driver.quit(); // used to close all tab //
}
	public static void main(String[] args) {
		Base base = new Base();
		base.initializebrowser();
		base.closebrowser();
	}

}
