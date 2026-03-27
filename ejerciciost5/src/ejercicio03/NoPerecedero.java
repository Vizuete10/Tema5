package ejercicio03;

public class NoPerecedero extends Productos {
    private String tipo;

    // Constructor
    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    // Getter y setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // calcular (igual que Producto)
    @Override
    public double calcular(int cantidad) {
        return super.calcular(cantidad);
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }
}