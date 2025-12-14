package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SeleniumBasics.Base;

public class DropDownHandling extends Base{
	public void dropDownSelectByValue()
	{
		//selectclass : for dropdown
		// tagname should be selected for selecting the class called select
		//standard dropdown : use tagname select
		//custom dropdown : no select tag
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select [@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByValue("Red");
	}
	public void SelectByVisibleText()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select [@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Yellow");
	}
	public void DropDownSelectByIndex()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select [@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
	}

	public static void main(String[] args) {
		DropDownHandling dropdownhandling = new DropDownHandling();
		dropdownhandling.initializebrowser();
		//dropdownhandling.dropDownSelectByValue();
		//dropdownhandling.SelectByVisibleText();
		dropdownhandling.DropDownSelectByIndex();
		

	}

}
