import java.util.Scanner;

/**
* 
* Ejercicio 9, Realiza un programa que pida 8 números enteros y que 
* luego muestre esos números junto con la palabra “par” o “impar” 
* según proceda.
* 
* Nombre del archivo: Ejercicio9.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		int [] n = new int [8];
		
		System.out.println("Por favor introduzca 8 números: ");
		
		for (int i = 0; i < 8; i++) {
			n[i] = datos.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < 8; i++) {
			if (n[i] % 2 == 0) {
				System.out.println(n[i] + " Par");
			} else {
				System.out.println(n[i] + " Impar");
			}
		}
		
		
	}
}
