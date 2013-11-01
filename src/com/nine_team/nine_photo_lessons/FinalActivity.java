package com.nine_team.nine_photo_lessons;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

public class FinalActivity extends ActionBarActivity implements OnClickListener{
	
	private Button btnI, btnEstimate, btnDevelop, btnAbout, btnHome;
	private FrameActivity frame;
	
	private final int FRAME_PARTNERS = 1;
	private final int FRAME_ABOUT = 2;
	Intent intent;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().hide();
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
			setContentView(R.layout.activity_final);
			
			frame = new FrameActivity();
						
			btnI = (Button)findViewById(R.id.btnToPartners);
			btnEstimate = (Button)findViewById(R.id.btnEstimate);
			btnDevelop = (Button)findViewById(R.id.btnDevelopers);
			btnAbout = (Button)findViewById(R.id.btnAbout);
			btnHome = (Button)findViewById(R.id.btnHome);
		
			
			btnI.setOnClickListener(this);
			btnEstimate.setOnClickListener(this);
			btnDevelop.setOnClickListener(this);
			btnAbout.setOnClickListener(this);
			btnHome.setOnClickListener(this);
			
			
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.btnToPartners:
			frame.setFrameId(FRAME_PARTNERS);
			frame.show(getSupportFragmentManager(), "framePartners");			
			break;
		case R.id.btnEstimate:
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nine_team.nine_photo_lessons"));
			startActivity(intent);
			break;
		case R.id.btnDevelopers:
			intent = new Intent(this, DevelopersActivity.class);
			startActivity(intent);
			break;
		case R.id.btnAbout:
			frame.setFrameId(FRAME_ABOUT);
			frame.show(getSupportFragmentManager(), "frameAbout");
			break;
		case R.id.btnHome:
			finish();
			break;
			
		
		
		}
		
	}

}
