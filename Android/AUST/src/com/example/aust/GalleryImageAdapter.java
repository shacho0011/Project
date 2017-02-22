package com.example.aust;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class GalleryImageAdapter extends BaseAdapter {

	public static Integer[]  galleryImage = {R.drawable.austgallery1, R.drawable.austgallery2, 
			R.drawable.austgallery3, R.drawable.austgallery4,
			R.drawable.austgallery5, R.drawable.austgallery6,
			R.drawable.austgallery7, R.drawable.austgallery8,
			R.drawable.austgallery9, R.drawable.austgallery10,
			R.drawable.austgallery11, R.drawable.austgallery2,
			R.drawable.austgallery13, R.drawable.austgallery14,
			R.drawable.austgallery15, R.drawable.austgallery16,
			R.drawable.austgallery17, R.drawable.austgallery18,
			R.drawable.austgallery19, R.drawable.austgallery20,
			R.drawable.austgallery21, R.drawable.austgallery22,
			R.drawable.austgallery23, R.drawable.austgallery24,
			R.drawable.austgallery25, R.drawable.austgallery26,
			R.drawable.austgallery27, R.drawable.austgallery28,
			R.drawable.austgallery29, R.drawable.austgallery30,
	};
	private Context context;
	public GalleryImageAdapter(Context applicationContext) {
		// TODO Auto-generated constructor stub
		context = applicationContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return galleryImage.length;
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
		imageView.setImageResource(galleryImage[position]);
		return imageView;
	}

}
