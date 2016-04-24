package main;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class BotonImagen {

	private float x;
	private float y;
	private float ancho;
	private float alto;
	private BufferedImage imagen;
	private BufferedImage inormal;
	private BufferedImage isecundario;
	
	public BotonImagen (float x, float y, float ancho, float alto, BufferedImage inormal, BufferedImage isecundario){
		this.x =x;
		this.y =y;
		this.ancho =ancho;
		this.alto =alto;
		this.inormal = inormal;
		this.isecundario = isecundario;
	}
	
	public void setImagen(BufferedImage imagen){
		this.imagen = imagen; 
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
			setImagen(isecundario);
		}else{
			setImagen(inormal);
		}
	}
	
	public void dibujar (Graphics g){
		g.drawImage(imagen,(int)x,(int)y,(int)(ancho), (int)(alto), null);
	}
}
