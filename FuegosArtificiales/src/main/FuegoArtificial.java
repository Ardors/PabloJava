package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class FuegoArtificial {
	
	private ArrayList<Particula> particulas = new ArrayList<>();
	
	public FuegoArtificial(double x,double y){
		int num = 1000;
		for(int i = 0;i<num;i++){
			Punto origenExplosion = new Punto(x,y);
			Vector velocidad = new Vector((Math.random()-0.5)*0.8, (Math.random()-0.5)*0.8);
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
