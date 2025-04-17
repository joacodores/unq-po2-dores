package ar.edu.unq.po2.tp3.counter;
import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numbers;
	
	public Counter(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	//Setter
	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public ArrayList<Integer> getNumbers(){
		return numbers; 
	}
	
	public boolean isEven(int number ) {
		return (number % 2 == 0);
	}
	
	public int getEvenOcurrences() {
		int count = 0;
		for (int num : numbers) {
			if(isEven(num)) {
				count++;
			}
		}
		return count;
	}
	public int getOddOcurrences() {
		int count = 0;
		for (int num : numbers) {
			if(!isEven(num)) {
				count++;
			}
		}
		return count;
	}
	
	public boolean isMultipleOf(int numero, int divisor) {
		return (numero % divisor == 0);
	}
	
	public int getMultiplesOf(int divisor) {
		int count = 0;
		for(int num : numbers) {
			if(isMultipleOf(num, divisor)) {
				count++;
			}
		}
		return(count); 
	}
	
	public int getMostEvenDigits() {
		int mostEvenDigits = 0;
		for (int num : numbers) {
			mostEvenDigits = moreEvenDigits(mostEvenDigits, num);
		}
		return mostEvenDigits; 
	}
	
	public int moreEvenDigits(int n, int m) {
		int evensN = countEvenDigits(n);
		int evensM = countEvenDigits(m);
		return (evensN >= evensM) ? n : m; 
	}
	
	public int countEvenDigits(int number) {
		int count = 0;
		while (number > 0) {
			int digit = number % 10;
			if(isEven(digit)) {
				count++;
			}
			number /= 10;
		}
		return count; 
	}
	
	public int highestMultipleOf_And_(int n, int m) {
		int highestMultiple = -1;
		
		for (int i = 1; i < 1000; i++ ) {
			if(is_MultipleOf_And_(i, n, m)) {
				highestMultiple = i;
			}
		}
		return(highestMultiple);
	}
	
	public boolean is_MultipleOf_And_(int i, int n, int m) {
		return (i % n == 0) && (i % m == 0 );
	}	
	
	/*
	 * Respuesta tp3: ej 4-> 
	 * 
	 * s.length();
		Retorna 3

		t.length();
		Da error en tiempo de ejecución: NullPointerException
		Porque t está declarada pero no inicializada, es decir, vale null.

		1 + a;
		Retorna "1abc".

		a.toUpperCase();
		Retorna "ABC"

		"Libertad".indexOf("r");
		Retorna 4
		Porque la letra 'r' está en la posición 4 de "Libertad" (índices empiezan en 0).

		"Universidad".lastIndexOf('i');
	 	Retorna 9
		Busca la última aparición del carácter 'i' en "Universidad", que está en el índice 9.

		"Quilmes".substring(2, 4);
		Retorna "il"
		Extrae los caracteres desde el índice 2 hasta el 3 (el final no es inclusivo).

		(a.length() + a).startsWith("a");
		Retorna false
		"3abc".startsWith("a") 

		s == a;
		Retorna true

		a.substring(1,3).equals("bc")
		Retorna true
	 * */
	 
}














