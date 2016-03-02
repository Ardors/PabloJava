package com.example.alumno.dibujos;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Bala {

    public float y;
    public float x;
    public float vx;
    public float vy;
    private float radio;
    private Paint p;

    public Bala(float x, float y) {
        this.x = x;
        this.y = y;
        this.vx = x-Dibujos.ANCHO/2;
        this.vy = y-Dibujos.ALTO/2;
        this.radio = 100;
        p = new Paint();

        int a =(int)(Math.random()*155+100);
        int r =(int)(Math.random()*255);
        int g =(int)(Math.random()*255);
        int b =(int)(Math.random()*255);
        p.setARGB(a, r, g, b);
    }

    public void dibujar(Canvas c){
        c.drawOval(new RectF(x - radio, y - radio, x + radio, y + radio), p);
    }
    public void mover(float tiempo){
        if(x-radio<=0){
            vx=vx*(-1);
            x=radio;
        }
        if(x+radio>=Dibujos.ANCHO){
            vx=vx*(-1);
            x=Dibujos.ANCHO-radio;
        }
        if(y-radio<=0){
            vy=vy*(-1);
            y=radio;
        }
        if(y+radio>=Dibujos.ALTO){
            vy=vy*(-1);
            y=Dibujos.ALTO-radio;
        }

        x = x + vx*5*tiempo;
        y = y + vy*5*tiempo;
    }
    public boolean comprobarTocar(float x,float y){
        if (Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)) <= radio){
            return true;
        }else {
            return false;
        }
    }
    public void setPrint(){
        p.setARGB(255, 0, 0, 0);
    }
}
