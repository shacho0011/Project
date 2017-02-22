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

public class Fire_Service_page extends Activity{
	Context context = this;
	Cursor cursor;
	Button sodhorghatB;
	Button TejgaonB;
	Button KhilgaonB;
	Button KurmitolaB;
	Button BaridharaB;
	Button SavarB;
	Button DEPZB;
	Button MohammadpurB;
	Button LalbagB;
	Button MirpurB;
	Button PolashiB;
	Button PostogolaB;
	
	String show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fire__service_page);
		sodhorghatB = (Button)findViewById(R.id.SodhorGhatButton);
		TejgaonB = (Button)findViewById(R.id.TejgaonButton);
		KhilgaonB = (Button)findViewById(R.id.KhilgaonButton);
		KurmitolaB = (Button)findViewById(R.id.KurmitolaButton);
		BaridharaB = (Button)findViewById(R.id.BaridharaButton);
		SavarB = (Button)findViewById(R.id.SavarButton);
		DEPZB = (Button)findViewById(R.id.DEPZButton);
		MohammadpurB = (Button)findViewById(R.id.MohammadpurButton);
		LalbagB = (Button) findViewById(R.id.LalbagButton);
		MirpurB = (Button) findViewById(R.id.MirpurButton);
		PolashiB = (Button) findViewById(R.id.PolashiButton);
		PostogolaB = (Button) findViewById(R.id.PostogolaButton);
		
		sodhorghatB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "SodhorGhat");
				cursor.moveToFirst();
				try{
					do{
						if("SodhorGhat".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "SodhorGhat");
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
		
		
		TejgaonB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Tejgaon");
				cursor.moveToFirst();
				try{
					do{
						if("Tejgaon".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Tejgaon");
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
		KhilgaonB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Khilgaon");
				cursor.moveToFirst();
				try{
					do{
						if("Khilgaon".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Khilgaon");
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
		KurmitolaB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Kurmitola");
				cursor.moveToFirst();
				try{
					do{
						if("Kurmitola".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Kurmitola");
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
		BaridharaB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Baridhara");
				cursor.moveToFirst();
				try{
					do{
						if("Baridhara".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Baridhara");
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
		SavarB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Savar");
				cursor.moveToFirst();
				try{
					do{
						if("Savar".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Savar");
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
		DEPZB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "DEPZ");
				cursor.moveToFirst();
				try{
					do{
						if("DEPZ".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "DEPZ");
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
		MohammadpurB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Mohammadpur");
				cursor.moveToFirst();
				try{
					do{
						if("Mohammadpur".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Mohammadpur");
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
		LalbagB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Lalbag");
				cursor.moveToFirst();
				try{
					do{
						if("Lalbag".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Lalbag");
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
		MirpurB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Mirpur");
				cursor.moveToFirst();
				try{
					do{
						if("Mirpur".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Mirpur");
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
		PolashiB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db = new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Polashi");
				cursor.moveToFirst();
				try{
					do{
						if("Polashi".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Polashi");
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
		PostogolaB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				GetOperations  db= new GetOperations(context, "Fire_Service_page");
				cursor = db.getSelectionData(db, "Postogola");
				cursor.moveToFirst();
				try{
					do{
						if("Postogola".equals(cursor.getString(0))){
							cursor = db.getSelectionData(db, "Postogola");
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
