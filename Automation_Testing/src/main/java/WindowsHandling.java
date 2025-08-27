import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class WindowsHandling extends Base{

	public static void main(String[] args) {
		 WindowsHandling  window=new WindowsHandling ();
		 window.browserInitialization();
		 window.windowHandling();

	}

	public void windowHandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		
		String parentID= driver.getWindowHandle();
		System.out.println("parentID: "+parentID);
		
		
		WebElement pom=driver.findElement(By.xpath("//h1[text()='PAGE OBJECT MODEL']"));
		pom.click();
		
		WebElement dropdown=driver.findElement(By.xpath("//h1[text()='DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)']"));
		dropdown.click();
		
	   Set<String> ids=driver.getWindowHandles();
	
	for(String id :ids)
	{
		driver.switchTo().window(id);
		System.out.println(id);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("WebDriver | Page Object Model"))
		{
			driver.close();
		}
	}
	
	}
}
