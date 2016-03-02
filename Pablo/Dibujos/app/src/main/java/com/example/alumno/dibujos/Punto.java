package com.example.alumno.dibujos;


public class Punto {
    public float x;
    public float y;

    public Punto(float x,float y){
        this.x = x;
        this.y = y;
    }

    public void rotar(Punto a, float ang){
       // p x = cos(theta) * (px-ox) - sin(theta) * (py-oy) + ox
        //p y = sin(theta) * (px-ox) + cos(theta) * (py- oy) + oy
        float nx = x;
        float ny = y;

        nx = (float) (Math.cos(ang) * (x-a.x) - Math.sin(ang) * (y-a.y));
        ny = (float) (Math.sin(ang) * (x-a.x) + Math.cos(ang) * (y-a.y));

        x = nx + a.x;
        y = ny + a.y;
    }

}
