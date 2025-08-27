package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDown extends Base {

	public static void main(String[] args) {
		DropDown dropdown=new DropDown();
		dropdown.browserInitialization();
		//dropdown.dropDownHandling();
		dropdown.multiSelect();

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
	
	public void multiSelect()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
	
		WebElement drpdowns=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		
		Select select=new Select(drpdowns);
		
		List<WebElement>options=select.getOptions();
		System.out.println(options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		select.selectByVisibleText("Red");
		select.selectByVisibleText("Yellow");
	}
}
