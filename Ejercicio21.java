import java.util.Scanner;

/**
* 
* Ejercicio 21, Escribe un programa que rellene un array de 15 elementos
* con números enteros comprendidos entre 0 y 500 (ambos incluidos). 
* A continuación, se mostrará el array “cincuerizado”, según el 
* siguiente criterio: si el número que hay en una posición del array es 
* múltiplo de 5, se deja igual, y si no, se cambia por el siguiente 
* múltiplo de 5 que exista a partir de él.
* 
* Nombre del archivo: Ejercicio21.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio21 {
	public static void main(String[] args) {
		
		int [] n = new int [15];
		
		System.out.println("Array original: ");
		
		for (int i = 0; i < 15; i++) {
			n[i] = (int)(Math.random()*501);
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Array cincuerizado: ");
		
		for (int i = 0; i < 15; i++) {
			for (int u = 0; u < 5; u++) {
				if (n[i] %5 != 0)
				{
					n[i] += 1;
				}
			}
			
			System.out.print(n[i] + " ");
		}
		
		
	}
}
