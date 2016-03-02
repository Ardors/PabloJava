package com.example.alumno.dibujos;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class Triangulo {
    Punto a;
    Punto b;
    Punto c;
    private Paint p;

    public Triangulo(Punto a,Punto b, Punto c) {
        this.a = a;
        this.b = b;
        this.c = c;
        p = new Paint();
        p.setARGB(255,255,255,0);
    }

    public void dibujar(Canvas c){
        Path t = new Path();
        t.moveTo(a.x, a.y);
        t.lineTo(b.x, b.y);
        t.lineTo(this.c.x, this.c.y);
        t.close();
        c.drawPath(t, p);
    }


}

