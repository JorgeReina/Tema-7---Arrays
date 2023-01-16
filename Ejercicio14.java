import java.util.Scanner;

/**
* 
* Ejercicio 14, Escribe un programa que pida 8 palabras y las almacene 
* en un array. A continuación, las palabras correspondientes a colores 
* se deben almacenar al comienzo y las que no son colores a continuación.
* Puedes utilizar tantos arrays auxiliares como quieras. Los colores que 
* conoce el programa deben estar en otro array y son los siguientes: 
* verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
* 
* Nombre del archivo: Ejercicio14.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio14 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		String [] palabras = new String [8];
		String [] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		String [] otros = new String [8];
		String [] nocolores = new String [8];
		
		int contador = 0;
		int contador1 = 0;
		
		System.out.println("Por favor, introduce 8 palabras: ");
		
		for (int i = 0; i < 8; i++) {
			palabras[i]= datos.next();
		}
		
		
		
		for (int i = 0; i < 8; i++) {
			System.out.print(palabras[i] + " ");
		}
		
		for (int i = 0; i < 8; i++) {
			for (int u = 0; u < 8; u++) {
				if (palabras[i].equals(colores[u]))
				{
					otros[contador1] = palabras[i];
					contador1 += 1;
				}
				/*else
				{
					nocolores[contador] = palabras[i];
					contador += 1;
				}**/
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 8; i++)
		{
			System.out. print(otros[i] + " ");
			//System.out. print(nocolores[i] + " ");
		}
		
		
		
	}
}
