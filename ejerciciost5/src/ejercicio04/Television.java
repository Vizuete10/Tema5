package ejercicio04;

public class Television extends Electrodomestico {

	private static final int RESOLUCION_DEFECTO = 20;
	private static final boolean SINTONIZADOR_DEFECTO = false;

	private int resolucion;
	private boolean sintonizadorTDT;

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEFECTO;
		this.sintonizadorTDT = SINTONIZADOR_DEFECTO;
	}

	public Television(double precioBase, double peso, String color, char consumoEnergetico, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	@Override
	public double precioFinal() {
		double precio = super.precioFinal();

		if (resolucion > 40) {
			precio += precio * 0.30;
		}

		if (sintonizadorTDT) {
			precio += 50;
		}

		return precio;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	 @Override
	    public String toString() {
	        return "Television [precioBase=" + precioBase
	                + ", color=" + color
	                + ", consumo=" + consumoEnergetico
	                + ", peso=" + peso + " kg"
	                + ", resolucion=" + resolucion + "\""
	                + ", TDT=" + sintonizadorTDT + "]";
	    }
}
