package com.example.emergencyhelp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Instruction extends Activity{
	
	TextView instructionT;
	String instruction = "\nHow to use:\n\nYou should go to your required service then click your desired or any one content then it will launch your default dailer with number. Just press "+"YES"+" button to make a call for emergency service\n\n"+"\nQuery:\n\nwww.emergencyhelpandroid.com.bd";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instruction);
		instructionT = (TextView) findViewById(R.id.instructionText);
		instructionT.setText(instruction);
	}
	
	
	
}
