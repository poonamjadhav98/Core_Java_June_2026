package interfaceconcept;

public class ChromeBrowser implements Browser{
	

	@Override
	public void open() {
	System.out.println("Open Chrome Browser");
	}

	@Override
	public void search(String search) {
	
		System.out.println("Searching "+search+" in Chrome Browser");
	}

}
