package com.example.alumno.vectores;


public class Vector {

    private float x;
    private float y;

    public Vector(){
        this(0,0);
    }
    public Vector(Punto p1,Punto p2) {
        x = p2.getX()-p1.getX();
        y = p2.getY()-p1.getY();
    }
    public Vector(float x, float y){
        this.x=x;
        this.y=y;
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

    public void multiplicar(float mult){
        x = x*mult;
        y = y*mult;
    }

}
