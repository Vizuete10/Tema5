package ejercicio03;

public class Main {
    public static void main(String[] args) {
        Productos productoNew = new Productos("Arroz", 2.0);
        Perecedero perecederoNew = new Perecedero("Leche", 1.5, 2);
        NoPerecedero noPerecederoNew = new NoPerecedero("Lata", 3.0, "Conserva");

        System.out.println(productoNew);
        System.out.println("Total: " + productoNew.calcular(5));

        System.out.println(perecederoNew);
        System.out.println("Total: " + perecederoNew.calcular(5));

        System.out.println(noPerecederoNew);
        System.out.println("Total: " + noPerecederoNew.calcular(5));
    }
}
