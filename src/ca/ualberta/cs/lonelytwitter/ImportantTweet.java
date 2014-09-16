package ca.ualberta.cs.lonelytwitter;


public class ImportantTweet extends Model {

	public ImportantTweet(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Important! " + super.getText();
	}

}
