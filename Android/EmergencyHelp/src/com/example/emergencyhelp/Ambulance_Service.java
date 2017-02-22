package com.example.emergencyhelp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Ambulance_Service extends Activity {
	Context context = this;
	Cursor cursor;
	Button CompathB;
	Button PGHospitalB;
	Button LifelineB;
	Button PrimeB;
	Button ICDDRB;
	Button RafaB;
	
	String show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ambulance__service);
		
		CompathB = (Button) findViewById(R.id.CompathButton);
		PGHospitalB = (Button) findViewById(R.id.PGHospitalButton);
		LifelineB = (Button) findViewById(R.id.LifelineButton);
		ICDDRB = (Button) findViewById(R.id.ICDDRButton);
		RafaB = (Button) findViewById(R.id.RafaButton);
		PrimeB = (Button) findViewById(R.id.PrimeButton);
		
		CompathB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Ambulance_Service");
				cursor = db.getSelectionData(db, "Compath Ambulance Service");
				cursor.moveToFirst();
				try{
					do{
						if("Compath Ambulance Service".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Compath Ambulance Service");
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
		PGHospitalB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Ambulance_Service");
				cursor = db.getSelectionData(db, "PG Hospital Ambulance Service");
				cursor.moveToFirst();
				try{
					do{
						if("PG Hospital Ambulance Service".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "PG Hospital Ambulance Service");
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
		LifelineB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Ambulance_Service");
				cursor = db.getSelectionData(db, "Life line Ambulance Service");
				cursor.moveToFirst();
				try{
					do{
						if("Life line Ambulance Service".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Life line Ambulance Service");
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
		PrimeB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Ambulance_Service");
				cursor = db.getSelectionData(db, "Prime Ambulance Service");
				cursor.moveToFirst();
				try{
					do{
						if("Prime Ambulance Service".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Prime Ambulance Service");
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
		ICDDRB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Ambulance_Service");
				cursor = db.getSelectionData(db, "ICDDR Ambulance Service");
				cursor.moveToFirst();
				try{
					do{
						if("ICDDR Ambulance Service".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "ICDDR Ambulance Service");
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
		RafaB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Ambulance_Service");
				cursor = db.getSelectionData(db, "Rafa Ambulance Service");
				cursor.moveToFirst();
				try{
					do{
						if("Rafa Ambulance Service".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Rafa Ambulance Service");
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ambulance_, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
