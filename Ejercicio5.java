import java.util.Scanner;

/**
* 
* Ejercicio 5, Escribe un programa que pida 10 números por teclado y 
* que luego muestre los números introducidos junto con las palabras 
* “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
* 
* Nombre del archivo: Ejercicio5.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] n = new int [10];
		
		for (int i = 0; i < 10; i++) {
			n[i] = datos.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Máximo %s Minimo\n", n[i]);
		}
		
		
		
	}
}
