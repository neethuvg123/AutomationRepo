package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBox extends Base {

	public static void main(String[] args) {
		
		CheckBox box=new CheckBox ();
		box.browserInitialization();
		//box.checkBox();
		box.checkBox2();

	}
public void checkBox()
{
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	
	WebElement checkbox= driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkbox.click();
}

public void checkBox2()
{
driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	
	WebElement checkbox= driver.findElement(By.xpath("//input[@id='gridCheck']"));
	if(checkbox.isSelected())
	{
		System.out.println("ceckbox is already selected");
	}
	else
	{
		checkbox.click();
	}
}
}
