package com.example.aust;

import com.example.database.DatabaseGetOperations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DepartmentDetails extends Activity{
	TextView department_titleT;
	Button faculty_detailB;
	TextView departmentDescriptionT;
	
	Context context = this;
	Cursor cursor;
	
	DatabaseGetOperations dbop;
	String departmentDescription;
	static String title;
	static String descriptionTableName;
	static String facultyTableName;
	static int coloumn;
	
	public static void setDepartmentTitle(String Title){
		title = Title;
	}
	
	
	public String getDepartmentTitle(){
		
		return title;
	}
	
	public static void setDescriptionTableName(String DescriptionTableName){
		descriptionTableName = DescriptionTableName;
	}
	
	
	public String getDescriptionTableName(){
		
		return descriptionTableName;
	}
	
	public static void setColoumNumber(int Coloumn){
		coloumn = Coloumn;
	}
	
	
	public int getColoumNumber(){
		
		return coloumn;
	}
	
	public static void setFacultyTableName(String FacultyTableName){
		facultyTableName = FacultyTableName;
	}
	
	
	public String getFacultyTableName(){
		
		return facultyTableName;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.variable_department_page);
		
		department_titleT = (TextView)findViewById(R.id.department_titleText);
		faculty_detailB = (Button) findViewById(R.id.faculty_detailsButton);
		departmentDescriptionT = (TextView)findViewById(R.id.department_descriptionText);
		
		department_titleT.setText(title);
		
		faculty_detailB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String getTableName = getFacultyTableName();
				FacultyMemberShowPage.setTableName(getTableName);
				Intent intent = new Intent(v.getContext(), FacultyMemberShowPage.class);
				startActivity(intent);
				//variable = new FacultyMemberShowPage(facultyTableName);
			}
		});
		
		dbop = new DatabaseGetOperations(context, descriptionTableName);
		cursor = dbop.getDepartmentDescriptionData(dbop);
		departmentDescriptionT.setText("");
		cursor.moveToFirst();
		try{
			do{
				departmentDescription = cursor.getString(coloumn);
				departmentDescriptionT.append(departmentDescription);
			}while(cursor.moveToNext());
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
