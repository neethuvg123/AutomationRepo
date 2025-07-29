package testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
 public WebDriver driver;
	
 public static void main(String[] args) {
		
		Base base=new Base();
		base.browserInitialization();
		
	}
public void browserInitialization()

{
    driver= new ChromeDriver();
	driver.get("https://selenium.qabible.in/");//opens the browser with the url
	driver.manage().window().maximize();// maximize the window
	
	
}
public void driverQuitAndClose()
{
	driver.close();// close the opened window
	//driver.quit();//close all the opened windows
}
}
