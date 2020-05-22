package view;

import java.util.LinkedList;

import model.Persona;

import processing.core.PApplet;

public class Main extends PApplet {

	ScreenOne pintando;
	LinkedList <Persona> PersonaList;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	
	public void settings () {
		size (600, 600);
		
	}
	
	public void setup () {
		pintando = new ScreenOne (this);
		PersonaList = pintando.getPersonaList();
		
	}
	
	public void draw () {
		background (255);
		//pintando.pintarScreen();
		for (int i = 0; i < PersonaList.size(); i++) {
			PersonaList.get(i).pintar();
			new Thread (PersonaList.get(i)).start();
			
			for (int j = 0; j < PersonaList.size(); j++) {
				if (dist(PersonaList.get(i).getPosX(), PersonaList.get(i).getPosY(), 
						PersonaList.get(j).getPosX(), PersonaList.get(j).getPosY()) < 100){
					
					System.out.println("popo");
					
						}
					}
				}
			
			}
	
	
	public void keyPressed () {
		pintando.sortListScreen(key);
	}
}
	
	
	
