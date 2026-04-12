package ejercicio2Analisis;

public class Libro extends Ficha {

	private static final int DIAS_PRESTAMO = 15;

	private String autor;
	private String editorial;

	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		this.autor = autor;
		this.editorial = editorial;
	}

	@Override
	public int prestar() {
		return DIAS_PRESTAMO;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setAutor(String a) {
		this.autor = a;
	}

	public void setEditorial(String e) {
		this.editorial = e;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
}