package com.example.alumno.raqueta;


public class Punto {
    private float x;
    private float y;

    public Punto(){
        x=0;
        y=0;
    }
    public Punto(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void add(Vector v) {
        x = x + v.getX();
        y = y + v.getY();
    }

    public void rotar(Punto a, float grados){

        double rad = Math.toRadians(grados);
        // p x = cos(theta) * (px-ox) - sin(theta) * (py-oy) + ox
        //p y = sin(theta) * (px-ox) + cos(theta) * (py- oy) + oy
        float nx = x;
        float ny = y;

        nx = (float) (Math.cos(rad) * (x-a.x) - Math.sin(rad) * (y-a.y));
        ny = (float) (Math.sin(rad) * (x-a.x) + Math.cos(rad) * (y-a.y));

        x = nx + a.x;
        y = ny + a.y;
    }
}
