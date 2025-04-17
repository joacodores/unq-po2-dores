package ar.edu.unq.po2.tp3.multioperador;
import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numbers;
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public Multioperador(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public int sumTodos() {
		int sumaTotal = 0;
		for (int num : numbers) {
			sumaTotal = sumaTotal + num;
		}
		return sumaTotal;
	}
	
	public int restarTodos() {
		int restaTotal = numbers.get(0);
		for (int num = 1; num < numbers.size(); num++) {
			restaTotal = restaTotal - numbers.get(num);
		}
		return restaTotal;
	}
	public int multiplicarTodos() {
		int productoTotal = 1;
		for (int num : numbers) {
			productoTotal = productoTotal * num;
		}
		return productoTotal;
	}
	
}
