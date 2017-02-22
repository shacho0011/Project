package com.example.aust;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcademicPage extends Activity{
	
	Button recognizationB;
	Button exam_and_grading_systemB;
	Button labB;
	Button libraryB;
	Button academic_calendarB;
	Button tutions_and_feesB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.academic_page);
		
		recognizationB = (Button) findViewById(R.id.recognizationButton);
		exam_and_grading_systemB = (Button) findViewById(R.id.exam_grading_systemButton);
		labB = (Button) findViewById(R.id.lab_academic_pageButton);
		libraryB = (Button) findViewById(R.id.library_academic_pageButton);
		academic_calendarB = (Button) findViewById(R.id.academic_calendar_academic_pageButton);
		tutions_and_feesB = (Button) findViewById(R.id.tutions_and_feesButton);
		
		recognizationB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Recognization", 1, "http://www.aust.edu/accreditation.htm");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		
		
		exam_and_grading_systemB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Exam and Grading System", 6, "http://www.aust.edu/academics_grading.html");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		
		labB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Lab", 9, "http://www.aust.edu/academics_labs.html");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		
		libraryB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Library", 10, "http://www.aust.edu/academics_library.html");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		
		academic_calendarB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://aust.edu/academic_cal.htm");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
				
			}
		});
		
		tutions_and_feesB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Tutions and Fees", 7, "http://www.aust.edu/admission_tuition.htm");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		
	}
}
