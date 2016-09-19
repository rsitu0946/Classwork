/**
 * 
 */
package introunit;

/**
 * @author Student6
 *This class is designed to contrast with the ProceduralExample.
 * It embodies and Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian", "programmer"); 
		//polymorphism - calling a senior a student
		
		Student jordan = new Student("Jordan");
		Student joseph = new Student("Joseph");
		((Student)jillian).talk();
		
		jordan.talk();
		joseph.talk();
	}

}
