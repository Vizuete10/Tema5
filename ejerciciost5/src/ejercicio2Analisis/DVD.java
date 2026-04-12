package ejercicio2Analisis;

public class DVD extends Ficha {

	private static final int DIAS_PRESTAMO = 5;
	private static final String[] TIPOS_VALIDOS = { "pelicula", "documental", "serie" };
	private static final String TIPO_DEFAULT = "pelicula";

	private String director;
	private int anio;
	private String tipo;

	public DVD(int id, String titulo, String director, int anio, String tipo) {
		super(id, titulo);
		this.director = director;
		this.anio = anio;
		this.tipo = comprobarTipo(tipo);
	}

	private String comprobarTipo(String tipo) {
		if (tipo == null)
			return TIPO_DEFAULT;
		for (String t : TIPOS_VALIDOS) {
			if (t.equalsIgnoreCase(tipo))
				return t;
		}
		return TIPO_DEFAULT;
	}

	@Override
	public int prestar() {
		return DIAS_PRESTAMO;
	}

	public String getDirector() {
		return director;
	}

	public int getAnio() {
		return anio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = comprobarTipo(tipo);
	}

	@Override
	public String toString() {
		return "DVD [id=" + id + ", titulo=" + titulo + ", director=" + director + ", anio=" + anio + ", tipo=" + tipo
				+ "]";
	}
}