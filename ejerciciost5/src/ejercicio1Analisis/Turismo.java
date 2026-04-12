package ejercicio1Analisis;

public class Turismo extends Vehiculo {

	private static final String[] TIPOS_VALIDOS = { "particular", "profesional" };
	private static final String TIPO_DEFAULT = "particular";

	private int numPlazas;
	private String tipoUso;

	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String tipoUso) {
		super(marca, modelo, color, matricula);
		this.numPlazas = numPlazas;
		this.tipoUso = comprobarTipoUso(tipoUso);
	}

	private String comprobarTipoUso(String tipo) {
		if (tipo == null)
			return TIPO_DEFAULT;
		for (String t : TIPOS_VALIDOS) {
			if (t.equalsIgnoreCase(tipo))
				return t;
		}
		return TIPO_DEFAULT;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		this.tipoUso = comprobarTipoUso(tipoUso);
	}

	@Override
	public String toString() {
		return "Turismo [" + marca + " " + modelo + ", matricula=" + matricula + ", plazas=" + numPlazas + ", uso="
				+ tipoUso + ", motor=" + (motorEncendido ? "ON" : "OFF") + ", marcha=" + marchaActual + ", velocidad="
				+ velocidadActual + " km/h]";
	}
}