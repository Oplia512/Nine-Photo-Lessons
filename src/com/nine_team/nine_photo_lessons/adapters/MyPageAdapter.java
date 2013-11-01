package com.nine_team.nine_photo_lessons.adapters;

import java.util.ArrayList;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nine_team.nine_photo_lessons.R;

public class MyPageAdapter extends PagerAdapter {

	private View firstPage, secondPage, thirdPage, fourthPage, fifthPage,
			sixthPage, seventhPage, eigthPage, ninthPage, ninthBPage;
	
	private LayoutInflater inflater;
	private ArrayList<View> pages = null;

	public MyPageAdapter(Context context) {
		
		pages = new ArrayList<View>();
		inflater = LayoutInflater.from(context);

		firstPage = inflater.inflate(R.layout.first_page, null);
		pages.add(firstPage);

		secondPage = inflater.inflate(R.layout.second_page, null);
		pages.add(secondPage);

		thirdPage = inflater.inflate(R.layout.third_page, null);
		pages.add(thirdPage);

		fourthPage = inflater.inflate(R.layout.fourth_page, null);
		pages.add(fourthPage);

		fifthPage = inflater.inflate(R.layout.fifth_page, null);
		pages.add(fifthPage);

		sixthPage = inflater.inflate(R.layout.sixth_page, null);
		pages.add(sixthPage);

		seventhPage = inflater.inflate(R.layout.seventh_page, null);
		pages.add(seventhPage);
		
		eigthPage = inflater.inflate(R.layout.eighth_page, null);
		pages.add(eigthPage);
		
		ninthBPage = inflater.inflate(R.layout.ninth_b_page, null);
		pages.add(ninthBPage);
		
		ninthPage = inflater.inflate(R.layout.ninth_page, null);
		pages.add(ninthPage);

	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		View v = pages.get(position);
		((ViewPager) container).addView(v, 0);

		return v;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		((ViewPager) container).removeViewInLayout((View) object);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pages.size();
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		// TODO Auto-generated method stub
		return view.equals(object);
	}

	@Override
	public CharSequence getPageTitle(int position) {

		return null;
	}

}
