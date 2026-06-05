package abstraction;

public class Honda extends Bike{

	@Override
	void run() {
		
		System.out.println("Start Honda Bike");
		
	}

	@Override
	int speed(int speed) {
		
		return speed;
	}

}
