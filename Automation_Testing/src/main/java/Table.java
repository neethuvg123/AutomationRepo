import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import testscript.Base;

public class Table extends Base {

	public static void main(String[] args) {
		Table table=new Table();
		table.browserInitialization();
		table.tab();
	}

	public void tab()
	
	{   driver.navigate().to("https://webdriveruniversity.com/Data-Table/index.html");
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='t01']//tr"));
		for(WebElement row:rows)
		{
			
			System.out.println(row.getText());
			
		}
	}
}
