package interfaces;

import java.util.Arrays;

public class MainFutbolista {

	public static void main(String[] args) {

		Futbolista[] tabla = { new Futbolista(10, "Messi", 36, 30), new Futbolista(7, "Ronaldo", 39, 25),
				new Futbolista(10, "Iniesta", 39, 5), new Futbolista(9, "Benzema", 36, 20),
				new Futbolista(3, "Piqué", 37, 2) };

		System.out.println("Sin ordenar:");
		for (Futbolista f : tabla)
			System.out.println(f);

		Arrays.sort(tabla);
		System.out.println();
		System.out.println("Ordenados:");
		for (Futbolista f : tabla)
			System.out.println(f);

		// Probar equals
		Futbolista copia = new Futbolista(10, "Messi", 99, 0);
		System.out.println();
		System.out.println("¿tabla[0] equals copia (camiseta=10, Messi)? " + tabla[0].equals(copia));
	}
}