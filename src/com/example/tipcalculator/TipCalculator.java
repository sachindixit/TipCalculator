package com.example.tipcalculator;

//import java.util.ArrayList;
//import com.example.todo.R;
//import org.w3c.dom.Text;
//import android.R.integer;
//import java.io.IOException;

//import org.apache.commons.io.FileUtils;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;

public class TipCalculator extends Activity {
	private EditText Amount;
	private TextView Result;
	private Double res;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);	  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}

	public void onClick10Pct(View v) {
		 Amount = (EditText) findViewById(R.id.Amount);
		 Result = (TextView) findViewById(R.id.tvResult);
		 if (!Amount.getText().toString().trim().equals("")) {
			 res = Double.parseDouble(Amount.getText().toString()) * 10/100;
			 Result.setText(""+res);
		 }
		 else {
			 Result.setText("");
		 }
	}
	
	public void onClick15Pct(View v) {
		 Amount = (EditText) findViewById(R.id.Amount);
		 Result = (TextView) findViewById(R.id.tvResult);
		 if (!Amount.getText().toString().trim().equals("")) {
	         res = Double.parseDouble(Amount.getText().toString()) * 15/100;
			 Result.setText(""+res);
		 }
		 else {
			 Result.setText("");
		 }		 
	}
	
	public void onClick20Pct(View v) {
		 Amount = (EditText) findViewById(R.id.Amount);
		 Result = (TextView) findViewById(R.id.tvResult);
		 if (!Amount.getText().toString().trim().equals("")) {
	         res = Double.parseDouble(Amount.getText().toString()) * 20/100;
			 Result.setText(""+res);
		 }
		 else {
			 Result.setText("");
		 }

	 }
}
