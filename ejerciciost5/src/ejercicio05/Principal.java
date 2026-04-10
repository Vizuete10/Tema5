package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Poligono> poligonos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    introducirTriangulo(poligonos, sc);
                    break;
                case 2:
                    introducirRectangulo(poligonos, sc);
                    break;
                case 3:
                    mostrarPoligonos(poligonos);
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
        
        sc.close();
    }
    
    
    private static void mostrarMenu() {
        
        System.out.println("MENÚ - POLÍGONOS");
        System.out.println("=".repeat(40));
        System.out.println("1. Introducir triángulo.");
        System.out.println("2. Introducir rectángulo.");
        System.out.println("3. Mostrar polígonos.");
        System.out.println("0. Salir.");
        System.out.print("Elige una opción: ");
    }
    
    private static void introducirTriangulo(ArrayList<Poligono> lista, Scanner sc) {
        System.out.println("\n--- NUEVO TRIÁNGULO ---");
        System.out.print("Lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        double l3 = sc.nextDouble();
        
        Triangulo t = new Triangulo(l1, l2, l3);
        lista.add(t);
        System.out.println("Triángulo añadido correctamente.");
    }
    
    private static void introducirRectangulo(ArrayList<Poligono> lista, Scanner sc) {
        System.out.println("\n--- NUEVO RECTÁNGULO ---");
        System.out.print("Lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = sc.nextDouble();
        
        Rectangulo r = new Rectangulo(l1, l2);
        lista.add(r);
        System.out.println("Rectángulo añadido correctamente.");
    }
    
    private static void mostrarPoligonos(ArrayList<Poligono> lista) {
        if (lista.isEmpty()) {
            System.out.println("\nNo hay ningún polígono almacenado todavía.");
            return;
        }
        
        System.out.println("LISTA DE POLÍGONOS (" + lista.size() + ")");
        
        for (Poligono p : lista) {
            System.out.println(p.toString());
            System.out.printf("Área = ", p.area());
        }
    }
}
