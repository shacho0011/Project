package com.example.aust;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class GPACalculatorPage extends Activity{

	Button nextSubjectB;
	Button resultB;
	EditText numberE;
	EditText gpaResultE;
	EditText greadResultE;
	TextView gpaTitleT;
	
	RadioGroup creditRG;
	RadioButton creditB;
	
	String readNumber;
	
	float GPA = (float) 0.00, totalGPACredit = (float) 0.00, totalCredit = (float) 0.00, result = (float) 0.00;
		
	public static float number = (float) 0.00, creditH = (float) 0.00;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gpa_calculator);

		gpaTitleT = (TextView) findViewById(R.id.gpaTitleText);
		nextSubjectB = (Button) findViewById(R.id.nextSubjectButton);
		resultB = (Button) findViewById(R.id.resultButton);
		creditRG = (RadioGroup) findViewById(R.id.creditHourRadioGroup);
		
		gpaTitleT.setText("Respective Subject Credit Hour & Number");
		
		creditRG.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == R.id.credit75RadioButton) creditH = (float) 0.75;
				else if(checkedId == R.id.credit150RadioButton) creditH = (float) 1.50;
				else if(checkedId == R.id.credit300RadioButton) creditH = (float) 3.00;
			}
		});
		
		nextSubjectB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hideSoftKeyBoard(v);
				numberE = (EditText) findViewById(R.id.numberEditText);
				try {
					if(creditH == 0.00){
						Toast.makeText(getBaseContext(),"Please first select credit hour",Toast.LENGTH_LONG).show();
					}
					else{
						readNumber = numberE.getText().toString();
						number = Float.parseFloat(readNumber);
						GPA = GPACalculation.GPA(number);
						
						totalGPACredit = totalGPACredit + (GPA*creditH);
						totalCredit = totalCredit + creditH;
						Toast.makeText(getBaseContext(),"GPA: "+GPA+" Credit: "+creditH,Toast.LENGTH_LONG).show();
						numberE.setText("");
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					Toast.makeText(getBaseContext(),"Error!\nPlease check your data",Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
				
			}
		});
		
		resultB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hideSoftKeyBoard(v);
				gpaResultE = (EditText) findViewById(R.id.gpaResultEditText);
				greadResultE = (EditText) findViewById(R.id.greadResultEditText);
				numberE = (EditText) findViewById(R.id.numberEditText);
				
				try {
					if(creditH == 0){
						Toast.makeText(getBaseContext(),"Please first select credit hour",Toast.LENGTH_LONG).show();
					}
					else{
						readNumber = numberE.getText().toString();
						number = Float.parseFloat(readNumber);
						GPA = GPACalculation.GPA(number);
						totalGPACredit = totalGPACredit + (GPA*creditH);
						totalCredit = totalCredit + creditH;
						result = totalGPACredit/totalCredit;
						
						String finalGPA = Float.toString(result);
						String finalLetterGread = GPACalculation.LetterGrade(result);
						gpaResultE.setText(finalGPA);
						greadResultE.setText(finalLetterGread);
						if(result>=2.00){
							Toast.makeText(getBaseContext(),"Congrats!",Toast.LENGTH_LONG).show();
						}
						else {
							Toast.makeText(getBaseContext(),"Sorry!",Toast.LENGTH_LONG).show();
						}
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					Toast.makeText(getBaseContext(),"Error...! Please check your data",Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
				
				numberE.setText("");
				GPA = (float) 0.00; 
				totalGPACredit = (float) 0.00; 
				totalCredit = (float) 0.00; 
				result = (float) 0.00;
				number = (float) 0.00; 
				creditH = (float) 0.00;

			}
		});
	}
	
	private void hideSoftKeyBoard(View v) {
		InputMethodManager inputMM = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		inputMM.hideSoftInputFromWindow(v.getWindowToken(), 0);
		
	}
	
}
