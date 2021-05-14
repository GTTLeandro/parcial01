package parcial01.ejercicio01;

import java.util.ArrayList;

public class App {
	
	
	public ArrayList<Recibo> rrhh(ArrayList<Empleado> empleados) {
		ArrayList<Recibo> salida = new ArrayList<Recibo>();
		for (Empleado emp : empleados) {
			salida.add(new Recibo(emp));}
			return salida;
			
	}
	
		
		
}


