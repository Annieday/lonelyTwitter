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

	public void testRemove() {
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
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
		tlm.addTweet(t1);
		assertEquals(tlm.getCount(), 1);
	}

}
