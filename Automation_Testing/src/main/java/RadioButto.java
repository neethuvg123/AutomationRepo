import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButto extends Base{

	public static void main(String[] args) {
		
		RadioButto  but=new RadioButto ();
		but.browserInitialization();
		but.button();

}
	
	public void button()
	{
		
		
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> radios=driver.findElements(By.xpath("//input[@name='color']"));
	
	    for(WebElement radio:radios) {
	    	
	    	String val=radio.getAttribute("value");
	    	if(val.equals("orange"))
	    	{
	    		radio.click();
	    	}
	    	
	    }
	}
	
}