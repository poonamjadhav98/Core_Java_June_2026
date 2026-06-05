package arrayconcept;

public class MaxValue {
	
	public static void main(String[] args) {
		
		int arr[] = {20, 40, 50, 60, 30, 10};
		
		int max = arr[0]; 
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {  
				
				max=arr[i];  
			}

		}
		System.out.println("Maximum value = "+max);
	}

}
