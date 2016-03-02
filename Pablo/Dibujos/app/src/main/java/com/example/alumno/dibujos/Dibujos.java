package com.example.alumno.dibujos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

public class Dibujos extends Activity {

    public static int ALTO;
    public static int ANCHO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics d = getResources().getDisplayMetrics();
        ANCHO = d.widthPixels;
        ALTO = d.heightPixels;

        MyView v = new MyView(this);
        setContentView(v);
    }
}
