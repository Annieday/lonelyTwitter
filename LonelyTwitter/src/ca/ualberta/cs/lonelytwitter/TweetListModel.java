package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;

	public TweetListModel() {
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void addTweet(LonelyTweetModel t) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		try {
			if (!hasTweet(t))
				tweets.add(t);
		} catch (IllegalArgumentException e) {
			System.out.println("Duplicate tweets");
		}
	}

	public boolean hasTweet(LonelyTweetModel t) {
		boolean contains = false;
		// TODO Auto-generated method stub
		for (int i = 0; i < tweets.size(); i++) {
			if (tweets.get(i).getText().trim().equals(t.getText().trim())) {
				contains = true;
				break;
			}
		}
		return contains;
	}

	public boolean containsTweet(LonelyTweetModel t) {
		return tweets.contains(t);
	}

	public void removeTweet(LonelyTweetModel t) {
		tweets.remove(t);
	}

	public int getCount() {
		return tweets.size();

	}
}
