import java.util.Scanner;

/**
* 
* Ejercicio 13, Escribe un programa que rellene un array de 100 
* elementos con números enteros aleatorios comprendidos entre 0 y 500 
* (ambos incluidos). A continuación el programa mostrará el array y 
* preguntará si el usuario quiere destacar el máximo o el mínimo. 
* Seguidamente se volverá a mostrar el array escribiendo el número 
* destacado entre dobles asteriscos.
* 
* Nombre del archivo: Ejercicio13.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio13 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] n = new int [100];
		
		int minimo = 600;
		int maximo = 0;
		
		for (int i = 0; i < 100; i++) {
			n[i] = (int)(Math.random() * 501);
		}
		
		for (int i = 0; i < 100; i++)
		{
			System.out.print(n[i]+ " ");
		}
		
		System.out.println();
		System.out.print("¿Qué quieres destacar? (1 - mínimo, 2 - máximo): ");
		int respuesta = datos.nextInt();
		
		System.out.println();
		
		switch (respuesta)
		{
			case 1:
				for (int i = 0; i < 100; i++) {
					if (n[i] < minimo)
					{
						minimo = n[i];
					}
				}
				
				for (int i = 0; i < 100; i++) {
					if (n[i] == minimo)
					{
						System.out.printf("**%s** ", minimo);
					} else
					{
						System.out.print(n[i] + " ");
					}
				}
				break;
			case	2:
				for (int i = 0; i < 100; i++) {
					if (n[i] > maximo)
					{
						maximo = n[i];
					}
				}
				
				for (int i = 0; i < 100; i++) {
					if (n[i] == maximo)
					{
						System.out.printf("**%s** ", maximo);
					} else
					{
						System.out.print(n[i] + " ");
					}
				}
				break;
			default:
				System.out.print("El dato que has introducido no es correcto");
		}
		
		
	}
}
