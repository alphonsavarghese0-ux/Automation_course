package SeleniumBasics;

public class BrowserCommands extends Base{
	public void browserCommands()
	{
		String title =driver.getTitle();
		System.out.println(title);// To get title of the current page//
		String url = driver.getCurrentUrl(); // Get the url of the current page//
		System.out.println(url);
		String pagesource =driver.getPageSource(); //get page source is a method that retrives the html source code the current web page//
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializebrowser();
		browsercommands.browserCommands();

	}

}
