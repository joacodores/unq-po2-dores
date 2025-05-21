package ar.edu.unq.po2.tp4.ingreso.trabajador;
import ar.edu.unq.po2.tp4.ingreso.*;
import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos;

	public Trabajador(ArrayList<Ingreso> i) {
		this.ingresos = i;
	}
	public Trabajador() {
	}
	
	public void agregarIngreso(Ingreso i) {
		this.ingresos.add(i);
	}

	public ArrayList<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public double getTotalPercibido() {
        double total = 0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.getMontoTotalPercibido();
        }
        return total;
    }

    public double getTotalImponible() {
        double total = 0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.getMontoImponible();
        }
        return total;
    }

    public double getImpuestoAPagar(){
        return getTotalImponible() * 0.02;
    }
	
}


