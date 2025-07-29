package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	public static void main(String[] args) {
	
		
	Locators locators=new Locators();
	locators.browserInitialization();
	
	locators.IDlocator();
	locators.nameLocator();
	locators.classNameLocator();
	locators.linkTextLocator();
	locators.partialLinkTextLocator();
	
	}
	
//syntax:- WebElement elementname=driver.findElement(By.Locator("locator value"));

	//ID Locator
	
	public void IDlocator() {
	
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	WebElement text=driver.findElement(By.id("single-input-field"));
	text.sendKeys("neethu");
	
	WebElement showmsg= driver.findElement(By.id("button-one"));
	showmsg.click();
	
	WebElement showmsg1 =driver.findElement(By.id("button-two"));
	showmsg1.click();
	
	WebElement menu=driver.findElement(By.id("autoclosable-btn-success"));
	
	WebElement menu1=driver.findElement(By.id("autoclosable-btn-info"));
	
	
}

	//Name Locator
	
public void nameLocator()
{
	WebElement name=driver.findElement(By.name("viewport"));
	
	WebElement name1= driver.findElement(By.name("description"));
	
	WebElement name2=driver.findElement(By.name("author"));
	
	WebElement name3= driver.findElement(By.name("keywords"));
	
	WebElement name4= driver.findElement(By.name("states[]"));
}

//class Locator

public void classNameLocator()
{
	WebElement clas =driver.findElement(By.className("header-top"));
	
	WebElement class1 =driver.findElement(By.className("form-control datepicker"));
	
	WebElement class2=driver.findElement(By.className("btn btn-success btn-block"));
	
	WebElement class3= driver.findElement(By.className("btn moveall btn-outline-secondary"));
	
	WebElement class4=driver.findElement(By.className("btn removeall btn-outline-secondary"));
}

//LinkText Locator

public void linkTextLocator()
{
	WebElement link= driver.findElement(By.linkText("Ajax Form Submit"));
	link.click();
	
	WebElement link1= driver.findElement(By.linkText("Radio Buttons Demo"));
	
	WebElement link2= driver.findElement(By.linkText("Table Data Download"));
	
	WebElement link3=driver.findElement(By.linkText("Input Form"));
	
	WebElement link4=driver.findElement(By.linkText("Jquery List Box"));
	
}

//PartialLink locator

public void partialLinkTextLocator()
{
	WebElement partial= driver.findElement(By.partialLinkText("Ajax"));
	
	WebElement partial1=driver.findElement(By.partialLinkText("Jquery List"));
	
	WebElement partial2=driver.findElement(By.partialLinkText("Radio Buttons"));
	
	WebElement partial3=driver.findElement(By.partialLinkText("Table Data"));
	
	WebElement partial4=driver.findElement(By.partialLinkText("Simple F"));
}
}
