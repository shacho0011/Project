package com.example.aust;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Gallery extends Activity{
	
	private ImageView imageview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gallery);
		
		try {
			GridView galleryGridV = (GridView) findViewById(R.id.galleryGridView);
			galleryGridV.setAdapter(new GalleryImageAdapter(getApplicationContext()));
			
			galleryGridV.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View v,
						int position, long id) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(v.getContext(), GalleryImageDetails.class);
					intent.putExtra("id", position);
					startActivity(intent);
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
