package circulo;

import java.awt.Color;
import java.awt.Graphics;

public class Estrella {

	float x;
	float y;
	
	public Estrella(float x,float y){
		this.x=x;
		this.y=y;
	}
	
	public void mover(float dx,float dy,float tt){
		x+=dx*tt;
		y+=dy*tt;
		if(x<0){
			x=Ventana.screenSize.width+x;
		}
		if(x>Ventana.screenSize.width){
			x=x-Ventana.screenSize.width;
		}
		if(y<0){
			y=Ventana.screenSize.height+y;
		}
		if(y>Ventana.screenSize.height){
			y=y-Ventana.screenSize.height;
		}
	}
	
	public void dibujar(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect((int)x, (int)y, 1, 1);
	}
}
