import java.util.Scanner;

/**
* 
* Ejercicio 18, Realiza un programa que genere 10 números enteros 
* aleatorios entre 0 y 200 ambos incluidos y que los almacene en un 
* array. A continuación, el programa debe mostrar el contenido de ese 
* array junto al índice (0 – 9). Seguidamente el programa debe colocar 
* de forma alterna y en orden los menores o iguales de 100 y los mayores
* de 100: primero menor, luego mayor, luego menor, luego mayor… Cuando 
* se acaben los menores o los mayores, se completará con los números que queden.
* 
* Nombre del archivo: Ejercicio18.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio18 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [] n = new int [10];
		int [] mayor = new int[10];
		int [] menor = new int[10];
		int [] suma = new int[10];
		
		int	contador = 0;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		
		System.out.println("Array original:");
		System.out.println();
		
		System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9");
		System.out.print("Valor ");
		
		for (int i = 0; i < 10; i++) {
			n[i] = (int)(Math.random()*201);
			System.out.print(" " + n[i] + "	");
		}
		
		System.out.println();
		System.out.println("Array resultado:");
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			if (n[i] > 100) {
				mayor[contador] = n[i];
				contador += 1;
			}
			if (n[i] < 100) {
				menor[contador1] = n[i];
				contador1 += 1;
			}
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print(mayor[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print(menor[i] + " ");
		}
		
		for (int i = 0; i < 10; i++) {
			for (int i = 0; i < contador; i++)
			{
				
			}
			
		}
		
		
		
		
		/**for (int i = 0; i < 10; i+2) {
				n[i] = minimo[contador2];
				contador2 += 1;
		}
		for (int i = 1; i < 10; i+2) {
				n[i] = maximo[contador3];
				contador3 += 1;
		}**/
		
		
	}
}
