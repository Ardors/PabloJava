package com.example.alumno.raqueta;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Dibujable {

    private Paint paint;
    private Punto posicion;
    private Vector velocidad;

    public Dibujable(){
        this(0,0);
    }
    public Dibujable(Punto posicion){
        this(posicion.getX(),posicion.getY());
    }
    public Dibujable(float x, float y){
        posicion = new Punto (x,y);
        paint = new Paint();
        velocidad = new Vector();
    }

    public abstract void dibujar(Canvas c);

    public float getX(){
        return posicion.getX();
    }
    public float getY(){
        return posicion.getY();
    }
    public Punto getPosicion(){
        return posicion;
    }

    public void setX(float x){
        posicion.setX(x);
    }
    public void setY(float y){
        posicion.setY(y);
    }

    public void setColor(int a, int r, int g, int b){
        if(a > 255){
            a=255;
        }
        if(a < 0){
            a=0;
        }
        if(r > 255){
            r=255;
        }
        if(r < 0){
            r=0;
        }
        if(g > 255){
            g=255;
        }
        if(g < 0){
            g=0;
        }
        if(b > 255){
            b=255;
        }
        if(b < 0){
            b=0;
        }
        paint.setARGB(a, r, g, b);
    }
    public Paint getColor(){
        return paint;
    }

    public void setVelocidad(float x,float y){
        velocidad.setX(x);
        velocidad.setY(y);
    }
    public void setVelocidad(Vector velocidad){
        setVelocidad(velocidad.getX(), velocidad.getY());
    }
    public void setVx(float x){
        velocidad.setX(x);
    }
    public void setVy(float y){
        velocidad.setY(y);
    }
    public Vector getVelocidad() {
        return velocidad;
    }
    public float getVx(){
        return velocidad.getX();
    }
    public float getVy(){
        return velocidad.getY();
    }

    public void mover(){
        posicion.add(velocidad);
    }
}
