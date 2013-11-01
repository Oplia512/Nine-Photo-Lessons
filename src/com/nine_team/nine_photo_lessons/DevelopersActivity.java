package com.nine_team.nine_photo_lessons;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

public class DevelopersActivity extends ActionBarActivity implements
		OnClickListener {

	private Button btnDevBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().hide();
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_developers);

		btnDevBack = (Button) findViewById(R.id.btnDevelopersBack);
		btnDevBack.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		finish();

	}

}
