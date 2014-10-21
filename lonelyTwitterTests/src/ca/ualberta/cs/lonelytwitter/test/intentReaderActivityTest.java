package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.TextView;


public class intentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity >
{
	public intentReaderActivityTest(){
		super(IntentReaderActivity.class);
	}
	
	public void testSendText(){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY , "test string ");
		setActivityIntent(intent);
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("test string ", activity.getText());
		
	}
	public void testDoubleText(){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY , "test string ");
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.DOUBLE);
		setActivityIntent(intent);
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("test string test string ", activity.getText());
		
	}
	public void testREVERSEText(){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY , "test string");
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.REVERSE);
		setActivityIntent(intent);
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("gnirts tset", activity.getText());
		
	}
	
	
	
	public void testDisplayText(){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY , "test string");
		setActivityIntent(intent);
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		TextView widget = (TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		assertEquals("test string", widget.getText());
	}
	
	
	
	
	
	
	public void testDisplayTextDirection() throws Throwable{
		IntentReaderActivity activity =(IntentReaderActivity) getActivity();	
		TextView widget =(TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		runTestOnUiThread(new Runnable()
		{
		@Override
			public void run()
			{
				IntentReaderActivity activity =(IntentReaderActivity) getActivity();
				TextView widget =(TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
				// TODO Auto-generated method stub
						widget.setText("test string");
			}
		});
		assertEquals("test string", widget.getText());
		
	}
	public void testDisplayTextOnscreen() throws Throwable{
		IntentReaderActivity activity =(IntentReaderActivity) getActivity();	
		TextView widget =(TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		runTestOnUiThread(new Runnable()
		{
		@Override
			public void run()
			{
				IntentReaderActivity activity =(IntentReaderActivity) getActivity();
				TextView widget =(TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
				// TODO Auto-generated method stub
						widget.setText("test string");
			}
		});
		ViewAsserts.assertOnScreen(widget, widget);
	}
}
