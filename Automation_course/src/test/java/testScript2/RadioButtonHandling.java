package testScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumBasics.Base;

public class RadioButtonHandling extends Base{
	public void radioButton()
	{
		//click();- To select radio button
		//isSelected(); - To check whether the radio button is selected or not
		//isDisplayed();- verify whether the button is displayed / visible
		//isEnabled :- To check whether the button is Clickable
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton = driver.findElement(By.xpath("//input[(@id='inlineRadio2' and  @name='inlineRadioOptions')]"));
		radiobutton.click();
		WebElement selectedvalue = driver.findElement(By.xpath("//button[@id='button-one']"));
		selectedvalue.click();	
	}
	
	public void isSelected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton = driver.findElement(By.xpath("//input[(@id='inlineRadio2' and  @name='inlineRadioOptions')]"));
		if(radiobutton.isSelected())
		{
			System.out.println("Radion button is already selected");
		}
		else
		{
			radiobutton.click();
		}
	}
	public void isEnabled() // finding out the count of buttons //
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		List<WebElement> buttonnumber = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total no of radio button :"+buttonnumber.size());
	}
	
	public void listSelectARadioButton() // Selecting a particular button from a group of button//
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		List<WebElement> buttonnumber = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement list :buttonnumber)
		{
			if(list.getAttribute("value").equals("Female"))
			{
				list.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		RadioButtonHandling radiobuttonhandling = new RadioButtonHandling();
		radiobuttonhandling.initializebrowser();
		//radiobuttonhandling.radioButton();
		//radiobuttonhandling.isSelected();
		radiobuttonhandling.isEnabled();
		radiobuttonhandling.listSelectARadioButton();
		
		

	}

}
