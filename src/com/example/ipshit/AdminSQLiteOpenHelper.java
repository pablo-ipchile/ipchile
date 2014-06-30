package com.example.ipshit;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(Context context, String nombre, CursorFactory factory, int version) {
        super(context, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase Formulario) {
        Formulario.execSQL("create table dato(nombre text, apellido text, tipo text ,comentario text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase inventario, int versionAnte, int versionNue) {
        inventario.execSQL("drop table if exists dato");
        inventario.execSQL("create table dato(nombre text, apellido text, tipo text ,comentario text)");        
    }    
}
