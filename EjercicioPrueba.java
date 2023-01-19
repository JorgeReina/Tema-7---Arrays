import java.util.Scanner;

/**
* 
* Ejercicio Problema de la pizarra, Foto de la pizarra.
* 
* Nombre del archivo: EjercicioPrueba.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioPrueba {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [][] tabla = new int [5][10];
		
		int abajo = 0;
		
		
		for (int i = 0; i < 10; i++) {
			for (int u = 0; u < 5; u++) {
				tabla[u][i] = abajo;
				abajo += 2;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int u = 0; u < 10; u++) {
				System.out.print(tabla[i][u] + " ");
			}
			System.out.println();
		}
		
	}
}
