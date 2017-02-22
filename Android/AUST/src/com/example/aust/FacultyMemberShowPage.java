package com.example.aust;

import com.example.database.DatabaseGetOperations;
import com.example.database.TableModel.FacultyMemberTableInfo;
import com.example.database.TableModel.FacultyMemberTableInfo_INT;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FacultyMemberShowPage extends Activity{
	
	String searchFacultyMemberName;
	Context context = this;
	Cursor cursor;
	static String tableName;
	String getTableName;
	DatabaseGetOperations database;
	
	EditText searchE;
	Button searchB;

	public static void setTableName(String TableName){
		tableName = TableName;
	}
	
	public String getTableName(){
		return tableName;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.faculty_member_list_view);
		
		database = new DatabaseGetOperations(context, getTableName());
		searchB = (Button) findViewById(R.id.searchButton);
		searchB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nameF;
				hideSoftKeyBoard(v);
				searchE = (EditText) findViewById(R.id.searchEdit);
				String namefaculty = searchE.getText().toString();
				Cursor mySCursor = database.getSelectionData(database, namefaculty);
				mySCursor.moveToFirst();
				try {
					if(mySCursor != null){
						do {
							nameF = mySCursor.getString(FacultyMemberTableInfo_INT.NAME);
							ShowListViewOnSearch(nameF);
						} while (mySCursor.moveToNext());
					}
					else{
						Toast.makeText(v.getContext(), "Not available...\nTry with full name", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					Toast.makeText(v.getContext(), "Error... Try with full name", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
				
			}
		});

		ShowListView();
		registerListClickCallBack();

	}
		
		private void ShowListView(){
		
			Cursor cursor = database.getAllData(database);
			startManagingCursor(cursor);
			String[] Field = new String[]{FacultyMemberTableInfo.name, FacultyMemberTableInfo.designation, FacultyMemberTableInfo.cellNumber, FacultyMemberTableInfo.email};
			int[] ViewID = new int[]{R.id.nameText, R.id.designationText, R.id.contactText, R.id.emailText};
			
			SimpleCursorAdapter myAdapter = null;
			
			myAdapter = new SimpleCursorAdapter(this, R.layout.list_item, cursor, Field, ViewID);
			ListView myListView = (ListView) findViewById(R.id.facultyListView);
			myListView.setAdapter(myAdapter);
		}
	
		public void ShowListViewOnSearch(String facultyName){

				Cursor cursor = database.getSelectionData(database, facultyName);
				startManagingCursor(cursor);
				String[] Field = new String[]{FacultyMemberTableInfo.name, FacultyMemberTableInfo.designation, FacultyMemberTableInfo.email, FacultyMemberTableInfo.cellNumber};
				int[] ViewID = new int[]{R.id.nameText, R.id.designationText, R.id.contactText, R.id.emailText};
				
				SimpleCursorAdapter myAdapter = null;
				myAdapter = new SimpleCursorAdapter(this, R.layout.list_item, cursor, Field, ViewID);
				ListView myListView = (ListView) findViewById(R.id.facultyListView);
				myListView.setAdapter(myAdapter);

		}
	
		private void registerListClickCallBack(){
			ListView myListView = (ListView) findViewById(R.id.facultyListView);
			myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					//database = new DatabaseGetOperations(context, getTableName());
					Cursor myCursor = database.mySelectedRow(database, id);
					
					if(myCursor != null){
						String name = myCursor.getString(FacultyMemberTableInfo_INT.NAME);
						String cellNumber = myCursor.getString(FacultyMemberTableInfo_INT.CELL_NUMBER);
						Toast.makeText(view.getContext(), name, Toast.LENGTH_LONG).show();
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",cellNumber, null));
						startActivity(intent);
					}
					myCursor.close();
					
				}
			});
			
		}
	
	
		private void hideSoftKeyBoard(View v) {
			InputMethodManager inputMM = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
			inputMM.hideSoftInputFromWindow(v.getWindowToken(), 0);
			
		}
	
}
