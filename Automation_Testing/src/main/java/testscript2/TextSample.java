package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TextSample extends Base {

	public static void main(String[] args) {
		
		TextSample textsample=new TextSample();
		textsample.browserInitialization();
		textsample.sample();

	}
public void sample()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement textfield=driver.findElement(By.id("single-input-field"));
	textfield.sendKeys("hello");
	
	WebElement button=driver.findElement(By.xpath("//button[text()='Show Message']"));
	button.click();
	
}
}
