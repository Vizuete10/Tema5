package ejercicio03;

public class Productos {
	
	  protected String nombre;
	    protected double precio;

	    // Constructor
	    public Productos(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    // Getters y setters
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    // Método calcular
	    public double calcular(int cantidad) {
	        return precio * cantidad;
	    }

	    // toString
	    @Override
	    public String toString() {
	        return "Nombre: " + nombre + ", Precio: " + precio;
	    }
}
