package com.example.aust;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AustPage extends Activity{
	Button recognizationB;
	Button rankingB;
	Button internationalB;
	Button researchB;
	Button publicationB;
	Button vacancyB;
	
	public int selection = 0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aust_page);
		
		recognizationB = (Button) findViewById(R.id.recognization_aust_pageButton);
		rankingB = (Button) findViewById(R.id.rankingButton);
		internationalB = (Button) findViewById(R.id.internationalButton);
		researchB = (Button) findViewById(R.id.researchButton);
		publicationB = (Button) findViewById(R.id.publicationsButton);
		vacancyB = (Button) findViewById(R.id.vacancyButton);
		
		recognizationB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Recognization", 1, "http://www.aust.edu/accreditation.htm");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		
		
		rankingB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Ranking", 2, "http://www.aust.edu/aust_ranking.htm");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		internationalB.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("International", 3, "http://www.aust.edu/international.htm");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		researchB.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Research", 4, "http://www.aust.edu/research.htm");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		publicationB.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DetailsShowPage.setDetails("Publication", 5,"http://www.aust.edu/publication/index.htm");
				Intent intent = new Intent(v.getContext(), DetailsShowPage.class);
				startActivity(intent);
				
			}
		});
		vacancyB.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				OpenWebView.setWebLink("http://www.aust.edu/career_at_aust.htm");
				Intent intent = new Intent(v.getContext(), OpenWebView.class);
				startActivity(intent);
			}
		});
	}
}
