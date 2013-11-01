package com.nine_team.nine_photo_lessons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

public class MainFrameActivity extends ActionBarActivity implements
		OnClickListener {

	private Button btnStartLessons, btnAbout;
	private final int FRAME_ABOUT = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getSupportActionBar().hide();
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main_frame);

		btnAbout = (Button) findViewById(R.id.btnMainFrameAbout);
		btnAbout.setOnClickListener(this);

		btnStartLessons = (Button) findViewById(R.id.btnSatrtLessons);
		btnStartLessons.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnSatrtLessons:
			Intent intent = new Intent(this, LessonsActivity.class);
			startActivity(intent);
			break;

		case R.id.btnMainFrameAbout:
			FrameActivity frame = new FrameActivity();
			frame.setFrameId(FRAME_ABOUT);
			frame.show(getSupportFragmentManager(), "about");
			break;

		}

	}

}
