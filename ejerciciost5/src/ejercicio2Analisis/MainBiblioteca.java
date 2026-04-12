package ejercicio2Analisis;

import java.util.ArrayList;
import java.util.List;

public class MainBiblioteca {

	public static void main(String[] args) {

		List<Ficha> fichas = crearLista();

		for (Ficha f : fichas) {
			System.out.println(f);
			System.out.println("  Días de préstamo: " + f.prestar());
			System.out.println();
		}
	}

	private static List<Ficha> crearLista() {
		List<Ficha> lista = new ArrayList<>();
		lista.add(new Libro(1, "El Quijote", "Cervantes", "Alfaguara"));
		lista.add(new Revista(2, "National Geographic", 305, 2024));
		lista.add(new DVD(3, "Interstellar", "Nolan", 2014, "pelicula"));
		lista.add(new DVD(4, "Cosmos", "Sagan", 1980, "documental"));
		return lista;
	}
}