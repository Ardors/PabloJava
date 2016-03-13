package com.example.alumno.dibujos;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MyView extends View {


    long tult = System.currentTimeMillis();
    long tult2 = System.currentTimeMillis();
    //ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
    ArrayList<Bala> balas = new ArrayList<Bala>();

    Punto uno = new Punto(Dibujos.ANCHO/2-12,Dibujos.ALTO/2-100);
    Punto dos = new Punto(Dibujos.ANCHO/2+12,Dibujos.ALTO/2-100);
    Punto tres = new Punto(Dibujos.ANCHO/2,Dibujos.ALTO/2);
    Triangulo t = new Triangulo(uno, dos, tres);

    public MyView(Context context) {
        super(context);

    }

    @Override
    public void onDraw(Canvas c){
        super.onDraw(c);

        long tact = System.currentTimeMillis();
        float tt = (tact - tult)/1000f;
        tult = tact;

        long tact2 = System.currentTimeMillis();
        float tt2 = (tact2 - tult2);
        if(tt2>800){
            tult2=tact2;
            Bala p = new Bala(uno.x,uno.y);
            balas.add(p);
        }




        /*for(int i = 0;i < pelotas.size();i++){
            Pelota p = pelotas.get(i);
            p.dibujar(c);
            p.mover(tt);
        }*/

        for(int i = 0;i < balas.size();i++){
            Bala act = balas.get(i);
            act.dibujar(c);
            act.mover(tt);
        }

        uno.rotar(tres, 0.07f);
        dos.rotar(tres, 0.07f);
        t.dibujar(c);
        postInvalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        for(int i = 0;i < balas.size();i++){
            if (balas.get(i).comprobarTocar(x,y) == true){
                balas.remove(i);
            }

        }


        return super.onTouchEvent(event);


    }

    /*@Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        Pelota p = new Pelota(x,y);
        pelotas.add(p);
        return super.onTouchEvent(event);

    }*/
}
