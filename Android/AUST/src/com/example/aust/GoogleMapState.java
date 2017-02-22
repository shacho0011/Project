package com.example.aust;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

import android.content.Context;
import android.content.SharedPreferences;

public class GoogleMapState {
	private static final String LATITUDE = "latitude";
	private static final String LONGITUDE = "longitude";
	private static final String ZOOM = "zoom";
	private static final String BEARING = "bearing";
	private static final String TILT = "tilt";
	private static final String MAPTYPE = "maptype";
	private static final String PREFS_NAME = "mapCameraState";
	
	private SharedPreferences mapStatePrefs;
	
	public GoogleMapState(Context context){
		mapStatePrefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
	}
	
	public void saveMapState(GoogleMap map){
		SharedPreferences.Editor editor = mapStatePrefs.edit();
		CameraPosition cPosition = map.getCameraPosition();
		
		editor.putFloat(LATITUDE, (float) cPosition.target.latitude);
		editor.putFloat(LATITUDE, (float) cPosition.target.latitude);
		editor.putFloat(ZOOM, cPosition.zoom);
		editor.putFloat(BEARING, cPosition.bearing);
		editor.putFloat(TILT, cPosition.tilt);
		editor.putInt(MAPTYPE, map.getMapType());
		editor.commit();
	}
	
	public CameraPosition getSavedCameraPosition(){
		double latitude = mapStatePrefs.getFloat(LATITUDE, 0);
		if(latitude == 0){
			return null;
		}
		double longitude = mapStatePrefs.getFloat(LONGITUDE, 0);
		LatLng targetLatLng = new LatLng(latitude, longitude);
		float zoom = mapStatePrefs.getFloat(ZOOM, 0);
		float bearing = mapStatePrefs.getFloat(BEARING, 0);
		float tilt = mapStatePrefs.getFloat(TILT, 0);
		CameraPosition position = new CameraPosition(targetLatLng, zoom, tilt, bearing);
		return position;
	}

}
