package model;

import processing.core.PApplet;

public class Infectada extends Persona{

	public Infectada(int numero, PApplet app) {
		// TODO Auto-generated constructor stub
		super(numero,app);
		this.tipo = 2;
		
	}
	
	public void pintar () {
		app.noStroke();
		app.fill(this.r,this.g,this.b);
		app.ellipse(this.posX, this.posY, this.tam, this.tam);
		
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
