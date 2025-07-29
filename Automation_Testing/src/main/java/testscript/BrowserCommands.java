package testscript;

public class BrowserCommands  extends Base {

	public static void main(String[] args) {
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.browserInitialization();
		browsercommands.browserCommands();
		//browsercommands.driverQuitAndClose();
		

	}
public void browserCommands()
{
	//String title =driver.getTitle();
	//System.out.println(title);
	
	//String url= driver.getCurrentUrl();
	//System.out.println(url);
	
	String page= driver.getPageSource();
	System.out.println(page);
}
}
