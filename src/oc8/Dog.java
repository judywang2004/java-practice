package oc8;

public class Dog extends Animal{
	private String breed;
	
//	Dog(String breed){
//		this.breed=breed;
//	}

	Dog(String name,String breed){
		super(name);
		this.breed=breed;
	}
	public String getBreed(){
		return breed;
	}

}
