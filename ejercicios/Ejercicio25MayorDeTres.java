package ejercicios;

import java.util.Scanner;

public class Ejercicio25MayorDeTres {

	public static void main(String[] args) {

		// Se requiere determinar cuál de tres cantidades proporcionadas es la mayor.

		System.out.println("Bienvenido");

		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese el primer numero");
		int primero = sc.nextInt();

		System.out.println("ingrese el segundo numero");
		int segundo = sc.nextInt();

		System.out.println("ingrese el tercer numero");
		int tercero = sc.nextInt();

		sc.close();

		if (primero > segundo && primero > tercero) {
			System.out.println("El numero mas grande es: " + primero);
		} else if (segundo > primero && segundo > tercero) {
			System.out.println("El numero mas grande es: " + segundo);
		} else {
			System.out.println("El numero mas grande es: " + tercero);
		}

	}// cierra el main

}// cierra la class
