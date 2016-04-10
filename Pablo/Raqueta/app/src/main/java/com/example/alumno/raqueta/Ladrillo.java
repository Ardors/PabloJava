package com.example.alumno.raqueta;

import android.util.Log;

public class Ladrillo extends Rectangulo{

    float ancho = Main.ancho/8;
    float alto = Main.alto/32;
    public Ladrillo(int xPos, int yPos){
        super(xPos*Main.ancho/8,yPos*Main.alto/32,Main.ancho/8,Main.alto/32);
    }

    public void comprobarColision(Pelota pelota){
        if(pelota.getY()>getY()-pelota.getRadio() && pelota.getY()<getY() +alto+pelota.getRadio() &&
           pelota.getX()>getX()-pelota.getRadio() && pelota.getX()<getX()+ancho+pelota.getRadio() ){
            float vx = pelota.getVx();
            float vy = pelota.getVy();
            if(vx > 0){
                if(vy > 0){
                    float x = getX();
                    float y = getY();
                    Recta r = new Recta (new Punto(x,y),new Vector(vx,vy));
                    if (r.superior(pelota.getPosicion())){
                        pelota.invertirVy();
                    }else if(r.inferior(pelota.getPosicion())){
                        pelota.invertirVx();
                    }else{
                        pelota.invertirVx();
                        pelota.invertirVy();
                    }
                }else if(vy<0){
                    float x = getX();
                    float y = getY()+alto;
                    Recta r = new Recta (new Punto(x,y),new Vector(vx,vy));
                    if (r.superior(pelota.getPosicion())){
                        pelota.invertirVx();
                    }else if(r.inferior(pelota.getPosicion())){
                        pelota.invertirVy();
                    }else{
                        pelota.invertirVx();
                        pelota.invertirVy();
                    }
                }else{
                    pelota.invertirVx();
                }
            }else if (vx < 0){
                if(vy > 0){
                    float x = getX()+ancho;
                    float y = getY();
                    Recta r = new Recta (new Punto(x,y),new Vector(vx,vy));
                    if (r.superior(pelota.getPosicion())){
                        pelota.invertirVy();
                    }else if(r.inferior(pelota.getPosicion())){
                        pelota.invertirVx();
                    }else{
                        pelota.invertirVx();
                        pelota.invertirVy();
                    }
                }else if(vy < 0){
                    float x = getX()+ancho;
                    float y = getY()+alto;
                    Recta r = new Recta (new Punto(x,y),new Vector(vx,vy));
                    if (r.superior(pelota.getPosicion())){
                        pelota.invertirVx();
                    }else if(r.inferior(pelota.getPosicion())){
                        pelota.invertirVy();
                    }else{
                        pelota.invertirVx();
                        pelota.invertirVy();
                    }
                }else{
                    pelota.invertirVx();
                }
            }else{
                pelota.invertirVy();
            }


        }
    }


}
