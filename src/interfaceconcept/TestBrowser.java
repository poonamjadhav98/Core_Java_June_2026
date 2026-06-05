package interfaceconcept;

public class TestBrowser {
	
	public static void main(String[] args) {
		
		Browser browser = new EdgeBrowser();
		browser.open();
		browser.search("Google");
	}

}
