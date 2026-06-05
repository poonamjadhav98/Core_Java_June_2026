package arrayconcept;

public class MinValue {
	
	public static void main(String[] args) {
		
		int array[] = {20, 40, 50, 10, 5, 4, 3, 2};
		
		int min=array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]<min) {
				
				min=array[i];
			}
		}
		System.out.println("Minimum value = "+min);
	}

}
