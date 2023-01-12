import java.util.Scanner;

/**
* 
* Ejercicio 4, Define tres arrays de 20 números enteros cada una, 
* con nombres numero, cuadrado y cubo. 
* Carga el array numero con valores aleatorios entre 0 y 100.
* 
* Nombre del archivo: Ejercicio4.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio4 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] numero = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		
		System.out.println("Numero		Cuadrado		Cubo");
		
		for (int i = 0; i < 20; i++) {
			int nAleatorio = (int)(Math.random()*110);
			numero[i] = nAleatorio;
			cuadrado[i] = (int)Math.pow(numero[i], 2);
			cubo[i] = (int)Math.pow(numero[i], 3);
			System.out.printf("%s		%s 			%s\n", numero[i], cuadrado[i], cubo[i]);
		}
		
		
	}
}
