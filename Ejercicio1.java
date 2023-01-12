import java.util.Scanner;

/**
* 
* Ejercicio 1, Define un array de 12 números enteros con nombre num y asigna los valores 
* según la tabla que se muestra a continuación.
* 
* Nombre del archivo: Ejercicio1.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] num = new int [12];
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		for (int i = 0; i < 12; i++) {
			
			System.out.printf("Índice: %s 	Valor: %s\n", i, num[i]);
			
		}
		
		
	}
}
