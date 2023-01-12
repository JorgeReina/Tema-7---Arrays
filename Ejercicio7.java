import java.util.Scanner;

/**
* 
* Ejercicio 7, Escribe un programa que genere 100 números aleatorios 
* del 0 al 20 y que los muestre por pantalla separados por espacios. 
* El programa pedirá entonces por teclado dos valores y a continuación 
* cambiará todas las ocurrencias del primer valor por el segundo en la 
* lista generada anteriormente. Los números que se han cambiado deben 
* aparecer entrecomillados.
* 
* Nombre del archivo: Ejercicio7.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] n = new int [100];
		
		for (int i = 0; i < 100; i++) {
			int nAleatorio = (int)(Math.random()*21);
			n[i] = nAleatorio;
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("Por favor introduce el valor que quiere sustituir: ");
		int nuAntiguo = datos.nextInt();
		
		System.out.print("Por favor introduce el valor por el que quiere sustituirlo: ");
		int nuNuevo = datos.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			if (n[i] == nuAntiguo)
			{
				n[i] = nuNuevo;
			}
		}
		
		for (int i = 0; i < 100; i++)
		{
			if (n[i] == nuNuevo)
			{
				System.out.printf("'%s' ", n[i]);
			} else
			{
				System.out.printf("%s ", n[i]);
			}
		}
		
	}
}
