package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxHandling extends FormSubmit{
 public void checkBoxClick()
 {
	 driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	 WebElement checkbox = driver.findElement(By.xpath("//input[@class='form-check-input'and @id='gridCheck']"));
	 checkbox.click();
 }
 
	public void isSelected()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement boxselect = driver.findElement(By.xpath("//input [@id='check-box-two']"));
		if(boxselect.isSelected())
		{
			System.out.println("Button selected");
		}
		else
		{
		  boxselect.click();
		}
	}
	public void isEnabled()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement boxenabled = driver.findElement(By.xpath("//input [@id='check-box-two']"));
        if (boxenabled.isEnabled())
        {
        	System.out.println("Check box enabled");
        }
        else
        {
        	System.out.println("Checkbox not enabled");
        }

	}
	//public void checkBoxList()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
        List<WebElement> numberlist = driver.findElements(By.xpath("//input[@type=checkbox']"));
        for(WebElement list :numberlist)
		{
        {
			if(list.getAttribute("id").equals("check-box-two"))
			{
				list.click();
				break;
			}
		}
		}
	}
	//
	public static void main(String[] args) {
		CheckBoxHandling checkboxhandling = new CheckBoxHandling();
		checkboxhandling.initializebrowser();
		checkboxhandling.checkBoxClick();
		checkboxhandling.isSelected();
		checkboxhandling.isEnabled();
		//checkboxhandling.checkBoxList();
		

	}

}
