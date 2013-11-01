package com.nine_team.nine_photo_lessons;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;

public class FrameActivity extends DialogFragment implements OnClickListener{

	private final int FRAME_PARTNERS = 1;
	private final int FRAME_ABOUT = 2;
	private int frameId;
	

	public FrameActivity() {
		super();
	}
	
	

	public void setFrameId(int frameId) {
		this.frameId = frameId;

	}



	

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = null;
		if (frameId == FRAME_PARTNERS) {
			getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
			getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
			v = inflater.inflate(R.layout.frame_to_partners, null);
			v.findViewById(R.id.btnCloseFramePartners).setOnClickListener(this);
		

		}
		if (frameId == FRAME_ABOUT) {
			getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
			getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
			v = inflater.inflate(R.layout.frame_about, null);
			v.findViewById(R.id.btnCloseFrameAbout).setOnClickListener(this);
		}
		return v;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnCloseFramePartners:
			dismiss();
			break;
		case R.id.btnCloseFrameAbout:
			dismiss();
			break;


		}

	}

}