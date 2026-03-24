package ejercicio01;


public class HoraExacta extends Hora {
 private int segundo;

 public HoraExacta(int hora, int minuto, int segundo) {
     super(hora, minuto);
     if (segundo < 0 || segundo > 59) {
         throw new IllegalArgumentException("Segundo no válido");
     }
     this.segundo = segundo;
 }

 public boolean setSegundo(int valor) {
     if (valor < 0 || valor > 59) return false;
     segundo = valor;
     return true;
 }

 @Override
 public void inc() {
     segundo++;
     if (segundo == 60) {
         segundo = 0;
         super.inc();
     }
 }

 @Override
 public String toString() {
	    String[] partes = super.toString().split(":");
	    String seg = (segundo < 10) ? "0" + segundo : "" + segundo;
	    return partes[0] + ":" + partes[1] + ":" + seg;
	}
}
