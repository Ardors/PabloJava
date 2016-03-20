package com.example.alumno.raqueta;

import android.graphics.Canvas;
import android.graphics.RectF;

public class Rectangulo extends Dibujable{

    private float ancho;
    private float alto;

    public Rectangulo(Punto posicion,float ancho,float alto){
        super(posicion);
        this.ancho=ancho;
        this.alto=alto; 
    }
    public Rectangulo(float x, float y,float ancho, float alto){
        super(x,y);
        this.ancho=ancho;
        this.alto=alto;
    }

    public boolean comprobarDentro(Punto p){
        return p.getX() < getX()+ancho && p.getY() < getY()+alto && p.getX() < getX() && p.getY() < getY();
    }

    @Override
    public void dibujar(Canvas c) {
        c.drawRect((getX()),(getY()),(getX()+ancho),(getY()+alto),getColor());
    }
}
