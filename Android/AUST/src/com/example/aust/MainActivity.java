package com.example.aust;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	Button aboutB;
	Button austB;
	Button admissionB;
	Button academicB;
	Button notice_boardB;
	Button student_cornerB;
	Button departmentB;
	Button galleryB;
	Button contactB;
	Context context = this;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView mainGridV = (GridView) findViewById(R.id.mainGridView);
        mainGridV.setAdapter(new ImageAdapter(getApplicationContext()));
        
        mainGridV.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent;
				switch (position) {
				case 0:
					DetailsShowPage.setDetails("About", 0, "http://www.aust.edu/about_aust.html");
					intent = new Intent(v.getContext(), DetailsShowPage.class);
					startActivity(intent);
					break;
				case 1:
					intent = new Intent(v.getContext(), AustPage.class);
					startActivityForResult(intent, 0);
					break;
				case 2:
					intent = new Intent(v.getContext(), AcademicPage.class);
					startActivityForResult(intent, 0);
					break;
				case 3:
					OpenWebView.setWebLink("http://aust.edu/admission.htm");
					intent = new Intent(v.getContext(), OpenWebView.class);
					startActivity(intent);
					break;
				case 4:
					intent = new Intent(v.getContext(), DepartmentPage.class);
					startActivityForResult(intent, 0);
					break;
				case 5:
					intent = new Intent(v.getContext(), StudentCornerPage.class);
					startActivityForResult(intent, 0);
					break;
				case 6:
					OpenWebView.setWebLink("http://aust.edu/news_events.htm");
					intent = new Intent(v.getContext(), OpenWebView.class);
					startActivity(intent);
					break;
				case 7:
					intent = new Intent(v.getContext(), Gallery.class);
					startActivityForResult(intent, 0);
					break;
				case 8:
					intent = new Intent(v.getContext(), ContactPage.class);
					startActivityForResult(intent, 0);
					break;
				default:
					break;
				}
				
			}
		});
        
        /*aboutB = (Button)findViewById(R.id.aboutButton);
        austB = (Button)findViewById(R.id.austButton);
        admissionB = (Button)findViewById(R.id.admissionButton);
        academicB = (Button)findViewById(R.id.academicButton);
        notice_boardB = (Button)findViewById(R.id.notice_boardButton);
        student_cornerB = (Button)findViewById(R.id.student_cornerButton);
        departmentB = (Button)findViewById(R.id.departmentButton);
        galleryB = (Button)findViewById(R.id.galleryButton);
        contactB = (Button)findViewById(R.id.contactButton);
        
        aboutB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("About", 0, "http://www.aust.edu/about_aust.html");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
			}
		});
        
        austB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), AustPage.class);
				startActivityForResult(intent, 0);
			}
		});
        
		admissionB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://aust.edu/admission.htm");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
			}
		});
		
		academicB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), AcademicPage.class);
				startActivityForResult(intent, 0);
			}
		});
		
		student_cornerB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), StudentCornerPage.class);
				startActivityForResult(intent, 0);
			}
		});
		
		departmentB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				
				
				
				Intent intent = new Intent(v.getContext(), DepartmentPage.class);
				startActivityForResult(intent, 0);
			}
		});
		
		notice_boardB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://aust.edu/news_events.htm");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
			}
		});
	    
	    galleryB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), Gallery.class);
				startActivityForResult(intent, 0);
			}
		});
	    
		contactB.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(v.getContext(), ContactPage.class);
				startActivityForResult(intent, 0);
			}
		});*/

    }
    
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
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
