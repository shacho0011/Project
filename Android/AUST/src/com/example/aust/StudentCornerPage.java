package com.example.aust;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentCornerPage extends Activity{
	Button classroutineB;
	Button examroutineB;
	Button examresultB;
	Button academiccalendarB;
	Button studentwelfareB;
	Button gpaCalculatorB;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_corner_page);
		
		classroutineB = (Button) findViewById(R.id.class_routineButton);
		examroutineB = (Button) findViewById(R.id.exam_routineButton);
		examresultB = (Button) findViewById(R.id.exam_resultButton);
		academiccalendarB = (Button) findViewById(R.id.academic_calendar_student_corner_pageButton);
		studentwelfareB = (Button) findViewById(R.id.student_welfareButton);
		gpaCalculatorB = (Button) findViewById(R.id.gpaCalculatorButton);
		
		classroutineB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://aust.edu/class_routine.htm");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
				
			}
		});
		
		
		examroutineB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://aust.edu/exam_routine.html");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
				
			}
		});
		
		examresultB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://aust.edu/result/index.htm");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
				
			}
		});
		
		academiccalendarB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://aust.edu/academic_cal.htm");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
				
			}
		});
		
		studentwelfareB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://www.aust.edu");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
				
			}
		});
		
		gpaCalculatorB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://www.aust.edu");
				Intent intent = new Intent(v.getContext(), GPACalculatorPage.class);
				startActivity(intent);
				
			}
		});
		
	}
}
