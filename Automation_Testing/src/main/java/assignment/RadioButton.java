package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButton extends Base {

	public static void main(String[] args) {
		RadioButton button=new RadioButton();
		button.browserInitialization();
		//button.radioButton();
		button.radioButtons();

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
	
	public void radioButtons()
	{
        driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement fbutton= driver.findElement(By.xpath("//input[@id='inlineRadio2' and @value='Female']"));
		
		if(fbutton.isSelected())
		{
			System.out.println("Female button already selected");
		}
		else
		{
			fbutton.click();
		}
		
		WebElement buton=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		buton.click();
		
		WebElement gender=driver.findElement(By.xpath("//input[@id='inlineRadio21' and @name='student-gender']"));
		
		if(gender.isSelected())
		{
			System.out.println("Gender button is already selected");
		}
		else
		{
			gender.click();
		}
		WebElement ageGroup=driver.findElement(By.xpath("//input[@id='inlineRadio23' and @value='19 to 44']"));
		if(ageGroup.isSelected())
		{
			System.out.println("Age group button is already selected");
		}
		else
		{
			ageGroup.click();
		}
		
		WebElement result=driver.findElement(By.xpath("//button[text()='Get Results']"));
		result.click();
	}
	
}
