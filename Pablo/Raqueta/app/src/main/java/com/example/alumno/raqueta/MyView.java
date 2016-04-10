package com.example.alumno.raqueta;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {

    private boolean inicio = true;
    float raqAncho = Main.ancho/4;
    float pelRadio = Main.ancho/40;
    float ladAncho = Main.ancho/8;
    float ladAlto = Main.alto/32;
    Raqueta raqueta = new Raqueta(Main.ancho/2-raqAncho/2,raqAncho);
    Pelota pelota;
    Ladrillo l1 = new Ladrillo(0,0);
    Ladrillo l2 = new Ladrillo(2,1);
    Ladrillo l3 = new Ladrillo(4,0);

    public MyView(Context context){
        super(context);



        pelota = new Pelota(Main.ancho/2,Main.alto-Main.alto/12-pelRadio,pelRadio,this);
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
            raqueta.setVx(-5);
            if(inicio==true){
                pelota.setVelocidad(-5,-5);
                inicio=false;
            }
        }
        if(x>Main.ancho/2){
            raqueta.setVx(5);
            if(inicio == true){
                pelota.setVelocidad(5,-5);
                inicio=false;
            }
        }
    }
    public void touchUp(MotionEvent event){
        raqueta.setVx(0);
    }

    @Override
    public void onDraw(Canvas c){
        super.onDraw(c);

        raqueta.mover();
        pelota.mover(raqueta.getX(),raqAncho);

        pelota.dibujar(c);
        raqueta.dibujar(c);
        l1.dibujar(c);
        l2.dibujar(c);
        l3.dibujar(c);

        l1.comprobarColision(pelota);
        l2.comprobarColision(pelota);
        l3.comprobarColision(pelota);

        postInvalidate();
    }
    public void pelotaPerdida(){
        raqueta.setX(Main.ancho/2-raqAncho/2);
        pelota.setY(Main.alto - Main.alto / 12 - pelRadio);
        pelota.setX(Main.ancho / 2);
        pelota.setVelocidad(0, 0);
        raqueta.setVelocidad(0, 0);
        inicio = true;
    }





}