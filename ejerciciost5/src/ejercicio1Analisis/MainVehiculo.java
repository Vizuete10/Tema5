package ejercicio1Analisis;

import java.util.Scanner;

public class MainVehiculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la velocidad objetivo (km/h): ");
		int velocidadObjetivo = sc.nextInt();

		System.out.print("Introduce el tiempo de espera (segundos): ");
		int tiempoEspera = sc.nextInt();

		Turismo coche = new Turismo("Seat", "Ibiza", "rojo", "1234ABC", 5, "particular");

		System.out.println("\n── Situación de reposo ──");
		System.out.println(coche);

		System.out.println("\n── Arrancamos ──");
		coche.arrancar();

		System.out.println("\n── Acelerando hasta " + velocidadObjetivo + " km/h ──");
		while (coche.getVelocidadActual() < velocidadObjetivo) {
			coche.acelerar(10);
		}

		System.out.println("\n── Manteniendo velocidad " + tiempoEspera + " segundo(s) ──");
		System.out.println(coche);
		// En una simulación real: Thread.sleep(tiempoEspera * 1000)

		System.out.println("\n── Desacelerando hasta parar ──");
		while (coche.getVelocidadActual() > 0) {
			coche.desacelerar(10);
		}

		System.out.println("\n── Punto muerto y apagamos motor ──");
		coche.parar();
		System.out.println(coche);

		sc.close();
	}
}