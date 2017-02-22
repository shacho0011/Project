package com.example.emergencyhelp;


import com.example.emergencyhelp.DataHelper.ContactTableInfo;

import android.app.Activity;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	 Button policeButton;
	 Button fireButton;
	 Button hpospitalButton;
	 Button ambulanceButton;
	 Button blood_bankButton;
	 Button doctorButton;
	 Button user_contactButton;
	 Button cost_guardButton;
	 Button Public_UtilitiesButton;
	 Button InstructionButton;
	 Button trafficPoliceB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        policeButton=(Button) findViewById(R.id.policeButton);
        
        trafficPoliceB = (Button) findViewById(R.id.trafficPoliceButton);
        
        fireButton=(Button) findViewById(R.id.fireButton);
        hpospitalButton=(Button) findViewById(R.id.hpospitalButton);
        ambulanceButton=(Button) findViewById(R.id.ambulanceButton);
        blood_bankButton=(Button) findViewById(R.id.blood_bankButton);
        doctorButton=(Button) findViewById(R.id.doctorButton);
        user_contactButton=(Button) findViewById(R.id. user_contactButton);
        cost_guardButton=(Button) findViewById(R.id.cost_guardButton);
        Public_UtilitiesButton=(Button) findViewById(R.id. Public_UtilitiesButton);
        InstructionButton=(Button) findViewById(R.id.InstructionButton);
        
        
        InstructionButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, Instruction.class);
				startActivityForResult(intent, 0);
				
			}
		});
       
        ambulanceButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Ambulance_Service");
				db.execSQL("CREATE TABLE IF NOT EXISTS Ambulance_Service (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO Ambulance_Service VALUES ('Compath Ambulance Service','01196233356')");
				db.execSQL("INSERT INTO Ambulance_Service VALUES ('PG Hospital Ambulance Service','01834367671')");
				db.execSQL("INSERT INTO Ambulance_Service VALUES ('Life line Ambulance Service','01191367822')");
				db.execSQL("INSERT INTO Ambulance_Service VALUES ('Prime Ambulance Service','01756367829')");
				db.execSQL("INSERT INTO Ambulance_Service VALUES ('ICDDR Ambulance Service','01810367821')");
				db.execSQL("INSERT INTO Ambulance_Service VALUES ('Rafa Ambulance Service','01711367815')");
				db.close();
				Log.i("log:", "Inserted");
				Intent intent = new Intent(MainActivity.this, Ambulance_Service.class);
				startActivityForResult(intent, 0);
				
			}
		});
        
        blood_bankButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS blood_bank_page");
				db.execSQL("CREATE TABLE IF NOT EXISTS blood_bank (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO blood_bank VALUES ('Shandhani','01196238584')");
				db.execSQL("INSERT INTO blood_bank VALUES ('Badhon Blood Bank','01724367675')");
				db.execSQL("INSERT INTO blood_bank VALUES ('Redcrecent Blood Bank','01710367822')");
				db.execSQL("INSERT INTO blood_bank VALUES ('Islami Bank Hospital Blood Bank','01734367829')");
				db.execSQL("INSERT INTO blood_bank VALUES ('Quantum Blood Bank','01710367821')");
				db.execSQL("INSERT INTO blood_bank VALUES ('Sir Salimullah College Blood Bank','01711367892')");
				db.close();
				Log.i("log:", "Inserted");
				Intent intent = new Intent(MainActivity.this, blood_bank_page.class);
				startActivityForResult(intent, 0);
			}
		});

        cost_guardButton.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS cost_guard_page");
				db.execSQL("CREATE TABLE IF NOT EXISTS cost_guard_page (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO cost_guard_page VALUES (' Dhaka Zone','0191238574')");
				db.execSQL("INSERT INTO cost_guard_page VALUES ('South Zone','01732436779')");
				db.execSQL("INSERT INTO cost_guard_page VALUES ('East Zone','01842786251')");
				db.execSQL("INSERT INTO cost_guard_page VALUES ('West Zone','01942786234')");
				db.close();
				Log.i("log:", "Inserted");
				
				Intent intent = new Intent(MainActivity.this, cost_guard_page.class);
				startActivityForResult(intent, 0);
			}
		});

        doctorButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Doctor_page");
				db.execSQL("CREATE TABLE IF NOT EXISTS Doctor (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO Doctor VALUES ('TB Hospital','0191238514')");
				db.execSQL("INSERT INTO Doctor VALUES ('Heart Foundation','01712436729')");
				db.execSQL("INSERT INTO Doctor VALUES ('Care Hospital','01912786251')");
				db.execSQL("INSERT INTO Doctor VALUES ('Central Hospital','01812786234')");
				db.execSQL("INSERT INTO Doctor VALUES ('Asian Hospital','0195238572')");
				db.execSQL("INSERT INTO Doctor VALUES ('Metro Hospital','01912436779')");
				db.execSQL("INSERT INTO Doctor VALUES ('SSMC','01742786251')");
				db.execSQL("INSERT INTO Doctor VALUES ('DMC','01194278623')");
				db.close();
				Log.i("log:", "Inserted");
				
				Intent intent = new Intent(MainActivity.this, Doctor_page.class);
				startActivityForResult(intent, 0);
			}
		});

		
        fireButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Fire_Service_page");
				db.execSQL("CREATE TABLE IF NOT EXISTS Fire_Service_page (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Sodhorghat','01822385841')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Tejgaon','01924367823')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Khilgaon','01914367824')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Kurmitola','01974367826')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Baridhara','01810367829')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Savar','01911367821')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('DEPZ','01811367829')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Mohammadpur','01711367820')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Lalbag','01722367823')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Mirpur','01911367827')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Polashi','01713367829')");
				db.execSQL("INSERT INTO Fire_Service_page VALUES ('Postogola','01941367829')");
				db.close();
				Log.i("log:", "Inserted");
				
				Intent intent = new Intent(MainActivity.this, Fire_Service_page.class);
				startActivityForResult(intent, 0);
			}
		});
		
        hpospitalButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Hospital");
				db.execSQL("CREATE TABLE IF NOT EXISTS Hospital (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO Hospital VALUES ('Apollo Hospitals Dhaka','01238584')");
				db.execSQL("INSERT INTO Hospital VALUES ('Square Hospital Dhaka','01724367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('green Life Hospital Dhaka','01714367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('Shomorita Hospital Dhaka','01774367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('BSMMU','01710367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('Birdem','01711367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('Ibn Sina Hospital','01711367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('Shohwardi Medical College Hospital','01711367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('United Hospital','01711367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('Holy Family Hospital','01711367481')");
				db.execSQL("INSERT INTO Hospital VALUES ('CMH','01711367825')");
				db.execSQL("INSERT INTO Hospital VALUES ('Mitford','01711367829')");
				db.execSQL("INSERT INTO Hospital VALUES ('United Hospital','01711367829')");
				
				db.close();
				Log.i("log:", "Inserted");
				
				Intent intent = new Intent(MainActivity.this, Hospital_page.class);
				startActivityForResult(intent, 0);
			}
		});
		
        
        policeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Police_page");
				db.execSQL("CREATE TABLE IF NOT EXISTS Police_page (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO Police_page VALUES ('Tejgaon Police Station','01194438584')");
				db.execSQL("INSERT INTO Police_page VALUES ('Dhanmondi Police Station','01712367822')");
				db.execSQL("INSERT INTO Police_page VALUES ('Mirpur Police Station','011924367828')");
				db.execSQL("INSERT INTO Police_page VALUES ('Uttara Police Station','01774367825')");
				db.execSQL("INSERT INTO Police_page VALUES ('Ramna Police Station','01811367820')");
				db.execSQL("INSERT INTO Police_page VALUES ('Kotwali Police Station','01610367238')");
				db.execSQL("INSERT INTO Police_page VALUES ('Kafrul Police Station','01938367811')");
				db.execSQL("INSERT INTO Police_page VALUES ('Badda Police Station','01738367523')");
				db.execSQL("INSERT INTO Police_page VALUES ('Gulsan Police Station','01638367852')");
				
				db.close();
				Log.i("log:", "Inserted");
				
				Intent intent = new Intent(v.getContext(), Police_page.class);
				startActivityForResult(intent, 0);
				
			}
		});
        
        
        
        trafficPoliceB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				try {
					SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
					db.execSQL("DROP TABLE IF EXISTS Traffic_page");
					db.execSQL("CREATE TABLE IF NOT EXISTS Traffic_page (name TEXT,contact TEXT);");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Tejgaon Traffic Police Station','01198438584')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Dhanmondi Traffic Police Station','01715367822')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Mirpur Traffic Police Station','01727367828')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Uttara Traffic Police Station','01784367825')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Motijeel Traffic Police Station','01713367820')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Badda Traffic Police Station','01712367823')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Shahbag Traffic Police Station','01738367823')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Palton Traffic Police Station','01738367823')");
					db.execSQL("INSERT INTO Traffic_page VALUES ('Newmarket Traffic Police Station','01738367823')");
					db.close();
					Log.i("log:", "Inserted");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Intent intent = new Intent(v.getContext(), Traffic_page.class);
				startActivity(intent);
			}
		});
        
        
       Public_UtilitiesButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Utilities");
				db.execSQL("CREATE TABLE IF NOT EXISTS Utilities (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO Utilities VALUES ('WASA Dhaka','0171238584')");
				db.execSQL("INSERT INTO Utilities VALUES ('DESCO','01732436779')");
				db.execSQL("INSERT INTO Utilities VALUES ('GAS Dhaka','01742786231')");
				db.close();
				Log.i("log:", "Inserted");
				Intent intent = new Intent(MainActivity.this, Utilities.class);
				startActivityForResult(intent, 0);
			}
		});
       
       user_contactButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = openOrCreateDatabase("EmergencyServiceDatabase", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS " + ContactTableInfo.databaseTableName);
				db.execSQL("CREATE TABLE IF NOT EXISTS user_contact (name TEXT,contact TEXT);");
				db.execSQL("INSERT INTO user_contact VALUES ('WASA Dhaka','0171238584')");
				db.execSQL("INSERT INTO user_contact VALUES ('DESCO','01732436779')");
				db.execSQL("INSERT INTO user_contact VALUES ('GAS Dhaka','01742786231')");
				db.close();
				Log.i("log:", "Inserted");
				Intent intent = new Intent(MainActivity.this, User_contact.class);
				startActivityForResult(intent, 0);
			}
		});
       
        
    }

	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
