package com.example.aust;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DepartmentPage extends Activity{
	Button architectureB;
	Button arts_scienceB;
	Button civilB;
	Button textileB;
	Button cseB;
	Button eeeB;
	Button mpeB;
	Button bbaB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.department_page);
		
		architectureB = (Button) findViewById(R.id.architectureButton);
		arts_scienceB = (Button) findViewById(R.id.arts_and_secienceButton);
		civilB = (Button) findViewById(R.id.civilButton);
		textileB = (Button) findViewById(R.id.textileButton);
		cseB = (Button) findViewById(R.id.cseButton);
		eeeB = (Button) findViewById(R.id.eeeButton);
		mpeB = (Button) findViewById(R.id.mpeButton);
		bbaB = (Button) findViewById(R.id.bbaButton);
		
		
		architectureB.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(0);
				DepartmentDetails.setFacultyTableName("ArchitectureFaculty");
				DepartmentDetails.setDepartmentTitle("Architecture");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Architecture", "DepartmentDescription", 0, "ArchitectureFaculty");
			}
		});
		
		arts_scienceB.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(7);
				DepartmentDetails.setFacultyTableName("ArtsAndScienceFaculty");
				DepartmentDetails.setDepartmentTitle("Arts and Science");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Arts and Science", "DepartmentDescription", 7, "ArtsAndScienceFaculty");
			}
		});
		
		civilB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(4);
				DepartmentDetails.setFacultyTableName("CivilFaculty");
				DepartmentDetails.setDepartmentTitle("Civil Engineering");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Civil Engineering", "DepartmentDescription", 4, "CivilFaculty");
			}
		});
		
		textileB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(5);
				DepartmentDetails.setFacultyTableName("TextileFaculty");
				DepartmentDetails.setDepartmentTitle("Textile Engineering");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Textile Engineering", "DepartmentDescription", 5, "TextileFaculty");
			}
		});
		
		cseB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(1);
				DepartmentDetails.setFacultyTableName("CSEFaculty");
				DepartmentDetails.setDepartmentTitle("Computer Science and Engineering");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Computer Science and Engineering", "DepartmentDescription", 1, "CSEFaculty");
			}
		});
		
		eeeB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(2);
				DepartmentDetails.setFacultyTableName("EEEFaculty");
				DepartmentDetails.setDepartmentTitle("Electrical and Electronic Engineering");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Electrical and Electronic Engineering", "DepartmentDescription", 2, "EEEFaculty");
			}
		});
		
		mpeB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(3);
				DepartmentDetails.setFacultyTableName("MPEFaculty");
				DepartmentDetails.setDepartmentTitle("Mechanical and Production Engineering");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Mechanical and Indriastial Production Engineering", "DepartmentDescription", 3, "MPEFaculty");
			}
		});
		
		bbaB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DepartmentDetails.setColoumNumber(6);
				DepartmentDetails.setFacultyTableName("BBAFaculty");
				DepartmentDetails.setDepartmentTitle("Bachelor of Business Administration");
				DepartmentDetails.setDescriptionTableName("DepartmentDescription");
				Intent intent = new Intent(v.getContext(), DepartmentDetails.class);
				startActivity(intent);
				//variable = new DepartmentDetails("Bachelor of Business Administration", "DepartmentDescription", 6, "BBAFaculty");
			}
		});
		
	}
}
