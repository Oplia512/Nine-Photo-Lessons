package com.nine_team.nine_photo_lessons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.nine_team.nine_photo_lessons.adapters.MyPageAdapter;
import com.nine_team.nine_photo_lessons.photo.PhotoMaker;

public class LessonsActivity extends ActionBarActivity implements OnClickListener {

	private ViewPager vPager;
	private MyPageAdapter pAdapter;
	private Button btnNext, btnPrev, btnPhoto;
	
	private final int COUNT = 9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		getSupportActionBar().hide();
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main_pages_layout);

		btnNext = (Button) findViewById(R.id.btnNext);
		btnPrev = (Button) findViewById(R.id.btnPrev);
		btnPhoto = (Button) findViewById(R.id.btnPhoto);

		btnNext.setOnClickListener(this);
		btnPrev.setOnClickListener(this);
		btnPhoto.setOnClickListener(this);

		btnPrev.setVisibility(Button.INVISIBLE);

		pAdapter = new MyPageAdapter(this);
		vPager = (ViewPager) findViewById(R.id.pager);
		vPager.setAdapter(pAdapter);

		vPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int page) {

				if (vPager.getCurrentItem() != 0) {
					if (btnPrev.getVisibility() != 0
							|| btnNext.getVisibility() != 0) {
						btnPrev.setVisibility(Button.VISIBLE);
						btnNext.setVisibility(Button.VISIBLE);
					}

				}

				if (vPager.getCurrentItem() == 0) {
					btnNext.setVisibility(Button.VISIBLE);
					btnPrev.setVisibility(Button.INVISIBLE);
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnNext:
			if(vPager.getCurrentItem() == COUNT){
				Intent intent = new Intent(this, FinalActivity.class);
				startActivity(intent);
				finish();
			} else	vPager.setCurrentItem(vPager.getCurrentItem() + 1);
			break;

		case R.id.btnPrev:
			vPager.setCurrentItem(vPager.getCurrentItem() - 1);
			break;
			
		case R.id.btnPhoto:
			Intent intent = new Intent(new PhotoMaker().makePhoto());
			startActivity(intent);
		break;
			
		}

	}

	@Override
	public void onBackPressed() {
		if (vPager.getCurrentItem() == 0) {
			super.onBackPressed();

		} else {
			vPager.setCurrentItem(vPager.getCurrentItem() - 1);
		}

	}

}
