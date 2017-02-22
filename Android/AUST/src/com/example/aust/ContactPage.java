package com.example.aust;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactPage extends Activity{
	
	TextView vcT;
	TextView registerT;
	TextView treasurerT;
	TextView addressT1;
	TextView addressT2;
	
	Button vcCallB;
	Button registerCallB;
	Button treasurerCallB;
	Button mapB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_page);
		
		vcT = (TextView) findViewById(R.id.vcText);
		registerT = (TextView) findViewById(R.id.registerText);
		treasurerT = (TextView) findViewById(R.id.officeText);
		addressT1 = (TextView) findViewById(R.id.addressText1);
		addressT2 = (TextView) findViewById(R.id.addressText2);
		
		vcCallB = (Button) findViewById(R.id.vcButton);
		registerCallB = (Button) findViewById(R.id.registerButton);
		treasurerCallB = (Button) findViewById(R.id.officeButton);
		mapB = (Button) findViewById(R.id.mapContactButton);
		
		vcT.setText("Vice-Chancellor's Office: +88(02)8870422 Ext. - 101");
		registerT.setText("Registrar: +88(02)8870416");
		treasurerT.setText("Treasurer: +88(02)8870415");
		addressT1.setText("\nAddress:\n\t141 & 142, Love Road, Tejgaon Industrial Area, Dhaka-1208 BANGLADESH\n");
		addressT2.setText("\nPABX:\n\t8870418,  8870423,  8870426.8870420,  8870424, 8870421,  8870425, Ext: 400, 500, 300, 104, 107\nFax Number: \n\t880-2-8870417 - 18\nEmail:\n\t1. info@aust.edu\n\t2. regr@aust.edu\n");
		
		vcCallB.setOnClickListener(new View.OnClickListener() {
					
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel","+88028870422", null));
					startActivity(intent);
				}
		});
		
		registerCallB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel","+88028870416", null));
				startActivity(intent);
			}
		});
		
		treasurerCallB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel","+88028870415", null));
				startActivity(intent);
			}
		});
		
		mapB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), GoogleMapView.class);
				startActivity(intent);
			}
		});
	}

}
