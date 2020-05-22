package model;
import java.util.Comparator;




public class CompararPersona implements Comparator <Persona> {

	public int compare(Persona o1, Persona o2) {
	
		return o1.getR()-o2.getR();
	}

}
