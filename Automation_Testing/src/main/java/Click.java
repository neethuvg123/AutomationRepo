import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Click extends Base {

	public static void main(String[] args) {
		Click click=new Click();
		click.browserInitialization();
		click.webEle();
		click.mouse();

	}
public void webEle()
{
	driver.navigate().to("https://webdriveruniversity.com/Click-Buttons/index.html");
	
	WebElement cli= driver.findElement(By.xpath("//span[@id='button1']/p"));
	//cli.click();	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("argument[0].value='admin';", cli);
}


public void mouse()
{
	driver.navigate().to("https://webdriveruniversity.com/Click-Buttons/index.html");
	
	WebElement mou=driver.findElement(By.id("button3"));
	//mou.click();
	
	Actions action=new Actions(driver);
	action.clickAndHold(mou).perform();
	
}
}
