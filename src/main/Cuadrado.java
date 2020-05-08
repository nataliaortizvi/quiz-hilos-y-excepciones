package main;

import processing.core.PApplet;

public class Cuadrado implements Runnable{

	private PApplet app;
	private int px;
	private int py;
	private int tam;
	private int color;
	private int vel;
	
	public Cuadrado(int px, int py, PApplet app) {
		this.app = app;
		this.px = px;
		this.py = py;
		this.tam = 20;
		this.vel = 3;
	}
	
	public void run() {
		mover();
		// TODO Auto-generated method stub
		
	}
	
	
	public void pintar(int color) {
		if(color == 1) {
			app.fill(255);
		
			
		}else {
		
			app.fill(0);
			
			
		}
		app.rect(this.px,this.py,this.tam,this.tam);
		
	}
	
	
	public void mover() {
		this.py += vel;
		
		if(this.py >= -20) {
			this.vel*= -1;
		}
		if (this.py <= 20) {
	            this.vel *= -1;
	    }
		
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
