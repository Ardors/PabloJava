package com.example.alumno.vectores;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

public class MyView extends View {

    private ArrayList<Dibujable> dibujables = new ArrayList<Dibujable>();
    Punto p1 = new Punto (250,250);

    public MyView(Context context){
        super(context);

        for(int i=0;i<10;i++){
            Punto p = new Punto(200,100);
            p.rotar(p1, i*36);
            Dibujable d = new Ovalo(p,50,50);
            dibujables.add(d);
        }



    }

    @Override
    public void onDraw(Canvas c){
        super.onDraw(c);


        for(Dibujable d:dibujables){
            d.dibujar(c);
        }

        postInvalidate();
    }


}


