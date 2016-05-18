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
	private long ut;
	
	public Bala(float radio, float x, float y, float vx, float vy){
		this.radio = radio;
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	public void mover(float tt){
		x=x+vx*tt;
		y=y+vy*tt;
		
	}
	public void dibujar(Graphics g){
		int r=(int)(((Math.cos(a)+1)/2.0)*128);
		
		for(int i = 0;i<5;i++){
			
			float r1=(float) (Math.random()*20-10);
			float r2=(float) (Math.random()*20-10);
			g.setColor(new Color(255,255,0,40));
			if(i%2==0){
				g.setColor(new Color(255,0,0,40));
			}
			g.fillOval((int)(x-radio+r1), (int)(y-radio+r2), (int)(radio*2), (int)(radio*2));
		}
		
		
		a+=0.05;
	}
}
