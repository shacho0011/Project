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

public class DetailsShowPage extends Activity{
	TextView titleT;
	TextView descriptionT;
	Button webB;
	Context context = this;
	Cursor cursor;
	public static String Title, WebLink;
	public String Description; 
	public static int ColoumnSelection;
	public String databaseTableName = "AUSTDescription";
	DatabaseGetOperations dbop = new DatabaseGetOperations(context, databaseTableName);
	
	public static void setDetails(String title, int coloumnSelection, String webLink){
		Title = title;
		ColoumnSelection = coloumnSelection;
		WebLink = webLink;
	}
	
	
	public String getPageTitle(){
		return Title;
	}
	
	public String getWebLink(){
		return WebLink;
	}
	
	public int getColoumnSelection(){
		return ColoumnSelection;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details_show_page);
		
		titleT = (TextView) findViewById(R.id.titleText);
		descriptionT = (TextView) findViewById(R.id.descriptionText);
		webB = (Button) findViewById(R.id.referenceWebLinkButton);
		
		titleT.setText(Title);
		cursor = dbop.getAUSTDescriptionData(dbop);
		cursor.moveToFirst();
		try{
			do{
				Description = cursor.getString(ColoumnSelection);
				descriptionT.append(Description);
			}while(cursor.moveToNext());
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		webB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink(WebLink);
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
			}
		});
	}
		
}

