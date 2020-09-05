package ejercicios;

import java.util.Scanner;

public class Ejercicio23Lapices {

	private static final int PRECIO_MIN = 90;
	private static final int PRECIO_MAY = 85;

	public static void main(String[] args) {
		// de 1000 en adelante precio 85
		// sino 90
		// solicitar cantidad de lapices
		// informar el total

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido");
		System.out.println("Por favor ingrese la cantidad de lapices");
		int lapices = sc.nextInt();

		sc.close();

		int precioTotal = 0;

		if (lapices > 0 && lapices < 1000) {

			precioTotal = lapices * PRECIO_MIN;
		} else {
			precioTotal = lapices * PRECIO_MAY;
		}

		System.out.println("El total es: " + precioTotal);
	}
}
