package chatbot;

import java.util.Scanner;

public class RyanMain {

	static Scanner input; 
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	static Topic like;
	
	public static void main(String[] args) {
		createTopics();
		
		String s1 = "a";
		String s2 = "b";
		System.out.println(s1.compareTo(s2));
		
		promptName();
		talkForever();	
	}
	
	public static void promptName(){
		System.out.println("Hello, human! I am a board covered with semiconductors \n and other such electronic components. What is your name?");
		user = input.nextLine();
		System.out.println("Awesome! I will call you "+user+" until you "
				+ "terminate me.");
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			System.out.println("Greetings, "+user+" . How are you?");
			response = getInput();									
			if(findKeyword(response, "good", 0) >= 0){
				System.out.println("I'm so happy you're good. \n");
			}
			else if(findKeyword(response, "like", 0)) >= 0
			{
				
			}
			
			else if(findKeyword(response,"school",0) >= 0)
			{
				inLoop = false; //exit this loop
				school.talk();
			}
			else{
				System.out.println("I'm sorry, I don't understand you. \n");
			}
		}
	}
	
	public static int findKeyword(String searchString, String key, int startIndex) {
		//delete white space
		String phrase = searchString.trim();
		
		//set all letters to lowercase
		phrase=phrase.toLowerCase();
		key = key.toLowerCase();
		
//		System.out.println("The phrase is " +phrase);
//		System.out.println("The key is " +key);
		
		//find position of key
		int psn = phrase.indexOf(key);
//		System.out.println("The position found is "+psn);
		
		//keep looking for the word until you find the right context
		while(psn >= 0){
			String before = " ";
			String after = " ";
			
			//if the phrase does not end with this word 
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(),psn+key.length()+1).toLowerCase();
//				System.out.println("The character after "+key+"is "+after);
			}

			//if the phrase does not begin with this word
			if(psn >0){
					before = phrase.substring(psn-1,psn).toLowerCase();
//					System.out.println("The character before "+key +" is "+before);
			}
			
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
//				System.out.println(key+" was found at "+psn);
				if(noNegations(phrase,psn)){
					return psn;
				}
			}
			
			//in case the keyword was not found yet,
			//check the rest of the string
			psn = phrase.indexOf(key,psn+1);
//			System.out.println(key+" was not found. Checking "+psn);
		}
		
		return -1;
	}
	
	//"helper method" - a method that contributes 
	//functionality 
	//to another method. Helper methods are very common when you need to do the same thing repeatedly. They also help make methods more readable.
	//This method is private because it is only used by the method it is helping.
	
	private static boolean noNegations(String phrase, int index){
		//check for word "NO "; (3 characters (including space))
		//check to see if there is space for the word
		//"NO " to be in front of the index
		if(index - 3 >=0 && phrase.substring(index-3,index).equals("no ")){
			return false;
		}
		//check for "not "
		if(index - 4 >= 0 && phrase.substring(index-3,index).equals("not ")){
			return false;
		}
		//check for never
		if(index - 6 >=0 && phrase.substring(index-3,index).equals("never ")){
			return false;
		}
		//check for "n't"
		if(index - 4 >=0 && phrase.substring(index-3,index).equals("n't ")){
			return false;
		}
		return true;
	}
	
//	public static void promptInput() {
//		print("Try inputting a String!");
//		String userInput = input.nextLine();
//		print("You typed: "+userInput);
//	}
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void print (String s){ 
	//if you don't want to type System.out.println()
		String printString = "";
		int cutoff = 35;
		//check to see if there are words to add
		//in other words, is the length of s > 0
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are less 
			//than the cutoff, AND there are still
			//words to add, do the following loop
			while(currentLine.length() +
				nextWord.length() <= cutoff && 
				s.length() > 0){
				//add the next word to the line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length()-1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord+1); 
			}
			printString += currentLine = "\n";
		}
		
		System.out.println(printString);
	}

	public static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
		like = new RyanLike();
	}	
}
