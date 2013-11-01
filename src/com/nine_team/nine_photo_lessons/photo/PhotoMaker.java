package com.nine_team.nine_photo_lessons.photo;

import java.io.File;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;

public class PhotoMaker {

	private File directory;
	
	public PhotoMaker() {
		createDirectory();

	}
	
	public Intent makePhoto(){
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, generateFileUri());
		return intent;
	}

	private Uri generateFileUri() {
		File file = new File(directory.getPath() + "/" + "photo_"
				+ System.currentTimeMillis() + ".jpg");

		return Uri.fromFile(file);
	}

	private void createDirectory() {

		directory = new File(
				Environment
						.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
				"NineLessonsPhoto");

		if (!directory.exists())
			directory.mkdir();
	}

}
