package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 3350710760250147620L;	
	private FuegoArtificial f;
	private ArrayList<BotonImagen> ibotones= new ArrayList<BotonImagen>();
	Ventana v;
	public Panel(Ventana v){
		this.v=v;
		setBackground(Color.BLACK);
		f = new FuegoArtificial(400.0,400.0);
		
		BufferedImage i2 = null;
		BufferedImage i1 = null;
		BufferedImage i3 = null;
		BufferedImage i4 = null;
		try {
			i1 = ImageIO.read(new File("basico.png"));
			i2 = ImageIO.read(new File("secundario.png"));
			i3 = ImageIO.read(new File("BasicoExit.png"));
			i4 = ImageIO.read(new File("SecundarioExit.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ibotones.add(new BotonImagen (v.getAncho()/2-50,v.getAlto()/2-25,100,50,i1,i2));
		ibotones.add(new BotonImagen (v.getAncho()-150,50,100,50,i3,i4));
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					repaint();
				}		
			}
		});
		
		t.start();
		
		addMouseMotionListener(new MouseAdapter(){
			@Override
			public void mouseMoved(MouseEvent e){
				for(BotonImagen b : ibotones){
					b.mouseMoved(e);
				}
				super.mouseMoved(e);
			}
		});
		addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				if (ibotones.get(0).estaDentro(e.getX(),e.getY())){
					f = new FuegoArtificial(Math.random()* v.getAncho(),Math.random()* v.getAlto());
				}
				if (ibotones.get(1).estaDentro(e.getX(),e.getY())){
					System.exit(0);
				}
				super.mouseClicked(e);
			}
		});
		addKeyListener(new KeyAdapter(){
			@Override 
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
			}
		});
		setFocusable(true);
		requestFocus();
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		for(BotonImagen b : ibotones){
			b.dibujar(g);
		}
		f.dibujar(g);
	}			
}
