package uppgiftB;

public class Dog extends Mamal {

	boolean stupid;

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}

	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		setFriendlyName(friendlyName);
		this.stupid = stupid;
	}

	public boolean isStupid() {
		return this.stupid;
	}

	/** Overrides the abstract method and sets name to the dog and checks if it is stupid, and if it has a friendly name */
	@Override
	public String getInfo() {
		String AnimalInfo;
		if (friendlyName == null) {

			if (isStupid() == true) {

				AnimalInfo = "The dog is wild and has no name: Latin name: " + latinName
						+ " and nurses its babies for: " + gestationTime + " days " + "and is stupid";
			} else {

				AnimalInfo = "The dog is wild and has no name: Latin name: " + latinName
						+ " and nurses its babies for: " + gestationTime + " days " + "and is not stupid ";
			}
		} else {

			if (isStupid() == true) {
				AnimalInfo = "The dog is named: " + friendlyName + " Latin name: " + latinName
						+ " and nurses its babies for: " + gestationTime + " days " + "and is stupid";
			} else {

				AnimalInfo = "The dog is named: " + friendlyName + " Latin name: " + latinName
						+ " and nurses its babies for: " + gestationTime + " days " + "and is not stupid ";
			}
		}
		return AnimalInfo;

	}

}
