package ejercicios;

import java.util.Scanner;

public class Ejercicio21Mayor {

	public static void main(String[] args) {

		// Se desea implementar un algoritmo para determinar cuál de dos valores
		// proporcionados es el mayor.

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido");
		System.out.println("Ingrese el primer numero");
		int primero = sc.nextInt();

		System.out.println("Ingrese el segundo numero");
		int segundo = sc.nextInt();

		sc.close();

		if (primero > segundo) {
			System.out.println("El numero mas grande es: " + primero);
		} else if (primero < segundo) {

			System.out.println("El numero mas grande es: " + segundo);

		} else {

			System.out.println("los numeros ingresados son IGUALES");

		}

	}
}
