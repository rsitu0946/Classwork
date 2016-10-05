package chatbot;

public class RyanLike implements Topic {
	private boolean inLikeLoop;
	private String likeResponse;

	public void talk() {
		RyanMain.print("What are some things you like?");
		inLikeLoop = true;
		while (inLikeLoop) {
			likeResponse = RyanMain.getInput();
			int likePsn = RyanMain.findKeyword(likeResponse, "like", 0);
			if (likePsn >= 0) {
				String thingsLiked = likeResponse.substring(likePsn + 5);
				RyanMain.print("You are such an interesting person, because you like " + thingsLiked);
				if (RyanMain.findKeyword(thingsLiked, "school", 0) >= 0) {
					inLikeLoop = false;
					RyanMain.school.talk();
				}
				inLikeLoop = false;
				RyanMain.talkForever();
			} else {
				RyanMain.print("I don't understand you.");
			}
		}
	}

	public boolean isTriggered(String userInput) {
		if (RyanMain.findKeyword(userInput, "like", 0) >= 0) {
			return true;
		}
		return false;
	}
}
