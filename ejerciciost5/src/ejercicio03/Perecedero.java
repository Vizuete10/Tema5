package ejercicio03;

public class Perecedero extends Productos {
    private int diasACaducar;

    // Constructor
    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    // Getter y setter
    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    // Método calcular
    @Override
    public double calcular(int cantidad) {
        double total = super.calcular(cantidad);

        if (diasACaducar == 1) {
            total = total / 4;
        } else if (diasACaducar == 2) {
            total = total / 3;
        } else if (diasACaducar == 3) {
            total = total / 2;
        }

        return total;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Días a caducar: " + diasACaducar;
    }
}