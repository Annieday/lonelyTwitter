package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;

	public TweetListModel() {
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void addTweet(LonelyTweetModel t) {
		// TODO Auto-generated method stub
		if (hasTweet(t)) {
			throw new IllegalArgumentException("Duplicate tweets");
		} else {
			tweets.add(t);
		}
	}

	public boolean hasTweet(LonelyTweetModel t) {
		boolean contains = false;
		// TODO Auto-generated method stub
		for (int i = 0; i < tweets.size(); i++) {
			if (tweets.get(i).equals(t)) {
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

	public ArrayList<LonelyTweetModel> getTweets() {
		ArrayList<LonelyTweetModel> orderedList = tweets;
		Collections.sort(orderedList, new Comparator<LonelyTweetModel>() {
			public int compare(LonelyTweetModel t1, LonelyTweetModel t2) {
				return t1.getTimestamp().compareTo(t2.getTimestamp());
			}
		});
		return orderedList;
		// TODO Auto-generated method stub
	}
}
