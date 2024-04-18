package util;

public abstract class Algoritmo {
/**
 * Esto recibira un numero entero y 
 * devolvera el numero de fibonacci
 * @return el numero de fibonacci
 * 
 */
	public static int fibonacci(int numero) {
		if(numero==0) {
			return numero;
		}
		if(numero==1) {
			return numero;
		}
		else {
			return fibonacci(numero-1)+fibonacci(numero-2);
		}
		
	}
/**
 * Esto recibira un numero entero y 
 * devolvera el numero factorial
 * @return el numero factorial
 */
	public static int factorial(int numero) {
		int num1=numero;
		for (int i=1;i<numero;i++) {
			num1=num1*i;
		}
		numero=num1;
		return numero;
	}
/**
 * Esto recibira un numero entero y 
 * devolvera un true o false si es primo o no
 * @return si es primo o no
 */
	public static boolean primo(int numero) {
		boolean res=true;
		if(numero==2) {
			res=true;
		}
		else if(numero==3) {
			res=true;
		}
		else if(numero==5) {
			res=true;
		}
		else if(numero%2==0) {
			res= false;
		}
		else if(numero%3==0) {
			res= false;
		}
		else if(numero%5==0) {
			res= false;
		}
		else if(numero%2!=0) {
			res= true;
		}
		else if(numero%3!=0) {
			res= true;
		}
		else if(numero%5!=0) {
			res= true;
		}
		return res;
	}
}
