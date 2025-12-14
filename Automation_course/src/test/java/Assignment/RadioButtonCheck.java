package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonCheck extends FormSubmit{
	public void isdisplayed()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement display = driver.findElement(By.xpath("//input[@name='inlineRadioOptions' and @id='inlineRadio1']"));
		if(display.isDisplayed())
		{
			System.out.println("Respective button is available for selection");
		}
		else
		{
			System.out.println("Respective button is not available");
		}
	}
	
	public void isEnabled()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement isenabled = driver.findElement(By.xpath("//input[@id='inlineRadio1' and @value='Male']"));
		if (isenabled.isDisplayed())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is not able to enable");
		}

	}
	
	public void buttonClick()
	{
		WebElement button = driver.findElement(By.xpath("//input[@name='inlineRadioOptions' and @id='inlineRadio1']"));
           if(button.isDisplayed() && button.isEnabled())
           {
        	   button.click();
        	   
           }
           else
           {
        	   System.out.println("Button is not available");
           }
	}

	public static void main(String[] args) {
		RadioButtonCheck radiobuttoncheck = new RadioButtonCheck();
		radiobuttoncheck.initializebrowser();
		radiobuttoncheck.isdisplayed();
		radiobuttoncheck.isEnabled();
		radiobuttoncheck.buttonClick();

	}

}
