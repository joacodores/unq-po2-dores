package ar.edu.unq.po2.tp7Composite.Cultivos;

import java.util.ArrayList;

public class CultivoMixto implements Parcela{
	private ArrayList<Parcela> subparcelas;
	
	public CultivoMixto() {
		this.subparcelas = new ArrayList<Parcela>();
	}
	
    public void agregarParcela(Parcela p) {
        if (subparcelas.size() < 4) {
            subparcelas.add(p);
        } else {
            throw new IllegalStateException("No se pueden agregar más de 4 subparcelas.");
        }
    }
	
    public double gananciaAnual() {
        if (subparcelas.isEmpty()) return 0;

        double proporcion = 1.0 / subparcelas.size();
        double total = 0;
        for (Parcela p : subparcelas) {
            total += p.gananciaAnual() * proporcion;
        }
        return total;
    }
}
