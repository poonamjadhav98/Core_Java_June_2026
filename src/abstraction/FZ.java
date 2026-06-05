package abstraction;

public class FZ extends Bike {

	@Override
	void run() {
		System.out.println("Start FZ Bike");
	}
	
	@Override
	int speed(int speed) {
		
		System.out.println("in FZ Class speed method");
		return speed;
	}

}
