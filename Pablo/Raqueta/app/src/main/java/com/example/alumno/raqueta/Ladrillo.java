package com.example.alumno.raqueta;

public class Ladrillo extends Rectangulo{

    float ancho = Main.ancho/8;
    float alto = Main.alto/32;
    public Ladrillo(int xPos, int yPos){
        super(xPos*Main.ancho/8,yPos*Main.alto/32,Main.ancho/8,Main.alto/32);
    }

    public void comprobarColision(Pelota pelota){
        if(pelota.getY()>=getY() && pelota.getY()<=getY()+alto){

        }
    }


}
