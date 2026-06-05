package controlstatements;

public class ForSwitchDemo {
	
	public static void main(String[] args) {
		
		int age=20;
		
		for(int i=1; i<=100; i++) {
			
			if(age==i) {
				
				switch (i) {
				
				case 10:
					System.out.println("Value 10");
					break;
					
				case 20:
					System.out.println("Value 20");
					break;
					
				case 30:
					System.out.println("Value 30");
					break;
				}
				
			}

		}
	}

}
