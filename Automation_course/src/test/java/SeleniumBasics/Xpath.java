package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	public void relativeXpath()
	{
		// tagname[@attribute='value']
		
		WebElement relativexpath1 = driver.findElement(By.xpath("//input [@id='single-input-field']"));
		WebElement relativexpath2 = driver.findElement(By.xpath("//input [@id='value-a']"));
		
	}
	
	public void text()
	{
		//tagname[text()='value']
		
		WebElement text1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
	}
	
	public void contains()
	{
		//tagname[contains(@attribute,'value')]
		//tagname [contains(text(),'value')]
		
		WebElement contains1 = driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement contains2 = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		
	}
	
	public void startsWith()
	{
		//tagname[starts-with(@attribute,'value')]
		
		WebElement startswith1 = driver.findElement(By.xpath("//input[starts-with(@id,'single-in')]"));
		WebElement startswith2 = driver.findElement(By.xpath("//button [starts-with(@id,'button-t')]"));
	}
	public void and() 
	{
		//tagname[@attribute='value' and @attribute='value']
		
		WebElement and1 = driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
		WebElement and2 = driver.findElement(By.xpath("//button[@id='button-one' and contains(@class,'btn-primary')]"));
	}
	public void or()
	{
		//tagname[@attribute='value' or @attribute='value']
		WebElement or1 = driver.findElement(By.xpath("//button [@class='btn btn-primary' or @id='button-one']"));
		WebElement or2 = driver.findElement(By.xpath("//input[@class='form-control' or @id='value-b']"));
		
		
	}

	public static void main(String[] args) {


	}

}
