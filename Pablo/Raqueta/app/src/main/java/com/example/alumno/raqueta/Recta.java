package com.example.alumno.raqueta;

public class Recta {

    float A;
    float B;
    float C;

    public Recta (Punto p, Vector v){
        A = v.getY();
        B = v.getX()*-1;
        C = v.getX()*p.getY()-v.getY()*p.getX();
    }

    public boolean superior (Punto p){
        if(B > 0){
            if(A*p.getX()+B*p.getY()+C < 0){
                return true;
            }
        }else if(B < 0){
            if(A*p.getX()+B*p.getY()+C > 0){
                return true;
            }
        }
        return false;
    }
    public boolean igual (Punto p){
        return(A*p.getX()+B*p.getY()+C == 0);
    }
    public boolean inferior (Punto p){
        if(B > 0){
            if(A*p.getX()+B*p.getY()+C > 0){
                return true;
            }
        }else if(B < 0){
            if(A*p.getX()+B*p.getY()+C < 0){
                return true;
            }
        }
        return false;
    }
}
