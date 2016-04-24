package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class FuegoArtificial {
	
	private ArrayList<Particula> particulas = new ArrayList<>();
	
	public FuegoArtificial(double x,double y){
		int num = 3000;
		for(int i = 0;i<num;i++){
			double grados = 1800*i/num;
			Punto origenExplosion = new Punto(x,y);
			
			double vx = Math.cos(Math.toRadians(grados));
			double vy = Math.sin(Math.toRadians(grados));
			vy*=Math.random()*1.6-0.8;
			vx*=Math.random()*1.6-0.8;
			
			Vector velocidad = new Vector(vx,vy);
			Particula p = new Particula(origenExplosion,velocidad,(long)(Math.random()*1000+500));
			particulas.add(p);
		}
	}
	
	public void dibujar(Graphics g){
		ArrayList<Particula> pMuertas = new ArrayList<>();
		for(Particula p: particulas){
			if(!p.estaViva()){
				pMuertas.add(p);
			}	
		}
		for(Particula p: pMuertas){
			particulas.remove(p);
		}
		
		for(Particula p: particulas){
			p.dibujar(g);
			
		}
	}

}
