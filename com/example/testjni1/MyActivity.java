package com.example.testjni1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {
	static {
		System.loadLibrary("MyActivity");
	}

	private native String getTextFromJni();

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView test = (TextView)findViewById(R.id.test);
		test.setText(getTextFromJni());
	}
}
