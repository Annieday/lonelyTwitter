package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends LonelyTwitterActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		TextView showNumber = (TextView) findViewById(R.id.showTweetNumber);
		Button backToMain = (Button) findViewById(R.id.backToMain);
		int numberTweet = LonelyTwitterActivity.tweets.size();
		showNumber.setText("Totol number of tweets: "+numberTweet);
		backToMain.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,
                		LonelyTwitterActivity.class);
                startActivity(intent);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
