package com.example.ipshit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class sedes extends Activity {

	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sedes);
	    }
//Hola

	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }	
	    
	    
	    
	    
	    public void sj(View v){
	    	Intent i = new Intent (this, sedesanjoaquin.class);
	    	startActivity(i);
	    }
}
