import java.util.Scanner;

/**
* 
* Ejercicio clase, enunciado en papel.
* 
* Nombre del archivo: EjercicioClase2.java
* 
* @author Jorge Reina Romero
* 
*/
 
public class EjercicioClase2 {
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
		int hombres = 0;
		int mujeres = 0;
		
		int [][] n = new int [fila][columna];
		
		for (int i = 0; i < personas; i++) {
			
			sexo = (int)(Math.random()* 2 +1);
			
			switch (sexo)
			{
				case 1:
					n[0][contador] = sexo;
					contador += 1;
					sueldo = (int)(Math.random()* 10001 + 20000);
					n[1][contador1] = sueldo;
					mediaHombre += sueldo;
					contador1 += 1;
					break;
				case 2:
					n[0][contador] = sexo;
					contador += 1;
					sueldo = (int)(Math.random()* 10001 + 20000);
					n[1][contador1] = sueldo;
					mediaMujer += sueldo;
					contador1 += 1;
				break;
				default:
					System.out.print("Introduce un valor correcto");
			}
			
		}
			
			System.out.println();
			
			System.out.println("(Hombre 1 - Mujer 2)");
			
			System.out.println();
			
			for (x = 0; x < fila; x++) {
			for (y = 0; y < columna; y++) {
				System.out.printf("%10s", n[x][y]);
			}
			System.out.println();
		}
		
	
			for (y = 0; y < columna; y++) {
				if (n[0][y] == 1)
				{
					hombres +=1;
				}else
				{
					mujeres +=1;
				}
			}
			
		System.out.println();
		System.out.printf("Hombres Totales: %s\n", hombres);
		System.out.printf("Media sueldo Hombre: %s\n", mediaHombre / hombres);
		System.out.println();
		System.out.printf("Mujeres Totales: %s\n", mujeres);
		System.out.printf("Media sueldo Mujer: %s\n", mediaMujer / mujeres);
		System.out.println();
		System.out.printf("Diferencia salarial: %s\n", mediaMujer / mujeres - mediaHombre / hombres);
		
		
		
	}
}
