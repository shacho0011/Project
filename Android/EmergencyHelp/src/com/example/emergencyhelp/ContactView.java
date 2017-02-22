package com.example.emergencyhelp;

import java.util.Vector;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactView extends Activity {
	TextView Name;
    TextView Number;
	ImageView edit;
	ImageView delete;
	DataHelper DataHelper;
	int id;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_view);
        Bundle extras = getIntent().getExtras();
		if (extras == null) {
			return;
		}
		DataHelper = new DataHelper(this);
		 id= extras.getInt("id");
		Vector record=DataHelper.getRecord(id);
	
       Name=(TextView)findViewById(R.id.textView3);
       Number=(TextView)findViewById(R.id.textView4);
       if(record!=null||record.size()==0){
		Name.setText((String)record.elementAt(1));
		Number.setText((String)record.elementAt(2));
       }
      
       /*edit=(ImageView)findViewById(R.id.imageView1);
       delete=(ImageView)findViewById(R.id.imageView2);*/
       
    edit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i=new Intent(ContactView.this,ContactUpdate.class);
			i.putExtra("id",id);
			DataHelper.close();
			startActivity(i);
			
		}
	});
    
    delete.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			DataHelper.delete(id);
			DataHelper.close();
   			Intent i=new Intent(ContactView.this,EmergencyHelp.class);
			startActivity(i);
			
		}
	});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contact_view, menu);
        return true;
    }
}
