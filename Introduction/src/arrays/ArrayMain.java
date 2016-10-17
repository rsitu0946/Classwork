package arrays;

public class ArrayMain {

	public static void main(String[] args) {
		//createFiftyArray();
		createRandomArray();
		System.out.println(Math.random());
	}

	//1
	private static void createFiftyArray(){
		String[] someNumbers = new String[50];
		populateArray(someNumbers);
	
	}
	
	private static void populateArray(String[] a) {
		//this loop instantiating the strings
		for(int index1 = 0; index1 < a.length; index1++){
			a[index1] = "value "+(index1+1);
			System.out.println(a[index1]);
		}
	}
	
	//2
	private static void createRandomArray(){
		String[] randomNumbers = new String[10];
		populateArrayRandomly(randomNumbers);
	}
	
	private static void populateArrayRandomly(String[] a){
		for (int index = 0; index < a.length; index++){
			//a[index] = Math.random();
			System.out.println(a[index]);
		}
	}
	
	//3
	
	//4
	private static void populateDeck(String[] a){
		String[] cardSuites = {"Hearts", "Clubs", "Spades", "Diamonds" };
		String[] cardValues = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
				+ "Ten", "Jack", "Queen", "King", "Ace"};
		String[] playingCards = new String[52];
		
		for(int index = 0; index < a.length; index++){
			for()
		}
	}
}
