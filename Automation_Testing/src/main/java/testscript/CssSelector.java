package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{

	public static void main(String[] args) {
		
		CssSelector selector=new CssSelector();
		
		selector.browserInitialization();
		selector.tagAndID();
		selector.tagAndClass();
		selector.tagAndAttribute();
		selector.tagClassAndAttribute();
	}
	
	
	
	//syntax : tag#id
public void tagAndID()
{
	WebElement text=driver.findElement(By.cssSelector("input#single-input-field"));
	
	WebElement text2= driver.findElement(By.cssSelector("input#single-input-field2"));
	
	WebElement text3=driver.findElement(By.cssSelector("button#autoclosable-btn-success"));
	
	WebElement text4=driver.findElement(By.cssSelector("button#autoclosable-btn-warning"));
	
	WebElement text5=driver.findElement(By.cssSelector("button#downloadButton"));
}


// syntax : tag.classname
public void tagAndClass()
{
	WebElement text =driver.findElement(By.cssSelector("button.ui-button ui-corner-all ui-widget"));
	
	WebElement text2=driver.findElement(By.cssSelector("input.form-control datepicker"));
	
	WebElement text3=driver.findElement(By.cssSelector("span.select2-selection select2-selection--multiple"));
	
	WebElement text4=driver.findElement(By.cssSelector("input.form-control"));
	
}



//syntax : tag[attribute='value']
public void tagAndAttribute()
{
	WebElement text1= driver.findElement(By.cssSelector("input[id='single-input-field']"));
	
	WebElement text2=driver.findElement(By.cssSelector("select[name='dtBasicExample_length']"));
	
	WebElement text3=driver.findElement(By.cssSelector("input[type='search']"));
	
	WebElement text4=driver.findElement(By.cssSelector("button[title='Remove all']"));
	
	WebElement text5=driver.findElement(By.cssSelector("input[class='form-control datepicker']"));
}




//syntax :  tag.classname[attribute='value']
public void tagClassAndAttribute()
{
	WebElement text= driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
	
	WebElement text2 =driver.findElement(By.cssSelector("input.form-control[name='daterange']"));
	
	WebElement text3=driver.findElement(By.cssSelector("input.form-control[placeholder='Enter Value']"));
	
	WebElement text4 =driver.findElement(By.cssSelector("button.ui-button[id='downloadButton']"));
	
	WebElement text5=driver.findElement(By.cssSelector("input.form-control[id='from']"));
	
	}
}
