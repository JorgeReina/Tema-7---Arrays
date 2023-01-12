import java.util.Scanner;

/**
* 
* Ejercicio 3, Escribe un programa que lea 10 números por teclado y que 
* luego los muestre en orden inverso, es decir, el primero que se introduce
* es el último en mostrarse y viceversa.
* 
* Nombre del archivo: Ejercicio3.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio3 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
	int [] n = new int [10];
	
	System.out.println("Introduce 10 números:");
	
	for (int i = 0; i < 10; i++) {
		
		n[i] = datos.nextInt();
		
	}
	
	System.out.println();
	
	//int o = 9;
	
	for (int i = 9; i > 0; i--) {	
		
		System.out.println(n[i]);
		
		//o = o-1;
		
	}
		
	}
}
