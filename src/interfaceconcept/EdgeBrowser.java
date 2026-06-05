package interfaceconcept;

public class EdgeBrowser implements Browser {

	public void open() {
		
		System.out.println("Open Edge Browser");
	}
	
	public void search(String search) {
		
		System.out.println("Searching "+search+" in Edge Browser");
	}
}
