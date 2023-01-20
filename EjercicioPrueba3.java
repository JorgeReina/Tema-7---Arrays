import java.util.Scanner;

/**
* 
* Ejercicio Problema de la pizarra, Tabla de exponentes.
* 
* Nombre del archivo: EjercicioPrueba3.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioPrueba3 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [][] n = new int [3][7];
		
		int x, y;
		
		int fila = 3;
		int columna = 7;
		
		int numero = 2;
		int exponente = 0;
		
		
		for (x = 0; x < fila; x++) {
			
			for (y = 0; y < columna; y++) {
				int resultado = (int)Math.pow(numero, exponente);
				n[x][y] = resultado;
				exponente += 1;
			}
			
		}
		
		
		for (x = 0; x < columna; x++) {
			for (y = 0; y < fila; y++) {
				System.out.printf("%10s", n[y][x]);
			}
			System.out.println();
		}
		
		
		
	}
}
