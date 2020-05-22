package model;

import processing.core.PApplet;

public class Recuperado extends Persona {

	public Recuperado(int numero, PApplet app) {
		// TODO Auto-generated constructor stub
		super(numero,app);
		this.tipo = 3;
	}

	
	
	public void pintar () {
		app.noStroke();
		app.fill(this.r,this.g,this.b);
		app.ellipse(this.posX, this.posY, this.tam, this.tam);
		
	}
	
	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
