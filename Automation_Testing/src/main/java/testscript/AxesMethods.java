package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxesMethods extends Base {

	public static void main(String[] args) {
	

	}
	
public void parent()
{
	WebElement button=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	
}

public void child()
{
	
	WebElement childs= driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	
}

public void followingSibling()
{
	WebElement sibling=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
}

public void following()
{
	WebElement follow_sibling=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));
	
}

public void precceding()
{
	WebElement precced=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
	
}

public void ancestor()
{
	WebElement ancest=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));
	
}

public void descendant()
{
	WebElement descent=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[2]"));
	
}

public void indexing()
{
	WebElement index=driver.findElement(By.xpath("(//div[@class='row'])[1]"));

	WebElement index1=driver.findElement(By.xpath("(//button[@id='button-one'])[1]"));	
			
}
}
