package interfaces;

public class Perro extends AnimalDomestico {

 public Perro(String nombre, String raza, double peso, String color) {
     super(nombre, raza, peso, color);
 }

 @Override
 public void hacerRuido() {
     System.out.println(nombre + ": ¡Guau guau!");
 }

 // Devuelve true el 90% de las veces
 @Override
 public boolean hacerCaso() {
     boolean caso = Math.random() < 0.90;
     System.out.println(nombre + (caso ? " hace caso." : " no hace caso."));
     return caso;
 }

 // Método exclusivo de Perro
 public void sacarPaseo() {
     System.out.println("¡Hora del paseo! " + nombre + " sale corriendo con la correa.");
 }
}