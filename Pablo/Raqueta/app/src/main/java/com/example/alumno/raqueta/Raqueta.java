package com.example.alumno.raqueta;

public class Raqueta extends Rectangulo{

    private float ancho;

    public Raqueta(float x, float ancho) {
        super(x,Main.alto-Main.alto/12, ancho, Main.alto/45);
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
