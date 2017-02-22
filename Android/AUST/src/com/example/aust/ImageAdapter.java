package com.example.aust;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ImageAdapter extends BaseAdapter {
	
	private int[] image = {
			R.drawable.about,
			R.drawable.aust,
			R.drawable.academic,
			
			R.drawable.admission,
			R.drawable.department,
			R.drawable.student,

			R.drawable.news,
			R.drawable.gallery,
			R.drawable.contact
	};
	private Context context;

	public ImageAdapter(Context applicationContext) {
		// TODO Auto-generated constructor stub
		context = applicationContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return image.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView;
		if(convertView != null){
			imageView = (ImageView) convertView;
		}
		else{
			imageView = new ImageView(context);
			imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
			imageView.setScaleType(ScaleType.CENTER_CROP);
			imageView.setPadding(5, 5, 5, 5);
		}
		imageView.setImageResource(image[position]);
		return imageView;
	}

}
