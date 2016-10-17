package arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//This is how you time how quickly a computer processes.
		long startTime = System.currentTimeMillis();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has"
				+ " a number equal to "+sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in "
				+ (endTime-startTime)+ " milliseconds");	
		}
	
	private static void passByValueDemonstration(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		int ten = 10;
		increase(ten);
		System.out.println("Ten, increased is "+ten);
		
		//in this method, we pass the ELEMENT
		//(a variable) not the array, so
		//no change will be made
		System.out.println("Before "+someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After \"changeString\" method " +someStrings[99]);
		changeArray(someStrings);
		System.out.println("After \"changeArray\" method " +someStrings[99]);
		changeArrayElement(someStrings, 99);
		System.out.println("After \"changeArrayElement\" method " +someStrings[99]);
	}
	
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item "+(i+1);
	}

	private static void changeArray(String[] someStrings) {
		someStrings = new String[100];
		for(int i = 0; i < someStrings.length; i++){
			someStrings[i] = "new item "+(i+1);
		}
		
	}

	//this method does nothing, since local variables
	//are destroyed after the method is complete
	private static void increase(int x) {
		x = x + 1;	
	}

	private static void changeString(String s) {
		s = "This string has been changed!";
	}

	private static void printArray(String[] a) {
		//this loop prints the strings
		for(String s: a){
			System.out.println(s);
		}
	}

	private static void populateArray(String[] a) {
		//this loop instantiating the strings
		for(int index1 = 0; index1 < a.length; index1++){
			a[index1] = "value "+(index1+1);
		}
	}

	public static void arrayIntroMethod(){	//broken down into 2 methods
		//construct 3 integer arrays
				//these two methods do the same thing
				//primitive type arrays fill with ZEROES 0, 0.0, false ,
				int[] zeros1 = {0,0,0};
				int[] zeros2 = new int[3];
				//example
				boolean[] booleans = new boolean[3];
				//iterate {2 ways}
				//WHEN TO USE THIS FOR LOOP
				//	-the index of the data is important to reference
				//	-you need to customize how you iterate
					//(increase by 2, backwards, etc...)
				for(int index = 0; index < booleans.length; index++){
					System.out.println(index+") "+booleans[index]);
				}
				
				//SECOND METHOD: "FOR-EACH"
				//always goes in order, does not keep track of index
				//easier to type
				int index = 0;
				for(boolean b: booleans){
					System.out.println(""+b);
				}
							
				//these two constructors are different
				String[] strings1 = {"","",""};
				String[] strings2 = new String[3];
				
				//this loop instantiating the strings
				for(int index1 = 0; index1 < strings2.length; index1++){
					strings2[index1] = "value "+(index1+1);
				}
				
				//this loop prints the strings
				for(String s: strings2){
					System.out.println(s);
				}
		
	}

}
