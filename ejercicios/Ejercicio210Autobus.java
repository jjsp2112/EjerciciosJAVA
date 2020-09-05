package ejercicios;

import java.util.Scanner;

public class Ejercicio210Autobus {

	public static void main(String[] args) {
		// tres costos diferentes por km
		// para cada autobus
		// minimo 20 pers
		// determinar costo total
		// determinar costo x persona

		Scanner sc = new Scanner(System.in); // se utiliza para leer ingresos del teclado

		// solicitar la cantidad de personas
		System.out.println("Ingrese cantidad de personas");
		int personas = sc.nextInt();

		// solicitar la cantidad de km
		System.out.println("Ingrese cantidad de km");
		int km = sc.nextInt();

		// solicitar tipo de autobus
		System.out.println("Ingrese el tipo de autobus (A, B, C)");
		String tipo = sc.next();

		sc.close(); // se utiliza para cerrar el objeto sc, es decir que cierra el scanner

	}

}
