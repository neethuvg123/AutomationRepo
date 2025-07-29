package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButton extends Base {

	public static void main(String[] args) {
		RadioButton button=new RadioButton();
		button.browserInitialization();
		button.radioButton();

	}

	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement fbutton= driver.findElement(By.xpath("//input[@id='inlineRadio2' and @value='Female']"));
		fbutton.click();
		
		WebElement buton=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		buton.click();
		
		WebElement gender=driver.findElement(By.xpath("//input[@id='inlineRadio21' and @name='student-gender']"));
		gender.click();
		
		WebElement ageGroup=driver.findElement(By.xpath("//input[@id='inlineRadio23' and @value='19 to 44']"));
		ageGroup.click();
		
		WebElement result=driver.findElement(By.xpath("//button[text()='Get Results']"));
		result.click();
	}
}
