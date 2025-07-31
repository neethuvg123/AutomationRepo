package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDownButton extends Base{

	public static void main(String[] args) {
		DropDownButton dropdown=new DropDownButton();
		dropdown.browserInitialization();
		dropdown.dropDown();
				
	}
public void dropDown()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	
	WebElement button=driver.findElement(By.xpath("//select[@ id='single-input-field']"));
	
	Select select=new Select(button);
	
	//select.selectByIndex(3);
	
	//select.selectByValue("Yellow");
	
	select.selectByVisibleText("Green");
	
	
}
}
