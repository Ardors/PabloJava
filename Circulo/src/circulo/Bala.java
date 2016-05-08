package circulo;

import java.awt.Color;
import java.awt.Graphics;

public class Bala {
	float radio;
	float x;
	float y;
	float vx;
	float vy;
	private double a;
	
	public Bala(float radio, float x, float y, float vx, float vy){
		this.radio = radio;
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	public void mover(){
		x=x+vx;
		y=y+vy;
	}
	public void dibujar(Graphics g){
		int r=(int)(((Math.cos(a)+1)/2.0)*255);
		
		g.setColor(new Color(r,255-r,0));
		g.fillOval((int)(x-radio), (int)(y-radio), (int)(radio*2), (int)(radio*2));
		a+=0.05;
	}
}
