package com.example.alumno.vectores;

import android.graphics.Canvas;
import android.graphics.RectF;

public class Ovalo extends Dibujable{

    private float ancho;
    private float alto;

    public Ovalo(Punto posicion,float ancho,float alto){
        super(posicion);
        this.ancho=ancho;
        this.alto=alto;
    }
    public Ovalo(float x, float y,float ancho, float alto){
        super(x,y);
        this.ancho=ancho;
        this.alto=alto;
    }

    @Override
    public void dibujar(Canvas c) {
        c.drawOval(new RectF((getX()-ancho/2),(getY()-alto/2),(getX()+ancho/2),(getY()+alto/2)),getPaint());
    }

}
