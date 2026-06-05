package arrayconcept;

public class MultiDimensionalExample {

	public static void main(String[] args) {

		int arr[][] = new int[2][2];

		arr[0][0] = 10;
		arr[0][1] = 20; 
		arr[1][0] = 11;
		arr[1][1] = 21 ;

		//array length depends on row size
		System.out.println("Array Length: "+arr.length);   //2

		System.out.println(arr[0][1]);     //20

		//row
		for (int i = 0; i < arr.length; i++) {

			//column
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Value of index "+i+""+j+":"+arr[i][j]);
			}
		}

		System.out.println("********************************************");
		System.out.println("********************************************");
		//Using String array
		//row-column combination --> e.g. row-Poonam, column - Shivanya (1st row, 1st column)
		
		//[2][3]      ---> 2x3 array (2 Rows, 3 columns)
		
 		String[][] str = {{"a","b","c"}, {"d","e","f"}};

 		for(int i=0; i<str.length; i++) {
 			
 			//2 rows & 3 columns (so added str.length+1 in below for loop)
 			for(int j=0; j<str.length+1; j++) {
 				
 				System.out.println("Value of index "+i+""+j+": "+str[i][j]);
 				
 			}
 		}
	}

}
