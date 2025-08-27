package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Frames extends Base {

	public static void main(String[] args) {
		
		Frames frames=new Frames();
		frames.browserInitialization();
		frames.framesHAndling();
	}

	public void framesHAndling()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		
		WebElement frames=driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(frames);
		
		WebElement image= driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		 image.click();
		 
		 
		 
	}
}
