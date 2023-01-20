import java.util.Scanner;

/**
* 
* Ejercicio Problema de la pizarra, Tabla de exponentes con long.
* 
* Nombre del archivo: EjercicioPrueba4.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioPrueba4 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		
		int fila = 5;
		int columna = 7;
		
		long [][] n = new long [fila][columna];
		
		int numero = 2;
		int exponente = 0;
		
		
		for (x = 0; x < fila; x++) {
			
			for (y = 0; y < columna; y++) {
				long resultado = (long)Math.pow(numero, exponente);
				n[x][y] = resultado;
				exponente += 1;
			}
			
		}
		
		
		for (x = 0; x < columna; x++) {
			for (y = 0; y < fila; y++) {
				System.out.printf("%15s", n[y][x]);
			}
			System.out.println();
		}
		
		
		
	}
}
