package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{

	public static void main(String[] args) {
		Xpath xpath=new Xpath();
		
		xpath.browserInitialization();
		xpath.relativeXpath();
		xpath.text();
		xpath.contains();
		xpath.startsWith();
		}
	
	//tagname[@attribute='value']
	
public void relativeXpath()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	WebElement path=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement path1=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement path2=driver.findElement(By.xpath("//button[@id='button-two']"));
	WebElement path3=driver.findElement(By.xpath("//input[@id='check-box-one']"));
	WebElement path4=driver.findElement(By.xpath("//input[@value='Select All']"));
    WebElement path5=driver.findElement(By.xpath("//textarea[@class='form-control']"));
}


//tagname[text()='value']

public void text()
{
	WebElement text=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement text1=driver.findElement(By.xpath("//button[text()='Get First Selected']"));
	WebElement text2=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	WebElement text3=driver.findElement(By.xpath("//a[text()='Jquery Select2']"));
	WebElement text4=driver.findElement(By.xpath("//button[text()='Submit data']"));
}


//tagname[contains(@attribute,'value')]

public void contains()
{
	 WebElement contain=driver.findElement(By.xpath("//input[contains(@id,'-input-field')]"));
	 WebElement contain1=driver.findElement(By.xpath("//button[contains(@type,'sub')]"));
	 WebElement contain2=driver.findElement(By.xpath("//input[contains(@class,'form-control ')]"));
	 WebElement contain3=driver.findElement(By.xpath("//button[contains(@id,'normal-btn-danger')]"));
	 WebElement contains4=driver.findElement(By.xpath("/button[contains(@id,'save')]"));
			 
}

//tag[starts-with(@attribute,'value')]

public void startsWith()
{
	WebElement start=driver.findElement(By.xpath("//input[starts-with(@id,'single-input-fie')]"));
	WebElement starts1=driver.findElement(By.xpath("//button[starts-with(@id,'do')]"));
	WebElement sarts2=driver.findElement(By.xpath("//input[starts-with(@class,'form')]"));
	WebElement starts3=driver.findElement(By.xpath("//select[starts-with(@multiple,'multiple')]"));
	WebElement starts4=driver.findElement(By.xpath("//button[starts-with(@title,'Remove all')]"));
}

//tagname[@attribute='value' and @attribute='value']

public void and()
{
	WebElement an=driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
	WebElement an1=driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-success btn-block']"));
	WebElement an2=driver.findElement(By.xpath("//input[@type='text' and @id='value-a']"));
}

//tagname[@attribute='value' or @attribute='value']

public void or()
{
	WebElement o=driver.findElement(By.xpath("//input[@id='single-input-field' or @class='form-control'])"));
	WebElement o1=driver.findElement(By.xpath("//button[text()='Show Selected Value' or @id='button-one']"));
	WebElement o2=driver.findElement(By.xpath("//textarea[@id='description' or @rows='3']"));
	WebElement o3=driver.findElement(By.xpath("//select[@name='dtBasicExample_length'  or @aria-controls='dtBasicExample']"));
}
}
