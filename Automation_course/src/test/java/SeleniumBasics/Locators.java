package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	//WebElement elementname=driver.findElement(By.Locator("locator value")); // declaring webelement
public void Id()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement inputfield= driver.findElement(By.id("single-input-field"));
		inputfield.sendKeys("HAI");
		
		WebElement showmessage= driver.findElement(By.id("button-one"));
		showmessage.click();
		
	}
public void twoId()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys("1");
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("2");
		
		WebElement gettotal= driver.findElement(By.id("button-two"));
		gettotal.click();	
		
	}
public void className()
{

	WebElement Enterdate= driver.findElement(By.className("form-control datepicker"));
	WebElement Enterdate2 = driver.findElement(By.className("form-control"));
	WebElement submitdata = driver.findElement(By.className("btn btn-success btn-block"));
	WebElement forwardarrow =driver.findElement(By.className("btn moveall btn-outline-secondary")); // List box //
	WebElement backwardarrow =driver.findElement(By.className("btn removeall btn-outline-secondary"));
		
}
public void name()
{
	
    WebElement name1 = driver.findElement(By.name("viewport"));	
    WebElement name2 = driver.findElement(By.name("description"));
    WebElement name3=  driver.findElement(By.name("author"));
    WebElement name4=  driver.findElement(By.name("keywords"));
	
}

public void linkText()
{
	WebElement linktext = driver.findElement(By.linkText("Checkbox Demo"));
	WebElement linktext2 = driver.findElement(By.linkText("Radio Buttons Demo"));
	WebElement linktext3 = driver.findElement(By.linkText("Select Input"));
	WebElement linktext4 = driver.findElement(By.linkText("Jquery Select2"));
	WebElement linktext5 = driver.findElement(By.linkText("Form Submit"));
	
}

public void partialLinkText()
{
	WebElement partiallinktext = driver.findElement(By.partialLinkText("Radio Buttons D"));
	WebElement partiallinktext2 = driver.findElement(By.partialLinkText("Checkbox D"));
	WebElement partiallinktext3 = driver.findElement(By.partialLinkText("Select I"));
	WebElement partiallinktext4 = driver.findElement(By.partialLinkText("Jquery Se"));
	WebElement partiallinktext5 = driver.findElement(By.partialLinkText("Form Su"));
}

public void tagName()
{
	
	List<WebElement> tagname = driver.findElements(By.tagName("a")); // to findout total count //
	
}
	public static void main(String[] args) 
	{
		Locators locators = new Locators();
		locators.initializebrowser();
		locators.Id();
		locators.twoId();

	}

}
