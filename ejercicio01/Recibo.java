package parcial01.ejercicio01;

import java.time.LocalDate;

public class Recibo {
	private int numero;
	private LocalDate fecha;
	private double total;
	private Empleado empleado;
	
	
	public Recibo(Empleado empleado) {
		super();
		this.empleado = empleado;
		total = empleado.liquidar();
	}
	
	

}
