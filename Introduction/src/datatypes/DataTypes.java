package datatypes;

public class DataTypes {

	public static void main(String[] args) {
	/*1*/	System.out.println(5.0/2); //double divided by int
	/*2*/	System.out.println((double) 5/2); //casting
	/*3*/	System.out.println(5/2);
	/*4 The first two interpret the 5 as a double, whereas in 3, the 5
	  is merely an integer.	*/
	/*5*/	System.out.println(3+5.0/2+5*2);
	/*6*/	System.out.println(3.0+5/2+5*2);
	
	if(42 == 42.0) System.out.println("42 equals 42.0");
	
	 String ten = "10";
	 String two = "2";
	 if(ten.compareTo(two)>0)System.out.println("10 is greater than two.");
	 else System.out.println("10 is not greater than two.");
	}

}
