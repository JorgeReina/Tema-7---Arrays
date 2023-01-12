import java.util.Scanner;

/**
* 
* Ejercicio 6, Escribe un programa que lea 15 números por teclado y que 
* los almacene en un array. Rota los elementos de ese array, es decir, 
* el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a 
* la 2, etc. El número que se encuentra en la última posición debe pasar
* a la posición 0. Finalmente, muestra el contenido del array.
* 
* Nombre del archivo: Ejercicio6.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Definimos los dos Arrays.
		int [] n = new int [15];
		
		int [] invertido = new int [15];
		
		//Introducimos los datos del primer arrays.
		for (int i = 0; i < 15; i++) {
			n[i] = datos.nextInt();
		}
		
		//Definimos la variable 'p' para ir seleccionando los elementos del array n.
		int p = 0; 
		//Definimos el elemento '0' del array invertido porque en el bucle empieza por uno y no lo rellena.
		invertido[0] = n[14];
		
		for (int i = 1; i < 15; i++)
		{
			invertido[i] = n[p];
			p += 1;
		}
		
		System.out.println();
		System.out.println("Normal 	Invertido");
		
		for (int i = 0; i < 15; i++) {
			System.out.printf("%s 	%s\n", n[i], invertido[i]);
		}
		
	}
}
