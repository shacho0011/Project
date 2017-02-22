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

public class Police_page extends Activity {
	
	Context context = this;
	Cursor cursor;
	Button tejgaonPoliceB;
	Button dhanmondiPoliceB;
	Button mirpurPoliceB;
	Button uttaraPoliceB;
	Button ramnaPoliceB;
	Button kotwaliPoliceB;
	Button kafrulPoliceB;
	Button baddaPoliceB;
	Button gulsanPoliceB;
	
	String show;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_police_page);
		
		tejgaonPoliceB = (Button) findViewById(R.id.tejgaonPoliceButton);
		dhanmondiPoliceB = (Button) findViewById(R.id.dhanmondiPoliceButton);
		mirpurPoliceB = (Button) findViewById(R.id.mirpurPoliceButton);
		uttaraPoliceB = (Button) findViewById(R.id.uttaraPoliceButton);
		ramnaPoliceB = (Button) findViewById(R.id.ramnaPoliceButton);
		kotwaliPoliceB = (Button) findViewById(R.id.kotwaliPoliceButton);
		kafrulPoliceB = (Button) findViewById(R.id.kafrulPoliceButton);
		gulsanPoliceB = (Button) findViewById(R.id.gulsanPoliceButton);
		baddaPoliceB = (Button) findViewById(R.id.baddaPoliceButton);
		
		
		tejgaonPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Tejgaon Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Tejgaon Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Tejgaon Police Station");
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
		
		dhanmondiPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Dhanmondi Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Dhanmondi Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Dhanmondi Police Station");
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
		
		mirpurPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Mirpur Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Mirpur Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Mirpur Police Station");
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
		uttaraPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Uttara Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Uttara Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Uttara Police Station");
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
		
		ramnaPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Ramna Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Ramna Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Ramna Police Station");
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
		
		kotwaliPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Kotwali Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Kotwali Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Kotwali Police Station");
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
		
		kafrulPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Kafrul Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Kafrul Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Kafrul Police Station");
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
		
baddaPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Police_page");
				cursor = db.getSelectionData(db, "Badda Police Station");
				cursor.moveToFirst();
				try{
					do{
						if("Badda Police Station".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Badda Police Station");
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

gulsanPoliceB.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		GetOperations  db = new GetOperations(context, "Police_page");
		cursor = db.getSelectionData(db, "Gulsan Police Station");
		cursor.moveToFirst();
		try{
			do{
				if("Gulsan Police Station".equals(cursor.getString(0))){
						cursor = db.getSelectionData(db, "Gulsan Police Station");
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
		getMenuInflater().inflate(R.menu.police_page, menu);
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
