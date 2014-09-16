package ca.ualberta.cs.lonelytwitter;


public class NormalTweet extends Model {

	public NormalTweet(String text) {
		super(text);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getText();
	}

}
