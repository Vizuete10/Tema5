package ejercicio2Analisis;

public class Revista extends Ficha {

	private static final int DIAS_PRESTAMO = 10;

	private int numRevista;
	private int anio;

	public Revista(int id, String titulo, int numRevista, int anio) {
		super(id, titulo);
		this.numRevista = numRevista;
		this.anio = anio;
	}

	@Override
	public int prestar() {
		return DIAS_PRESTAMO;
	}

	public int getNumRevista() {
		return numRevista;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Revista [id=" + id + ", titulo=" + titulo + ", num=" + numRevista + ", anio=" + anio + "]";
	}
}