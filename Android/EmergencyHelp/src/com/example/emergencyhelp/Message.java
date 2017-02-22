package com.example.emergencyhelp;

import java.util.StringTokenizer;
import java.util.Vector;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Message extends Activity {
	Button btnSendSMS;String message = "Please call me!! \n Muajhid!!";
	
	 EditText txtPhoneNo;
	 EditText txtMessage; DataHelper dh;String CONTACTS[];
	 
	    int IDS[];String msg="";
	    //sensor
	    private static SensorManager sensorService;
		private Sensor sensor;
		
	    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        btnSendSMS = (Button) findViewById(R.id.button1);
        txtPhoneNo = (EditText) findViewById(R.id.phoneNumber);
        txtMessage = (EditText) findViewById(R.id.messageText);
        
        txtMessage.getText().toString();
        
        txtMessage.setText(message);
        Vector rows=new Vector();
        dh=new DataHelper(this);
        rows=dh.selectAll();
        dh.close();
        int size=rows.size();
        IDS=new int[size];
		CONTACTS=new String[size];
    	for(int i=0;i<rows.size();i++){
			Vector eachRecord=(Vector)rows.elementAt(i);
			String nameData=(String)eachRecord.elementAt(2);
			int idData=(Integer)eachRecord.elementAt(0);
			IDS[i]=idData;
			CONTACTS[i]=nameData;
		}
    	for(int i=0;i<CONTACTS.length;i++){
    		msg+=CONTACTS[i]+",";
    	}
    	String msg1=msg.substring(0, msg.length()-1);
        txtPhoneNo.setText(msg1);
        btnSendSMS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				message = txtMessage.getText().toString();
				
	            String phoneNo = txtPhoneNo.getText().toString();

	            StringTokenizer st=new StringTokenizer(phoneNo,",");
	            while (st.hasMoreElements())
	            {
	                String tempMobileNumber = (String)st.nextElement();
	                if(tempMobileNumber.length()>0 && message.trim().length()>0) {
	                    sendSMS(tempMobileNumber, message);
	                }
	                else {
	                    Toast.makeText(getBaseContext(), 
	                            "Please enter both phone number and message.", 
	                            Toast.LENGTH_SHORT).show();
	                }
	            }

				
			}
		});
    }
    
    
    
    private void sendSMS(String phoneNumber, String message){
        String SENT = "SMS_SENT";
        String DELIVERED = "SMS_DELIVERED";

        PendingIntent sentPI = PendingIntent.getBroadcast(this, 0,
            new Intent(SENT), 0);

        PendingIntent deliveredPI = PendingIntent.getBroadcast(this, 0,
            new Intent(DELIVERED), 0);

      //---when the SMS has been sent---
        registerReceiver(new BroadcastReceiver(){
            @Override
            public void onReceive(Context arg0, Intent arg1) {
                switch (getResultCode())
                {
                    case Activity.RESULT_OK:
                    	
                    	for(int i=0;i<CONTACTS.length;i++)
                        Toast.makeText(getBaseContext(), "SMS sent ", 
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        Toast.makeText(getBaseContext(), "Generic failure", 
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_NO_SERVICE:
                        Toast.makeText(getBaseContext(), "No service", 
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_NULL_PDU:
                        Toast.makeText(getBaseContext(), "Null PDU", 
                                Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_RADIO_OFF:
                        Toast.makeText(getBaseContext(), "Radio off", 
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        },new IntentFilter(SENT));

        //---when the SMS has been delivered---
        registerReceiver(new BroadcastReceiver(){
            @Override
            public void onReceive(Context arg0, Intent arg1) {
                switch (getResultCode())
                {
                    case Activity.RESULT_OK:
                        Toast.makeText(getBaseContext(), "SMS delivered", 
                                Toast.LENGTH_SHORT).show();
                        break;
                    case Activity.RESULT_CANCELED:
                        Toast.makeText(getBaseContext(), "SMS not delivered", 
                                Toast.LENGTH_SHORT).show();
                        break;                        
                }
            }
        }, new IntentFilter(DELIVERED));        

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, sentPI, deliveredPI);       
    }
    
    public class SmsReceiver extends BroadcastReceiver {

    	@Override
    	public void onReceive(Context context, Intent intent) {
    	    //---get the SMS message passed in---
    	    Bundle bundle = intent.getExtras();        
    	    SmsMessage[] msgs = null;
    	    String str = ""; 
    	    if (bundle != null)
    	    {
    	        //---retrieve the SMS message received---
    	        Object[] pdus = (Object[]) bundle.get("pdus");
    	        msgs = new SmsMessage[pdus.length];            
    	        for (int i=0; i<msgs.length; i++)
    	        {
    	            msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);                
    	            str += "SMS from " + msgs[i].getOriginatingAddress();                     
    	            str += " :";
    	            str += msgs[i].getMessageBody().toString();
    	            str += "\n";        
    	        }
    	        //---display the new SMS message---
    	        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    	    }   
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.message, menu);
        return true;
    }
  }