package main;


import processing.core.PApplet;

public class Main extends PApplet {
	
	
	
	Cuadrado[][] cuadd = new Cuadrado[20][30];
	boolean moverse = false;

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}
	
	public void settings() {
		size(600,400);
		
	}
	
	public void setup() {
		
		
		
		
		for(int i=0; i<20; i++) {
			for(int j = 0; j<30; j++) {	
				
				
				cuadd[i][j] = new Cuadrado (j*20, i*20,this);
				
				
			}
		}
	}
		
		
		
	
	
	public void draw() {
		background(190);
		
		  for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 30; j++) {

	                if(i%2==0) {
	                    if (j%2==0) 
	                    cuadd[i][j].pintar(0);
	                    else cuadd[i][j].pintar(1);
	                    } else {

	                    if (j%2==0) 
	                        cuadd[i][j].pintar(1);
	                    else cuadd[i][j].pintar(0);
	                    
	                    if(moverse == true) {
	                    	new Thread (cuadd[i][j]).start();
	                    }
	                    }
	            }
	
		  }
	}
	
	public void mousePressed() {
		
		moverse = true;	
		
		
		
	}
}
	     
	     
