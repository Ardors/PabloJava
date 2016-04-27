package circulo;

import java.awt.Graphics;

public class Circulo {

	float radio;
	float x;
	float y;
	float vy = 0;
	float vx = 0;
	
	public Circulo(float radio, float x, float y){
		this.radio = radio;
		this.x = x;
		this.y = y;
	}
	
	public void mover(Graphics g){
		x=x+vx;
		y=y+vy;
	}
	
	public void dibujar(Graphics g){
		g.drawOval((int)x, (int)y, (int)radio*2, (int)radio*2);
	}
}
