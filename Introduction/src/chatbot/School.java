package chatbot;

public class School implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public School(){
		
	}
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			RyanMain.print("Tell me about school.");
			schoolResponse = RyanMain.getInput();
			if(schoolResponse.indexOf("stop")>= 0){
				inSchoolLoop = false;
				RyanMain.talkForever();
			}else{
				RyanMain.print("That's my favorite " 
				+ "part about school too.");				
			}
		}
	}

	public boolean isTriggered(String userInput){
//		String[] triggers = {"school", "class", "teacher"};
		//you could use a for loop
		//to iterate through an array
		if(RyanMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(RyanMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}

}
