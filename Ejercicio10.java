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
		
		//Creamos las arrays que vamos a utilizar.
		int [] aleatorio = new int [20];
		int [] par = new int [20];
		int [] impar = new int [20];
		
		//Primer bluce que define los números de forma aleatoria.
		for (int i = 0; i < 20; i++) {
			aleatorio[i] = (int)(Math.random() * 101);
		}
		
		//Definimos dos contadores para guardar los números en los arrays.
		int contador = 0;
		int contador1 = 0;
		
		//Se clasifica entre Par e Impar.
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
		
		//Este contador lo utilizamos para desplegar los datos del array impar.
		int contador2 = 0;
		
		//Bucle que coloca primero a los números Par y luego a los Impar.
		for (int i = 0; i < 20; i++)
		{
			if (i < contador) {
				aleatorio[i] = par[i];
			}else
			{
				aleatorio[i] = impar[contador2];
				contador2 += 1;
			}
		}
		
		System.out.println("NºAleatorio 		Par 		Impar");
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%4s  %20s  %16s\n", aleatorio[i], par[i], impar[i]);
		}
		
	}
}
