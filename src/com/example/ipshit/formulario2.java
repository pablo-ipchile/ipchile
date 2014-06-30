package com.example.ipshit;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class formulario2 extends Activity {
	private TextView tvNombre,tvApellido,tvSpinner,tvComentario;
	private Button btnVol;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario2);
        tvNombre= (TextView)findViewById(R.id.tvNombre);
        Bundle traer = getIntent().getExtras();
        tvNombre.setText(traer.getString("paso1"));
     	
    
        tvApellido= (TextView)findViewById(R.id.tvApellido);
        Bundle traer1 = getIntent().getExtras();
        tvApellido.setText(traer1.getString("paso2"));
    
    
        tvComentario= (TextView)findViewById(R.id.tvComentario);
        Bundle traer2 = getIntent().getExtras();
        tvComentario.setText(traer2.getString("paso3"));
    
 
        tvSpinner= (TextView)findViewById(R.id.tvSpinner);
        Bundle traer3 = getIntent().getExtras();
        tvSpinner.setText(traer3.getString("paso4"));
    

    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
        
    }
    public void volver(View view){
		 Intent h = new Intent(this , MainActivity.class);
		 startActivity(h);
		
			finish();
}

}