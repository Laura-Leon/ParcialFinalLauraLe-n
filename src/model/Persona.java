package model;

import processing.core.PApplet;

	public abstract class Persona implements Runnable, Comparable<Persona> {
		
		 int tipo;
	
		protected int posX;
		protected int posY;
		protected int dir;
		protected int r;
		protected int g;
		protected int b;
		protected int vel;
		protected int tam;
		
	
		public int getTam() {
			return tam;
		}

		public void setTam(int tam) {
			this.tam = tam;
		}

		PApplet app;
		
		public Persona (int numero,PApplet app) {
			this.posX = (int)app.random(0,600);
			this.posY = (int)app.random(0,600);
		
			this.dir = (int)app.random(1,5);
			this.r = (int)app.random(0,225);
			this.g = (int)app.random(0,225);
			this.b = (int)app.random(0,225);
			this.vel = 2;
			this.app = app;
		this.tam = 7;
			
			
		}
		
		public void pintar () {
			
		}
		
		public void mover () {
			if (this.dir == 1) {
				this.posX += this.vel;
				this.posY += this.vel;
			}
			
			if (this.dir == 2) {
				this.posX -= this.vel;
				this.posY -= this.vel;
			}
			
			if (this.dir == 3) {
				this.posX -= this.vel;
				this.posY += this.vel;
			}
			
			if (this.dir == 4) {
				this.posX += this.vel;
				this.posY -= this.vel;
			}
			
			if (this.posX <= 0 || this.posX >= 600 || this.posY <= 0 || this.posY >= 600) {
				this.vel *= -1;
			}
		}
		
		public void run () {
		
				mover();
			}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public int getPosX() {
			return posX;
		}

		public void setPosX(int posX) {
			this.posX = posX;
		}

		public int getPosY() {
			return posY;
		}

		public void setPosY(int posY) {
			this.posY = posY;
		}

		public int getDir() {
			return dir;
		}

		public void setDir(int dir) {
			this.dir = dir;
		}

		public int getR() {
			return r;
		}

		public void setR(int r) {
			this.r = r;
		}

		public int getG() {
			return g;
		}

		public void setG(int g) {
			this.g = g;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		public int getVel() {
			return vel;
		}

		public void setVel(int vel) {
			this.vel = vel;
		}

		public PApplet getApp() {
			return app;
		}

		public void setApp(PApplet app) {
			this.app = app;
		}
		
		/*
		public int compareTo (Persona nueva) {
			return this.Numero - nueva.getNumero();
		}
		*/
		
	

	}
	

