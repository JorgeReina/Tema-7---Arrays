import java.util.Scanner;

/**
* 
* Ejercicio 2 Bidimensional, Escribe un programa que pida 20 números 
* enteros. Estos números se deben introducir en un array de 4 filas por
* 5 columnas. El programa mostrará las sumas parciales de filas y 
* columnas igual que si de una hoja de cálculo se tratara. La suma total
*  debe aparecer en la esquina inferior derecha.
* 
* Nombre del archivo: Ejercicio2Bid.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio2Bid {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [][] n = new int [5][6];
		
		int fila, columna;
		
		for (fila = 0; fila < 4; fila++) {
			System.out.printf("Introduce los datos de la fila %s: \n", fila);
			for (columna = 0; columna < 5; columna++) {
				n[fila][columna] = datos.nextInt();
			}
			System.out.println();
		}
		
		for (fila = 4; fila < 5; fila++) {
			for (columna = 5; columna < 6; columna++) {
				for (int i = 0; i < 4; i++)
				{
					for (int u = 0; u < 5; u++)
					{
						n[fila][columna] += n[i][u];
					}
					
				}
				
			}
			System.out.println();
		}
		
		for (fila = 0; fila < 5; fila++) {
			
			for (columna = 0; columna < 6; columna++) {
				System.out.printf("%5s", n[fila][columna]);
			}
			System.out.println();
		}
		
	}
}
