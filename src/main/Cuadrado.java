package main;

import processing.core.PApplet;

public class Cuadrado implements Runnable{

	private PApplet app;
	private int px;
	private int py;
	private int tam;
	private int color;
	
	public Cuadrado(int px, int py, int color, PApplet app) {
		this.app = app;
		this.px = px;
		this.py = py;
		this.tam = 30;
		this.color = color;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void pintar() {
		if(this.color == 1) {
			app.fill(0);
			app.rect(this.px,this.py,this.tam,this.tam);
			
		}
		if(this.color == 2) {
			app.fill(255);
			app.rect(this.px,this.py,this.tam,this.tam);
			
		}
		
	}
	
	public void mover() {
		
	}
	

	//getters and setters
	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	

}
