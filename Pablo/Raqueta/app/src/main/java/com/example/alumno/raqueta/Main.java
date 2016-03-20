package com.example.alumno.raqueta;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Main extends Activity {

    public static float alto;
    public static float ancho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics d = getResources().getDisplayMetrics();
        ancho = d.widthPixels;
        alto = d.heightPixels;

        MyView view = new MyView(this);
        setContentView(view);
    }
}
