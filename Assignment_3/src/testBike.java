
import java.util.ArrayList;

public class testBike {

	private static ArrayList<bike> allBikes = new ArrayList<bike>();

	public static void main(String[] args) {

		int index = 1;

		//Enklare sätt att skapa en ArrayList än nedan!!
		
		allBikes.add(new bike("white", 9000, 23));
		allBikes.add(new bike("red", 2000, 10));
		allBikes.add(new bike("brööl", 5000, 28));
		allBikes.add(new bike("black", 6000, 25));
		allBikes.add(new bike("blue", 7000, 27));
		allBikes.add(new bike("red", 11000, 20));
		
		//Dåligt sätt att göra en ArrayList. Man behöver inte definiera nr för objekten i sin ArrayList. 
		
		bike bike6 = new bike("red", 11000, 20);
		allBikes.add(bike6);
		bike bike7 = new bike("blue", 23000, 130);
		allBikes.add(bike7);
		bike bike8 = new bike("yellow", 5600, 17);
		allBikes.add(bike8);
		bike bike9 = new bike("green", 30000, 18);
		allBikes.add(bike9);

		for (bike bikes : allBikes) {
			System.out.println("Bike " + (index++) + " is size: " + bikes.getPrice() + " color: " + bikes.getColor()
					+ " price: " + bikes.getSize() +" Kr");
		}

	}

}
