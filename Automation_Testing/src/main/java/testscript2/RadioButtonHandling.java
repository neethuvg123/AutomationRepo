package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButtonHandling extends Base {

	public static void main(String[] args) {
		
		RadioButtonHandling  radiobutton =new RadioButtonHandling ();
		radiobutton.browserInitialization();
		radiobutton.radioButton();

	}

	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		radiobutton.click();
		
	}
}
