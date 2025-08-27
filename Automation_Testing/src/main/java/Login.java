import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Login extends Base {

	public static void main(String[] args) {
		 Login lo=new  Login();
		 lo.browserInitialization();
lo.login();
	}
public void login()
{
	driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html?");
	
	
	WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
	username.sendKeys("admin");
	
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("123456");
	
	WebElement log=driver.findElement(By.xpath("//button[@id='login-button']"));
	
     log.click();
     
    // Alert alert= driver.switchTo().alert();
    // alert.accept();
}
}
