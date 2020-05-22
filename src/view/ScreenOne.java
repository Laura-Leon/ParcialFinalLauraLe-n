package view;

import java.util.LinkedList;

import controller.Controller;

import model.Persona;
import processing.core.PApplet;

public class ScreenOne {
	
	Controller Logic;
	public ScreenOne (PApplet app) {
		Logic = new Controller (app);
		
	}
	
	
	
	
	public LinkedList<Persona> getPersonaList() {
		return Logic.getPersonaList();
	}
	
	
	
	
	
	
	public void sortListScreen (char c) {
		Logic.sortListController(c);
	}

}