package encapsulation;


public class TestDemo {

	public static void main(String[] args) {

		EncapsulationDemo obj = new EncapsulationDemo();

		//age value
		//		int age = obj.getAge();
		//		System.out.println("Age = "+age);
		//		System.out.println("Name = "+obj.getName());

		//		obj.setAge(30);
		//		System.out.println("Age = "+obj.getAge());
		//		obj.setName("Ram");
		//		System.out.println("Student Name: "+obj.getName());
		//		obj.setSubject("Hindi");
		//		System.out.println("Subject = "+obj.getSubject());
		//		obj.setPercentage(80.10);
		//		System.out.println("Percentage = "+obj.getPercentage());

		System.out.println("----------------------------------------------------");

		//obj.age = 30;
		int actualEmpAge = 26;
		System.out.println("Actual Employee age: "+actualEmpAge);
		System.out.println("Valid Employee age: "+obj.getAge());
		checkEmpAge(obj.getAge(), actualEmpAge);
	}

	public static void checkEmpAge(int validAge, int actualEmpAge) {

		if(actualEmpAge > validAge) {
			System.out.println("Employee is valid for Job Profile.!");
		}
		else {
			System.out.println("Employee is not valid for Job Profile.!");
		}
	}

}


