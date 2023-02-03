import java.util.Scanner;

/**
* 
* Ejercicio clase, enunciado en papel.
* 
* Nombre del archivo: EjercicioClase.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioClase {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int x, y;
		
		int personas;
		System.out.print("Introduce la cantidad de personas: ");
		personas = datos.nextInt();
		
		int fila = 2;
		int columna = personas;
		int sexo;
		int sueldo;
		int mediaHombre = 0;
		int mediaMujer = 0;
		int contador = 0;
		int contador1 = 0;
		int contador2= 1;
		
		int [][] n = new int [fila][columna];
		
		for (int i = 0; i < personas; i++) {
			
			System.out.printf("Introduce los datos de la persona %s\n", contador2);
			System.out.print("¿Hombre o Mujer? (Hombre 1 - Mujer 2): ");
			sexo = datos.nextInt();
			
			switch (sexo)
			{
				case 1:
					n[0][contador] = sexo;
					contador += 1;
					System.out.print("Introduce el sueldo: ");
					sueldo = datos.nextInt();
					n[1][contador1] = sueldo;
					mediaHombre += sueldo;
					contador1 += 1;
					break;
				case 2:
					n[0][contador] = sexo;
					contador += 1;
					System.out.print("Introduce el sueldo: ");
					sueldo = datos.nextInt();
					n[1][contador1] = sueldo;
					mediaMujer += sueldo;
					contador1 += 1;
				break;
				default:
					System.out.print("Introduce un valor correcto");
			}
			
			System.out.println();
			contador2 += 1;
			
		}
			
			System.out.println();
			
			for (x = 0; x < fila; x++) {
			for (y = 0; y < columna; y++) {
				System.out.printf("%10s", n[x][y]);
			}
			System.out.println();
		}
			
		System.out.println();
		System.out.printf("Media sueldo Hombre: %s\n", mediaHombre / personas);
		System.out.printf("Media sueldo Mujer: %s\n", mediaMujer / personas);
		
		System.out.printf("Diferencia salarial: %s\n", mediaMujer / personas - mediaHombre / personas);
		
	}
}
