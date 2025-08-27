import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class SampleWindowsHandling extends Base {

	public static void main(String[] args) {
		
		SampleWindowsHandling window= new SampleWindowsHandling();
		window.browserInitialization();
		window.windowHandling();
	}
public void windowHandling()
{
	driver.navigate().to("https://webdriveruniversity.com/");
	
	
	
	WebElement alertbutton= driver.findElement(By.xpath("//h1[text()='POPUP & ALERTS']"));
	alertbutton.click();
	
	WebElement actionbutton=driver.findElement(By.xpath("//h1[text()='ACTIONS']"));
	actionbutton.click();
	
   Set<String> ids=	driver.getWindowHandles();

for(String id:ids)
{
	driver.switchTo().window(id);
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(id);
}

}
}
