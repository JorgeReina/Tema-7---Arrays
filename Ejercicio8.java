import java.util.Scanner;

/**
* 
* Ejercicio 8, Realiza un programa que pida la temperatura media que ha 
* hecho en cada mes de un determinado año y que muestre a continuación 
* un diagrama de barras horizontales con esos datos. Las barras del 
* diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
* 
* Nombre del archivo: Ejercicio8.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] temperatura = new int [12];
		
		System.out.println("Introduce la temperatura media de cada mes: ");
		
		for (int i = 0; i < 12; i++) {
			temperatura[i] = datos.nextInt();
		}
		
		System.out.println();
		System.out.println("DIAGRAMA DE TEMPERATURAS");
		
		for (int i = 0; i < 12; i++) {
			System.out.print(temperatura[i] + " ");
			for (int u = 0; u < temperatura[i]; u++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
