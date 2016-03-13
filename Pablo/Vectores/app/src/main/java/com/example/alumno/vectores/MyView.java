package com.example.alumno.vectores;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

public class MyView extends View {

    private ArrayList<Dibujable> dibujables = new ArrayList<Dibujable>();
    Punto p1 = new Punto (150,200);



    public MyView(Context context){
        super(context);

        Rectangulo rect = new Rectangulo(p1,200,300);
        dibujables.add(rect);


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


