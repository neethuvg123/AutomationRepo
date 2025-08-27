import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class PopAlerts extends Base{

	public static void main(String[] args) {
		
		PopAlerts pos=new PopAlerts();
		pos.browserInitialization();
		//pos.popAlerts();
		pos.alerts();

	}
public void popAlerts()
{
	driver.navigate().to("https://webdriveruniversity.com/Actions/index.html#");
	WebElement drag=driver.findElement(By.xpath("//b[text()='DRAG ME TO MY TARGET!']"));
	//drag.click();
	
	WebElement dropElement=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	WebElement doubleclick= driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));
	
	Actions action=new Actions(driver);
	//action.dragAndDrop(drag, dropElement).perform();
	action.doubleClick().perform();
	
}


public void alerts()
{
	
	driver.navigate().to("https://webdriveruniversity.com/Popup-Alerts/index.html");
	//WebElement script= driver.findElement(By.xpath("//span[@id=\"button1\"]/p"));
	//script.click();
	
	WebElement box=driver.findElement(By.xpath("//span[@id='button4']/p"));
	box.click();
	
	Alert alert=driver.switchTo().alert();
	//alert.accept();
	alert.dismiss();
}
}
