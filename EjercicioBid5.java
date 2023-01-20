import java.util.Scanner;

/**
* 
* Ejercicio 5 Bidimensional, Realiza un programa que rellene un array 
* de 6 filas por 10 columnas con números enteros positivos comprendidos 
* entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá 
* dar la posición tanto del máximo como del mínimo.
* 
* Nombre del archivo: EjercicioBid5.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioBid5 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		
		int fila = 6;
		int columna = 10;
		int maximo = 0;
		int minimo = 1000;
		
		int [][] n = new int [fila][columna];
		
		for (x = 0; x < fila; x++) {
			
			for (y = 0; y < columna; y++) {
				n[x][y] = (int)(Math.random() * 1001);
				if (maximo < n[x][y])
				{
					maximo = n[x][y];
				}
				if (minimo > n[x][y])
				{
					minimo = n[x][y];
				}
			}
			
		}
		
		
		for (x = 0; x < columna; x++) {
			for (y = 0; y < fila; y++) {
				System.out.printf("%10s", n[y][x]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("Maximo: %s\n", maximo);
		System.out.printf("Minimo: %s", minimo);
		
	}
}
