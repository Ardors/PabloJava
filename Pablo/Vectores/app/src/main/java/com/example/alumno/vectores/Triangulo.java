package com.example.alumno.vectores;


import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;

public class Triangulo extends Dibujable{
    private Punto a;
    private Punto b;
    private Punto c;
    private Path path;
    private Matrix m = new Matrix();

    public Triangulo(Punto a,Punto b, Punto c) {
        this.a = a;
        this.b = b;
        this.c = c;
        path = new Path();
        path.moveTo(a.getX(), a.getY());
        path.lineTo(b.getX(), b.getY());
        path.lineTo(this.c.getX(), this.c.getY());
        path.close();
    }

    public void setRotacion(float grados, float cx, float cy){
        m.reset();
        m.setRotate(grados, cx, cy);
    }

    public void dibujar(Canvas c){
        Path p = new Path();
        m.preTranslate(getX(),getY());
        path.transform(m,p);
        c.drawPath(path, getColor());
    }
}
