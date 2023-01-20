import java.util.Scanner;

/**
* 
* Ejercicio 1 Bidimensional, Define un array de números enteros de 3 filas por 6 
* columnas con nombre num y asigna los valores según la siguiente tabla. 
* Muestra el contenido de todos los elementos del array dispuestos en 
* forma de tabla como se muestra en la figura.
* 
* Nombre del archivo: Ejercicio1Bid.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio1Bid {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [][] num = new int [3][6];
		
		num [0][0] = 0;
		num [0][1] = 30;
		num [0][2] = 2;
		num [0][5] = 5;
		num [1][0] = 75;
		num [1][4] = 0;
		num [2][2] = -2;
		num [2][3] = 9;
		num [2][5] = 11;
		
		int fila, columna;
		
		for (fila = 0; fila < 3; fila++) {
			for (columna = 0; columna < 6; columna++) {
				System.out.printf("%5d ", num[fila][columna]);
			}
			System.out.println();
		}
		
	}
}
