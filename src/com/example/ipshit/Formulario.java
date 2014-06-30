package com.example.ipshit;


import com.example.ipshit.AdminSQLiteOpenHelper;


import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Formulario extends Activity {

	
	private EditText et1 , et2, et3, et4 ;
	private Spinner spinner1;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.formulario);
	        
	        et1 = (EditText) findViewById(R.id.et1);
	        et2 = (EditText) findViewById(R.id.et2);
	        et3 = (EditText) findViewById(R.id.et3);
	        et4 = (EditText) findViewById(R.id.et4);
	       
	        
	        spinner1 = (Spinner) findViewById(R.id.spinner1);
	        String []opciones={"Sugerencia","Reclamo"};        
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
	        spinner1.setAdapter(adapter);
	        
	 }
	 
	        public boolean onCreateOptionsMenu(Menu menu) {
	            // Inflate the menu; this adds items to the action bar if it is present.
	            getMenuInflater().inflate(R.menu.main, menu);
	            return true;
	        }
	      
	        public void enviar(View view){
	    			 Intent i = new Intent(this , formulario2.class);
	    			 String selec=spinner1.getSelectedItem().toString();
	    				if(selec.equals("Reclamo")){
	    				 Toast.makeText(this, "Ud a enviado un reclamo",
	    		             Toast.LENGTH_SHORT).show();
	    			 } else{
	    				
	    		         Toast.makeText(this, "Ud a enviado una sugerencia",
	    		                 Toast.LENGTH_SHORT).show();
	    			 }
	    				i.putExtra("paso1", et1.getText().toString());
	    	        	i.putExtra("paso2", et2.getText().toString());
	    	        	i.putExtra("paso3", et4.getText().toString());
	    	        	i.putExtra("paso4", spinner1.getSelectedItem().toString());
	    	        	 startActivity(i);
	    			 AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
	    		                "Formulario", null, 1);
	    		        SQLiteDatabase Formulario = admin.getWritableDatabase();
	    		       
	    		        String nombre = et1.getText().toString();
	    		        String apellido = et2.getText().toString();
	    		        String tipo = spinner1.getSelectedItem().toString();
	    		        String comentario = et4.getText().toString();
	    		        ContentValues dato = new ContentValues();
	    		        dato.put("nombre", nombre);
	    		        dato.put("apellido", apellido);
	    		        dato.put("tipo", tipo);
	    		        dato.put("comentario", comentario);
	        	        et1.setText("");
	    		        et2.setText("");
	    		        et3.setText("");
	    		        et4.setText("");
	    		        Formulario.insert("dato", null, dato);
	    		        Formulario.close();
	    		        
	    		   
	        
	    			 }
	        
}
	        		
	    			
	

     
