import java.util.Scanner;

/**
* 
* Ejercicio 12 Bidimensional, Realiza un programa que muestre por 
* pantalla un array de 9 filas por 9 columnas relleno con números 
* aleatorios entre 500 y 900. A continuación, el programa debe mostrar 
* los números de la diagonal que va desde la esquina inferior izquierda 
* a la esquina superior derecha, así como el máximo, el mínimo y la 
* media de los números que hay en esa diagonal.
* 
* Nombre del archivo: EjercicioBid12.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioBid12 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		
		int fila = 9;
		int columna = 9;
		int maximo = 0;
		int minimo = 1000;
		int media = 0;
		int contador = 0;
		
		int [][] n = new int [fila][columna];
		int [] diagonal = new int [9];
		
		for (x = 0; x < fila; x++) {
			
			for (y = 0; y < columna; y++) {
				n[x][y] = (int)(Math.random() * 401 +500);
			}
			
		}
		
		for (int i = 8; i >= 0; i--)
		{
			diagonal[contador] = n[contador][i];
			if (maximo < n[contador][i])
				{
					maximo = n[contador][i];
				}
				if (minimo > n[contador][i])
				{
					minimo = n[contador][i];
				}
			media += n[contador][i];
			contador += 1;
		}
		
		
		
		for (x = 0; x < columna; x++) {
			for (y = 0; y < fila; y++) {
				System.out.printf("%10s", n[y][x]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Nº Diagonal: ");
		
		for (int i = 0; i < 9; i++) {
			System.out.printf("%5s", diagonal[i]);
		}
		
		
		System.out.println();
		System.out.printf("Maximo: %s\n", maximo);
		System.out.printf("Minimo: %s\n", minimo);
		System.out.printf("Media: %4s", media/10);
		
	}
}
