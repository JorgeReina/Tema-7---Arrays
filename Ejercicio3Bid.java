import java.util.Scanner;

/**
* 
* Ejercicio 3 Bidimensional, Modifica el programa anterior de tal forma 
* que los números que se introducen en el array se generen de forma 
* aleatoria (valores entre 100 y 999).
* 
* Nombre del archivo: Ejercicio3Bid.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio3Bid {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [][] n = new int [5][6];
		
		int fila, columna;
		
		for (fila = 0; fila < 4; fila++) {
			
			for (columna = 0; columna < 5; columna++) {
				n[fila][columna] = (int)(Math.random()*900 + 100);
			}
			
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
				System.out.printf("%6s", n[fila][columna]);
			}
			System.out.println();
		}
		
	}
}
