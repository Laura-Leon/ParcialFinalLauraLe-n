package model;

import java.util.Collections;
import java.util.LinkedList;

import Exception.NoMoreException;
import exception.MyExp;
import processing.core.PApplet;

public class Logic {

//ColorComparar colorComparar; 
	
	LinkedList <Persona> PersonaList;
	int numero;
	
	String [] info;
	String [] textSplit;
	String tipo;
	
	PApplet app;
	int contador;
	Boolean contagiado;

	
	public Logic (PApplet app) {
		this.app = app;
		
		info = app.loadStrings("../data/1.txt");
		PersonaList = new LinkedList <Persona> ();
		
		contagiado = false;
		
		
	
		
	
		
		for (int i = 0; i < info.length; i++) {
			textSplit = info[i].split(":");	
			tipo = textSplit[0];
			numero = Integer.parseInt (textSplit[1]);
		
			
			if (textSplit[0].equals("sanas")) {
				PersonaList.add(new Sana (numero,app));
				
			} 
			if (textSplit[0].equals("infectadas")) {
				PersonaList.add(new Infectada (numero,app));
				
			} 
			if (textSplit[0].equals("recuperadas")) {
				PersonaList.add(new Recuperado (numero,app));
				
			} 
			
			
			}
		
	}
	
	public void sortList (char c) {
			
			switch (c) {
			case 'n':
				
				Collections.sort(PersonaList);
				for (int i = 0; i < PersonaList.size(); i++) {
					PersonaList.get(i).setPosX(i*80+50);
					PersonaList.get(i).setPosY(300);
				}
				break;
			}
	}
			
		

	public void contagiado (boolean contagiado) throws MyExp {
		if (contagiado == true) {
			throw new MyExp ("Contagiado");
		}
	}
	
	
	public LinkedList<Persona> getPersonaList() {
		return PersonaList;
	}

	

	
	
}
