package app;
import util.Algoritmo;
public class Principal extends Algoritmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros=new int[5];
		int [] fibonacci=new int [5];
		int [] factorial=new int [5];
		boolean [] primo=new boolean [5];
		for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) (Math.random()*11);
		}
		for(int i=0;i<numeros.length;i++) {
			fibonacci[i]=fibonacci(numeros[i]);
			
		}
		for(int i=0;i<numeros.length;i++) {
			factorial[i]=factorial(numeros[i]);
			System.out.println(numeros[i]);
			System.out.println(factorial[i]);
		}
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
			primo[i]=primo(numeros[i]);
			System.out.println(primo[i]);
			
		}
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]);
			}
		System.out.println("");
		for(int i=0;i<fibonacci.length;i++) {
		System.out.print(fibonacci[i]);
		}
	}

}
