package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cssselector extends Base
{
	//1.Tag and ID(tag#id)
	//2.Tag and class(tag.class)
	//3.Tag and Attribute(tag[attribute=value])
	//4.Tag,class and Attribute(tag.classname[attribute=value]

	public void tagAndID()
	{
		WebElement tagname=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagname2=driver.findElement(By.cssSelector("button#button-one"));
		WebElement tagname3=driver.findElement(By.cssSelector("input#value-a"));
		WebElement tagname4=driver.findElement(By.cssSelector("input#value-b"));
		WebElement tagname5=driver.findElement(By.cssSelector("button#button-two"));
	}
	
	public void tagAndClass()
	{
		WebElement tagandclass = driver.findElement(By.cssSelector("div.header-top"));
		WebElement tagandclass2 = driver.findElement(By.cssSelector("div.top-logo"));
		WebElement tagandclass3 = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement tagandclass4 = driver.findElement(By.cssSelector("button.navbar-toggler"));
		
	}
	
	public void tagAndAttribute()
		{
			WebElement tagandattribute1 = driver.findElement(By.cssSelector("input[id=single-input-field]"));
			WebElement tagandattribute2 = driver.findElement(By.cssSelector("input[class=form-control datepicker]"));
			WebElement tagandattribute3 = driver.findElement(By.cssSelector("input[id=value-a]"));
			WebElement tagandattribute4 = driver.findElement(By.cssSelector("input[id=value-b]"));
			WebElement tagandattribute5 = driver.findElement(By.cssSelector("button[id=button-one]"));
		}
	public void tagClassAndAttribute()
	{
           WebElement tagclsattribute1 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
           WebElement tagclsattribute2 = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
           WebElement tagclsattribute3 = driver.findElement(By.cssSelector("input.form-control[id='value-a']")); 
           WebElement tagclsattribute4 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field2']")); 

           
           
           
	}
	public static void main(String args[])
	{
		Cssselector cssselector = new Cssselector();
		cssselector.initializebrowser();
	}
}


