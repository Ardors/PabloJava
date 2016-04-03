package com.example.alumno.raqueta;

public class Pelota extends  Ovalo{

    private float radio;
    private boolean perdida = false;
    private MyView v;

    public Pelota(float x, float y, float radio, MyView v) {
        super(x, y, radio*2, radio*2);
        this.radio = radio;
        this.v = v;
    }

    public void invertirVx(){
        setVx(getVx()*-1);
    }
    public void invertirVy(){
        setVy(getVy()*-1);
    }

    public float getRadio(){
        return radio;
    }

    public void mover(float raqX,float raqAncho) {
        if (getX() >= radio && getX() <= Main.ancho - radio) {
            setX(getX() + getVx());
        }
        if (getX() < radio) {
            setX(radio);
            invertirVx();
        }
        if (getX() > Main.ancho - radio) {
            setX(Main.ancho - radio);
            invertirVx();
        }
        if (getY() >= radio && getY() <= Main.alto - radio) {
            setY(getY() + getVy());
        }
        if (getY() < radio) {
            setY(radio);
            invertirVy();
        }
        if (getY() > Main.alto - Main.alto / 12 - radio) {
            if (getX() >= raqX && getX() <= raqX + raqAncho && perdida == false) {
                setY(Main.alto - Main.alto / 12 - radio);
                invertirVy();
            } else {
                perdida = true;
            }
        }
        if (getY() > Main.alto-radio) {
            v.pelotaPerdida();
            perdida = false;
        }
    }
}
