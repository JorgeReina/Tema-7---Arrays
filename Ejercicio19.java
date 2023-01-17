import java.util.Scanner;

/**
* 
* Ejercicio 19, Realiza un programa que sea capaz de insertar un número 
* en una posición concreta de un array. En primer lugar, el programa 
* generará un array de 12 números enteros aleatorios entre 0 y 200 ambos
* incluidos. A continuación se debe mostrar el contenido de ese array 
* junto al índice (0 – 11). Seguidamente el programa preguntará por el 
* número que se quiere insertar y por la posición donde será insertado. 
* Los números del array se desplazan a la derecha para dejar sitio al 
* nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá.
* 
* Nombre del archivo: Ejercicio19.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class Ejercicio19 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int [] n = new int [12];
		int [] copia = new int [12];
		
		int valor = 0;
		int menu = 0;
		
		int contador = 0;
		int contador1 = 1;
		int contador2 = 2;
		int contador3 = 3;
		int contador4 = 4;
		int contador5 = 5;
		int contador6 = 6;
		int contador7 = 7;
		int contador8 = 8;
		int contador9 = 9;
		int contador10 = 10;
		
		System.out.println("Array original:");
		System.out.println();
		
		System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
		System.out.print("Valor ");
		
		for (int i = 0; i < 12; i++) {
			n[i] = (int)(Math.random()*201);
			System.out.print(" " + n[i] + "	");
		}
		
		for (int i = 0; i < 12; i++)
		{
			copia[i] = n[i];
		}
		
		
		System.out.println();
		System.out.print("Introduzca el número que quiere insertar: ");
		valor = datos.nextInt();
		System.out.print("Introduzca la posiciónd donde quiere insertar (0-11): ");
		menu = datos.nextInt();
		
		switch (menu)
		{
			case 0:
			
				for (int i = 1; i < 12; i++)
				{
					n[i] = copia[contador];
					contador += 1;
				}
				
				n[0] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 1:
			
				for (int i = 2; i < 12; i++)
				{
					n[i] = copia[contador1];
					contador1 += 1;
				}
				
				n[1] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 2:
			
				for (int i = 3; i < 12; i++)
				{
					n[i] = copia[contador2];
					contador2 += 1;
				}
				
				n[2] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 3:
			
				for (int i = 4; i < 12; i++)
				{
					n[i] = copia[contador3];
					contador3 += 1;
				}
				
				n[3] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 4:
			
				for (int i = 5; i < 12; i++)
				{
					n[i] = copia[contador4];
					contador4 += 1;
				}
				
				n[4] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 5:
			
				for (int i = 6; i < 12; i++)
				{
					n[i] = copia[contador5];
					contador5 += 1;
				}
				
				n[5] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 6:
			
				for (int i = 7; i < 12; i++)
				{
					n[i] = copia[contador6];
					contador6 += 1;
				}
				
				n[6] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 7:
			
				for (int i = 8; i < 12; i++)
				{
					n[i] = copia[contador7];
					contador7 += 1;
				}
				
				n[7] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 8:
			
				for (int i = 9; i < 12; i++)
				{
					n[i] = copia[contador8];
					contador8 += 1;
				}
				
				n[8] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 9:
			
				for (int i = 10; i < 12; i++)
				{
					n[i] = copia[contador9];
					contador9 += 1;
				}
				
				n[9] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 10:
			
				for (int i = 11; i < 12; i++)
				{
					n[i] = copia[contador10];
					contador10 += 1;
				}
				
				n[10] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
				case 11:
				
				n[11] = valor;
				
				System.out.println("Indice	0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11");
				System.out.print("Valor ");
				for (int i = 0; i < 12; i++)
				{
					System.out.print(" " + n[i] + "	");
				}
				
				break;
			default:
				System.out.print("Opción incorecta");
		}
		
		
	}
}
