package util;

public abstract class Algoritmo {
/**
 * Esto recibira un numero entero y 
 * devolvera el numero de fibonacci
 * @return el numero de fibonacci
 * 
 */
	public static int fibonacci(int numero) {
		int serie=numero;
		int num1=0;
		int num2=1;
		int suma=1;
		for (int i=0;i<serie;i++) {
			suma=num1+num2;
			num1=num2
			num2=suma;
		}
		numero=suma;
		return numero;
		
	}
/**
 * Esto recibira un numero entero y 
 * devolvera el numero factorial
 * @return el numero factorial
 */
	public static int factorial(int numero) {

		return numero;
	}
/**
 * Esto recibira un numero entero y 
 * devolvera un true o false si es primo o no
 * @return si es primo o no
 */
	public static void primo(int numero) {
		
	}
}
