package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base {

	public static void main(String[] args) {
	
		TableHandling tableHandling=new TableHandling();
		tableHandling.browserInitialization();
		//tableHandling.tablePrinting();
		//tableHandling.rowPrinting();
		tableHandling.cellPrinting();

	}

	public void tablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		
		System.out.println(table.getText());
	}
	
	public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement tablerow= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]"));
		System.out.println(tablerow.getText());
	}
	
	public void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement tablecell= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[2]"));
		System.out.println(tablecell.getText());
		
	}
}
