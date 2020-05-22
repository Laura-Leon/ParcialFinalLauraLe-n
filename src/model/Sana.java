package model;

import processing.core.PApplet;

public class Sana extends Persona {

	
	public Sana(int numero, PApplet app) {
		super (numero,app);
		this.tipo = 1;
		
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

