package catGame;

import java.util.ArrayList;
import java.util.Iterator;

public class CatGarden {
	private ArrayList<Cat> allCats;
	private String name;

	public CatGarden(String name) {
		this.allCats = new ArrayList<Cat>();
		this.name = name;
	}

	public void addCat(Cat b) {
		if (allCats.size() < Constants.maxNumberOfCats) {
			this.allCats.add(b);
		}
	}

	public void killCat() {
		allCats.remove(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCats() {
		String s = this.name + "\n";
		for (Cat cat : allCats) {
			s = s + "Name: " + cat.getName() + " Age: " + cat.getAge() + "\n";
		}
		return s;
	}

}