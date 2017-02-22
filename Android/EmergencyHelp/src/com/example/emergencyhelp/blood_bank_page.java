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

public class blood_bank_page extends Activity{
	Context context = this;
	Cursor cursor;
	Button ShandhaniB;
	Button BadhonB;
	Button RedcrecentB;
	Button IslamiBankHospitalB;
	Button QuantumB;
	Button SirSalimullahCollegeB;
	
	String show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bloodbank);
		ShandhaniB = (Button) findViewById(R.id.ShandhaniButton);
		BadhonB = (Button) findViewById(R.id.BadhonButton);
		RedcrecentB = (Button) findViewById(R.id.RedcrecentButton);
		IslamiBankHospitalB = (Button) findViewById(R.id.IslamiBankHospitalButton);
		QuantumB = (Button) findViewById(R.id.QuantumButton);
		SirSalimullahCollegeB = (Button) findViewById(R.id.SirSalimullahCollegeButton);
		
		ShandhaniB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "blood_bank");
				cursor = db.getSelectionData(db, "Shandhani");
				cursor.moveToFirst();
				try{
					do{
						if("Shandhani".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Shandhani");
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
		BadhonB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "blood_bank");
				cursor = db.getSelectionData(db, "Badhon Blood Bank");
				cursor.moveToFirst();
				try{
					do{
						if("Badhon Blood Bank".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Badhon Blood Bank");
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
		RedcrecentB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "blood_bank");
				cursor = db.getSelectionData(db, "Redcrecent Blood Bank");
				cursor.moveToFirst();
				try{
					do{
						if("Redcrecent Blood Bank".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Redcrecent Blood Bank");
								cursor.moveToFirst();
								show = cursor.getString(1);
								Toast.makeText(getBaseContext(),cursor.getString(1),Toast.LENGTH_LONG).show();
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
		IslamiBankHospitalB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "blood_bank");
				cursor = db.getSelectionData(db, "Islami Bank Hospital Blood Bank");
				cursor.moveToFirst();
				try{
					do{
						if("Islami Bank Hospital Blood Bank".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Islami Bank Hospital Blood Bank");
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
		QuantumB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "blood_bank");
				cursor = db.getSelectionData(db, "Quantum Blood Bank");
				cursor.moveToFirst();
				try{
					do{
						if("Quantum Blood Bank".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Quantum Blood Bank");
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
		SirSalimullahCollegeB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "blood_bank");
				cursor = db.getSelectionData(db, "Sir Salimullah College Blood Bank");
				cursor.moveToFirst();
				try{
					do{
						if("Sir Salimullah College Blood Bank".equals(cursor.getString(0))){
								cursor = db.getSelectionData(db, "Sir Salimullah College Blood Bank");
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
