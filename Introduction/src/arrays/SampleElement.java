package arrays;

public class SampleElement {
	private int number;
	
	//constructor
	public SampleElement(int value){
		number = value;
	}

	public int getNumber(){
		return number;
	}
	
	//the number is stored as a field
	public void increase(){
		number++;
	}
}
