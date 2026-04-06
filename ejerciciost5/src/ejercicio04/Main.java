package ejercicio04;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase ejecutable para probar las clases Electrodomestico, Lavadora y Television.
 */
public class Main {

    private static final String SEPARADOR = "===========================================";

    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = crearListaElectrodomesticos();
        mostrarPrecios(electrodomesticos);
    }

    /**
     * Crea y devuelve la lista de electrodomésticos de prueba.
     */
    private static List<Electrodomestico> crearListaElectrodomesticos() {
        List<Electrodomestico> lista = new ArrayList<>();

        // Electrodomésticos genéricos
        lista.add(new Electrodomestico(100, 5));
        lista.add(new Electrodomestico(200, 25, "rojo",   'A'));
        lista.add(new Electrodomestico(150, 12, "NEGRO",  'C'));  // mayúsculas -> valido
        lista.add(new Electrodomestico(300, 35, "verde",  'Z'));  // invalidos  -> defecto

        // Lavadoras
        lista.add(new Lavadora(400, 30));                         // carga por defecto (5 kg)
        lista.add(new Lavadora(500, 40, "azul", 'B', 35));       // carga 35 kg -> +50 EUR
        lista.add(new Lavadora(250, 20, "gris", 'D', 25));       // carga 25 kg -> sin recargo

        // Televisiones
        lista.add(new Television(600, 8));
        lista.add(new Television(800, 10, "negro",  'A', 55, true));
        lista.add(new Television(450, 7,  "blanco", 'C', 32, false));

        return lista;
    }

    /**
     * Recorre la lista, imprime el precio final de cada electrodoméstico
     * y muestra el resumen de totales por tipo.
     */
    private static void mostrarPrecios(List<Electrodomestico> lista) {
        System.out.println(SEPARADOR);
        System.out.println("  LISTA DE ELECTRODOMESTICOS - PRECIOS");
        System.out.println(SEPARADOR);

        double totalGlobal       = 0;
        double totalLavadoras    = 0;
        double totalTelevisiones = 0;

        for (Electrodomestico electrodomestico : lista) {
            double precio = electrodomestico.precioFinal();

            System.out.println(electrodomestico);
            System.out.println("  -> Precio final: " + precio + " EUR\n");

            totalGlobal += precio;

            if (electrodomestico instanceof Lavadora) {
                totalLavadoras += precio;
            } else if (electrodomestico instanceof Television) {
                totalTelevisiones += precio;
            }
        }

        mostrarResumen(totalGlobal, totalLavadoras, totalTelevisiones);
    }

    /**
     * Muestra el resumen de precios totales por tipo de electrodoméstico.
     */
    private static void mostrarResumen(double totalGlobal, double totalLavadoras,
                                       double totalTelevisiones) {
        System.out.println(SEPARADOR);
        System.out.println("  RESUMEN DE PRECIOS");
        System.out.println(SEPARADOR);
        System.out.println("  Total Electrodomesticos (suma global): " + totalGlobal       + " EUR");
        System.out.println("  Total Lavadoras:                       " + totalLavadoras    + " EUR");
        System.out.println("  Total Televisiones:                    " + totalTelevisiones + " EUR");
        System.out.println(SEPARADOR);
    }
}

