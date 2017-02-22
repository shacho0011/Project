package com.example.emergencyhelp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class cost_guard_page extends Activity{
	
	Context context = this;
	Cursor cursor;
	Button dhakaB;
	Button southB;
	Button eastB;
	Button westB;
	String show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.costguard);
		dhakaB = (Button) findViewById(R.id.DhakaButton);
		southB = (Button) findViewById(R.id.SouthButton);
		eastB = (Button) findViewById(R.id.EastButton);
		westB = (Button) findViewById(R.id.WestButton);
	
		dhakaB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				GetOperations  db = new GetOperations(context, "cost_guard_page");
				cursor = db.getSelectionData(db, "Dhaka Zone");
				cursor.moveToFirst();
				try{
					do{
						if("Dhaka Zone".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Dhaka Zone");
								cursor.moveToFirst();
								show = cursor.getString(1);
								Toast.makeText(getBaseContext(),cursor.getString(0),Toast.LENGTH_LONG).show();
								Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",show, null));
								startActivity(intent);
						}
						
					}while(cursor.moveToNext());
				}catch(Exception e){
					e.printStackTrace();
					Toast.makeText(getBaseContext(), "Not available...! :(", Toast.LENGTH_LONG).show();
				}
					
			}
			
		});
		southB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				GetOperations  db = new GetOperations(context, "cost_guard_page");
				cursor = db.getSelectionData(db, "South Zone");
				cursor.moveToFirst();
				try{
					do{
						if("South Zone".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "South Zone");
								cursor.moveToFirst();
								show = cursor.getString(1);
								Toast.makeText(getBaseContext(),cursor.getString(0),Toast.LENGTH_LONG).show();
								Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",show, null));
								startActivity(intent);
						}
						
					}while(cursor.moveToNext());
				}catch(Exception e){
					e.printStackTrace();
					Toast.makeText(getBaseContext(), "Not available...! :(", Toast.LENGTH_LONG).show();
				}
					
			}
		});
		eastB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "cost_guard_page");
				cursor = db.getSelectionData(db, "East Zone");
				cursor.moveToFirst();
				try{
					do{
						if("East Zone".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "East Zone");
								cursor.moveToFirst();
								show = cursor.getString(1);
								Toast.makeText(getBaseContext(),cursor.getString(0),Toast.LENGTH_LONG).show();
								Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",show, null));
								startActivity(intent);
						}
						
					}while(cursor.moveToNext());
				}catch(Exception e){
					e.printStackTrace();
					Toast.makeText(getBaseContext(), "Not available...! :(", Toast.LENGTH_LONG).show();
				}
					
			}
		});
		westB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "cost_guard_page");
				cursor = db.getSelectionData(db, "West Zone");
				cursor.moveToFirst();
				try{
					do{
						if("West Zone".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "West Zone");
								cursor.moveToFirst();
								show = cursor.getString(1);
								Toast.makeText(getBaseContext(),cursor.getString(0),Toast.LENGTH_LONG).show();
								Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",show, null));
								startActivity(intent);
						}
						
					}while(cursor.moveToNext());
				}catch(Exception e){
					e.printStackTrace();
					Toast.makeText(getBaseContext(), "Not available...! :(", Toast.LENGTH_LONG).show();
				}
					
			}
		});
		
		
	}

}
