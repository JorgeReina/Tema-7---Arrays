import java.util.Scanner;

/**
* 
* Ejercicio 11 Bidimensional, Realiza un programa que muestre por 
* pantalla un array de 10 filas por 10 columnas relleno con números 
* aleatorios entre 200 y 300. A continuación, el programa debe mostrar 
* los números de la diagonal que va desde la esquina superior izquierda 
* a la esquina inferior derecha, así como el máximo, el mínimo y la 
* media de los números que hay en esa diagonal.
* 
* Nombre del archivo: EjercicioBid11.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioBid11 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		
		int fila = 10;
		int columna = 10;
		int maximo = 0;
		int minimo = 1000;
		int media = 0;
		
		int [][] n = new int [fila][columna];
		int [] diagonal = new int [10];
		
		for (x = 0; x < fila; x++) {
			
			for (y = 0; y < columna; y++) {
				n[x][y] = (int)(Math.random() * 101 +200);
			}
			
		}
		
		for (int i = 0; i < 10; i++)
		{
			diagonal[i] = n[i][i];
			if (maximo < n[i][i])
				{
					maximo = n[i][i];
				}
				if (minimo > n[i][i])
				{
					minimo = n[i][i];
				}
				media += n[i][i];
		}
		
		
		
		for (x = 0; x < columna; x++) {
			for (y = 0; y < fila; y++) {
				System.out.printf("%10s", n[y][x]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Nº Diagonal: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%5s", diagonal[i]);
		}
		
		
		System.out.println();
		System.out.printf("Maximo: %s\n", maximo);
		System.out.printf("Minimo: %s\n", minimo);
		System.out.printf("Media: %4s", media/10);
		
	}
}
