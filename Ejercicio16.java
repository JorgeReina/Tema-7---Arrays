import java.util.Scanner;

/**
* 
* Ejercicio 16, Escribe un programa que rellene un array de 20 elementos
* con números enteros aleatorios comprendidos entre 0 y 400 (ambos 
* incluidos). A continuación el programa mostrará el array y preguntará 
* si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7.
* Seguidamente se volverá a mostrar el array escribiendo los números que 
* se quieren resaltar entre corchetes.
* 
* Nombre del archivo: Ejercicio16.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio16 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [] n = new int [20];
		
		for (int i = 0; i < 20; i++) {
			n[i] = (int)(Math.random()*401);
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		System.out.print("¿Què números quieres resaltar? (1 - los múltiplos de 5, 2- los múltiplos de 7): ");
		int menu = datos.nextInt();
		System.out.println();
		
		switch (menu)
		{
			case 1:
				for (int i = 0; i < 20; i++) {
					if (n[i] %5 == 0)
					{
						System.out.printf("[%s] ", n[i]);
					}
					else
					{
						System.out.printf("%s ", n[i]);
					}
				}
				break;
			case 2:
				for (int i = 0; i < 20; i++) {
					if (n[i] %7 == 0)
					{
						System.out.printf("[%s] ", n[i]);
					}
					else
					{
						System.out.printf("%s ", n[i]);
					}
				}
				break;
			default:
				System.out.println("Introduce una opción correcta.");
		}
		
		
		
	}
}
