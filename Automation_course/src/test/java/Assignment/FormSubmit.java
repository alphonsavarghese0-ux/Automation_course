package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FormSubmit
{

public WebDriver driver;
   public void initializebrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	public void closebrowser()
	{
		
		driver.quit();
	}
	
   public void browsing()
   {
	driver.navigate().to("https://selenium.qabible.in/form-submit.php"); 
   }
   public void firstName()
  {
	WebElement firstname= driver.findElement(By.id("validationCustom01"));                  
	firstname.sendKeys("Ammu");
    WebElement lastname = driver.findElement(By.id("validationCustom02"));
	lastname.sendKeys("sara");
	WebElement usename = driver.findElement(By.id("validationCustomUsername"));
	usename.sendKeys("abc@gmail.com");
	WebElement city =driver.findElement(By.id("validationCustom03"));
	city.sendKeys("Kottayam");
	WebElement state = driver.findElement(By.id("validationCustom04"));
	state.sendKeys("Kerala");
	WebElement zip =driver.findElement(By.id("validationCustom05"));
	zip.sendKeys("5678");
	WebElement checkbox = driver.findElement(By.id("invalidCheck"));
	checkbox.click();
	WebElement submit =driver.findElement(By.className("btn btn-primary"));
	submit.clear();
  }
  public static void main(String[] args) {
			FormSubmit formsubmit = new FormSubmit();
			formsubmit.initializebrowser();
			formsubmit.browsing();
			formsubmit.firstName();
		
			
		//formsubmit.closebrowser();
		}

	}


