package com.example.emergencyhelp;

import com.example.emergencyhelp.DataHelper.ContactTableInfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactAdd extends Activity {
	
	EditText name;
	EditText number;
	Button save;
	GetOperations database;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_add);
        name=(EditText)findViewById(R.id.editText1);
        number=(EditText)findViewById(R.id.editText2);
        save=(Button)findViewById(R.id.button1);
        
        database = new GetOperations(this, ContactTableInfo.databaseTableName);
        
        save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nameText=name.getText().toString();
				String numberText=number.getText().toString();
				database.InsertUserContact(database, nameText, numberText);
				
				Toast.makeText(ContactAdd.this,"Contact saved Successfully",Toast.LENGTH_LONG).show();
				
				/*Intent i=new Intent(ContactAdd.this,EmergencyHelp.class);
				startActivity(i);	*/
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contact_add, menu);
        return true;
    }
}
        