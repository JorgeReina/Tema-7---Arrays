import java.util.Scanner;

/**
* 
* Ejercicio 13 Bidimensional, Realiza un programa que calcule la 
* estatura media, mínima y máxima en centímetros de personas de 
* diferentes países. El array que contiene los nombres de los paises es 
* el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}. Los 
* datos sobre las estaturas se deben simular mediante un array de 4 
* filas por 10 columnas con números aleatorios generados al azar entre 
* 140 y 210. Los decimales de la media se pueden despreciar. Los nombres
* de los países se deben mostrar utilizando el array de países 
* (no se pueden escribir directamente).
* 
* Nombre del archivo: EjercicioBid13.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioBid13 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		
		int fila = 4;
		int columna = 10;
		int maximo = 0;
		int minimo = 1000;
		int media = 0;
		int contador = 0;
		int contador1 = 0;
		
		int [][] n = new int [fila][columna];
		int [] diagonal = new int [10];
		String [] paises = {"España","Rusia", "Japón", "Australia"};
		
		for (x = 0; x < fila; x++) {
			
			for (y = 0; y < columna; y++) {
				n[x][y] = (int)(Math.random() * 61 + 140);
			}
			
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.printf("%15s", paises[i]);
		}
		
		System.out.println();
		
		for (x = 0; x < columna; x++) {
			for (y = 0; y < fila; y++) {
				System.out.printf("%15s", n[y][x]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("Maximo: %s\n", maximo);
		System.out.printf("Minimo: %s\n", minimo);
		System.out.printf("Media: %4s", media/10);
		
	}
}
