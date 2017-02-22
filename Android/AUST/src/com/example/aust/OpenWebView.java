package com.example.aust;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class OpenWebView extends Activity{
	
	Button backwardB;
	Button forwardB;
	Button refreshB;
	
	private WebView webview;
	static String request = "http://www.aust.edu/";
	
	public static void setWebLink(String link) {
		// TODO Auto-generated constructor stub
		request = link;
	}
	
	public String getWebLink() {
		// TODO Auto-generated constructor stub
		return request;
	}
	
	@SuppressLint("SetJavaScriptEnabled") @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser);
		
		backwardB = (Button) findViewById(R.id.backwardButton);
		forwardB = (Button) findViewById(R.id.forwardButton);
		refreshB = (Button) findViewById(R.id.refreshButton);
		
		webview = (WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.getSettings().setLoadWithOverviewMode(true);
		webview.getSettings().setUseWideViewPort(true);
		webview.setWebViewClient(new OpenWebViewClint());
		webview.getSettings().setBuiltInZoomControls(true);
		webview.getSettings().setSupportZoom(true);
		
		try{
			webview.loadUrl(getWebLink());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		backwardB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(webview.canGoBack())
					webview.goBack();
				
			}
		});
		
		forwardB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(webview.canGoForward())
					webview.goForward();
			}
		});
		
		refreshB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				webview.reload();
			}
		});
		
	}
}
