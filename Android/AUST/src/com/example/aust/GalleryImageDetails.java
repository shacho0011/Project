package com.example.aust;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class GalleryImageDetails extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		try {
			setContentView(R.layout.image_view);
			Intent intent = getIntent();
			int position = (Integer)intent.getExtras().get("id");
			ImageView imageView = (ImageView) findViewById(R.id.galleryImageView);
			imageView.setImageResource(GalleryImageAdapter.galleryImage[position]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
