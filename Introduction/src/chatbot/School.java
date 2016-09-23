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

}
