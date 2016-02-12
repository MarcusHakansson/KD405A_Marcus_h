/** Extends the class Animal*/

package uppgiftB;

public abstract class Mamal extends Animal {
	protected int gestationTime;

	public Mamal (String latinName, int gestationTime){
		super(latinName);
		this.gestationTime = gestationTime;
	}

	public int getGestationTime() {
		return gestationTime;
	}
}
