package com.example.aust;

import java.io.IOException;
import java.util.List;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Dialog;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GoogleMapView extends FragmentActivity{
	
	private static final int GPS_ERRORDIALOG_REQUEST = 9001;
	GoogleMap myGMap;
	MapView myGMapView;
	MarkerOptions marker = new MarkerOptions();
	Button searchB;
	
	private static final double AUST_LAT = 23.763774;
	private static final double AUST_LNG = 90.406644;
	private static final float DEFAULT_ZOOM = 15;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		if(serviceChecker()){
			setContentView(R.layout.google_maps);

			//myGMapView = (MapView) findViewById(R.id.austMapView);
			//myGMapView.onCreate(savedInstanceState);
			
			if(initMap()){
				Toast.makeText(this, "Map is Ready... :D" , Toast.LENGTH_LONG).show();
				gotoLocation(AUST_LAT, AUST_LNG, DEFAULT_ZOOM);
			}
			else Toast.makeText(this, "Map is not available... :(" , Toast.LENGTH_LONG).show();
			myGMap.setBuildingsEnabled(true);

			searchB = (Button) findViewById(R.id.placeSearchButton);
			searchB.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					try {
						gotoSearchedLocation(v);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_type, menu);
        return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch (item.getItemId()) {
		case R.id.noneMapType:
			myGMap.setMapType(GoogleMap.MAP_TYPE_NONE);
			break;
		case R.id.normalMapType:
			myGMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);		
			break;
		case R.id.hybridMapType:
			myGMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			break;
		case R.id.terrianMapType:
			myGMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
			break;
		case R.id.satelliteMapType:
			myGMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
			break;
		case R.id.currentLocation:
			myGMap.setMyLocationEnabled(true);
			break;
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	public boolean serviceChecker(){
		
		int isAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
		
		if(isAvailable == ConnectionResult.SUCCESS)
			return true;
		else if(GooglePlayServicesUtil.isUserRecoverableError(isAvailable)){
			Dialog myGMapDialog = GooglePlayServicesUtil.getErrorDialog(isAvailable, this, GPS_ERRORDIALOG_REQUEST);
			myGMapDialog.show();
		}
		else Toast.makeText(this, "Can't connect to Google Play Service... :(" , Toast.LENGTH_LONG).show();
		
		return false;
	}
	
	private boolean initMap(){
		if (myGMap == null) {
			SupportMapFragment myGMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.austMapView);
			myGMap = myGMapFragment.getMap();
		}
		return (myGMap != null);
	}
	
	private void gotoLocation(double lat, double lna){
		LatLng latlng = new LatLng(lat, lna);
		CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLng(latlng);
		myGMap.moveCamera(cameraUpdate);
	}
	
	private void gotoLocation(double lat, double lng, float defaultZoom) {
		LatLng latlng = new LatLng(lat, lng);
		CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latlng, defaultZoom);
		myGMap.moveCamera(cameraUpdate);
		
		marker.position(new LatLng(lat, lng));
		myGMap.addMarker(marker);
	}
	
	private void gotoSearchedLocation(View v) throws IOException{
		hideSoftKeyBoard(v);
		EditText searchLocationE = (EditText) findViewById(R.id.placeSearchEdit);
		String searchLocation = searchLocationE.getText().toString();
		if(searchLocation.length() == 0){
			Toast.makeText(this, "Please type a place... :)" , Toast.LENGTH_LONG).show();
		}
		Geocoder myGeocoder = new Geocoder(this);
		List<Address> myLocationList = myGeocoder.getFromLocationName(searchLocation, 1);
		Address myLocationAddress = myLocationList.get(0);
		String locality = myLocationAddress.getLocality();
		Toast.makeText(this, locality , Toast.LENGTH_LONG).show();
		double lat = myLocationAddress.getLatitude();
		double lng = myLocationAddress.getLongitude();
		gotoLocation(lat, lng, DEFAULT_ZOOM);
		
		marker.title(locality);
		marker.position(new LatLng(lat, lng));
		myGMap.addMarker(marker);
	}
	
	
	private void hideSoftKeyBoard(View v) {
		InputMethodManager inputMM = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		inputMM.hideSoftInputFromWindow(v.getWindowToken(), 0);
		
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		GoogleMapState saveMap = new GoogleMapState(this);
		saveMap.saveMapState(myGMap);
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		GoogleMapState savedMap = new GoogleMapState(this);
		CameraPosition position = savedMap.getSavedCameraPosition();
		if(position != null){
			CameraUpdate updateCamera = CameraUpdateFactory.newCameraPosition(position);
			myGMap.moveCamera(updateCamera);
		}
	}
}
