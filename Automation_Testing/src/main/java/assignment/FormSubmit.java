package assignment;

import java.net.FileNameMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class FormSubmit extends Base {

	public static void main(String[] args) {
		
		FormSubmit  submit=new FormSubmit ();
		submit.browserInitialization();
		submit.formSubmit();
		
	}

	public void formSubmit()
	{
		
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		
		WebElement fname=driver.findElement(By.xpath("//input[@id='validationCustom01' and @class='form-control']"));
		fname.sendKeys("Neethu");
		
		WebElement lname=driver.findElement(By.xpath("//input[@id='validationCustom02' and @class='form-control']"));
		lname.sendKeys("V G");
		
		WebElement username= driver.findElement(By.xpath("//input[@id='validationCustomUsername' and @class='form-control']"));
		username.sendKeys("neethuvg");
		
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03' and @class='form-control']"));
		city.sendKeys("Kottayam");
		
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04' and @class='form-control']"));
		state.sendKeys("Kerala");
		
		WebElement pin=driver.findElement(By.xpath("//input[@id='validationCustom05' and @class='form-control']"));
		pin.sendKeys("686122");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		checkbox.click();
		
		
		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit form']"));
		submit.click();
		
	
		
	}
}
