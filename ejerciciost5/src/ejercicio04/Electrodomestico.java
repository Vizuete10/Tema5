package ejercicio04;

public class Electrodomestico {

	private static final String COLOR_DEFECTO = "blanco";
	private static final char CONSUMO_DEFECTO = 'F';
	private static final double PRECIO_DEFECTO = 100.0;
	private static final double PESO_DEFECTO = 5.0;

	private static final String[] COLORES_VALIDOS = { "blanco", "negro", "rojo", "azul", "gris" };

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	/**
	 * Constructor con precio y peso. El resto toma valores por defecto.
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
	}

	/**
	 * Constructor con todos los atributos.
	 */
	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
	}

	/**
	 * Comprueba que la letra de consumo energético está entre A y F. Si no es
	 * correcta, devuelve la letra por defecto. Se invoca al crear el objeto y no es
	 * visible desde fuera.
	 */
	private char comprobarConsumoEnergetico(char letra) {
		char letraMayus = Character.toUpperCase(letra);
		if (letraMayus >= 'A' && letraMayus <= 'F') {
			return letraMayus;
		}
		return CONSUMO_DEFECTO;
	}

	/**
     * Comprueba que el color es uno de los colores válidos (sin importar mayúsculas).
     * Si no es correcto, devuelve el color por defecto.
     * Se invoca al crear el objeto y no es visible desde fuera.
     */
	private String comprobarColor(String color) {
		if (color == null)
			return COLOR_DEFECTO;
		String colorMinuscula = color.toLowerCase();
		for (String c : COLORES_VALIDOS) {
			if (c.equals(colorMinuscula)) {
				return colorMinuscula;
			}
		}
		return COLOR_DEFECTO;
	}

    /**
     * Calcula el precio final aplicando incrementos fijos por consumo energético y por peso.
     *
     * Tabla de incrementos por consumo energético:
     *   A → +100 €
     *   B → +80 €
     *   C → +60 €
     *   D → +50 €
     *   E → +30 €
     *   F → +10 €
     *
     * Tabla de incrementos por tamaño (peso):
     *   Entre  0 y 19 kg → +10 €
     *   Entre 20 y 49 kg → +50 €
     *   Entre 50 y 79 kg → +80 €
     *   Mayor de 80 kg   → +100 €
     *
     * @return precio final calculado
     */

	public double precioFinal() {
		double precio = precioBase;

		switch (consumoEnergetico) {
		case 'A':
			precio += 100;
			break;
		case 'B':
			precio += 80;
			break;
		case 'C':
			precio += 60;
			break;
		case 'D':
			precio += 50;
			break;
		case 'E':
			precio += 30;
			break;
		case 'F':
			precio += 10;
			break;
		}

		if (peso > 80) {
			precio += 100;
		} else if (peso >= 50) {
			precio += 80;
		} else if (peso >= 20) {
			precio += 50;
		} else {
			precio += 10;
		}

		return precio;
	}

	// Getters and Setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = comprobarColor(color);
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumoEnergetico
				+ ", peso=" + peso + " kg]";
	}

}
