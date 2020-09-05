package ejercicios;

import java.util.Scanner;

public class Ejercicio22Positivo {

	public static void main(String[] args) {
		// Realice un algoritmo para determinar si un número es positivo o negativo.

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido");
		System.out.println("Por favor ingrese el numero para determinar si es positivo o negativo");
		int numero = sc.nextInt();

		sc.close();

		if (numero < 0) {
			System.out.println("El numero ingresado es NEGATIVO");
		} else if (numero == 0) {
			System.out.println("El cero es un numero NEUTRO");
		} else {
			System.out.println("El numero ingresado es POSITIVO");
		}

	}// aca se cierra el main
}// aca se cierra la class
