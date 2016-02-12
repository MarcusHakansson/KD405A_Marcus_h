package uppgiftB;

public class Cat extends Mamal {

	int numberOfLifes;

	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		super(latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;
	}

	public int getNumberOfLifes() {
		return numberOfLifes;
	}

	public void setNumberOfLifes(int i) {
		this.numberOfLifes = i;
		
	}

	/** Overrides the abstract method and sets name do the cat and how many lifes it has.*/
	@Override
	public String getInfo() {
		String AnimalInfo;
			AnimalInfo = "The cats latin name is: " + latinName + " and it nurses its babies for: "
			+ gestationTime + " days and have " + numberOfLifes + " lifes" ;
		return AnimalInfo;

	}

}
