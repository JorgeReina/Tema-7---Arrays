import java.util.Scanner;

/**
* 
* Ejercicio 2, Define un array de 10 caracteres con nombre simbolo y asigna valores a los 
* elementos según la tabla que se muestra a continuación.
* 
* Nombre del archivo: Ejercicio2.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio2 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		char [] simbolo = new char[10];
		
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'q';
		
		for (int i = 0; i < 10; i++) {
			
			System.out.printf("Índice: %s Valor: %s\n", i, simbolo[i]);
			
		}
		
		
	}
}
