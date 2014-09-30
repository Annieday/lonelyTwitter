package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTest() {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testFiveIsFive() {
		assertEquals(5, 5);
	}

	public void testTweetListModel() {
		TweetListModel tlm = new TweetListModel();
	}

	public void testAdd() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t);
		assertTrue(tlm.containsTweet(t));
	}

	public void testGet() {
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hello1");
		LonelyTweetModel t3 = new LonelyTweetModel("Hello2");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t1);
		tlm.addTweet(t2);
		tlm.addTweet(t3);
		assertEquals(t1, tlm.getTweets().get(0));
	}

	public void testRemove() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t);
		assertTrue(tlm.containsTweet(t));
		tlm.removeTweet(t);
		assertFalse(tlm.containsTweet(t));
	}

	public void testCount() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel t1 = new LonelyTweetModel("Hello1");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t);
		tlm.addTweet(t1);
		assertEquals(tlm.getCount(), 2);
	}

	public void testAddDuplicate() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t);
		try {
			tlm.addTweet(t1);
		} catch (IllegalArgumentException e) {
			System.out.println("Duplicate tweets");
		}
		assertEquals(tlm.getCount(), 1);
	}

}
