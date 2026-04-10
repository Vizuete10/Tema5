package interfaces;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public void hacerRuido() {
		System.out.println(nombre + ": Miaauuu...");
	}

	// Devuelve true solo el 5% de las veces
	@Override
	public boolean hacerCaso() {
		boolean caso = Math.random() < 0.05;
		System.out.println(nombre + (caso ? " hace caso (¡sorpresa!)." : " pasa de ti olímpicamente."));
		return caso;
	}

	// Método exclusivo de Gato
	public void toserBolaPelo() {
		System.out.println(nombre + ": *hork* *hork* ... ¡Bola de pelo expulsada!");
	}
}