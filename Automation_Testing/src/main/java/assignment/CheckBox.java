package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBox extends Base {

	public static void main(String[] args) {
		
		CheckBox box=new CheckBox ();
		box.browserInitialization();
		//box.checkBox();
		//box.checkBox2();
		box.multiSelect();

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

public void multiSelect()
{
	
 driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	
  List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='check-box-list' and @type='checkbox']"));

  for(WebElement checkbox:checkboxes)
  {
	String ids=checkbox.getAttribute("id");
	if(ids.equals("check-box-one") || ids.equals("check-box-two"))
	{
		checkbox.click();
	}
}
}
}
