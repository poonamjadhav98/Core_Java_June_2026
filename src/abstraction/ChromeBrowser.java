package abstraction;

import java.io.Serial;

public class ChromeBrowser extends Browser{

	
	void openBrowser() {
		
		System.out.println("Chrome Browser launched successfully..!");
	}
	
	void search(String search) {
		
		System.out.println("Searching Google in Chrome...!"+search);
	}
}
