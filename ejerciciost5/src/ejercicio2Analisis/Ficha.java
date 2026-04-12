package ejercicio2Analisis;

public abstract class Ficha {

	protected int id;
	protected String titulo;

	public Ficha(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public abstract int prestar();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ficha))
			return false;
		return this.id == ((Ficha) obj).id;
	}

	@Override
	public abstract String toString();
}