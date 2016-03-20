package com.example.alumno.raqueta;

public class Pelota extends  Ovalo{

    private float x;
    private float y;

    public Pelota(float x, float y, float radio) {
        super(x, y, radio*2, radio*2);
        this.y = y;
        this.x = x;
    }
    @Override
    public void mover(){

    }
}
