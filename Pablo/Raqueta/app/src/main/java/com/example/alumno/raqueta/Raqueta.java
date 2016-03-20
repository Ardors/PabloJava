package com.example.alumno.raqueta;

public class Raqueta extends Rectangulo{

    private float ancho;

    public Raqueta(float x, float ancho) {
        super(x,Main.alto-100, ancho, 30);
        this.ancho=ancho;
    }

    @Override
    public void mover(){
        if(getX()>=0 && getX()<=Main.ancho-ancho){
            setX(getX()+getVx());

        }
        if(getX()<0){
            setX(0);
        }
        if(getX()>Main.ancho-ancho){
            setX(Main.ancho-ancho);
        }

    }
}
