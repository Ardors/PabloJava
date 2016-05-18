package circulo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Personaje {

	float radio;
	float x;
	float y;
	float vy=0;
	float vx=0;
	boolean arriba = false;
	boolean abajo = false;
	boolean derecha = false;
	boolean izquierda = false;
	ArrayList<Bala> balas= new ArrayList<Bala>();
	protected boolean disparando;
	private long cadencia = 200;
	private long tud;
	protected boolean frenando;
	public float potencia = 0.001f;

	public Personaje(float radio, float x, float y){
		this.radio = radio;
		this.x = x;
		this.y = y;
	}

	public void mover(float tt){
		if(frenando){
			arriba = vy>potencia*tt;
			abajo = vy<-potencia*tt;
			derecha = vx<-potencia*tt;
			izquierda = vx>potencia*tt;
			
		}
		if(arriba){
			vy-=potencia*tt;
		}
		if(abajo){
			vy+=potencia*tt;
		}
		if(izquierda){
			vx-=potencia*tt;
			
		}
		if(derecha){
			vx+=potencia*tt;
			
		}
		
		y += vy*tt;
		x += vx*tt;
		
		//vy*=0.999;
		//vx*=0.999;
		
		
	}
	
	public void disparar(){
		float x = Ventana.screenSize.width/2;
		float y = Ventana.screenSize.height/2;
		//balas.add(new Bala(10,x,y,0,-1));
		disparoEspecial();
	}

	public void dibujar(Graphics g, float tt){
		if(disparando && puedeDisparar()){
			tud = System.currentTimeMillis();
			disparar();
		}
		g.setColor(Color.WHITE);
		
		g.fillOval((int)(Ventana.screenSize.width/2-radio), (int)(Ventana.screenSize.height/2-radio), (int)(radio*2), (int)(radio*2));

		dibujarMotores(g);

		ArrayList<Bala>muertas = new ArrayList<>();
		for(Bala b : balas){
			b.mover(tt);
			b.dibujar(g);
			if(b.y<-b.radio || b.y>Ventana.screenSize.height-b.radio || b.x<-b.radio || b.x>Ventana.screenSize.width-b.radio){
				muertas.add(b);
			}
		}
		balas.removeAll(muertas);
	}

	private void dibujarMotores(Graphics g) {
		float x = Ventana.screenSize.width/2;
		float y = Ventana.screenSize.height/2;
		
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
		float x = Ventana.screenSize.width/2;
		float y = Ventana.screenSize.height/2;
		for(int i=0;i<36;i++){
			float vx = (float) Math.cos(Math.toRadians(i*10));
			float vy = (float) Math.sin(Math.toRadians(i*10));
			balas.add(new Bala(10,x,y,vx,vy));
		}
		
	}
}


















