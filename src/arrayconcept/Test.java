package arrayconcept;

public class Test {

	public void displayAgeValues(int age[]) {

		int ageLength = age.length;
		for (int i = 0; i < ageLength; i++) {
			System.out.println("value of index: "+i+" = "+age[i]);
		}
	}
	
	public static String[] getEmpNames() {
		
		String[] names = {"Poonam", "Shivanya", "Kanchan"};
		return names;
	}

	public static void main(String[] args) {
		//array declaration with initialization
		int age[] = {10, 1, 3, 4};

//		int age[] = new int[5];
//		age[0] = 1;
//		age[1] = 2;

		Test obj = new Test();
		obj.displayAgeValues(age);
		System.out.println("*****************************");
		System.out.println("*****************************");
		
		String[] name = getEmpNames();
		System.out.println("Length of String array = "+name.length);
		System.out.println("Name of index 1 = "+name[0]);
		
		//iterating String array using for-each loop
		System.out.println("Iterating String Array using for-each loop...!");
		for(String str:name) {
			
			System.out.println(str);
		}
	}

}
