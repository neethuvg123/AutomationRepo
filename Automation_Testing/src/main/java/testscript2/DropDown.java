package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDown extends Base {

	public static void main(String[] args) {
		DropDown dropdown=new DropDown();
		dropdown.browserInitialization();
		dropdown.dropDownHandling();

	}

	public void dropDownHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		 
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Red");
		
		//select.selectByValue("Red");
		
		select.selectByIndex(1);
		
		
	}
}
