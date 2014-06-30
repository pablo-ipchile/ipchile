package com.example.ipshit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class sedesanjoaquin extends Activity{
	
	private Spinner spinner1;
	private Spinner spinner2;
	private Spinner spinner3;
	private Spinner spinner4;
	private Spinner spinner5;
	private Spinner spinner6;

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sedesanjoaquin);
	        
	        spinner1 = (Spinner) findViewById(R.id.spinner1);
	        String []opciones={"----------Seleccione--------------",
	        		"T�cnico en Administraci�n de Empresas menci�n Finanzas: Diurno-Vespertino",
	        		"T�cnico en Administraci�n de Empresas menci�n Procesos Log�sticos: Diurno-Vespertino",
	        		"Contabilidad General: Vespertino"};        
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
	        spinner1.setAdapter(adapter);
	        
	        
	        spinner2 = (Spinner) findViewById(R.id.spinner2);
	        String []opciones2={"----------Seleccione--------------","T�cnico en Deportes: Diurno-Vespertino",
	        		"Preparaci�n F�sica: Diurno-Vespertino"};        
	        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones2);
	        spinner2.setAdapter(adapter2);
	        
	        
	        spinner3 = (Spinner) findViewById(R.id.spinner3);
	        String []opciones3={"----------Seleccione--------------",
	        		            "T�cnico en Enfermer�a: Diurno-Vespertino",
                                "Kinesiolog�a: Diurno",
                                "Fonoaudiolog�a: Diurno-Vespertino",
                                "Terapia Ocupacional: Diurno",
	        		            "T�cnico en Masoterapia: Diurno"};        
	        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones3);
	        spinner3.setAdapter(adapter3);
	        
	        
	        spinner4 = (Spinner) findViewById(R.id.spinner4);
	        String []opciones4={"----------Seleccione--------------",
	        		            "Asistente en Educaci�n de P�rvulos : Diurno-Vespertino"};        
	        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones4);
	        spinner4.setAdapter(adapter4);
	        
	        
	        spinner5 = (Spinner) findViewById(R.id.spinner5);
	        String []opciones5={"----------Seleccione--------------",
	        		            "Analista Programador Computacional: Diurno-Vespertino",
                                "T�cnico en Conectividad y Redes: Diurno-Vespertino",
                                "T�cnico en Automatizaci�n y Control Industrial: Vespertino",
                                "T�cnico en Energ�as Renovables y Eficiencia Energ�tica: Vespertino",
                                "T�cnico en Electricidad y Electr�nica: Vespertino",
                                "T�cnico en Construcci�n: Vespertino",
                                "T�cnico en Prevenci�n de Riesgos: Diurno-Vespertino",
                                "T�cnico en Prevenci�n de Riesgos menci�n Seguridad Minera: Diurno-Vespertino",
                                "T�cnico en Prevenci�n de Riesgos menci�n Construcci�n: Diurno-Vespertino",
                                "Ingenier�a en Prevenci�n de Riesgos: Vespertino",
                                "Ingenier�a en Prevenci�n de Riesgos menci�n Seguridad Minera: Vespertino",
                                "Ingenier�a en Prevenci�n de Riesgos menci�n Construcci�n: Vespertino",
                                "T�cnico en Mec�nica Automotriz y Autotr�nica: Diurno-Vespertino",
                                "T�cnico en Mec�nica Automotriz y Autotr�nica menci�n Traslado de Pasajeros: Diurno-Vespertino",
                                "T�cnico en Mec�nica Automotriz y Autotr�nica menci�n Motores de Alta Potencia: Diurno-Vespertino"};        
	        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones5);
	        spinner5.setAdapter(adapter5);
	        
	        spinner6 = (Spinner) findViewById(R.id.spinner6);
	        String []opciones6={"----------Seleccione--------------",
	        		            "T�cnico en Miner�a: Diurno-Vespertino",
                                "T�cnico en Operaci�n de Planta Minera: Diurno-Vespertino"};        
	        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones6);
	        spinner6.setAdapter(adapter6);
            
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
}
