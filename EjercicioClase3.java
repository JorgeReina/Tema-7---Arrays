import java.util.Scanner;

/**
* 
* Ejercicio clase, enunciado en papel.
* 
* Nombre del archivo: EjercicioClase3.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioClase3 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		int par = 0;
		String green="\033[32m"; 
		
		System.out.print("Introduce la cantidad de filas: ");
		int fila = datos.nextInt();
		System.out.print("Introduce la cantidad de columnas: ");
		int columna = datos.nextInt();
		
		boolean multiplo = false;
		
		int [][] tabla = new int [fila][columna];
		int [] mult3 = new int [fila];
		
		for (x = 0; x < fila; x++) {
			for (y = 0; y < columna; y++) {
				tabla[x][y] = par;
				if (tabla[x][y] %7 == 0 && !multiplo && par > 0)
				{
					System.out.printf("\033[32m%5d\033[32m", tabla[x][y]);
					multiplo = true;
					
				} else {
					System.out.printf("\033[37m%5d\033[37m", tabla[x][y]);
				}
				if (tabla[x][y] %3 == 0)
				{
					mult3[x]=tabla[x][y];
				}
				par += 2;
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i = 0; i < fila; i++)
		{
			System.out.printf("%5d", mult3[i]);
		}
		
		
	}
}
