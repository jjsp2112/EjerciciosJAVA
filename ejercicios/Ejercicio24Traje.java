package ejercicios;

import java.util.Scanner;

public class Ejercicio24Traje {

	private static final float PRECIO_DTO = 2500.0f;
	private static final float DTO_A = 0.15f;
	private static final float DTO_B = 0.08f;

	public static void main(String[] args) {

		// Almacenes “El harapiento distinguido” tiene una promoción: a todos los trajes
		// que tienen un precio superior a $2500.00 se les aplicará un descuento de 15
		// %, a todos
		// los demás se les aplicará sólo 8%. Realice un algoritmo para determinar el
		// precio final
		// que debe pagar una persona por comprar un traje y de cuánto es el descuento
		// que
		// obtendrá.

		System.out.println("Bienvenido a Almacenes El Harapiento Distinguido");

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor ingrese el precio del traje, incluyendo los centavos");
		float precioTraje = sc.nextFloat();

		sc.close();

		float descuento = 0;

		if (precioTraje > PRECIO_DTO) {
			descuento = precioTraje * DTO_A;

		} else {
			descuento = precioTraje * DTO_B;
		}

		float precioFinal = precioTraje - descuento;

		System.out.println("El precio final del traje es: " + precioFinal);

	}// cierra el main
}// cierra la class
