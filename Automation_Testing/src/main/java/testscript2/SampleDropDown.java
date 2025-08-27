package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class SampleDropDown extends Base{

	public static void main(String[] args) {
		 SampleDropDown sample=new  SampleDropDown();
		 sample.browserInitialization();
		 sample.dropdown();
	}
public void dropdown()
{
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement drop1= driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	
	Select select=new Select(drop1);
	List<WebElement> options=select.getOptions();
	
	
	select.selectByVisibleText("C#");
	for(WebElement op:options)
	{
		System.out.println(op.getText());
	}
	
	
	List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement checkbox:checkboxs)
	{
		String value= checkbox.getAttribute("value");
		if(value.equals("option-2")||value.equals("option-4"))
		{
			checkbox.click();
		}
		if(value.equals("option-3"))
		{
			checkbox.click();
		}
	}
	
}
}
