package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class InputForm extends Base {

	public static void main(String[] args) {
	
		InputForm form=new InputForm();
		form.browserInitialization();
		form.inputForm();

	}

	public void inputForm()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement text= driver.findElement(By.id("single-input-field"));
		text.sendKeys("hello");
		
		WebElement showmsg= driver.findElement(By.xpath("//button[text()='Show Message']"));
		showmsg.click();
		
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("100");
		
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("300");
		
		WebElement total= driver.findElement(By.xpath("//button[text()='Get Total']"));
		total.click();
		
	}
	
}
