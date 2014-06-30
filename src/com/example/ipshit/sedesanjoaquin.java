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
	        		"Técnico en Administración de Empresas mención Finanzas: Diurno-Vespertino",
	        		"Técnico en Administración de Empresas mención Procesos Logísticos: Diurno-Vespertino",
	        		"Contabilidad General: Vespertino"};        
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
	        spinner1.setAdapter(adapter);
	        
	        
	        spinner2 = (Spinner) findViewById(R.id.spinner2);
	        String []opciones2={"----------Seleccione--------------","Técnico en Deportes: Diurno-Vespertino",
	        		"Preparación Física: Diurno-Vespertino"};        
	        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones2);
	        spinner2.setAdapter(adapter2);
	        
	        
	        spinner3 = (Spinner) findViewById(R.id.spinner3);
	        String []opciones3={"----------Seleccione--------------",
	        		            "Técnico en Enfermería: Diurno-Vespertino",
                                "Kinesiología: Diurno",
                                "Fonoaudiología: Diurno-Vespertino",
                                "Terapia Ocupacional: Diurno",
	        		            "Técnico en Masoterapia: Diurno"};        
	        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones3);
	        spinner3.setAdapter(adapter3);
	        
	        
	        spinner4 = (Spinner) findViewById(R.id.spinner4);
	        String []opciones4={"----------Seleccione--------------",
	        		            "Asistente en Educación de Párvulos : Diurno-Vespertino"};        
	        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones4);
	        spinner4.setAdapter(adapter4);
	        
	        
	        spinner5 = (Spinner) findViewById(R.id.spinner5);
	        String []opciones5={"----------Seleccione--------------",
	        		            "Analista Programador Computacional: Diurno-Vespertino",
                                "Técnico en Conectividad y Redes: Diurno-Vespertino",
                                "Técnico en Automatización y Control Industrial: Vespertino",
                                "Técnico en Energías Renovables y Eficiencia Energética: Vespertino",
                                "Técnico en Electricidad y Electrónica: Vespertino",
                                "Técnico en Construcción: Vespertino",
                                "Técnico en Prevención de Riesgos: Diurno-Vespertino",
                                "Técnico en Prevención de Riesgos mención Seguridad Minera: Diurno-Vespertino",
                                "Técnico en Prevención de Riesgos mención Construcción: Diurno-Vespertino",
                                "Ingeniería en Prevención de Riesgos: Vespertino",
                                "Ingeniería en Prevención de Riesgos mención Seguridad Minera: Vespertino",
                                "Ingeniería en Prevención de Riesgos mención Construcción: Vespertino",
                                "Técnico en Mecánica Automotriz y Autotrónica: Diurno-Vespertino",
                                "Técnico en Mecánica Automotriz y Autotrónica mención Traslado de Pasajeros: Diurno-Vespertino",
                                "Técnico en Mecánica Automotriz y Autotrónica mención Motores de Alta Potencia: Diurno-Vespertino"};        
	        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones5);
	        spinner5.setAdapter(adapter5);
	        
	        spinner6 = (Spinner) findViewById(R.id.spinner6);
	        String []opciones6={"----------Seleccione--------------",
	        		            "Técnico en Minería: Diurno-Vespertino",
                                "Técnico en Operación de Planta Minera: Diurno-Vespertino"};        
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
