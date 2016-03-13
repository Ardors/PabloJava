package com.example.alumno.vectores;

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

    public void setX(float x){
        posicion.setX(x);
    }
    public void setY(float y){
        posicion.setY(y);
    }

    public Paint getPaint(){
        return paint;
    }

    public void setVelocidad(float x,float y){
        velocidad.setX(x);
        velocidad.setY(y);
    }
    public void setVelocidad(Vector velocidad){
        setVelocidad(velocidad.getX(),velocidad.getY());
    }
    public void setVx(float x){
        velocidad.setX(x);
    }
    public void setVy(float y){
        velocidad.setY(y);
    }

    public void mover(){
        posicion.add(velocidad);
    }
}
