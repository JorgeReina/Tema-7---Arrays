import java.util.Scanner;

/**
* 
* Ejercicio 20, Implementa un programa que calcule la denominación 
* ordinal de los reyes de una secuencia histórica. El programa 
* solicitará la cantidad de reyes que se van a introducir, y a 
* continuación recibirá los nombres de los reyes. Presentará por 
* pantalla dichos nombres, pero colocándoles el ordinal correspondiente.
* Así, por ejemplo, si hay dos Felipes en los nombres de los reyes, 
* el primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.
* 
* Nombre del archivo: Ejercicio20.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio20 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduzca el número total de nombres de reyes: ");
		int cantidad = datos.nextInt();
		
		String [] reyes = new String [cantidad];
		
		System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO");
		
		for (int i = 0; i < cantidad; i++) {
			reyes[i] = datos.next();
		}
		
		System.out.println();
		System.out.println("Los reyes introducidos son: ");
		
		int numero = 1;
		
		for (int i = 0; i < cantidad; i++) {
			int contador = 1;
			
			if (reyes[i].equals(reyes[contador])) {
				System.out.printf("%s %sº\n", reyes[i], numero);
				numero += 1;
			}else {
				System.out.printf("%s %sº\n", reyes[i], numero);
			}
		}
		
		
	}
}
