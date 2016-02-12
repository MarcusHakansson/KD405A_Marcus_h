import java.util.ArrayList;
import java.util.Iterator;



public class bikeStore {
	
	/**Creates an arrayList */
	
	public static ArrayList<bike> bikeList = new ArrayList<bike>();
	
	/**Loops through the arrayList and fetches the different values */
	
	public String getAllBikes(){
		
	String returnString = "";
		
	for (int i = 0; i < bikeList.size(); i++) {
		returnString += ("Cykel nr " + (i + 1) + " har färgen: " + bikeList.get(i).getColor() + " storleken: " + bikeList.get(i).getSize() + " och kostar: " + bikeList.get(i).getPrice()+"\n");
	}
	return returnString; 
	}
	/** Method fort adding the bikes to the arrayList */
	public void addBike(String color, int size, int price) {
		bikeList.add(new bike(color, size, price));
	}

}