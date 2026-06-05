package abstraction;

public class StartsBikes {

	
	public static void main(String[] args) {
		
		Bike fzBike = new FZ();
		fzBike.run();
		int fzBikeSpeed = fzBike.speed(100);
		System.out.println("FZ Bike Speed = "+fzBikeSpeed);
		
		System.out.println("---------------------------------");
		Bike hondaBike = new Honda();
		hondaBike.run();
		int hondaBikeSpeed = hondaBike.speed(120);
		System.out.println("Honda Bike Speed = "+hondaBikeSpeed);

	}
}
