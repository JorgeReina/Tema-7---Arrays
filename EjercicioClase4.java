import java.util.Scanner;

/**
* 
* Ejercicio clase, enunciado en papel.
* 
* Nombre del archivo: EjercicioClase4.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioClase4 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		int par = 0;
		
		System.out.print("Introduce la cantidad de filas: ");
		int fila = datos.nextInt();
		System.out.print("Introduce la cantidad de columnas: ");
		int columna = datos.nextInt();
		
		int [][] tabla = new int [fila][columna];
		
		for (x = 0; x < fila; x++) {
			
			for (y = 0; y < columna; y++) {
				if (par % 2 == 0)
				{
					tabla[x][y] = par;
					
				}
				System.out.printf("%5d", tabla[x][y]);
				par += 2;
			}
			System.out.println();
			
		}
		
	}
}
