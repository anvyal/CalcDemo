package com.sarvardha.calculatordemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (EditText) findViewById(R.id.output);
		text.setText("0");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// this method is called at button click because we assigned the name to the
		  // "OnClick property" of the button
		  public void onClick(View view) {
			
			float inputValue = Float.parseFloat(text.getText().toString());
			
		    switch (view.getId()) {
		    case R.id.button1:
		    	if(inputValue == 0)
		    	{
		    		text.setText("1");
		      	}
		    	else
		    		text.setText(text.getText()+"1");
		        break;
		    case R.id.button2:
		    	if(inputValue == 0)
		    	{
		    		text.setText("2");
		      	}
		    	else
		    		text.setText(text.getText()+"2");
		        break; 
		    case R.id.button3:
		    	if(inputValue == 0)
		    	{
		    		text.setText("3");
		      	}
		    	else
		    		text.setText(text.getText()+"3");
		        break; 
		    case R.id.button4:
		    	if(inputValue == 0)
		    	{
		    		text.setText("4");
		      	}
		    	else
		    		text.setText(text.getText()+"4");
		        break; 
		    case R.id.button5:
		    	if(inputValue == 0)
		    	{
		    		text.setText("5");
		      	}
		    	else
		    		text.setText(text.getText()+"5");
		        break; 
		    case R.id.button6:
		    	if(inputValue == 0)
		    	{
		    		text.setText("6");
		      	}
		    	else
		    		text.setText(text.getText()+"6");
		        break; 
		    case R.id.button7:
		    	if(inputValue == 0)
		    	{
		    		text.setText("7");
		      	}
		    	else
		    		text.setText(text.getText()+"7");
		        break; 
		    case R.id.button8:
		    	if(inputValue == 0)
		    	{
		    		text.setText("8");
		      	}
		    	else
		    		text.setText(text.getText()+"8");
		        break; 
		    case R.id.button9:
		    	if(inputValue == 0)
		    	{
		    		text.setText("9");
		      	}
		    	else
		    		text.setText(text.getText()+"9");
		        break; 
		    case R.id.button0:
		    	if(inputValue == 0)
		    	{
		    		//Do Nothing
		      	}
		    	else
		    		text.setText(text.getText()+"0");
		        break; 
		    case R.id.back:
		    	String str=text.getText().toString();
		    	if (str == null )
		    	{
		    		//Do Nothing
		    	}
		    	
	            if (str.length() >=1 ) { 
	                str = str.substring(0, str.length() - 1);
	                text.setText(str);
	                };
	            if (str.length() <1 ) {
	            	text.setText("0");
	            }
		    	    		    	
		        break;

		      
		    }
		  }

}
