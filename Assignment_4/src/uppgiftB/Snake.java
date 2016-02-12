package uppgiftB;

public class Snake extends Animal {

	boolean poisonus;
	
	public Snake(String friendlyName,String latinName,boolean poisonus) {
		super(latinName);
		setFriendlyName(friendlyName);
		this.poisonus = poisonus;
	}

	public boolean isPoisonus() {
		return poisonus;
	}
	/** Overrides the abstract method and sets name to the snake and checks if it is poisonus */
	@Override
	public String getInfo() {
		String AnimalInfo;
		if( isPoisonus() == false){
			
			AnimalInfo = "The snake is named: " + getFriendlyName() + " Latin name: " + getLatinName() + " and is poisonus: " + isPoisonus();
		}else{
			
			AnimalInfo = "The snake is named: " + getFriendlyName() + " Latin name: " + getLatinName() + " and is poisonus: " + isPoisonus();
		}
		return AnimalInfo;
		
		
	}
	


}
