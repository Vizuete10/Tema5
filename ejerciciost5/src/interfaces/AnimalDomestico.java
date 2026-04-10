package interfaces;

public abstract class AnimalDomestico implements Vivir {

	protected String nombre;
	protected String raza;
	protected double peso;
	protected String color;

	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	// Métodos COMUNES a todos los animales domésticos

	public void vacunar() {
		System.out.println(nombre + " ha sido vacunado/a.");
	}

	@Override
	public void dormir() {
		System.out.println(nombre + " está durmiendo... Zzz");
	}

	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo.");
	}

	// Métodos ABSTRACTOS (cada subclase los implementa a su manera)

	@Override
	public abstract void hacerRuido();

	public abstract boolean hacerCaso();

	// To String
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + "kg, color="
				+ color + "]";
	}
}
