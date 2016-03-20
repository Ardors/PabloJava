package com.example.alumno.raqueta;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

public class MyView extends View {

    private ArrayList<Dibujable> dibujables = new ArrayList<Dibujable>();

    float raqAncho = 200;
    Raqueta raqueta = new Raqueta(Main.ancho/2-raqAncho/2,raqAncho);
    Pelota pelota = new Pelota(Main.ancho/2,Main.alto/2,30);

    public MyView(Context context){
        super(context);
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){
                    Log.i("HHHHH","UP");
                    touchUp(event);
                }
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    Log.i("HHHHH","DOWN");
                    touchDown(event);
                }
                return true;
            }
        });
    }

    public void touchDown(MotionEvent event){
        float x = event.getX();
        if(x<Main.ancho/2){
            raqueta.setVx(-4);
        }
        if(x>Main.ancho/2){
            raqueta.setVx(4);
        }
    }
    public void touchUp(MotionEvent event){
        raqueta.setVx(0);
    }

    @Override
    public void onDraw(Canvas c){
        super.onDraw(c);

        raqueta.mover();

        pelota.dibujar(c);
        raqueta.dibujar(c);

        postInvalidate();
    }


}