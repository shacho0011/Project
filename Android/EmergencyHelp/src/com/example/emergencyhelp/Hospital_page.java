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

public class Hospital_page extends Activity {

	Context context = this;
	Cursor cursor;
	Button apolloB;
	Button squareB;
	Button greenlifeB;
	Button shomoritaB;
	Button bsmmuB;
	Button birdemB;
	Button holyfamilyB;
	Button ibnsinaB;
	Button shohwardiB;
	Button unitedhospitalB;
	
	
	String show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hospital_page);
		apolloB = (Button) findViewById(R.id.ApolloButton);
		squareB = (Button) findViewById(R.id.SquareButton);
		greenlifeB = (Button) findViewById(R.id.GreenLifeButton);
		
		shomoritaB = (Button) findViewById(R.id.ShomoritaButton);
		bsmmuB = (Button) findViewById(R.id.BSMMUButton);
		birdemB = (Button) findViewById(R.id.BirdemButton);
		holyfamilyB = (Button) findViewById(R.id.HolyFamilyButton);
		ibnsinaB = (Button) findViewById(R.id.IbnSinaButton);
		shohwardiB = (Button) findViewById(R.id.ShohwardiButton);

		unitedhospitalB = (Button) findViewById(R.id.UnitedHospitalButton);
		
		
		apolloB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				GetOperations  db = new GetOperations(context, "Hospital");
				cursor = db.getSelectionData(db, "Apollo Hospitals Dhaka");
				cursor.moveToFirst();
				try{
					do{
						if("Apollo Hospitals Dhaka".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Apollo Hospitals Dhaka");
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
			squareB.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					GetOperations  db = new GetOperations(context, "Hospital");
					cursor = db.getSelectionData(db, "Square Hospital Dhaka");
					cursor.moveToFirst();
					try{
						do{
							if("Square Hospital Dhaka".equals(cursor.getString(0))){
									cursor = db.getSelectionData(db, "Square Hospital Dhaka");
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
			greenlifeB.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					GetOperations  db = new GetOperations(context, "Hospital");
					cursor = db.getSelectionData(db, "Green Life Hospital Dhaka");
					cursor.moveToFirst();
					try{
						do{
							if("green Life Hospital Dhaka".equals(cursor.getString(0))){
									cursor = db.getSelectionData(db, "Green Life Hospital Dhaka");
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
			shomoritaB.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					GetOperations  db = new GetOperations(context, "Hospital");
					cursor = db.getSelectionData(db, "Shomorita Hospital Dhaka");
					cursor.moveToFirst();
					try{
						do{
							if("Shomorita Hospital Dhaka".equals(cursor.getString(0))){
									cursor = db.getSelectionData(db, "Shomorita Hospital Dhaka");
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
			 bsmmuB.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					GetOperations  db = new GetOperations(context, "Hospital");
					cursor = db.getSelectionData(db, "BSMMU");
					cursor.moveToFirst();
					try{
						do{
							if("BSMMU".equals(cursor.getString(0))){
									cursor = db.getSelectionData(db, "BSMMU");
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
			 birdemB.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					GetOperations  db = new GetOperations(context, "Hospital");
					cursor = db.getSelectionData(db, "Birdem");
					cursor.moveToFirst();
					try{
						do{
							if("Birdem".equals(cursor.getString(0))){
									cursor = db.getSelectionData(db, "Birdem");
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
			 holyfamilyB.setOnClickListener(new OnClickListener() {
					
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					GetOperations  db = new GetOperations(context, "Hospital");
					cursor = db.getSelectionData(db, "Holy Family Hospital");
					cursor.moveToFirst();
					try{
						do{
							if("Holy Family Hospital".equals(cursor.getString(0))){
									cursor = db.getSelectionData(db, "Holy Family Hospital");
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
			 ibnsinaB.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						GetOperations  db = new GetOperations(context, "Hospital");
						cursor = db.getSelectionData(db, "Ibn Sina Hospital");
						cursor.moveToFirst();
						try{
							do{
								if("Ibn Sina Hospital".equals(cursor.getString(0))){
										cursor = db.getSelectionData(db, "Ibn Sina Hospital");
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
			 shohwardiB.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						GetOperations  db = new GetOperations(context, "Hospital");
						cursor = db.getSelectionData(db, "Shohwardi Medical College Hospital");
						cursor.moveToFirst();
						try{
							do{
								if("Shohwardi Medical College Hospital".equals(cursor.getString(0))){
										cursor = db.getSelectionData(db, "Shohwardi Medical College Hospital");
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
			 
			
			 unitedhospitalB.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						GetOperations  db = new GetOperations(context, "Hospital");
						cursor = db.getSelectionData(db, "United Hospital");
						cursor.moveToFirst();
						try{
							do{
								if("United Hospital".equals(cursor.getString(0))){
										cursor = db.getSelectionData(db, "United Hospital");
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
		getMenuInflater().inflate(R.menu.hospital_page, menu);
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
