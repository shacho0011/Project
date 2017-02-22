package com.example.emergencyhelp;

import java.util.Vector;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactUpdate extends Activity {
	EditText name;
	EditText number;
	Button save;
	DataHelper DataHelper;
	int id;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_update);
        Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		DataHelper=new DataHelper(this);
		id= extras.getInt("id");
		Vector record=DataHelper.getRecord(id);
       name=(EditText)findViewById(R.id.editText1);
       number=(EditText)findViewById(R.id.editText2);
       name.setText((String)record.elementAt(1));
       save=(Button)findViewById(R.id.button1);
       number.setText((String)record.elementAt(2));
       
       save.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String nameText=name.getText().toString();
			String numberText=number.getText().toString();
			DataHelper.update(nameText, numberText, id);
			DataHelper.close();
			Toast.makeText(ContactUpdate.this,"Contact Updated Successfully",Toast.LENGTH_LONG).show();
			Intent i = new Intent(ContactUpdate.this, EmergencyHelp.class);
			startActivity(i);
			
		}
	});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contact_update, menu);
        return true;
    }
}
