package main;

import java.awt.Color;
import java.awt.Graphics;

public class Particula {

	private Punto posicion;
	private Vector velocidad;
	private long tiempoDeVida;
	private long tiempoInicial;
	
	public Particula(Punto posicion, Vector velocidad, long tiempoDeVida) {
		this.posicion = posicion;
		this.velocidad = velocidad;
		this.tiempoDeVida = tiempoDeVida;
		tiempoInicial = System.currentTimeMillis();
	}

	public void dibujar(Graphics g){
		g.setColor(Color.WHITE);
		g.drawLine((int)(posicion.x), (int)(posicion.y), (int)(posicion.x+velocidad.x*50), (int)(posicion.y+velocidad.y*50));
		posicion.x+=velocidad.x;
		posicion.y+=velocidad.y;
		velocidad.x*=0.995;
		velocidad.y*=0.995;
		
		velocidad.y += 0.00015;
	}
	
	public boolean estaViva(){
		return (System.currentTimeMillis() - tiempoInicial) < tiempoDeVida;
	}
}
