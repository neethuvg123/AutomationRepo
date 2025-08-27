package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class ActionsClass extends Base {

	public static void main(String[] args) {
		
		ActionsClass actionclass=new ActionsClass();
		actionclass.browserInitialization();
		actionclass.action();
	}

	public void action()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement drag= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		WebElement drop= driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions actions=new Actions(driver);
	     // actions.dragAndDrop(drag, drop).perform();
		//actions.contextClick(drag).perform();
		//actions.moveToElement(drag).perform();
		actions.click(drag).perform();
}
}

