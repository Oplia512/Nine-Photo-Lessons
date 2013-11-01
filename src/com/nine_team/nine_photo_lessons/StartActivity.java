package com.nine_team.nine_photo_lessons;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.*;


public class StartActivity extends ActionBarActivity implements Runnable {

	private final int START_DELAY = 3000;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().hide();
		setContentView(R.layout.activity_start);
		
		Handler sHandler = new Handler();
		sHandler.postDelayed(this, START_DELAY);
	}

	@Override
	public void run() {
		Intent intent = new Intent(this, MainFrameActivity.class);
		startActivity(intent);
		finish();

	}

}
