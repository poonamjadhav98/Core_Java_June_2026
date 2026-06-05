package encapsulation;

public class EncapsulationDemo {

	private int age = 10;		//private variable
	private String name = "Poonam";
	private String subject;
	private double percentage;

	//getter method - read-only
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public double getPercentage() {
		return percentage;
	}

	//setter method - write only
	public void setAge(int age) {
		this.age=age;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
