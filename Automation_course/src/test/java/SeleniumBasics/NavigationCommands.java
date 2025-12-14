package SeleniumBasics;

public class NavigationCommands extends Base{
	public void navigationCommands()
	{
		
		driver.navigate().to("https://www.amazon.in/"); // navigate one page to another//
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.initializebrowser();
		navigationcommands.navigationCommands();
		// navigationcommands.closebrowser();
		

	}

}
