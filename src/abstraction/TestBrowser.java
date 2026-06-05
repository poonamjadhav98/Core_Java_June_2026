package abstraction;

public class TestBrowser {

	
	public static void main(String[] args) {
		
		Browser chromeBrowser = new ChromeBrowser();
		chromeBrowser.openBrowser();
		chromeBrowser.search("Google");
		
		Browser edgeBrowser = new EdgeBrowser();
		edgeBrowser.openBrowser();
		edgeBrowser.search("Google opened in Edge");
	}
}
