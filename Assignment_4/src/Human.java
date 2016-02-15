import java.util.ArrayList;

public class Human {

	private String name;
	private Dog dog;
	

	
	public Human(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public Dog buyDog(Dog dog1){
		this.dog = dog1;
		return dog;
	}
	
	public String getInfo(String info){
		if(dog == null){
		info = name + " Har ingen hund";
		
		}else{
			info = name + " köper en hund som heter: " + dog.getName();
		}
		return info;
		
	}

}
