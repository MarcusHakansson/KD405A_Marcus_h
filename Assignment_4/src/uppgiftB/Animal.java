/** ANIMALS IS A SUPERKLASS */
package uppgiftB;

public abstract class Animal {
	
	protected String latinName;
	protected String friendlyName;
	
	/**Constructors for the animals*/
	public Animal(String latinName) {
		this.latinName = latinName;
		
	}
	
	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	
	public String getLatinName() {
		return latinName;
	}

	public abstract String getInfo();

}
