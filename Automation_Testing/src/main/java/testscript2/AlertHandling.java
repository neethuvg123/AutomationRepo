package testscript2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base {

	public static void main(String[] args) {
		AlertHandling alert=new AlertHandling();
		alert.browserInitialization();
		//alert.simpleAlertHandle();
		//alert.confirmationAlert();
		alert.promptAlert();

	}
public void simpleAlertHandle()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement button= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	button.click();
	
	Alert alerts= driver.switchTo().alert();
	alerts.accept();
	
	
}

public void confirmationAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement buttonclick= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	buttonclick.click();
	
	Alert alerts =driver.switchTo().alert();
	//alerts.accept();
	alerts.dismiss();
	
}
public void promptAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement promptbutton= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	promptbutton.click();
	
	Alert alerts=driver.switchTo().alert();
	//alerts.sendKeys("hai");
	//alerts.accept();
	String msg=alerts.getText();
	System.out.println(msg);
	alerts.sendKeys("hai");
	alerts.accept();
}
}
