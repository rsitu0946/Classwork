package introunit;

public class Senior extends Student {
	
	private String internship; //encapsulation (private vs public)

	public Senior(String name, String internship) {
		super(name);
		this.internship = internship;
	}

	public void talk(){ //inheriting the talk method
		super.talk();//call the super method
		System.out.println("... I am a senior!");
		System.out.println("I intern as a "+internship");
	}
}
