package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class MouseActions extends Base{

	public static void main(String[] args) {
		 MouseActions action=new  MouseActions();
		 action.browserInitialization();
		 action.mouseActions();
	}
	
	
	
public void mouseActions()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	
	WebElement drag= driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	
	 WebElement drop= driver.findElement(By.xpath("//div[@id='mydropzone']"));

	 
	 Actions actions= new Actions(driver);
	 //actions.moveToElement(drag).perform();
	// actions.contextClick(drop).perform();
	 actions.dragAndDrop(drag, drop).perform();
	 
}
}
