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
import android.widget.Button;
import android.widget.Toast;

public class Traffic_page extends Activity {
	
	Context context = this;
	Cursor cursor;
	Button tejgaonTrafficPoliceB;
	Button dhanmondiTrafficPoliceB;
	Button mirpurTrafficPoliceB;
	Button uttaraTrafficPoliceB;
	Button shahbagTrafficPoliceB;
	Button baddaTrafficPoliceB;
	Button motijeelTrafficPoliceB;
	Button paltonTrafficPoliceB;
	Button newmarketTrafficPoliceB;
	
	String show;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_traffic_page);
		
		tejgaonTrafficPoliceB = (Button) findViewById(R.id.tejgaonTrafficPoliceButton);
		dhanmondiTrafficPoliceB = (Button) findViewById(R.id.dhanmondiTrafficPoliceButton);
		mirpurTrafficPoliceB = (Button) findViewById(R.id.mirpurTrafficPoliceButton);
		uttaraTrafficPoliceB = (Button) findViewById(R.id.uttaraTrafficPoliceButton);
		shahbagTrafficPoliceB = (Button) findViewById(R.id.shahbagTrafficPoliceButton);
		baddaTrafficPoliceB = (Button) findViewById(R.id.baddaTrafficPoliceButton);
		motijeelTrafficPoliceB = (Button) findViewById(R.id.motijeelTrafficPoliceButton);
		paltonTrafficPoliceB = (Button) findViewById(R.id.paltonTrafficPoliceButton);
		newmarketTrafficPoliceB = (Button) findViewById(R.id.newmarketTrafficPoliceButton);
		
		tejgaonTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Tejgaon Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Tejgaon Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Tejgaon Traffic Police Station");
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
		
		dhanmondiTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Dhanmondi Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Dhanmondi Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Dhanmondi Traffic Police Station");
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
		
		mirpurTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Mirpur Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Mirpur Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Mirpur Traffic Police Station");
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
		
		uttaraTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Uttara Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Uttara Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Uttara Traffic Police Station");
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
		shahbagTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Shahbag Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Shahbag Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Shahbag Traffic Police Station");
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
		
		baddaTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Badda Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Badda Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Badda Traffic Police Station");
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
		motijeelTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Motijeel Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Motijeel Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Motijeel Traffic Police Station");
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
		
		paltonTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Palton Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Palton Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Palton Traffic Police Station");
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
		
		newmarketTrafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Traffic_page");
				cursor = db.getSelectionData(db, "Newmarket Traffic Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Newmarket Traffic Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Newmarket Traffic Police Station");
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
		getMenuInflater().inflate(R.menu.traffic_page, menu);
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
