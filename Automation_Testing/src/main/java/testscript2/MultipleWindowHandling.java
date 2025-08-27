package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleWindowHandling extends Base{

	public static void main(String[] args) {
		
		MultipleWindowHandling multipleWindow=  new MultipleWindowHandling();
		multipleWindow.browserInitialization();
		multipleWindow.multipleWindowHandling();
		
	}
public void multipleWindowHandling()
{
	driver.navigate().to("https://webdriveruniversity.com/");
	WebElement cont=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	cont.click();
	
	WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	login.click();
	
	String parentID= driver.getWindowHandle();
	System.out.println(parentID);
	
	System.out.println("**********************************************************");
	
	Set<String> allWindows= driver.getWindowHandles();
	
	String title="";
	
	for(String id: allWindows)
	{       
		
		if(!id.equals(parentID))
		{
		System.out.println("Window Handle"+id);
		driver.switchTo().window(id);
		title= driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	   System.out.println("*********************************************************");
	
	}
	if(title.equals("WebDriver | Login Portal"))
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
		username.sendKeys("admin");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("123456");
		
		WebElement log=driver.findElement(By.xpath("//button[@id='login-button']"));
		
	     log.click();
	}
}
driver.switchTo().window(parentID);
}

}
