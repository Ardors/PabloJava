package circulo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Personaje {

	float radio;
	float x;
	float y;
	float vy;
	float vx;
	boolean arriba = false;
	boolean abajo = false;
	boolean derecha = false;
	boolean izquierda = false;
	ArrayList<Bala> balas= new ArrayList<Bala>();
	protected boolean disparando;
	private long cadencia = 200;
	private long tud;

	public Personaje(float radio, float x, float y){
		this.radio = radio;
		this.x = x;
		this.y = y;
	}

	public void mover(Graphics g){
		if(arriba){
			if(y>0+radio){
				y-=1;
			}
		}
		if(abajo){
			if(y<Ventana.screenSize.height-radio){
				y+=1;
			}
		}
		if(izquierda){
			if(x>0+radio){
				x-=1;
			}
		}
		if(derecha){
			if(x<Ventana.screenSize.width-radio){
				x+=1;
			}
		}
		
		
		
	}
	public void disparar(){
		balas.add(new Bala(10,x,y,0,-1));
		disparoEspecial();
	}

	public void dibujar(Graphics g){
		if(disparando && puedeDisparar()){
			tud = System.currentTimeMillis();
			disparar();
		}
		g.setColor(Color.WHITE);
		g.fillOval((int)(x-radio), (int)(y-radio), (int)(radio*2), (int)(radio*2));

		dibujarMotores(g);

		ArrayList<Bala>muertas = new ArrayList<>();
		for(Bala b : balas){
			b.mover();
			b.dibujar(g);
			//TODO: los limites derechi izquierdo y abajo
			if(b.y<-b.radio){
				muertas.add(b);
			}
		}
		balas.removeAll(muertas);
	}

	private void dibujarMotores(Graphics g) {
		if(arriba){
			float radio = this.radio/4f;
			for(int i=0;i<10;i++){
				g.setColor(new Color(0,0,255,64-i*6));
				g.fillOval((int)(x-radio), (int)(y-radio+this.radio+7*i), (int)(radio*2), (int)(radio*2));
			}
		}
		if(abajo){
			float radio = this.radio/4f;
			for(int i=0;i<10;i++){
				g.setColor(new Color(0,0,255,64-i*6));
				g.fillOval((int)(x-radio), (int)(y-radio-this.radio-7*i), (int)(radio*2), (int)(radio*2));
			}
		}
		if(derecha){
			float radio = this.radio/4f;
			for(int i=0;i<10;i++){
				g.setColor(new Color(0,0,255,64-i*6));
				g.fillOval((int)(x-radio-this.radio-7*i), (int)(y-radio), (int)(radio*2), (int)(radio*2));
			}
		}
		if(izquierda){
			float radio = this.radio/4f;
			for(int i=0;i<10;i++){
				g.setColor(new Color(0,0,255,64-i*6));
				g.fillOval((int)(x-radio+this.radio+7*i), (int)(y-radio), (int)(radio*2), (int)(radio*2));
			}
		}

	}

	private boolean puedeDisparar() {
		long tt = System.currentTimeMillis() - tud;

		return tt > cadencia;
	}
	
	public void disparoEspecial(){
		
		for(int i=0;i<36;i++){
			float vx = (float) Math.cos(Math.toRadians(i*10));
			float vy = (float) Math.sin(Math.toRadians(i*10));
			balas.add(new Bala(10,x,y,vx,vy));
		}
		
	}
}


















