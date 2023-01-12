import java.util.Scanner;

/**
* 
* Ejemplo 1, 
* 
* Nombre del archivo: Ejemplo1.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejemplo1 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		double [] n = new double[10];
		
		n[0] = Math.pow(2, 1);
		n[1] = Math.pow(2, 2);
		n[2] = Math.pow(2, 3);
		n[3] = Math.pow(2, 4);
		n[4] = Math.pow(2, 5);
		n[5] = Math.pow(2, 6);
		n[6] = n[2] * 10;
		n[7] = n[2] / 10;
		n[8] = n[0] + n[1] + n[2];
		n[9] = n[8];
		
		for (int i = 0; i < 10; i++) {
			
			System.out.printf("Posición: %s y Elemento: %s\n", i, n[i]);
			
		}
		
		System.out.println();
		System.out.print("Que posición quieres ver (0-9): ");
		int posicion = datos.nextInt();
		
		System.out.printf("La posición %s es: %s\n", posicion, n[posicion]);
		
		System.out.println();
		
		int pares = 0;
		
		for (int i = 0; i < 9; i++) {
			if (i%2 == 0)
			{
				System.out.println(n[i]);
				pares += n[i];
			}
		}
		
		System.out.print("La suma es " + pares);
		
	}
}
