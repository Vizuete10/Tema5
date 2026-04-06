package ejercicio04;

public class Lavadora extends Electrodomestico {

	private static final double CARGA_DEFECTO = 5.0;

	private double carga;

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	@Override
	public double precioFinal() {
		double precio = super.precioFinal();

		if (carga > 30) {
			precio += 50;
		}

		return precio;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Lavadora [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumoEnergetico + ", peso="
				+ peso + " kg" + ", carga=" + carga + " kg]";
	}
}
