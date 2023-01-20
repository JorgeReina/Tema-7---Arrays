import java.util.Scanner;

/**
* 
* Ejercicio Problema de la pizarra, Tabla de multiplicar.
* 
* Nombre del archivo: EjercicioPrueba2.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioPrueba2 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [][] tabla = new int [10][10];
		
		int valor = 1;
		int resultado = 1;
		
		for (int i = 0; i < 10; i++) {
			
			int multiplicado = 1;
			
			for (int u = 0; u < 10; u++) {
				
				resultado = valor * multiplicado;
				tabla[u][i] = resultado;
				System.out.printf("%4s", tabla[u][i]);
				multiplicado += 1;
				
			}
			
			System.out.println();
			valor += 1;
			
		}
		
	}
}
