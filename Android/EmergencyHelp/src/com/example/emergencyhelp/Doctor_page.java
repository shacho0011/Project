package com.example.emergencyhelp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Doctor_page extends Activity{
	Context context = this;
	Cursor cursor;
	Button TBHospitalB;
	Button HeartFoundationB;
	Button CareHospitalB;
	Button CentralHospitalB;
	Button AsianHospitalB;
	Button MetroB;
	Button SSMCB;
	Button DMCB;
	//Button LionsHospital;
	
	String show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doctor);
		TBHospitalB = (Button) findViewById(R.id.TBHospitalButton);
		HeartFoundationB = (Button) findViewById(R.id.HeartFoundationButton);
		CareHospitalB = (Button) findViewById(R.id.CareHospitalButton);
		CentralHospitalB = (Button) findViewById(R.id.CentralHospitalButton);
		AsianHospitalB = (Button) findViewById(R.id.AsianHospitalButton);
		MetroB = (Button) findViewById(R.id.MetroButton);
		SSMCB = (Button) findViewById(R.id.SSMCButton);
		DMCB = (Button) findViewById(R.id.DMCButton);
		//LionsHospitalB = (Button) findViewById(R.id.LionsHospitalButton);
		
		TBHospitalB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "TB Hospital");
				cursor.moveToFirst();
				try{
					do{
						if("TB Hospital".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "TB Hospital");
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
		HeartFoundationB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "Heart Foundation");
				cursor.moveToFirst();
				try{
					do{
						if("Heart Foundation".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Heart Foundation");
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
		CareHospitalB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "Care Hospital");
				cursor.moveToFirst();
				try{
					do{
						if("Care Hospital".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Care Hospital");
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
		CentralHospitalB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "Central Hospital");
				cursor.moveToFirst();
				try{
					do{
						if("Central Hospital".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Central Hospital");
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
		AsianHospitalB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "Asian Hospital");
				cursor.moveToFirst();
				try{
					do{
						if("Asian Hospital".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Asian Hospital");
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
		MetroB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "Metro Hospital");
				cursor.moveToFirst();
				try{
					do{
						if("Metro Hospital".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Metro Hospital");
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
		SSMCB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "SSMC");
				cursor.moveToFirst();
				try{
					do{
						if("SSMC".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "SSMC");
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
		DMCB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Doctor");
				cursor = db.getSelectionData(db, "DMC");
				cursor.moveToFirst();
				try{
					do{
						if("DMC".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "DMC");
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
