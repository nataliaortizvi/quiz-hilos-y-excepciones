package main;


import processing.core.PApplet;

public class Main extends PApplet {
	
	
	
	Cuadrado[][] cuadd;

	int ver=20;
	int hor=30;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}
	
	public void settings() {
		size(600,400);
		
	}
	
	public void setup() {
		
		
		cuadd = new Cuadrado [ver][hor];
		
		
		for(int i=0; i<ver; i++) {
			for(int j = 0; j<hor; j++) {	
				if (i % 2 == 0){
					cuadd[i][j] = new Cuadrado (i*30, j*30,2,this);
				}else {
					cuadd[i][j] = new Cuadrado (i*30, j*30,1,this);
				}
				
			}
		}
	}
		
		
		
	
	
	public void draw() {
		background(190);
		
		
		
		for(int i=0; i<ver; i++) {
			for(int j = 0; j<hor; j++) {
			
				cuadd[i][j].pintar();
			
			}
		}
		
	}
}
