import java.util.Scanner;

/**
* 
* Ejercicio 10, Escribe un programa que genere 20 números enteros 
* aleatorios entre 0 y 100 y que los almacene en un array. El programa 
* debe ser capaz de pasar todos los números pares a las primeras 
* posiciones del array (del 0 en adelante) y todos los números impares 
* a las celdas restantes. Utiliza arrays auxiliares si es necesario.
* 
* Nombre del archivo: Ejercicio10.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] aleatorio = new int [20];
		int [] par = new int [20];
		int [] impar = new int [20];
		
		for (int i = 0; i < 20; i++) {
			aleatorio[i] = (int)(Math.random() * 101);
		}
		
		int contador = 0;
		int contador1 = 0;
		
		for (int i = 0; i < 20; i++) {
			if (aleatorio[i] %2 ==0)
			{
				par[contador] = aleatorio[i];
				contador += 1 ;
			} else
			{
				impar[contador1] = aleatorio[i];
				contador1 += 1 ;
			}
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(par[i] + " " + impar[i]);
		}
		
		for (int i = 0; i < 20; i++)
		{
			
		}
		
		
		
	}
}
