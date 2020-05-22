package controller;

import java.util.LinkedList;
import processing.core.PApplet;
import model.Persona;

import model.Logic;


public class Controller {
	
Logic logica;
	
	public Controller (PApplet app) {
		logica = new Logic (app);
		
	}
	
	/*public void pintarController () {
		logica.pintarAll();
	}*/
	
	
	
	public LinkedList<Persona> getPersonaList() {
		return logica.getPersonaList();
	}
	
	
	public void sortListController (char c) {
		logica.sortList(c);;
	}

}
