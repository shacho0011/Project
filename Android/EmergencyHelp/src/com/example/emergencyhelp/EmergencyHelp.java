package com.example.emergencyhelp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EmergencyHelp extends Activity {
	private static SensorManager sensorService;
	private Sensor sensor;
	Button b1;
	TextView tv1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_help);
        tv1=(TextView)findViewById(R.id.textView1);
      b1=(Button)findViewById(R.id.button1);
        
        sensorService = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensor = sensorService.getDefaultSensor(Sensor.TYPE_ORIENTATION);
		if (sensor != null) {
			sensorService.registerListener(mySensorEventListener, sensor,
					SensorManager.SENSOR_DELAY_NORMAL);
			Log.i("Compass MainActivity", "Registerered for ORIENTATION Sensor");

		} else {
			Log.e("Compass MainActivity", "Registerered for ORIENTATION Sensor");
			Toast.makeText(this, "ORIENTATION Sensor not found",
					Toast.LENGTH_LONG).show();
			finish();
		}
	


        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(EmergencyHelp.this,Message.class);startActivity(i);
				
			}
		});
    }


int i=0;
    private SensorEventListener mySensorEventListener = new SensorEventListener() {

		@Override
		public void onAccuracyChanged(Sensor sensor, int accuracy) {
		}

		@Override
		public void onSensorChanged(SensorEvent event) {
			float azimuth = event.values[0];
		while(i<1000)
		{
			if(azimuth>10)
			{
				i++;
				
			}
			if(i==1000)
			{
				Intent in=new Intent(EmergencyHelp.this,Message.class);startActivity(in);
			}
			tv1.setText(""+azimuth);
		}
			
		}
	};

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (sensor != null) {
			sensorService.unregisterListener(mySensorEventListener);
		}
	}

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.emergency_help, menu);
        menu.add(0,0,0,"Add Contact").setIcon(R.drawable.add);
        menu.add(0,1,1,"Contact List").setIcon(R.drawable.icon);
        return true;
    }
    
  @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	 Intent i;
	  switch(item.getItemId()){
  	case 0:i=new Intent(this,ContactAdd.class);startActivity(i);
  	return true;
  	case 1:i=new Intent(this,ContactList.class);startActivity(i);
  	return true;
  		
  	
  	}
		return super.onOptionsItemSelected(item);
	}
}

