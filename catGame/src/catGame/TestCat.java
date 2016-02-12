package catGame;

public class TestCat {

	/*TestClass for testing the Cat-class*/
	/* Eclipse chooses to run the file that is open here if it has a main class but it only runs one of them
	So if you press play here only this Main method will run not hte one in TestCAtGarden or the one in CatGardenGUI*/ 
	public static void main(String[] args) {
		System.out.println("Detta �r en test f�r Cat");
		System.out.println("**Start Test");
		Cat c = new Cat();
		Cat b = new Cat("bullen","basse");
		Cat a = new Cat("Brown","Missen");
		System.out.println("One cat: "+ c.getName()+" and one: "+ a.getName() + " and one " + b.getName());
		System.out.println("**End Test");
	}

}