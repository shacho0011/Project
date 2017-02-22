package com.example.aust;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OpenWebViewClint extends WebViewClient {
	@Override
	public boolean shouldOverrideUrlLoading(WebView web, String url){
		try{
			web.loadUrl(url);
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
}
