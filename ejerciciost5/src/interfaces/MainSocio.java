package interfaces;

import java.util.Arrays;

public class MainSocio {

	public static void main(String[] args) {

		Socio s1 = new Socio(3, "Carlos", 25);
		Socio s2 = new Socio(1, "Ana", 30);
		Socio s3 = new Socio(2, "Luis", 22);

		// Comprobar compareTo manualmente
		System.out.println("Comparar s1(id=3) con s2(id=1): " + s1.compareTo(s2));
		System.out.println("Comparar s2(id=1) con s3(id=2): " + s2.compareTo(s3));

		// Array y ordenación con Arrays.sort (usa compareTo internamente)
		Socio[] socios = { s1, s2, s3 };

		System.out.println("\nAntes de ordenar:");
		for (Socio s : socios)
			System.out.println(s);

		Arrays.sort(socios);

		System.out.println("\nDespués de ordenar:");
		for (Socio s : socios)
			System.out.println(s);
	}
}