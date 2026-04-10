package interfaces;

public class MainAnimales {

	public static void main(String[] args) {

		Perro perro = new Perro("Rex", "Pastor Alemán", 30.5, "marrón");
		Gato gato = new Gato("Michi", "Siamés", 4.2, "blanco");

		System.out.println("=== PERRO ===");
		System.out.println(perro);
		perro.comer();
		perro.dormir();
		perro.hacerRuido();
		perro.vacunar();
		perro.hacerCaso();
		perro.sacarPaseo();

		System.out.println("=== GATO ===");
		System.out.println(gato);
		gato.comer();
		gato.dormir();
		gato.hacerRuido();
		gato.vacunar();
		gato.hacerCaso();
		gato.toserBolaPelo();

		System.out.println("=== Polimorfismo ===");
		AnimalDomestico[] animales = { perro, gato };
		for (AnimalDomestico a : animales) {
			a.hacerRuido();
			a.hacerCaso();
		}
	}
}