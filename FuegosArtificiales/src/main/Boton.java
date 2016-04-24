package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Boton {

	private float x;
	private float y;
	private float ancho;
	private float alto;
	private Color color;
	private Color cnormal;
	private Color csecundario;
	
	public Boton (float x, float y, float ancho, float alto, Color cnormal, Color csecundario){
		this.x =x;
		this.y =y;
		this.ancho =ancho;
		this.alto =alto;
		this.cnormal = cnormal;
		this.csecundario = csecundario;
	}
	
	public void setColor(Color color){
		this.color = color; 
	}
	
	public boolean estaDentro(float x,float y){
		if (x>this.x && y>this.y && x<this.x+ancho && y<this.y+alto){
			return true;
		}else{
			return false;
		}
	}
	
	public void mouseMoved(MouseEvent e){
		if (estaDentro(e.getX(),e.getY())){
			setColor(csecundario);
		}else{
			setColor(cnormal);
		}
	}
	
	public void dibujar (Graphics g){
		g.setColor(color);
		g.fillRect((int)x,(int)y,(int)ancho,(int)alto);
	}
}
