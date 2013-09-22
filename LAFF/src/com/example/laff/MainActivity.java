package com.example.laff;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private String TAG = getClass().getSimpleName();
	
	private EditText messageText;
	
	private TextView helloWorld;
	
	private Button sendButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		messageText = (EditText) findViewById(R.id.messageText);
		
		sendButton = (Button) findViewById(R.id.sendButton);
		
		helloWorld = (TextView) findViewById(R.id.textView1);
		
		addButtonListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addButtonListener()
	{
		Log.i(TAG, "called addButtonListener()");
		
		sendButton.setOnClickListener(new OnClickListener() { 
			@Override
			public void onClick(View arg0) {
				helloWorld.setText( messageText.getText().toString() );
				Log.i(TAG, messageText.getText().toString());
			}
		});
		
		Log.i(TAG, "finished addbuttonlistener()");
	}
	
	private void msgToast(String msg) {
		Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
	}

}
